package com.example.hp.page;

import android.media.Image;

/**
 * Created by HP on 2018/7/10.
 */

public class User {
    private String Username;
    private String Password;

    public User(String username, String password) {
        Username = username;
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
