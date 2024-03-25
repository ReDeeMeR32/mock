package com.example.springstub;

import java.time.*;
public class User {
    private String login;
    private String password;
    private LocalDateTime timeNow;

    public User (String login, String password) {
        this.login = login;
        this.password = password;
        this.timeNow = LocalDateTime.now();
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LocalDateTime getTimeNow() {
        return timeNow;
    }

    public void setTimeNow(LocalDateTime timeNow) {
        this.timeNow = timeNow;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{ 'login':'" + login + "', 'password':'" + password + "', 'timeNow':'' + timeNow + '' }";
    }
}

