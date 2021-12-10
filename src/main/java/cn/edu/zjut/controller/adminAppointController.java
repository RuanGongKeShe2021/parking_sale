package cn.edu.zjut.controller;

import cn.edu.zjut.po.Appoint;
import cn.edu.zjut.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class adminAppointController {
    @Autowired
    private AppointService appointService;
    @RequestMapping("")
    public  Map<String,Integer> appointGot(String lot_id){
        int got_appoint_id = appointService.AppointGot(lot_id);
//        将摇中号传到前端
        Map<String,Integer> result=new HashMap<String,Integer>();
        result.put("got_appoint_id",got_appoint_id);
        return result;
    }


}
