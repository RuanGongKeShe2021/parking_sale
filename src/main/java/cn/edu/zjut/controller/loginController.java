package cn.edu.zjut.controller;

import cn.edu.zjut.po.Community;
import cn.edu.zjut.po.Owner;
import cn.edu.zjut.service.CommunityService;
import cn.edu.zjut.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class loginController {
    @Autowired
    private OwnerService ownerService;
    @Autowired
    private CommunityService communityService;

    @RequestMapping("/login")
    public String login(String owner_id,String password){
        if(ownerService.Login(owner_id,password)){
            //通过前端传过来的只有业主ID和密码，并未业主的其余信息，需要进一步查询
            Owner owner = ownerService.SelectOwnerById(owner_id);
//            将业主自己的信息传到前端
            return "center";
        }
        else {
            return "login";
        }
    }
    @RequestMapping("/register")
    public String register(@RequestBody Owner owner){
        if (ownerService.Register(owner)){
            return "login";
        }
        else {
//            该ID已被注册
            return "register";
        }
    }
    @RequestMapping("/")
    public String updateOwner(Owner owner){
        if (ownerService.UpdateOwner(owner)){
            return "";
        }
        else return "";
    }
    @RequestMapping("/center")
    public String communityCheck(String owner_id){
        List<Community> commList = communityService.SelectCommunityByOwnerId(owner_id);
//        将小区名传给前端，用于下拉框显示（只能在其拥有房产的小区内买车位）
        return "";
    }


}
