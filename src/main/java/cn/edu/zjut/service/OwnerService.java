package cn.edu.zjut.service;

import cn.edu.zjut.dao.OwnerDao;
import cn.edu.zjut.po.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public boolean UpdateOwner(Owner owner) {
        try {
            if(ownerDao.updateOwner(owner) == 1)
                return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean UpdateOwnerCertification(String owner_id) {
        try {
            if(ownerDao.updateOwnerCertification(owner_id) == 1)
                return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean DeleteOwner(String owner_id) {
        try {
            if(ownerDao.deleteOwner(owner_id) == 1)
                return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public Owner SelectOwnerById(String owner_id) {
        return ownerDao.selectOwnerById(owner_id);
    }

    @Override
    public List<Owner> SelectOwnerByCommunityId(String community_id) {
        return ownerDao.selectOwnerByCommunityId(community_id);
    }
}
