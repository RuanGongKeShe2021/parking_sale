package cn.edu.zjut.service;

import cn.edu.zjut.dao.AdminDao;
import cn.edu.zjut.po.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminService implements IAdminService{
    @Autowired
    private AdminDao adminDao;

    @Override
    public Admin SelectAdminById(String admin_id) {
        return adminDao.selectAdminById(admin_id);
    }

    @Override
    public Admin SelctAdminByCommunityId(String community_id) {
        return adminDao.selectAdminByCommunityId(community_id);
    }

    @Override
    public List<Admin> FindAllAdmin(String developer_id) {
        return adminDao.findAll(developer_id);
    }

    @Override
    public boolean AddAdmin(Admin admin) {
        try {
            if(adminDao.addAdmin(admin) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean UpdateAdmin(Admin admin) {
        try {
            if(adminDao.updateAdmin(admin) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }

    @Override
    public boolean DeleteAdmin(String admin_id) {
        try {
            if(adminDao.deleteAdmin(admin_id) == 1)return true;
            else return false;
        }catch (Exception e){
            e.printStackTrace();
        }return false;
    }
}
