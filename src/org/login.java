package org;

/**
 * Created by hasee on 2017/8/30.
 */
public class login {
    //属性
    private String id;
    private String name;
    private String password;



    public void setId(String id) {
        this.id = id;
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

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    private boolean role;

}
