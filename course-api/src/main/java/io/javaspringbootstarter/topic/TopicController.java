package io.javaspringbootstarter.topic;


import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javaspringbootstarter.model.Topic;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{ 
		return Arrays.asList(

				new Topic("Spring", "Spring Framework", "Spring Framework Description"),
				new Topic("Java", "SCore Java", "Description"),
				new Topic("JS", "JS Framework", "JS Description")
				);
	}
}


