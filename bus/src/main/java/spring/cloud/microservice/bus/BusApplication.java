/*
 * Copyright (c) 2001-2017 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package spring.cloud.microservice.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.cloud.microservice.bus.kafka.Producer;

/**
 * 总线启动类
 *
 * @author qinqixiang
 * @version V1.0
 * @since 2017-07-21 14:49
 */
@SpringBootApplication
@RestController
public class BusApplication {
    @Autowired
    private Producer producer;

    public static void main(String[] args) {
        SpringApplication.run(BusApplication.class, args);
    }

    @RequestMapping("/sendMsgToKafka")
    public String kafka() {
        producer.sendMessage();
        return "message sended";
    }
}
