package cn.edu.zjut.service;

import cn.edu.zjut.dao.DeveloperDao;
import cn.edu.zjut.po.Developer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("developerService")
public class DeveloperService implements IDeveloperService{
    @Autowired
    private DeveloperDao developerDao;

    @Override
    public boolean Login(String developer_id, String password) {
        try {
            if (developerDao.selectDeveloperCheck(developer_id, password) != null)
                return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public Developer SelectDeveloperByName(String name) {
        return developerDao.selectDeveloperByName(name);
    }

    @Override
    public Developer SelectDeveloperById(String developer_id) {
        return developerDao.selectDeveloperById(developer_id);
    }
}
