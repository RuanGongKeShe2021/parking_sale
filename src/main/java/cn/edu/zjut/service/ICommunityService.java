package cn.edu.zjut.service;

import cn.edu.zjut.po.Community;

import java.util.List;

public interface ICommunityService {
    public List<Community> FindAllCommunity(String developer_id);
    public boolean AddCommunity(Community community);
    public boolean UpdateCommunity(Community community);
    public boolean DeleteCommunity(String community_id);
}
