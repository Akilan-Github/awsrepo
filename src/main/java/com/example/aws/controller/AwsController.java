package com.example.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
	@GetMapping("/getaws")
	public String getAws() {
		return "Amazon Web Services (AWS) is a cloud computing platform that offers a wide range of products and services to help organizations scale,"
				+ " lower IT costs, and move faster. "
				+ " AWS is a major part of Amazon's business and controls over a third of the cloud market.";
	}

}
