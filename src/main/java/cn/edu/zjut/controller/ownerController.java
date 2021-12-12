package cn.edu.zjut.controller;

import cn.edu.zjut.po.Owner;
import cn.edu.zjut.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class ownerController {
    @Autowired
    private OwnerService ownerService;
    @RequestMapping("/")
    public String selectOwnerByCommunityId(String community_id){
        List<Owner> ownerList = ownerService.SelectOwnerByCommunityId(community_id);
//        将用户传到前端
        return "";
    }
    @RequestMapping("/")
    public String selectOwnerById(String owner_id){
        Owner owner = ownerService.SelectOwnerById(owner_id);
//        将用户传到前端
        return "";
    }
    @RequestMapping("/")
    public String updateOwner(Owner owner){
        if (ownerService.UpdateOwner(owner)){
            return "";
        }
        else return "";
    }
}
