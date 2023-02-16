/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nnminh322
 */
public class GheModel {

    private String maGhe;
    private String maPhong;
    private int giaGhe;
    private int soGhe;
    private int hangGhe;
    private boolean trangThaiGhe;

    public GheModel(String maGhe, String maPhong, int giaGhe, int soGhe, int hangGhe, boolean trangThaiGhe) {
        this.maGhe = maGhe;
        this.maPhong = maPhong;
        this.giaGhe = giaGhe;
        this.soGhe = soGhe;
        this.hangGhe = hangGhe;
        this.trangThaiGhe = trangThaiGhe;
    }

    public String getMaGhe() {
        return maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getGiaGhe() {
        return giaGhe;
    }

    public void setGiaGhe(int giaGhe) {
        this.giaGhe = giaGhe;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public int getHangGhe() {
        return hangGhe;
    }

    public void setHangGhe(int hangGhe) {
        this.hangGhe = hangGhe;
    }

    public boolean isTrangThaiGhe() {
        return trangThaiGhe;
    }

    public void setTrangThaiGhe(boolean trangThaiGhe) {
        this.trangThaiGhe = trangThaiGhe;
    }

    @Override
    public String toString() {
        return "GheModel{" + "maGhe=" + maGhe + ", maPhong=" + maPhong + ", giaGhe=" + giaGhe + ", soGhe=" + soGhe + ", hangGhe=" + hangGhe + ", trangThaiGhe=" + trangThaiGhe + '}';
    }

}
