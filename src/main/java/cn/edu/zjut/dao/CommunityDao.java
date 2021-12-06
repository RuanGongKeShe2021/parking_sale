package cn.edu.zjut.dao;

import cn.edu.zjut.po.Community;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("communityDao")
@Mapper
public interface CommunityDao {
    public Community selectCommunityById(String community_id);
    public List<Community> findAll(String developer_id);
    public int addCommunity(Community community);
    public int updateCommunity(Community community);
    public int deleteCommunity(String community_id);
//    public Community selectCommunityByAdminId(String admin_id);
}
