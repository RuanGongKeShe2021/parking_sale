package cn.edu.zjut.controller;

import cn.edu.zjut.po.Admin;
import cn.edu.zjut.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

//管理员管理，主要用于开发商进行操作，管理员的增删改

@Controller
@RequestMapping("/admin")
public class adminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("/login")
    public Map login(String admin_id,String password){
        Map result=new HashMap();
        Admin admin=adminService.SelectAdminById(admin_id);
        if (admin.getPassword().equals(password)){
            result.put("success",true);
            result.put("admin",admin);
        }
        else{
            result.put("success",false);
        }
        return result;
    }
    @RequestMapping("/")
    public String updateAdmin(Admin admin){
        if(adminService.UpdateAdmin(admin)){
            return "";
        }else return "";
    }
}
