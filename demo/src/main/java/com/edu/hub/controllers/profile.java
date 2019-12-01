package com.edu.hub.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.hub.model.User;

@RestController("/api")
public class profile {
	Logger logger = LoggerFactory.getLogger(getClass());

	@PostMapping("/registerUser")
	public ResponseEntity<String> registerUser(@Valid @RequestBody User user) {

		logger.info(user.toString());

		return ResponseEntity.ok().body("Success_TOBEDECIDED");
	}

}
