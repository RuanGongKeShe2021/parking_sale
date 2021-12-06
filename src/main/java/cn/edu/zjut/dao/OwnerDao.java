package cn.edu.zjut.dao;


import cn.edu.zjut.po.Owner;
import cn.edu.zjut.po.Sale;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ownerDao")
@Mapper
public interface OwnerDao {
    public Owner selectOwnerById(String owner_id);
    public Owner selectOwnerCheck(String owner_id,String password);
    public int addOwner(Owner owner);
    public int updateOwner(Owner owner);
    public int updateOwnerCertification(String owner_id);
    public int deleteOwner(Owner owner);
    public List<Owner> selectOwnerByCommunityId(String community_id);
}
