package toyproject.springkafkasubtester.config;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import toyproject.springkafkasubtester.service.ConsumerService;

@Component
@RequiredArgsConstructor
public class KafkaMessageListener {
  private final LeaderElectionService leaderElectionService;
  private final ConsumerService consumerService;

  @KafkaListener(
      topics = "subject0",
      groupId = "subject-group-0",
      //id = "your-listener-id",
      //containerFactory = "kafkaListenerContainerFactory",
      autoStartup = "false",
      concurrency = "1"
  )
  public void listenToKafka0(String message) {
    if (leaderElectionService.needToStartListener()) {
      // Start processing messages
      // Your business logic here
      System.out.println("Received message: " + message);
      consumerService.processMessage(message);
    } else {
      System.out.println("Condition is false, not starting listener.");
    }
  }

  @KafkaListener(
      topics = "subject1",
      groupId = "subject-group-1",
      //id = "your-listener-id",
      //containerFactory = "kafkaListenerContainerFactory",
      autoStartup = "false",
      concurrency = "1"
  )
  public void listenToKafka1(String message) {
    if (leaderElectionService.needToStartListener()) {
      // Start processing messages
      // Your business logic here
      System.out.println("Received message: " + message);
      consumerService.processMessage(message);
    } else {
      System.out.println("Condition is false, not starting listener.");
    }
  }

  @KafkaListener(
      topics = "subject2",
      groupId = "subject-group-2",
      //id = "your-listener-id",
      //containerFactory = "kafkaListenerContainerFactory",
      autoStartup = "false",
      concurrency = "1"
  )
  public void listenToKafka2(String message) {
    if (leaderElectionService.needToStartListener()) {
      // Start processing messages
      // Your business logic here
      System.out.println("Received message: " + message);
      consumerService.processMessage(message);
    } else {
      System.out.println("Condition is false, not starting listener.");
    }
  }

  @KafkaListener(
      topics = "subject3",
      groupId = "subject-group-3",
      //id = "your-listener-id",
      //containerFactory = "kafkaListenerContainerFactory",
      autoStartup = "false",
      concurrency = "1"
  )
  public void listenToKafka3(String message) {
    if (leaderElectionService.needToStartListener()) {
      // Start processing messages
      // Your business logic here
      System.out.println("Received message: " + message);
      consumerService.processMessage(message);
    } else {
      System.out.println("Condition is false, not starting listener.");
    }
  }

  @KafkaListener(
      topics = "subject4",
      groupId = "subject-group-4",
      //id = "your-listener-id",
      //containerFactory = "kafkaListenerContainerFactory",
      autoStartup = "false",
      concurrency = "1"
  )
  public void listenToKafka4(String message) {
    if (leaderElectionService.needToStartListener()) {
      // Start processing messages
      // Your business logic here
      System.out.println("Received message: " + message);
      consumerService.processMessage(message);
    } else {
      System.out.println("Condition is false, not starting listener.");
    }
  }

  @KafkaListener(
      topics = "subject5",
      groupId = "subject-group-5",
      //id = "your-listener-id",
      //containerFactory = "kafkaListenerContainerFactory",
      autoStartup = "false",
      concurrency = "1"
  )
  public void listenToKafka5(String message) {
    if (leaderElectionService.needToStartListener()) {
      // Start processing messages
      // Your business logic here
      System.out.println("Received message: " + message);
      consumerService.processMessage(message);
    } else {
      System.out.println("Condition is false, not starting listener.");
    }
  }

  @KafkaListener(
      topics = "subjec6",
      groupId = "subject-group-6",
      //id = "your-listener-id",
      //containerFactory = "kafkaListenerContainerFactory",
      autoStartup = "false",
      concurrency = "1"
  )
  public void listenToKafka6(String message) {
    if (leaderElectionService.needToStartListener()) {
      // Start processing messages
      // Your business logic here
      System.out.println("Received message: " + message);
      consumerService.processMessage(message);
    } else {
      System.out.println("Condition is false, not starting listener.");
    }
  }

  @KafkaListener(
      topics = "subject7",
      groupId = "subject-group-7",
      //id = "your-listener-id",
      //containerFactory = "kafkaListenerContainerFactory",
      autoStartup = "false",
      concurrency = "1"
  )
  public void listenToKafka7(String message) {
    if (leaderElectionService.needToStartListener()) {
      // Start processing messages
      // Your business logic here
      System.out.println("Received message: " + message);
      consumerService.processMessage(message);
    } else {
      System.out.println("Condition is false, not starting listener.");
    }
  }

  @KafkaListener(
      topics = "subject8",
      groupId = "subject-group-8",
      //id = "your-listener-id",
      //containerFactory = "kafkaListenerContainerFactory",
      autoStartup = "false",
      concurrency = "1"
  )
  public void listenToKafka8(String message) {
    if (leaderElectionService.needToStartListener()) {
      // Start processing messages
      // Your business logic here
      System.out.println("Received message: " + message);
      consumerService.processMessage(message);
    } else {
      System.out.println("Condition is false, not starting listener.");
    }
  }

  @KafkaListener(
      topics = "subject9",
      groupId = "subject-group-9",
      //id = "your-listener-id",
      //containerFactory = "kafkaListenerContainerFactory",
      autoStartup = "false",
      concurrency = "1"
  )
  public void listenToKafka9(String message) {
    if (leaderElectionService.needToStartListener()) {
      // Start processing messages
      // Your business logic here
      System.out.println("Received message: " + message);
      consumerService.processMessage(message);
    } else {
      System.out.println("Condition is false, not starting listener.");
    }
  }

}