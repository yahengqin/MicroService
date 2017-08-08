/*
 * Copyright (c) 2001-2017 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package spring.cloud.microservice.bus.kafka;

import com.alibaba.fastjson.JSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * kafka生产者
 *
 * @author qinqixiang
 * @version V1.0
 * @since 2017-07-21 15:20
 */
@Component
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage() {
        kafkaTemplate.send("springCloudBus", "{\"message\":\"this message is from kafka\"}");
    }

}
