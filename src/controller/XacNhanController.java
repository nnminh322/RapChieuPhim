/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.BaoCaoDAO;
import dao.GheDAO;
import dao.PhimDAO;
import dao.PhongChieuDAO;
import dao.SuatChieuDAO;
import dao.VeDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.BaoCaoModel;
import model.GheModel;
import model.PhimModel;
import model.PhongChieuModel;
import model.SuatChieuModel;
import model.VeModel;
import view.XacNhan;

/**
 *
 * @author nnminh322
 */
public class XacNhanController implements ActionListener {

    private XacNhan XacNhan;

    public XacNhanController(XacNhan XacNhan) {
        this.XacNhan = XacNhan;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.XacNhan.getTitle().equals("Xoá phim")) {
            this.xoaPhim(this.XacNhan.getPhimModel());
            this.XacNhan.dispose();
        }
        if (this.XacNhan.getTitle().equals("Xoá suất chiếu")) {
            this.xoaSuatChieu(this.XacNhan.getSuatChieuModel());
            this.XacNhan.dispose();
        }
        if (this.XacNhan.getTitle().equals("Xoá phòng chiếu")) {
            this.xoaPhongChieu(this.XacNhan.getPhongChieuModel());
            this.XacNhan.dispose();
        }
        if (this.XacNhan.getTitle().equals("Xoá ghế")) {
            this.xoaGhe(this.XacNhan.getGheModel());
            this.XacNhan.dispose();
        }
        if (this.XacNhan.getTitle().equals("Xoá vé")) {
            this.xoaVe(this.XacNhan.getVeModel());
            this.XacNhan.dispose();
        }
        if (this.XacNhan.getTitle().equals("Xoá báo cáo")) {
            this.xoaBaoCao(this.XacNhan.getBaoCaoModel());
            this.XacNhan.dispose();
        }
    }

    private int xoaPhim(PhimModel phimModel) {
        return PhimDAO.getInstance().delete(phimModel);
    }

    private int xoaSuatChieu(SuatChieuModel suatChieuModel) {
        return SuatChieuDAO.getInstance().delete(suatChieuModel);
    }

    private int xoaPhongChieu(PhongChieuModel phongChieuModel) {
        return PhongChieuDAO.getInstance().delete(phongChieuModel);
    }

    private int xoaGhe(GheModel gheModel) {
        return GheDAO.getInstance().delete(gheModel);
    }

    private int xoaVe(VeModel veModel) {
        return VeDAO.getInstance().delete(veModel);
    }

    private int xoaBaoCao(BaoCaoModel baoCaoModel) {
        return BaoCaoDAO.getInstance().delete(baoCaoModel);
    }

}
