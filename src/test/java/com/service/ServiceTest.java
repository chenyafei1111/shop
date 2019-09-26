package com.service;

import com.BeatTest;
import com.st.bean.Area;
import com.st.service.TestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceTest extends BeatTest{
    @Autowired
    private TestService testService;

    @Test
    public void setTestService(){
        List<Area> daoTest = testService.getDaoTest();
        System.out.println(daoTest);
    }

}
