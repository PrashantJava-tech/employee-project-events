package com.pk.event.message.employeeprojectevents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pk.event.message.employeeprojectevents.service.producer.KafkaProducer;

@RestController
public class KafkaProducerController {

	@Autowired
	private KafkaProducer kafkaProducer;
	
	@PostMapping("/api/v1/kafka/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message){
		kafkaProducer.message(message);
		return ResponseEntity.ok("Message sent to kafka topic");
	}
}
