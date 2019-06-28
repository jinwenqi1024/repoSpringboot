package com.mailuo.pojo;

public class User {
    private String username;
    private String password;
    private String  code;
    private String id;

    public User() {
    }

    public User(String username, String password, String code, String id) {
        this.username = username;
        this.password = password;
        this.code = code;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
