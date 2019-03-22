package com.admin.po;

import java.util.Date;

public class Account {
    private Integer userid;

    private String username;

    private String password;

    private Integer roleid;

    private String email;

    private String telephon;

    private Date adddatetime;

    private String dbids;

    private Boolean status;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelephon() {
        return telephon;
    }

    public void setTelephon(String telephon) {
        this.telephon = telephon == null ? null : telephon.trim();
    }

    public Date getAdddatetime() {
        return adddatetime;
    }

    public void setAdddatetime(Date adddatetime) {
        this.adddatetime = adddatetime;
    }

    public String getDbids() {
        return dbids;
    }

    public void setDbids(String dbids) {
        this.dbids = dbids == null ? null : dbids.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}