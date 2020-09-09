package com.example.docker.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import sun.plugin2.util.PojoUtil;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.hamcrest.Matchers.containsString;


@WebMvcTest
public class WebLayerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeDao dao;

    /**
     * Test requesting our endpoints
     * @throws Exception
     */
    @Test
    public void shouldReturnDefaultMessage() throws Exception {

        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, World")));
    }

    @Test
    public void testPostRequest()throws Exception{
        Employee emp=new Employee();
        emp.setName("name");
        emp.setSid("sid");
        this.mockMvc.perform(post("/test").contentType(MediaType.APPLICATION_JSON).content(PojoUtil.toJson(emp)).accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}
