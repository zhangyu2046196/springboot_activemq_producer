package com.youyuan.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Topic;

/**
 * @author zhangy
 * @version 1.0
 * @description 自定义配置类，配置队列或主题
 * @date 2019/12/27 7:49
 */
@Configuration
@EnableJms  //打开基于注解的ActiveMQ功能
public class ConfigBean {
    @Value("${myqueue}")
    private String queueName;
    @Value("${mytopic}")
    private String topicName;

    /**
     * 配置Queue对象
     * @return
     */
    @Bean
    public ActiveMQQueue queue() {
        return new ActiveMQQueue(queueName);
    }

    /**
     * 配置topic对象
     * @return
     */
    @Bean
    public Topic topic(){
        return new ActiveMQTopic(topicName);
    }
}
