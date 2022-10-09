package com.abhicodes.springfoxswagger3.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Demo APIs")
public class DemoController {

	@GetMapping("/hello-world")
	@ApiOperation("Hello peeps")
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Hello Medium");
	}

}
