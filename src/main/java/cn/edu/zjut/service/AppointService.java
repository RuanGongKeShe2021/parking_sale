package cn.edu.zjut.service;

import cn.edu.zjut.dao.AppointDao;
import cn.edu.zjut.po.Appoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service("appointService")
public class AppointService implements IAppointService{

    @Autowired
    private AppointDao appointDao;

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
    public int AppointGot(String lot_id) {
        List<Appoint> list = appointDao.selectAppointByLotId(lot_id);
        Random rd = new Random();
        int number=list.size();
        int randon = rd.nextInt(number);
        int tmp = list.get(randon).getAppoint_id();
        if(UpdateAppointGot(tmp)){
            return tmp;
        }else return 0;
    }
}
