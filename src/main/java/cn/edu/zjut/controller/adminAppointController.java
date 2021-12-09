package cn.edu.zjut.controller;

import cn.edu.zjut.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class adminAppointController {
    @Autowired
    private AppointService appointService;
    @RequestMapping("")
    public String appointGot(String lot_id){
        int got_appoint_id = appointService.AppointGot(lot_id);
//        将摇中号传到前端
        return "";
    }
}
