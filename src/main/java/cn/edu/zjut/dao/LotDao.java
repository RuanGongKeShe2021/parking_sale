package cn.edu.zjut.dao;

import cn.edu.zjut.po.Lot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("lotDao")
@Mapper
public interface LotDao {
    public int updateStatusByTime();
    public List<Lot> selectLotByCommunityId(String community_id);
    public Lot selectLotByLotId(String lot_id);
    public List<Lot> selectLotSoldByCommunityId(String community_id);
    public List<Lot> selectLotUnSoldByCommunityId(String community_id);
    public String selectLotPictureById(String lot_id);
    public int addLot(Lot lot);
    public int updateLot(Lot lot);
    public int addBuyCascade(String owner_id,int lot_id);
    public int deleteLot(String lot_id);
    public int deleteBuyCascade(String lot_id);
    public List<Lot> selectLotSaleStatus(String community_id);
    public int updateSaleStatus(String lot_id);
}
