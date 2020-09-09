package com.example.docker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @Autowired
    private EmployeeDao dao;


    @RequestMapping(method = RequestMethod.GET,value = "")
    public String home(HttpServletRequest request){
        return "Hello, World";
    }

    @RequestMapping(method = RequestMethod.POST,value = "test")
    public ResponseEntity<Object> testAll(@RequestBody Employee employee){
        dao.save(employee);
        Map<String,Object> map=new HashMap<>();
        map.put("test",dao.findAll());
        return new ResponseEntity<Object>(map,HttpStatus.OK);
    }
}
