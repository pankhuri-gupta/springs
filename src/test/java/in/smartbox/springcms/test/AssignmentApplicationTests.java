package in.smartbox.springcms.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import in.smartbox.springcms.service.AssignmentService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { SpringCMSTestConfig.class })
public class AssignmentApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Autowired
	AssignmentService assignmentService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testAddTwoNumbers() {
		// 1. Setup
		int a = 2, b = 3, expectedResult = 5;

		// 2. Calculate

		int actualResult = assignmentService.addTwoNumber(a, b);
		// 3. Verify

		Assert.assertEquals(expectedResult, actualResult);

	}

}
