package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;

public class Lot {
    private String lot_id;
    private String address;
    private String lot_picture;
    private Community community;
    private Buy buy = null;
    private Owner owner = null;
    private Set appoint = new HashSet(0);
    private int sale_status = 0;
    private int price;

    public Lot() {
    }

    public String getLot_id() {
        return lot_id;
    }

    public void setLot_id(String lot_id) {
        this.lot_id = lot_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLot_picture() {
        return lot_picture;
    }

    public void setLot_picture(String lot_picture) {
        this.lot_picture = lot_picture;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Buy getBuy() {
        return buy;
    }

    public void setBuy(Buy buy) {
        this.buy = buy;
    }

    public Set getAppoint() {
        return appoint;
    }

    public void setAppoint(Set appoint) {
        this.appoint = appoint;
    }

    public int getSale_status() {
        return sale_status;
    }

    public void setSale_status(int sale_status) {
        this.sale_status = sale_status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
