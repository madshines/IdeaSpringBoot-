package com.madshines.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootLogApplicationTests {
    Logger logger = LoggerFactory.getLogger(SpringBootLogApplicationTests.class);

    @Test
    void contextLoads() {
        //日志级别，由低到高，可以手动调节日志级别
        logger.trace("这是跟踪日志");
        logger.debug("这是调试日志");
        logger.info("这是info日志");
        logger.warn("这是警告日志");
        logger.error("这是错误日志");
    }

}
