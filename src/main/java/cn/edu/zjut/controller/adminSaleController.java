package cn.edu.zjut.controller;

import cn.edu.zjut.po.Sale;
import cn.edu.zjut.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//管理员对活动的管理，发布修改删除查询

@RestController
@RequestMapping("/")
public class adminSaleController {
    @Autowired
    private SaleService saleService;
    @RequestMapping("/")
    public Map addSale(Sale sale){
        Map result=new HashMap();
        if (saleService.AddSale(sale)){
            result.put("success",true);
        }
        else {
            result.put("success",false);
        }
        return  result;
    }
    @RequestMapping("/")
    public Map updateSale(Sale sale){
        Map result=new HashMap();
        if (saleService.UpdateSale(sale)){
            result.put("success",true);
        }
        else {
            result.put("success",false);
        }
        return  result;
    }
    @RequestMapping("/")
    public Map deleteSale(int sale_id){
        Map result=new HashMap();
        if (saleService.DeleteSale(sale_id)){
            result.put("success",true);
        }
        else {
            result.put("success",false);
        }
        return  result;
    }
    @RequestMapping("/")
    public List<Sale> selectSaleByCommunity(String community_id){
        List<Sale> saleList = saleService.SelectSaleByCommunityId(community_id);
//      将活动信息传到前端
        return saleList;
    }
}
