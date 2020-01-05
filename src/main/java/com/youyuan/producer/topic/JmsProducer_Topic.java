package com.youyuan.producer.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;
import java.util.UUID;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/27 9:09
 */
@Component
public class JmsProducer_Topic {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Topic topic;

    /**
     * 每隔三秒钟发送一次消息
     */
    @Scheduled(fixedDelay = 3000L)
    public void sendMQToTopicScheduler() {
        jmsMessagingTemplate.convertAndSend(topic, "topic发送内容:" + UUID.randomUUID().toString());
        System.out.println("生产者发送完topic消息");
    }
}
