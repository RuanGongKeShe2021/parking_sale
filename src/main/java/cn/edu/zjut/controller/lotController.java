package cn.edu.zjut.controller;

import cn.edu.zjut.po.Lot;
import cn.edu.zjut.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/lot")
public class lotController {
    @Autowired
    private LotService lotService;
    @RequestMapping("/selectLotList")
    public String selectLotList(String community_id){
        List<Lot> lotList = lotService.SelectLotByCommunityId(community_id);
//        传给前端车位集合
        return "";
    }
    @RequestMapping("/selectLotSingle")
    public String selectLot(String lot_id){
        Lot lot = lotService.SelectLotById(lot_id);
//        传给前端车位信息
        return "";
    }
}
