package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;

public class Owner {
    private String owner_id;
    private String name;
    private String password;
    private String IDNumber;
    private boolean sex;
    private String phone;
    private int certificated = 0;
    private Set appoint = new HashSet(0);
    private Set buy = new HashSet(0);
    private Set community = new HashSet(0);

    public Owner() {
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCertificated() {
        return certificated;
    }

    public void setCertificated(int certificated) {
        this.certificated = certificated;
    }

    public Set getAppoint() {
        return appoint;
    }

    public void setAppoint(Set appoint) {
        this.appoint = appoint;
    }

    public Set getBuy() {
        return buy;
    }

    public void setBuy(Set buy) {
        this.buy = buy;
    }

    public Set getCommunity() {
        return community;
    }

    public void setCommunity(Set community) {
        this.community = community;
    }
}
