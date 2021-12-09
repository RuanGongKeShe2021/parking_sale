package cn.edu.zjut.controller;

import cn.edu.zjut.po.Admin;
import cn.edu.zjut.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class adminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/login")
    public String login(String admin_id,String password){
        if (adminService.SelectAdminById(admin_id).getPassword().equals(password)){
            return "";
        }
        else return "adminlogin";
    }
}
