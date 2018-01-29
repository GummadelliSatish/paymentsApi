package com.form3.services.data.payment.repo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;

import cz.jirutka.spring.embedmongo.EmbeddedMongoBuilder;

/**
 * Embedded mongoDB configuration
 * @author satishgummadelli
 *
 */
@Configuration
@EnableMongoRepositories
@EnableAutoConfiguration
public class MongoApplicationConfig extends AbstractMongoConfiguration {


    @Override
    protected String getDatabaseName() {
        return "form3-test-db";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new EmbeddedMongoBuilder()
            .version("2.6.1")
            .bindIp("127.0.0.1")
            .port(12345)
            .build();
    }
}