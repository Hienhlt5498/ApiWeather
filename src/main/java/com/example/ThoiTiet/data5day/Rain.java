/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ThoiTiet.data5day;

/**
 *
 * @author Administrator
 */

public class Rain {

    private double threeH;

    public Rain(double threeH) {
        this.threeH = threeH;
    }

    public double getThreeH() {
        return threeH;
    }

    public void setThreeH(double threeH) {
        this.threeH = threeH;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "threeH=" + threeH +
                '}';
    }
}
