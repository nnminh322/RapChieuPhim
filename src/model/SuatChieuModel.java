/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nnminh322
 */
public class SuatChieuModel {
    private String maSuatChieu;
    private String khungGio;
    private String tenPhim;
    private String maPhim;

    public SuatChieuModel(String maSuatChieu, String khungGio, String tenPhim, String maPhim) {
        this.maSuatChieu = maSuatChieu;
        this.khungGio = khungGio;
        this.tenPhim = tenPhim;
        this.maPhim = maPhim;
    }

    public SuatChieuModel(String maSuatChieu, String khungGio, String maPhim) {
        this.maSuatChieu = maSuatChieu;
        this.khungGio = khungGio;
        this.maPhim = maPhim;
        this.tenPhim = "";
    }

    public String getMaSuatChieu() {
        return maSuatChieu;
    }

    public void setMaSuatChieu(String maSuatChieu) {
        this.maSuatChieu = maSuatChieu;
    }

    public String getKhungGio() {
        return khungGio;
    }

    public void setKhungGio(String khungGio) {
        this.khungGio = khungGio;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getMaPhim() {
        return maPhim;
    }

    public void setMaPhim(String maPhim) {
        this.maPhim = maPhim;
    }

    
}
