package toyproject.springkafkasubtester.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import toyproject.springkafkasubtester.service.ConsumerService;

@Component
@RequiredArgsConstructor
public class KafkaMessageListener {
  private final ConsumerService consumerService;
  private final KafkaConsumer<String, String> kafkaConsumer;
  @Value("${kafka.bootstrap.servers}")
  private String bootStrapServers;
  @Value("${topics}")
  private String targetTopics;

  public void start(){
    String[] topicArr = targetTopics.split(",");
    kafkaConsumer.subscribe(List.of(topicArr));

    while(true){
      ConsumerRecords<String, String> records = kafkaConsumer.poll(100);
      for(ConsumerRecord<String, String> record : records){
        String consumedItem = record.value();
        consumerService.processMessage(consumedItem);
      }
    }
  }

}
