package cn.edu.zjut.dao;

import cn.edu.zjut.po.Developer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("developerDao")
@Mapper
public interface DeveloperDao {
    public Developer selectDeveloperByName(String name);
    public Developer selectDeveloperById(String developer_id);
    public Developer selectDeveloperCheck(String developer_id,String password);
}
