package com.YHDL;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

public class User {
    private String userName;  //成员变量   用户名字
    private String passWord; //成员变量    用户密码

    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getPassWord(){
        return this.passWord;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
    public String show(){
        String s = "userName:"+this.userName+"passWord："+this.passWord;
                return s;
    }

}
