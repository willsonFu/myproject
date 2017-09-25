package com.wf.base.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 */
@Controller
@RequestMapping("/hello")
public class BaseController {
    @ResponseBody
    @GetMapping(value="say")
    public JsonNode hello(){
        ObjectNode objectNode = new ObjectMapper().createObjectNode();
        objectNode.put("say","hello World");
        return objectNode;
    }
}
