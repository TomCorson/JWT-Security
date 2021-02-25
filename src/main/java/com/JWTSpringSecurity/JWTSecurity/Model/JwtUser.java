package com.JWTSpringSecurity.JWTSecurity.Model;

public class JwtUser {
    private String UserName;
    private Long userId;
    private String role;

    public String getUserName() {
        return UserName;
    }

    public Long getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }

    public void setId(long userId) {
        this.userId = userId;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
