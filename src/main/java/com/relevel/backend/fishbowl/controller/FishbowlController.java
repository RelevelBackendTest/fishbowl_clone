package com.relevel.backend.fishbowl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FishbowlController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

