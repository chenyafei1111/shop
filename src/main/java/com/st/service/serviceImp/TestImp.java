package com.st.service.serviceImp;

import com.st.bean.Area;
import com.st.mapper.DaoTest;
import com.st.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestImp implements TestService {
    @Autowired
    private DaoTest daoTest;

    public List<Area> getDaoTest() {
        List<Area> area = daoTest.getArea();
        System.out.println(area);
        return area;
    }

}
