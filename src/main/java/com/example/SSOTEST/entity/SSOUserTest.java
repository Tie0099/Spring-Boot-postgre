package com.example.SSOTEST.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sso_user_test")
public class SSOUserTest {

    @Id
    private LocalDateTime requestDate;

    private String ssotype;
    private String systemid;
    private String systemname;
    private String systemtransactions;
    private String systemprivileges;
    private String systemusergroup;
    private String systemlocationgroup;
    private String userid;
    private String userfullname;
    private String userrdofficecode;
    private String userofficecode;
    private String clientlocation;
    private String locationmachinenumber;
    private String tokenid;

    public LocalDateTime getRequestDate() {
        return requestDate;
    }
    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }
    public String getSsotype() {
        return ssotype;
    }
    public void setSsotype(String ssotype) {
        this.ssotype = ssotype;
    }
    public String getSystemid() {
        return systemid;
    }
    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }
    public String getSystemname() {
        return systemname;
    }
    public void setSystemname(String systemname) {
        this.systemname = systemname;
    }
    public String getSystemtransactions() {
        return systemtransactions;
    }
    public void setSystemtransactions(String systemtransactions) {
        this.systemtransactions = systemtransactions;
    }
    public String getSystemprivileges() {
        return systemprivileges;
    }
    public void setSystemprivileges(String systemprivileges) {
        this.systemprivileges = systemprivileges;
    }
    public String getSystemusergroup() {
        return systemusergroup;
    }
    public void setSystemusergroup(String systemusergroup) {
        this.systemusergroup = systemusergroup;
    }
    public String getSystemlocationgroup() {
        return systemlocationgroup;
    }
    public void setSystemlocationgroup(String systemlocationgroup) {
        this.systemlocationgroup = systemlocationgroup;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getUserfullname() {
        return userfullname;
    }
    public void setUserfullname(String userfullname) {
        this.userfullname = userfullname;
    }
    public String getUserrdofficecode() {
        return userrdofficecode;
    }
    public void setUserrdofficecode(String userrdofficecode) {
        this.userrdofficecode = userrdofficecode;
    }
    public String getUserofficecode() {
        return userofficecode;
    }
    public void setUserofficecode(String userofficecode) {
        this.userofficecode = userofficecode;
    }
    public String getClientlocation() {
        return clientlocation;
    }
    public void setClientlocation(String clientlocation) {
        this.clientlocation = clientlocation;
    }
    public String getLocationmachinenumber() {
        return locationmachinenumber;
    }
    public void setLocationmachinenumber(String locationmachinenumber) {
        this.locationmachinenumber = locationmachinenumber;
    }
    public String getTokenid() {
        return tokenid;
    }
    public void setTokenid(String tokenid) {
        this.tokenid = tokenid;
    }

    
}

   