package cn.edu.zjut.service;

import cn.edu.zjut.po.Sale;

import java.util.List;

public interface ISaleService {
    public List<Sale> SelectSaleOnByCommunityId(String community_id);
    public List<Sale> SelectSaleByCommunityId(String community_id);
    public boolean AddSale(Sale sale);
    public boolean UpdateSale(Sale sale);
    public boolean DeleteSale(int sale_id);
}
