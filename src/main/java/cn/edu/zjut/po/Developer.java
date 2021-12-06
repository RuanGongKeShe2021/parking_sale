package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;

public class Developer {
    private String developer_id;
    private String name;
    private String password;
    private String phone;
    private Set community = new HashSet(0);
    private Set admin = new HashSet(0);

    public Developer() {
    }

    public String getDeveloper_id() {
        return developer_id;
    }

    public void setDeveloper_id(String developer_id) {
        this.developer_id = developer_id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set getCommunity() {
        return community;
    }

    public void setCommunity(Set community) {
        this.community = community;
    }

    public Set getAdmin() {
        return admin;
    }

    public void setAdmin(Set admin) {
        this.admin = admin;
    }
}
