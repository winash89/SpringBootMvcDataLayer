package io.ashwin.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	public List<topics> getAllTopics(){
		List<topics> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public topics getTopic(String id){
		return topicRepository.findOne(id);
	}

	public void addTopic(topics topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(topics topic, String id) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}

}
