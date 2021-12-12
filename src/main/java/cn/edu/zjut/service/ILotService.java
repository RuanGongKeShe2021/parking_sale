package cn.edu.zjut.service;

import cn.edu.zjut.po.Lot;

import java.util.List;

public interface ILotService {
    public void updateStatusByTime();
    public Lot SelectLotById(String lot_id);
    public List<Lot> SelectLotByCommunityId(String community_id);
    public List<Lot> SelectLotSoldByCommunityId(String community_id);
    public List<Lot> SelectLotUnSoldByCommunityId(String community_id);
    public boolean AddLot(Lot lot);
    public boolean UpdateLot(Lot lot);
    public boolean DeleteLot(String lot_id);
    public String SelectLotPictureById(String lot_id);
    public boolean AddBuyCascade(String owner_id,int lot_id);
    public boolean DeleteBuyCascade(String lot_id);
    public List<Lot> SelectLotSaleStatus(String community_id);
    public boolean UpdateSaleStatus(String lot_id);
}
