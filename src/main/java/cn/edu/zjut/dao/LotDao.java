package cn.edu.zjut.dao;

import cn.edu.zjut.po.Lot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("lotDao")
@Mapper
public interface LotDao {
    public List<Lot> selectLotByCommunityId(String community_id);
    public Lot selectLotByLotId(String lot_id);
    public int addLot(Lot lot);
    public int updateLot(Lot lot);
    public int deleteLot(String lot_id);
    public String selectLotPictureById(String lot_id);
}
