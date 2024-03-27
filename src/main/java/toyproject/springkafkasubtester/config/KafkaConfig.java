package toyproject.springkafkasubtester.config;

import java.util.Properties;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class KafkaConfig {

  @Value("${kafka.bootstrap.servers}")
  private String bootStrapServers;

  @Bean
  public KafkaConsumer<String, String> getKafkaConsumer(){
    Properties props = new Properties();
    props.put("bootstrap.servers", bootStrapServers);
    props.put("group.id", "test-consumer");
    props.put("enable.auto.commit", "true");
    props.put("auto.offset.reset", "latest");
    props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
    props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

    KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
    return consumer;
  }

}
