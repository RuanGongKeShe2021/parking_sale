package cn.edu.zjut.service;

import cn.edu.zjut.po.Developer;

public interface IDeveloperService {
    public boolean Login(String developer_id,String password);
    public Developer DeveloperInfo(String name);
}
