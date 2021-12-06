package cn.edu.zjut.service;

import cn.edu.zjut.po.Sale;

import java.util.List;

public interface ISaleService {
    public List<Sale> ShowSaleOn();
    public List<Sale> FindAll();
    public boolean AddSale(Sale sale);
    public boolean UpdateSale(Sale sale);
    public boolean DeleteSale(int sale_id);
}
