package ks.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private Integer ksId;

    private String ksName;

    private String ksEmail;

    private String ksSubject;

    private String ksMessage;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ksData;

    public Integer getKsId() {
        return ksId;
    }

    public void setKsId(Integer ksId) {
        this.ksId = ksId;
    }

    public String getKsName() {
        return ksName;
    }

    public void setKsName(String ksName) {
        this.ksName = ksName == null ? null : ksName.trim();
    }

    public String getKsEmail() {
        return ksEmail;
    }

    public void setKsEmail(String ksEmail) {
        this.ksEmail = ksEmail == null ? null : ksEmail.trim();
    }

    public String getKsSubject() {
        return ksSubject;
    }

    public void setKsSubject(String ksSubject) {
        this.ksSubject = ksSubject == null ? null : ksSubject.trim();
    }

    public String getKsMessage() {
        return ksMessage;
    }

    public void setKsMessage(String ksMessage) {
        this.ksMessage = ksMessage == null ? null : ksMessage.trim();
    }

    public Date getKsData() {
        return ksData;
    }

    public void setKsData(Date ksData) {
        this.ksData = ksData;
    }
}