package cn.edu.zjut.po;

public class Appoint {
    private int appoint_id;
    private Owner owner;
    private Lot lot;
    private Community community;
    private int status = 0;
    private int got = 0;

    public Appoint() {
    }

    public int getAppoint_id() {
        return appoint_id;
    }

    public void setAppoint_id(int appoint_id) {
        this.appoint_id = appoint_id;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getGot() {
        return got;
    }

    public void setGot(int got) {
        this.got = got;
    }
}
