package com.st.controller.superadmin;

import com.st.bean.Area;
import com.st.service.TestService;
import com.st.service.serviceImp.TestImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    TestService testService;

    @RequestMapping("/listarea")
    @ResponseBody
    private Map<String,Object> listArea(){
        Map<String, Object> map = new HashMap<String, Object>();
        List list = new ArrayList<Area>();

        try {
            list = testService.getDaoTest();
            map.put("rows",list);
            map.put("total",list.size());

        }catch (Exception e){
            e.printStackTrace();
            map.put("success",false);
            map.put("errmsg",e.toString());
        }

        return map;

    }

}
