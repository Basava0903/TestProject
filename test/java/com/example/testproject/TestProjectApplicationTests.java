package com.example.testproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestProjectApplicationTests {

	public static Logger logger =LoggerFactory.getLogger(TestProjectApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case Executing");
		assertEquals(true,true);
	}

}
