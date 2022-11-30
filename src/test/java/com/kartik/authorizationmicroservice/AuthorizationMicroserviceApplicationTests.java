package com.kartik.authorizationmicroservice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kartik.authorizationmicroservice.model.JwtRequestTest;


@SpringBootTest
@AutoConfigureMockMvc
class AuthorizationMicroserviceApplicationTests {

	@Autowired
	MockMvc mvc;
	
	@Test
	void contextLoads() {
	}
}
