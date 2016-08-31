package win.renboqieqie.core.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import win.renboqieqie.core.bean.TestTb;
import win.renboqieqie.core.dao.TestTbDao;

@Service
@Transactional
public class TestTbServiceImpl implements TestTbService {

	@Resource
	private TestTbDao testTbDao;
	/*关掉了事务,查询语句的时候关闭*/
	/*@Transactional(readOnly  = true)*/
	public void addTestTb(TestTb testTb) {
		// TODO Auto-generated method stub
		testTbDao.insert(testTb);
	}
	
	
}
