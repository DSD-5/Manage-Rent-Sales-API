package com.tutiempolibro.managerentsales.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tutiempolibro.managerentsales.producer.SendSalesRent;

@Service
public class RentSalesProducer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	public void sendMessage(SendSalesRent send) throws JsonProcessingException {
		String json = objectMapper.writeValueAsString(send);
		kafkaTemplate.send("t_rentsales_finish", json);
	}
	
}
