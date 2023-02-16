/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nnminh322
 */
public class PhongChieuModel {

    private String maPhongChieu;
    private String tenPhongChieu;
    private int sucChua;
    private int soLuongGheTrong;

    public PhongChieuModel(String maPhongChieu, String tenPhongChieu, int sucChua, int soLuongGheTrong) {
        this.maPhongChieu = maPhongChieu;
        this.tenPhongChieu = tenPhongChieu;
        this.sucChua = sucChua;
        this.soLuongGheTrong = soLuongGheTrong;
    }

    public String getMaPhongChieu() {
        return maPhongChieu;
    }

    public void setMaPhongChieu(String maPhongChieu) {
        this.maPhongChieu = maPhongChieu;
    }

    public String getTenPhongChieu() {
        return tenPhongChieu;
    }

    public void setTenPhongChieu(String tenPhongChieu) {
        this.tenPhongChieu = tenPhongChieu;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public int getSoLuongGheTrong() {
        return soLuongGheTrong;
    }

    public void setSoLuongGheTrong(int soLuongGheTrong) {
        this.soLuongGheTrong = soLuongGheTrong;
    }

}
