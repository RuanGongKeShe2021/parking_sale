package cn.edu.zjut.controller;

import cn.edu.zjut.po.Buy;
import cn.edu.zjut.service.BuyService;
import cn.edu.zjut.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class buyController {
    @Autowired
    private BuyService buyService;
    @Autowired
    private LotService lotService;

//    只有在车位有剩余或者摇中时才可购买
    @RequestMapping("/")
    public String addBuy(@RequestBody Buy buy){
        if(buyService.AddBuy(buy)){
            lotService.AddBuyCascade(buy.getOwner().getOwner_id(),buy.getBuy_id());
//            购买成功
            return "";
        }
        else {
//            购买失败
            return "";
        }
    }
    @RequestMapping("/")
    public String updateBuy(@RequestBody Buy buy){
        if (buyService.UpdateBuy(buy)){
            return "";
        }
        else {
            return "";
        }
    }
//    放弃购买会收取相应费用
    @RequestMapping("/")
    public String deleteBuy(int buy_id){
        Buy buy = buyService.SelectBuyById(buy_id);
        String tmp_id = buy.getLot().getLot_id();
        if (buyService.DeleteBuy(buy_id)){
            lotService.DeleteBuyCascade(tmp_id);
            return "";
        }
        else {
            return "";
        }
    }



    //我的购买模块（车位查看）
    @RequestMapping("/")
    public String selectBuyByOwnerId(String owner_id){
        List<Buy> buyList = buyService.SelectBuyByOwnerId(owner_id);
//        将购买列表传到前端
        return "";
    }
}
