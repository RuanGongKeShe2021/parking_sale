package cn.edu.zjut.service;

import cn.edu.zjut.po.Owner;

import java.util.List;

public interface IOwnerService {
    public Owner SelectOwnerById(String owner_id);
    public boolean Login(String owner_id,String password);
    public boolean Register(Owner owner);
    public boolean UpdateOwner(Owner owner);
    public boolean UpdateOwnerCertification(String owner_id);
    public boolean DeleteOwner(String owner_id);
    public List<Owner> SelectOwnerByCommunityId(String community_id);
}
