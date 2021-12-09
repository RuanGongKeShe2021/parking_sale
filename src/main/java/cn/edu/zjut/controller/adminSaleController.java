package cn.edu.zjut.controller;

import cn.edu.zjut.po.Sale;
import cn.edu.zjut.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class adminSaleController {
    @Autowired
    private SaleService saleService;
    @RequestMapping("/")
    public String addSale(Sale sale){
        if (saleService.AddSale(sale)){
            return "";
        }
        else return "";
    }
    @RequestMapping("/")
    public String updateSale(Sale sale){
        if (saleService.UpdateSale(sale)){
            return "";
        }
        else return "";
    }
    @RequestMapping("/")
    public String deleteSale(int sale_id){
        if (saleService.DeleteSale(sale_id)){
            return "";
        }
        else return "";
    }
    @RequestMapping("/")
    public String selectSaleByCommunity(String community_id){
        List<Sale> saleList = saleService.SelectSaleByCommunityId(community_id);
//      将活动信息传到前端
        return "";
    }
}
