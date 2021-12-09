package cn.edu.zjut.dao;

import cn.edu.zjut.po.Appoint;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("appointDao")
@Mapper
public interface AppointDao {
    public List<Appoint> selectAppointByOwnerId(String owner_id);
    public List<Appoint> selectAppointByLotId(String lot_id);
    public int addAppoint(Appoint appoint);
    public int updateAppoint(Appoint appoint);
    public int deleteAppoint(int appoint_id);
    public int updateAppointGot(int lot_id);
}
