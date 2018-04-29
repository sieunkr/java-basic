package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("이름", "Eddy.Kim");
		linkedHashMap.put("나이", "비밀");
		linkedHashMap.put("업종", "포털");
		linkedHashMap.put("사는곳", "서울");

		linkedHashMap.forEach((key, value) -> System.out.println(key + value));


		//jackson 라이브러리
		ObjectMapper mapper = new ObjectMapper();
		try{
			System.out.println(mapper.writeValueAsString(linkedHashMap));
		}
		catch (Exception ex){
		}


		//Google gson 라이브러리
		Gson gson = new Gson();
		String json = gson.toJson(linkedHashMap, LinkedHashMap.class);
		System.out.println(json);

	}
}
