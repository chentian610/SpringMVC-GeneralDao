package com.chentian610.test.controller;

import com.chentian610.test.service.TestService;
import com.chentian610.test.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="testAction")
public class TestController {
	@Autowired
	private TestService testService;

	/**
	 * 添加
	 * @param vo
	 */
	@RequestMapping(value="/addTest")
	public Object addTest(TestVO vo){
		testService.addTest(vo);
		return "添加成功";
	}

	/**
	 * 修改
	 * @param vo
	 */
	@RequestMapping(value="/updateTest")
	public Object updateTest(TestVO vo){
		testService.updateTest(vo);
		return "修改成功";
	}


	/**
	 * 删除
	 * @param vo
	 */
	@RequestMapping(value="/deleteTest")
	public Object deleteTest(TestVO vo){
		testService.deleteTest(vo);
		return "删除成功";
	}

	/**
	 * 查询
	 * @param vo
	 */
	@RequestMapping(value="/getTestList")
	public Object getTestList(TestVO vo){
		return testService.getTestList(vo);
	}
	
}
