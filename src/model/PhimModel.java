/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nnminh322
 */
public class PhimModel {

    private String maPhim;
    private String tenPhim;
    private String theLoai;
    private String nhaSX;
    private int nam;
    private int thoiLuong;
    private int doTuoi;
    private int gia;

    public PhimModel(String maPhim, String tenPhim, String theLoai, String nhaSX, int nam, int thoiLuong, int doTuoi, int gia) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.theLoai = theLoai;
        this.nhaSX = nhaSX;
        this.nam = nam;
        this.thoiLuong = thoiLuong;
        this.doTuoi = doTuoi;
        this.gia = gia;
    }

    public PhimModel(String maPhim, String tenPhim, String theLoai, String nhaSX, int thoiLuong, int doTuoi) {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.theLoai = theLoai;
        this.nhaSX = nhaSX;
        this.nam = 0;
        this.thoiLuong = thoiLuong;
        this.doTuoi = doTuoi;
        this.gia = 0;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public int getDoTuoi() {
        return doTuoi;
    }

    public void setDoTuoi(int doTuoi) {
        this.doTuoi = doTuoi;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
}
