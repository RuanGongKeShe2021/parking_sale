package cn.edu.zjut.controller;

import cn.edu.zjut.po.Admin;
import cn.edu.zjut.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//开发商对管理员的管理

@Controller
@RequestMapping("/")
public class developerAdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/")
    public String addAdmin(Admin admin){
        if(adminService.AddAdmin(admin)){
            return "";
        }else return "";
    }
    @RequestMapping("/")
    public String updateAdmin(Admin admin){
        if(adminService.UpdateAdmin(admin)){
            return "";
        }else return "";
    }
    @RequestMapping("/")
    public String deleteAdmin(String admin_id){
        if(adminService.DeleteAdmin(admin_id)){
            return "";
        }else return "";
    }
}
