package cn.edu.zjut.dao;

import cn.edu.zjut.po.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("adminDao")
@Mapper
public interface AdminDao {
    public Admin selectAdminById(String admin_id);
    public List<Admin> findAll(String developer_id);
    public int addAdmin(Admin admin);
    public int updateAdmin(Admin admin);
    public int deleteAdmin(String admin_id);
    public Admin selectAdminByCommunityId(String community_id);
}
