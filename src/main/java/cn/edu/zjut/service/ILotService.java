package cn.edu.zjut.service;

import cn.edu.zjut.po.Lot;

import java.util.List;

public interface ILotService {
    public Lot SelectLotById(String lot_id);
    public List<Lot> FindAllLot(String community_id);
    public boolean AddLot(Lot lot);
    public boolean UpdateLot(Lot lot);
    public boolean DeleteLot(String lot_id);
    public String GetRootOfPicture(String lot_id);
}
