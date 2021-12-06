package cn.edu.zjut.service;

import cn.edu.zjut.dao.OwnerDao;
import cn.edu.zjut.po.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ownerService")
public class OwnerService implements IOwnerService{
    @Autowired
    private OwnerDao ownerDao;

    @Override
    public boolean Login(String owner_id,String password) {
        try {
            if(ownerDao.selectOwnerCheck(owner_id,password) != null){
                return true;
            }
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean Register(Owner owner) {
        try {
            if(ownerDao.addOwner(owner) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean UpdateOwnerInfo(String owner_id) {
        try {
            if(ownerDao.updateOwnerCertification(owner_id) == 1)
                return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public Owner OwnerInfo(String owner_id) {
        return ownerDao.selectOwnerById(owner_id);
    }
}
