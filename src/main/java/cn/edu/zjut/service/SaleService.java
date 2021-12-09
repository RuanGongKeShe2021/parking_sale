package cn.edu.zjut.service;

import cn.edu.zjut.dao.SaleDao;
import cn.edu.zjut.po.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("saleService")
public class SaleService implements ISaleService{
    @Autowired
    private SaleDao saleDao;

    @Override
    public List<Sale> SelectSaleOnByCommunityId(String community_id) {
        return saleDao.selectSaleOnByCommunityId(community_id);
    }

    @Override
    public List<Sale> SelectSaleByCommunityId(String community_id) {
        return saleDao.selectSaleByCommunityId(community_id);
    }

    @Override
    public boolean AddSale(Sale sale) {
        try {
            if(saleDao.addSale(sale) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean UpdateSale(Sale sale) {
        try {
            if(saleDao.updateSale(sale) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean DeleteSale(int sale_id) {
        try {
            if(saleDao.deleteSale(sale_id) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }
}
