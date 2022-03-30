package com.example.demo.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamsController {

	@GetMapping(value = "/teams", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Integer> getTeams() {
		return List.of(1, 2, 3, 4, 5, 6);
	}

}
