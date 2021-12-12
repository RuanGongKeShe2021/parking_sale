package cn.edu.zjut.controller;

import cn.edu.zjut.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class adminCertification {
    @Autowired
    private OwnerService ownerService;
    @RequestMapping("/")
    public String certificate(String owner_id){
        if(ownerService.UpdateOwnerCertification(owner_id)){
            return "";
        }else return "";
    }
    @RequestMapping("/")
    public String certificatedPrint(String community_id){
        ownerService.selectCertificated(community_id);
        return "";
    }
    @RequestMapping("/")
    public String unCertificatedPrint(String community_id){
        ownerService.SelectUnCertificated(community_id);
        return "";
    }
}
