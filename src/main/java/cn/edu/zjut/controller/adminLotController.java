package cn.edu.zjut.controller;

import cn.edu.zjut.po.Lot;
import cn.edu.zjut.service.LotService;
import cn.edu.zjut.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class adminLotController {
    @Autowired
    private LotService lotService;

    @RequestMapping("/")
    public String addLot(Lot lot){
        if(lotService.AddLot(lot)){
//            车位增加完成
            return "";
        }else return "";
    }
    @RequestMapping("/")
    public String updateLot(Lot lot){
        if(lotService.UpdateLot(lot)){
//            车位更新
            return "";
        }else return "";
    }
    @RequestMapping("/")
    public String deleteLot(String lot_id){
        if (lotService.DeleteLot(lot_id)){
//            车位删除
            return "";
        }else return "";
    }
//    管理员更新车位和活动信息
    @RequestMapping("/")
    public String updateSaleStatus(String lot_id){
        lotService.updateStatusByTime();
        return "";
    }

}
