package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	public List<String> getname()
	{
		List<String> list=Arrays.asList("mahi","sunita","vanita","sari","appa");
		return list;
	}
}
