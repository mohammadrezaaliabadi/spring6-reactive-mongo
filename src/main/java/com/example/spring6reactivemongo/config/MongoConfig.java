package com.example.spring6reactivemongo.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractReactiveMongoConfiguration {
    @Bean
    public MongoClient mongoConfig(){
        return MongoClients.create();
    }
    @Override
    protected String getDatabaseName() {
        return "sfg";
    }
}
