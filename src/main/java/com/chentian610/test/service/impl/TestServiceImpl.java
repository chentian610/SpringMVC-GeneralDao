package com.chentian610.test.service.impl;

import com.chentian610.framework.GeneralDAO;
import com.chentian610.test.service.TestService;
import com.chentian610.test.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value="TestServiceImpl")
public class TestServiceImpl implements TestService {
	@Autowired
	private GeneralDAO dao;

	public void addTest(TestVO vo) {
		Integer id = dao.insertObjectReturnID("testMap.insertTest",vo);
		vo.setId(id);
	}

	public void updateTest(TestVO vo) {
		dao.updateObject("testMap.updateTest",vo);
	}

	public void deleteTest(TestVO vo) {
		dao.deleteObject("testMap.deleteTestById",vo.getId());
	}

	public List<TestVO> getTestList(TestVO vo) {
		return dao.queryForList("testMap.getTestList",vo);
	}
}
