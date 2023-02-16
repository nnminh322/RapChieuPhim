/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nnminh322
 */
public class BaoCaoModel {

    private String maBaoCao;
    private String tenBaoCao;
    private String link;

    public BaoCaoModel(String maBaoCao, String tenBaoCao, String link) {
        this.maBaoCao = maBaoCao;
        this.tenBaoCao = tenBaoCao;
        this.link = link;
    }

    public String getMaBaoCao() {
        return maBaoCao;
    }

    public void setMaBaoCao(String maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    public String getTenBaoCao() {
        return tenBaoCao;
    }

    public void setTenBaoCao(String tenBaoCao) {
        this.tenBaoCao = tenBaoCao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    

}
