package com.example;

import java.util.ResourceBundle;

public class DummyKubernetesCronjob {

    public static void main(String[] args) {
        ResourceBundle res = ResourceBundle.getBundle("dummy");

        String name = res.getString("name");

        System.out.println(name + " is running! " + System.nanoTime());
    }
}
