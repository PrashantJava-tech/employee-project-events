package com.pk.event.message.employeeprojectevents.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.pk.event.message.employeeprojectevents.constants.AppConstants;

@Configuration
public class KafkaTopicConfig {
	
	@Bean
	public NewTopic getEMployeeTopic() {
		return TopicBuilder.name(AppConstants.TOPIC_NAME)
				.build();
	}

	@Bean
	public NewTopic topic2() {
	    return TopicBuilder.name(AppConstants.TOPIC_NAME1).partitions(3).build();
	}
}


