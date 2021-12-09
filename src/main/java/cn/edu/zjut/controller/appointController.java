package cn.edu.zjut.controller;

import cn.edu.zjut.po.Appoint;
import cn.edu.zjut.service.AdminService;
import cn.edu.zjut.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class appointController {
    @Autowired
    private AppointService appointService;
    @RequestMapping("/")
    public String addAppoint(@RequestBody Appoint appoint){
        if(appointService.AddAppoint(appoint)){
//            前端显示预约成功信息
            return "";
        }
        else {
//            显示预约失败信息
            return "";
        }
    }
    @RequestMapping("/")
    public String updateAppoint(@RequestBody Appoint appoint){
        if(appointService.UpdateAppoint(appoint)){
//            更新成功信息
            return "";
        }
        else {
//            更新失败
            return "";
        }
    }
    @RequestMapping("/")
    public String deleteAppoint(int appoint_id){
        if(appointService.DeleteAppoint(appoint_id)){
//            删除成功
            return "";
        }
        else {
//            删除失败
            return "";
        }
    }


//  我的预约模块 其中对于每一条预约都可进行增删改操作
    @RequestMapping("/")
    public String selectAppointByOwnerId(String owner_id){
        List<Appoint> appList = appointService.FindAllAppoint(owner_id);
        //将预约传到前端
        return "";
    }
}
