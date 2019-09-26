package com.dao;

import com.BeatTest;
import com.st.bean.Area;
import com.st.mapper.DaoTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Daotest extends BeatTest {
    @Autowired
    private DaoTest daoTest;

    @Test
    public void testGetArea(){
        List<Area> area = daoTest.getArea();
        System.out.println(area);
    }

}
