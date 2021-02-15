package com.spring.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    public List<Topic> getAllTopics(){
        ArrayList<Topic> tp = new ArrayList<>();
        topicRepository.findAll().forEach(topic -> tp.add(topic));
        return tp;
     }
    public Topic getTopic(int id){
        Optional<Topic> otp = topicRepository.findById(id);
        Topic tp = new Topic();
        tp=null;
        if(otp.isPresent()){
            tp = otp.get();
        }
        return tp;
    }
    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }
    public void updateTopic(Topic topic, int id){
       topicRepository.save(topic);
    }
    public void deleteTopic(int id){
        topicRepository.deleteById(id);
    }
}
