package com.xhx.springboot.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * xuhaixing
 * 2018/5/17 21:39
 *
 */
@Component
@RabbitListener(queues = "FANOUT_A") //监听不同队列，两个消费者同时收到消息
public class FanoutConsumer {
    @RabbitHandler
    public void receive(String message){
        System.out.println("1收到的消息是："+message);
    }
}
