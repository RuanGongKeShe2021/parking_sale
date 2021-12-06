package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;

public class Community {
    private String community_id;
    private String name;
    private int lot_num;
    private Developer developer;
    private Admin admin;
    private Set lot = new HashSet(0);
    private Set owner = new HashSet(0);

    public Community() {
    }

    public String getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(String community_id) {
        this.community_id = community_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLot_num() {
        return lot_num;
    }

    public void setLot_num(int lot_num) {
        this.lot_num = lot_num;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Set getLot() {
        return lot;
    }

    public void setLot(Set lot) {
        this.lot = lot;
    }

    public Set getOwner() {
        return owner;
    }

    public void setOwner(Set owner) {
        this.owner = owner;
    }
}
