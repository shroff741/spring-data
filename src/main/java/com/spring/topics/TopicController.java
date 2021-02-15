package com.spring.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> topics(){
        return topicService.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable int id){
        return topicService.getTopic(id);
    }
    @RequestMapping(value="/topics",method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
    @RequestMapping(value="topics/{id}",method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable int id){
        topicService.updateTopic(topic,id);
    }
    @RequestMapping(value="topics/{id}",method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable int id){
        topicService.deleteTopic(id);
    }
}
