package com.jtbdevelopment.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.stereotype.Component;

/**
 * Date: 6/13/2020
 * Time: 11:30 PM
 */
@Component
public class CacheTester {
    private static Logger logger = LoggerFactory.getLogger(CacheTester.class);

    public CacheTester(final CacheManager cacheManager) {
        logger.info("**********************************");
        logger.info("**********************************");
        logger.info("**********************************");
        logger.info("Cache manager is of class {}", cacheManager.getClass().getCanonicalName());
        if (cacheManager instanceof ConcurrentMapCacheManager) {
            logger.error("Wrong type");
            logger.error("Wrong type");
            logger.error("Wrong type");
        }
        logger.info("**********************************");
        logger.info("**********************************");
        logger.info("**********************************");
    }
}
