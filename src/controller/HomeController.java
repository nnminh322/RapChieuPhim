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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.BaoCaoModel;
import model.GheModel;
import model.PhimModel;
import model.PhongChieuModel;
import model.SuatChieuModel;
import model.VeModel;
import view.HomeUI;
import view.ThemSuaBaoCao;
import view.ThemSuaGhe;
import view.ThemSuaPhim;
import view.ThemSuaPhongChieu;
import view.ThemSuaSuatChieu;
import view.ThemSuaVe;

/**
 *
 * @author nnminh322
 */
public class HomeController implements ActionListener {

    public HomeUI homeUI;
    public ThemSuaPhim themSuaPhim;
    public ThemSuaSuatChieu themSuaSuatChieu;
    public ThemSuaPhongChieu themSuaPhongChieu;
    public ThemSuaGhe themSuaGhe;
    public ThemSuaVe themSuaVe;
    public ThemSuaBaoCao themSuaBaoCao;

    public HomeController(HomeUI homeUI) {
        this.homeUI = homeUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(homeUI, "ok");
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Thêm mới phim") || actionCommand.equals("Sửa phim")) {
            this.themSuaPhim = new ThemSuaPhim(homeUI);
            this.themSuaPhim.setTitle(actionCommand);
            this.themSuaPhim.setVisible(true);
        }
        if (actionCommand.equals("Thêm mới suất chiếu") || actionCommand.equals("Sửa suất chiếu")) {
            this.themSuaSuatChieu = new ThemSuaSuatChieu(homeUI);
            this.themSuaSuatChieu.setTitle(actionCommand);
            this.themSuaSuatChieu.setVisible(true);
        }
        if (actionCommand.equals("Thêm mới phòng chiếu") || actionCommand.equals("Sửa phòng chiếu")) {
            this.themSuaPhongChieu = new ThemSuaPhongChieu(homeUI);
            this.themSuaPhongChieu.setTitle(actionCommand);
            this.themSuaPhongChieu.setVisible(true);
        }
        if (actionCommand.equals("Thêm mới ghế") || actionCommand.equals("Sửa ghế")) {
            this.themSuaGhe = new ThemSuaGhe(homeUI);
            this.themSuaGhe.setTitle(actionCommand);
            this.themSuaGhe.setVisible(true);
        }
        if (actionCommand.equals("Thêm mới vé") || actionCommand.equals("Sửa vé")) {
            this.themSuaVe = new ThemSuaVe(homeUI);
            this.themSuaVe.setTitle(actionCommand);
            this.themSuaVe.setVisible(true);
        }
        if (actionCommand.equals("Thêm mới báo cáo") || actionCommand.equals("Sửa báo cáo")) {
            this.themSuaBaoCao = new ThemSuaBaoCao(homeUI);
            this.themSuaBaoCao.setTitle(actionCommand);
            this.themSuaBaoCao.setVisible(true);
        }
    }

    public ArrayList<PhimModel> hienThiPhim() {
        return PhimDAO.getInstance().selectAll();
    }

    public ArrayList<SuatChieuModel> hienThiSuatChieu() {
        return SuatChieuDAO.getInstance().selectAll();
    }

    public ArrayList<PhongChieuModel> hienThiPhongChieu() {
        return PhongChieuDAO.getInstance().selectAll();
    }

    public ArrayList<GheModel> hienThiGhe() {
        return GheDAO.getInstance().selectAll();
    }

    public ArrayList<VeModel> hienThiVe() {
        return VeDAO.getInstance().selectAll();
    }

    public ArrayList<BaoCaoModel> hienThiBaoCao() {
        return BaoCaoDAO.getInstance().selectAll();
    }
}
