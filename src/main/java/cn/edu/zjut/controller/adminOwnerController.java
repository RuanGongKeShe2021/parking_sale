package cn.edu.zjut.controller;

import cn.edu.zjut.po.Owner;
import cn.edu.zjut.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//管理员对业主的管理

@Controller
@RequestMapping("/")
public class adminOwnerController {
    @Autowired
    private OwnerService ownerService;
    @RequestMapping("/")
    public String addOwner(Owner owner){
        if(ownerService.Register(owner)){
            return "";
        }else return "";
    }
    @RequestMapping("/")
    public String updateOwner(Owner owner){
        if(ownerService.UpdateOwner(owner)){
            return "";
        }else return "";
    }
    @RequestMapping("/")
    public String deleteOwner(String owner_id){
        if (ownerService.DeleteOwner(owner_id)){
            return "";
        }else return "";
    }
}
