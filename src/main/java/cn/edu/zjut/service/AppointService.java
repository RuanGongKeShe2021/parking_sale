package cn.edu.zjut.service;

import cn.edu.zjut.dao.AppointDao;
import cn.edu.zjut.dao.LotDao;
import cn.edu.zjut.po.Appoint;
import cn.edu.zjut.po.Lot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service("appointService")
public class AppointService implements IAppointService{
    @Autowired
    private AppointDao appointDao;
    @Autowired
    private LotDao lotDao;
    @Override
    public List<Appoint> FindAllAppoint(String owner_id) {
        return appointDao.selectAppointByOwnerId(owner_id);
    }

    @Override
    public boolean AddAppoint(Appoint appoint) {
        try {
            if(appointDao.addAppoint(appoint) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean UpdateAppoint(Appoint appoint) {
        try {
            if(appointDao.updateAppoint(appoint) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean DeleteAppoint(int appoint_id) {
        try {
            if(appointDao.deleteAppoint(appoint_id) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public List<Appoint> FindAppointByLot_id(String lot_id) {
        return appointDao.selectAppointByLotId(lot_id);
    }

//    摇号得结果后更改摇中appoint的状态字段status
    @Override
    public boolean UpdateAppointGot(int appoint_id) {
        try {
            if(appointDao.updateAppointGot(appoint_id) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

//    摇号
    @Override
    public Map<String,Integer> AppointGot(String community_id) {
        Map<String, Integer> map = new HashMap<>();
        List<Lot> lot_list = lotDao.selectLotByCommunityId(community_id);
        for (Lot lot : lot_list) {
            List<Appoint> list = appointDao.selectAppointByLotId(lot.getLot_id());
            int len = list.size();
            if (len == 1) {
                map.put(lot.getLot_id(),list.get(0).getAppoint_id());
            } else {
                Random rd = new Random();
                int randon = rd.nextInt(len) + 1;
                int tmp = list.get(randon).getAppoint_id();
                UpdateAppointGot(tmp);
                map.put(lot.getLot_id(), tmp);
            }
        }return map;
    }
}
