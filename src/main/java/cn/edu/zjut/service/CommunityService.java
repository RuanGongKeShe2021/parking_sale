package cn.edu.zjut.service;

import cn.edu.zjut.dao.CommunityDao;
import cn.edu.zjut.po.Community;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("communityService")
public class CommunityService implements ICommunityService{
    @Autowired
    private CommunityDao communityDao;

    @Override
    public Community SelectCommunityById(String community_id) {
        return communityDao.selectCommunityById(community_id);
    }

    @Override
    public List<Community> SelectCommunityByOwnerId(String owner_id) {
        return communityDao.selectCommunityByOwnerId(owner_id);
    }

    @Override
    public List<Community> FindAllCommunity(String developer_id) {
        return communityDao.findAll(developer_id);
    }

    @Override
    public boolean AddCommunity(Community community) {
        try {
            if(communityDao.addCommunity(community) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean UpdateCommunity(Community community) {
        try {
            if(communityDao.updateCommunity(community) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean DeleteCommunity(String community_id) {
        try {
            if(communityDao.deleteCommunity(community_id) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }
}
