package org.n2aconsulting.springbootkafka.vendor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "customtopic",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("Listener received : " + data + "\n");
    }
}
