package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;


public class ProducerApp {

    private ProducerApp() {

    }
    public static void main(String[] args){
        // Load Producer configuration from properties
        Properties props = new Properties();
        try {
            props.load(getClass().getClassLoader().getResourceAsStream("producer-config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // KafkaProducer<String, String> myProducer = new KafkaProducer<String, String>(props);
        // DateFormat dtFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
        // String topic = "my-topic";

        // int numberOfRecords = 100; // number of records to send
        // long sleepTimer = 30; // how long you want to wait before the next record to be sent
        // try {
        //         for (int i = 0; i < numberOfRecords; i++ ){
        //             myProducer.send(new ProducerRecord<String, String>(topic, String.format("Message: %s  sent at %s", Integer.toString(i), dtFormat.format(new Date()))));
        //             Thread.sleep(sleepTimer);
        //         }
        //             // Thread.sleep(new Random(5000).nextLong()); // use if you want to randomize the time between record sends
        // } catch (Exception e) {
        //     e.printStackTrace();
        // } finally {
        //     myProducer.close();
        // }

    }
}
