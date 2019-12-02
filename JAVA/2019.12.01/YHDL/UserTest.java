package com.YHDL;

import java.util.Scanner;

public class UserTest {

    public static void main(String[] args) {
        User choji = new User();
        choji.setUserName("lifan");
        choji.setPassWord("123");

        Scanner inupu = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String a = inupu.next();
        System.out.print("请输入用密码：");
        String b = inupu.next();

        User w = dl(a,b,choji);
        if (w !=null){
            System.out.println(w.show());
        }else {
            System.out.println("登录失败");
        }
    }
    public static User dl(String a,String b,User chaoji){
        if (a.equals(chaoji.getUserName()) && b.equals(chaoji.getPassWord())) {
            return chaoji;
        } else {
            return null;
        }
    }

}
