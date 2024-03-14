package com.example.product;

import  com.example.product.dto.ProductRequest;
import com.example.product.repository.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import org.testcontainers.utility.DockerImageName;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Slf4j
// to use the test containers to run this particular test
@Testcontainers
@AutoConfigureMockMvc
class ProductServiceApplicationTests {

//	The test will start the mongodb container first by downloading the mongo image
//	After starting the container set it will get the replica set url and add it to the
//  spring data mongo uri property dynamically at the time of creating the test

	@Container
	static final MongoDBContainer mongoDBContainer = new MongoDBContainer(DockerImageName.parse("mongo:4.0.10"));

	// pojo to json and json to pojo
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private MockMvc mockMvc;
	@DynamicPropertySource
	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry)
	{
		dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
	}

	@Autowired
	private ProductRepository productRepository;

	// for creating product api
	// an object called mock mvc which will provide mock servlet environment
	@Test
	void shouldCreateProductApi() throws Exception {
		// product request object
		ProductRequest productRequest = getProductRequest();

		String  productRequestString = objectMapper.writeValueAsString(productRequest);
		log.info(productRequestString);
		mockMvc.perform(MockMvcRequestBuilders.post("/api/products")
						.contentType(MediaType.APPLICATION_JSON)
						.content(productRequestString))
				.andExpect(status().isCreated());
		// we have inserted one product
		Assertions.assertEquals(1, productRepository.findAll().size());
	}


	private ProductRequest getProductRequest()
	{
		return ProductRequest.builder()
				.name("iphone 13")
				.description("iphone 13")
				.price(BigDecimal.valueOf(1200))
				.build();
	}
	@Test
	void shouldGetProduct() throws Exception
	{
		mockMvc.perform(MockMvcRequestBuilders.get("/api/products"))
				.andExpect(status().isOk());
		log.info(String.valueOf(productRepository.findAll().size()));
		// we have inserted one product
		Assertions.assertEquals(0, productRepository.findAll().size());

	}


}

