package cn.edu.zjut.service;

import cn.edu.zjut.po.Buy;

import java.util.List;

public interface IBuyService {
    public boolean AddBuy(Buy buy);
    public boolean UpdateBuy(Buy buy);
    public boolean DeleteBuy(Buy buy);
    public List<Buy> SelectBuyByOwnerId(String owner_id);
    public Buy SelectBuyByLotId(String lot_id);
}
