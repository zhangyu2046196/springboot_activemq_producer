package com.youyuan.producer.queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import java.util.Queue;
import java.util.UUID;

/**
 * @author zhangy
 * @version 1.0
 * @description 生产者
 * @date 2019/12/27 7:52
 */
@Component
public class JmsProducer {

    @Autowired
    private ActiveMQQueue queue;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 发送消息
     */
    public void sendMQToQueue() {
        jmsMessagingTemplate.convertAndSend(queue, UUID.randomUUID().toString());
    }

    /**
     * 每隔3秒钟定时投送
     */
    //@Scheduled(fixedDelay = 3000L)
    public void sendMQToQueueScheduler(){
        jmsMessagingTemplate.convertAndSend(queue,UUID.randomUUID().toString());
        System.out.println("定时投送消息完成");
    }
}
