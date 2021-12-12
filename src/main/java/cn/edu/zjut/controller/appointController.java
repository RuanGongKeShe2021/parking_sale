package cn.edu.zjut.controller;

import cn.edu.zjut.po.Appoint;
import cn.edu.zjut.service.AdminService;
import cn.edu.zjut.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class appointController {
    @Autowired
    private AppointService appointService;
    @RequestMapping("/")
    public Map<String,Boolean> addAppoint(@RequestBody Appoint appoint){
        Map<String,Boolean> result=new HashMap<String,Boolean>();
        if(appointService.AddAppoint(appoint)){
//            前端显示预约成功信息
            result.put("success",true);

        }
        else {
//            显示预约失败信息
            result.put("success",false);
        }
        return  result;
    }
    @RequestMapping("/")
    public Map<String,Boolean> updateAppoint(@RequestBody Appoint appoint){
        Map<String,Boolean> result=new HashMap<String,Boolean>();
        if(appointService.UpdateAppoint(appoint)){
//            更新成功信息
            result.put("success",true);

        }
        else {
//            更新失败

            result.put("success",false);
        }
        return  result;
    }
    @RequestMapping("/")
    public Map<String,Boolean> deleteAppoint(int appoint_id){
        Map<String,Boolean> result=new HashMap<String,Boolean>();
        if(appointService.DeleteAppoint(appoint_id)){
//            删除成功
            result.put("success",true);
        }
        else {
//            删除失败
            result.put("success",false);
        }
        return  result;
    }


//  我的预约模块 其中对于每一条预约都可进行增删改操作
    @RequestMapping("/")
    public List<Appoint> selectAppointByOwnerId(String owner_id){
        List<Appoint> appList = appointService.FindAllAppoint(owner_id);
        //将预约传到前端
        return appList;
    }
}
