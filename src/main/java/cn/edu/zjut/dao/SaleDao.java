package cn.edu.zjut.dao;

import cn.edu.zjut.po.Sale;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("saleDao")
@Mapper
public interface SaleDao {
    public List<Sale> selectSaleOnByCommunityId(String community_id);
    public List<Sale> selectSaleByCommunityId(String community_id);
    public int addSale(Sale sale);
    public int updateSale(Sale sale);
    public int deleteSale(int sale_id);
}