package cn.edu.zjut.service;

import cn.edu.zjut.dao.BuyDao;
import cn.edu.zjut.po.Buy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("buyService")
public class BuyService implements  IBuyService{
    @Autowired
    private BuyDao buyDao;

    @Override
    public boolean AddBuy(Buy buy) {
        try {
            if(buyDao.addBuy(buy) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean UpdateBuy(Buy buy) {
        try {
            if(buyDao.updateBuy(buy) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean DeleteBuy(int buy_id) {
        try {
            if(buyDao.deleteBuy(buy_id) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public Buy SelectBuyByLotId(String lot_id) {
        return buyDao.selectBuyByLotId(lot_id);
    }

    @Override
    public List<Buy> SelectBuyByOwnerId(String owner_id) {
        return buyDao.selectBuyByOwnerId(owner_id);
    }

    @Override
    public Buy SelectBuyById(int buy_id) {
        return buyDao.selectBuyById(buy_id);
    }

    @Override
    public boolean UpdateBuyPayOff(int buy_id) {
        try {
            if(buyDao.updateBuyPayOff(buy_id) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }
}
