package com.youyuan.producer;

import com.youyuan.producer.queue.JmsProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhangy
 * @version 1.0
 * @description
 * @date 2019/12/27 7:58
 */
@SpringBootTest
public class ProducerTest {

    @Autowired
    private JmsProducer jmsProducer;

    @Test
    public void send() {
        jmsProducer.sendMQToQueue();
    }
}
