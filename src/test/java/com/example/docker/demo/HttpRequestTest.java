package com.example.docker.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    /**
     * Test sending requests to our endPoint but application need to be started
     * @throws Exception
     */
//    @Test
//    public void greetingShouldReturnDefaultMessage()throws Exception{
//        assert(this.restTemplate.getForObject("http://localhost:8081/",String.class)).contains("Hello, World");
//    }



}
