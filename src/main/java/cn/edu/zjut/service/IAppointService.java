package cn.edu.zjut.service;

import cn.edu.zjut.po.Appoint;

import java.util.List;
import java.util.Map;

public interface IAppointService {
    public List<Appoint> FindAllAppoint(String owner_id);
    public boolean AddAppoint(Appoint appoint);
    public boolean UpdateAppoint(Appoint appoint);
    public boolean DeleteAppoint(int appoint_id);
    public List<Appoint> FindAppointByLot_id(String lot_id);
    public boolean UpdateAppointGot(int appoint_id);

    public Map<String,Integer> AppointGot(String community_id);
}
