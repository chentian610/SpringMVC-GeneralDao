package com.chentian610.test.service;

import com.chentian610.test.vo.TestVO;

import java.util.List;

/**
 * Created by tuto on 2016-12-05 .
 */
public interface TestService {

    public void addTest(TestVO vo);

    public void updateTest(TestVO vo);

    public void deleteTest(TestVO vo);

    public List<TestVO> getTestList(TestVO vo);
}
