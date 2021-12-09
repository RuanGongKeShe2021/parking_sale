package cn.edu.zjut.dao;

import cn.edu.zjut.po.Buy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("buyDao")
@Mapper
public interface BuyDao {
    public Buy selectBuyById(int buy_id);
    public List<Buy> selectBuyByOwnerId(String owner_id);
    public Buy selectBuyByLotId(String lot_id);
    public int addBuy(Buy buy);
    public int updateBuy(Buy buy);
    public int deleteBuy(int buy_id);
    public int updateBuyPayOff(int buy_id);
}
