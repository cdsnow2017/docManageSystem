package edu.ynu.docmanagesystem.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//加载spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/applicationContext-dao.xml",
      "classpath:spring/applicationContext-service.xml", "classpath:spring/applicationContext-transaction.xml" })
public class UserServiceTest extends AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private UserService userService;

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testLoginVerify() {
		
	}

	@Test
	public void testUserAuthenticate() {
		assertEquals(1, userService.loginVerify(2013, "2013", 1));
		assertEquals(-1, userService.loginVerify(12313, "312312", 1));
		assertEquals(0, userService.loginVerify(2013, "2013", 2));
		assertEquals(-2, userService.loginVerify(2013, "23123", 1));
		
	}

}
