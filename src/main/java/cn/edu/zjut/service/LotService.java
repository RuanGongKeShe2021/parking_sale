package cn.edu.zjut.service;

import cn.edu.zjut.dao.LotDao;
import cn.edu.zjut.po.Lot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("lotService")
public class LotService implements ILotService{
    @Autowired
    private LotDao lotDao;

    @Override
    public Lot SelectLotById(String lot_id) {
        return lotDao.selectLotByLotId(lot_id);
    }

    @Override
    public List<Lot> FindAllLot(String community_id) {
        return lotDao.selectLotByCommunityId(community_id);
    }

    @Override
    public boolean AddLot(Lot lot) {
        try {
            if(lotDao.addLot(lot) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean UpdateLot(Lot lot) {
        try {
            if(lotDao.updateLot(lot) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean DeleteLot(String lot_id) {
        try {
            if(lotDao.deleteLot(lot_id) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public String GetRootOfPicture(String lot_id) {
        return lotDao.selectLotPictureById(lot_id);
    }
}
