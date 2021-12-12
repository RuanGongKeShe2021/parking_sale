package cn.edu.zjut.controller;

import cn.edu.zjut.po.Appoint;
import cn.edu.zjut.po.Community;
import cn.edu.zjut.po.Lot;
import cn.edu.zjut.service.AppointService;
import cn.edu.zjut.service.CommunityService;
import cn.edu.zjut.service.DeveloperService;
import cn.edu.zjut.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//开发商自己的一些操作，登录，销售情况查看，名下小区查看

@Controller
@RequestMapping("/developer")
public class developerController {
    @Autowired
    private DeveloperService developerService;
    @Autowired
    private CommunityService communityService;
    @Autowired
    private LotService lotService;
    @Autowired
    private AppointService appointService;

    @RequestMapping("/login")
    public String login(String developer_id,String password){
        if(developerService.Login(developer_id,password)){
            return "";
        }else return "developerlogin";
    }

    @RequestMapping("/")
    public String communityCheck(String developer_id){
        List<Community> list = communityService.FindAllCommunity(developer_id);
        return "";
    }
//    将车位销售比，未销售车位传到前端
    @RequestMapping("/")
    public String saleCheck(String community_id){
        Community community = communityService.SelectCommunityById(community_id);
        List<Lot> lotList = lotService.SelectLotSoldByCommunityId(community_id);
        double sale_rate = 1.0*lotList.size()/community.getLot_num();
        List<Lot> lotList1 = lotService.SelectLotUnSoldByCommunityId(community_id);
        int count = 0;
        List<Lot> lotList2 = lotService.SelectLotByCommunityId(community_id);
        for(Lot lot:lotList2){
            List<Appoint> appointList = appointService.FindAppointByLot_id(lot.getLot_id());
            count += appointList.size();
        }
        return "";
    }
}
