package com.jtbdevelopment.spring.hz.autoconfig;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.GroupConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Date: 6/13/2020
 * Time: 10:49 PM
 */
@Configuration
@ImportAutoConfiguration(HazelcastAutoConfiguration.class)
@AutoConfigureBefore({HazelcastAutoConfiguration.class, CacheAutoConfiguration.class})
public class HazelcastClientAutoConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(HazelcastClientAutoConfiguration.class);

    @Bean
    @ConditionalOnMissingBean
    public ClientConfig clientConfig() {
        logger.info("Making a client config bean");
        ClientConfig config = new ClientConfig();
        GroupConfig groupConfig = config.getGroupConfig();
        groupConfig.setName("dev");
        groupConfig.setPassword("dev-pass");
        return config;
    }
}
