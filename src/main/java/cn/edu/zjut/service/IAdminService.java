package cn.edu.zjut.service;

import cn.edu.zjut.po.Admin;

import java.util.List;

public interface IAdminService {
    public Admin SelectAdminById(String admin_id);
    public Admin SelctAdminByCommunityId(String community_id);
    public List<Admin> FindAllAdmin(String developer_id);
    public boolean AddAdmin(Admin admin);
    public boolean UpdateAdmin(Admin admin);
    public boolean DeleteAdmin(String admin_id);
}
