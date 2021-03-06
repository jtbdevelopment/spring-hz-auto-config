package com.jtbdevelopment.spring.hz.beanconfig;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.GroupConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

/**
 * Date: 6/13/2020
 * Time: 10:49 PM
 */
@Configuration
public class HazelcastClientConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(HazelcastClientConfiguration.class);

    @Bean
    @Lazy(false)
    public ClientConfig clientConfig() {
        logger.info("Making a client config bean");
        ClientConfig config = new ClientConfig();
        GroupConfig groupConfig = config.getGroupConfig();
        groupConfig.setName("dev");
        groupConfig.setPassword("dev-pass");
        return config;
    }
}
