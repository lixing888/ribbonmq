package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RabbinMqTest {
    @Autowired
    private AmqpTemplate amqpTemplate;
    @Test
    public void test(){
        amqpTemplate.convertAndSend("kkkkk","lixing:redis");
        System.out.println("成功");
    }

    /**
     * 监听消息，只有有消息就消费
     * @param str
     */
    @RabbitListener(queuesToDeclare=@Queue("kkkkk"))
    public void con(String str){
        System.out.println("消费"+str);
    }
}
