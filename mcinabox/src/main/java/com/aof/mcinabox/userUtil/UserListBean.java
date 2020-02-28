package com.aof.mcinabox.userUtil;

import android.content.Context;

import com.aof.mcinabox.MainActivity;
import com.aof.mcinabox.R;

public class UserListBean {
    private String user_name;
    private String user_model;
    private int user_image;
    private boolean isSelected;
    private Context context;

    public UserListBean(){
        this.user_name = "Steve";
        this.user_model = "offine";
        this.user_image = R.drawable.ic_account_box_black_24dp;
    }


    public String getUser_name() { return user_name; }
    public void setUser_name(String user_name) { this.user_name = user_name; }
    public int getUser_image() { return user_image; }
    public void setUser_image(int user_image_id) { this.user_image = user_image_id; }
    public String getUser_model() { return user_model; }
    public void setUser_model(String user_model) { this.user_model = user_model; }
    public boolean isIsSelected() { return isSelected; }
    public void setIsSelected(boolean isSelected) { this.isSelected = isSelected; }
    public Context getContext() { return context; }
    public void setContext(Context context) { this.context = context; }
}
