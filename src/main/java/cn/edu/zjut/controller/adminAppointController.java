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

//管理员对预约进行摇号


@Controller
@RequestMapping("/")
public class adminAppointController {
    @Autowired
    private AppointService appointService;
    @RequestMapping("")
    public String appointGot(String community_id){
        Map<String,Integer> map = appointService.AppointGot(community_id);
//        将摇中号传到前端
        return "";
    }
}
