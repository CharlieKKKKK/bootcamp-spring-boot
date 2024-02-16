package com.vtxlab.bootcamp;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException{
    CatController catController = new CatController();
     Map<String, Integer> mapResult = catController.getCats();
     String json = new ObjectMapper().writeValueAsString(mapResult);
     System.out.println(json);
    }
}