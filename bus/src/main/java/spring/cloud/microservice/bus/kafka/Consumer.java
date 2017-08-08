/*
 * Copyright (c) 2001-2017 GuaHao.com Corporation Limited. All rights reserved. 
 * This software is the confidential and proprietary information of GuaHao Company. 
 * ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall use it only 
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package spring.cloud.microservice.bus.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * kafka消费者
 *
 * @author qinqixiang
 * @version V1.0
 * @since 2017-07-24 15:52
 */
@Component
public class Consumer {

    @KafkaListener(topics = "springCloudBus")
    public void getMessage(String string) {
        System.out.println("get kafka message: " + string);
    }

}
