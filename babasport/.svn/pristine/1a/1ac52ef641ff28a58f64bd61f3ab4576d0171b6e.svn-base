package win.renboqieqie;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import win.renboqieqie.common.junit.SpringJunitTest;
import win.renboqieqie.core.bean.TestTb;
import win.renboqieqie.core.service.TestTbService;

/**
 * 
 * @author Administrator
 *
 */

public class TestTestTb extends SpringJunitTest{

	@Autowired
	private TestTbService testTbService;
	@Test
	public void testAdd() throws Exception{
		TestTb testTb  = new TestTb();
		testTb.setName("咋个又有一场");
		testTbService.addTestTb(testTb);
	}
}
