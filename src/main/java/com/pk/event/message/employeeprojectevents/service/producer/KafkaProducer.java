package com.pk.event.message.employeeprojectevents.service.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.pk.event.message.employeeprojectevents.constants.AppConstants;

@Service
public class KafkaProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void message(String message) {
		LOGGER.info("** message sent -> {}", message);
		kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
		
	}
}

