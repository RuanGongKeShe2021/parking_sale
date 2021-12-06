package cn.edu.zjut.service;

import cn.edu.zjut.po.Owner;

public interface IOwnerService {
    public boolean Login(String owner_id,String password);
    public boolean Register(Owner owner);
    public boolean UpdateOwnerInfo(String owner_id);
    public Owner OwnerInfo(String owner_id);
}
