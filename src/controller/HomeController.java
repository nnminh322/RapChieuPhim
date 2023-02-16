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
import model.InVeModel;
import model.PhimModel;
import model.PhongChieuModel;
import model.SuatChieuModel;
import model.VeModel;
import service.InVe;
import view.HomeUI;
import view.ThemSuaBaoCao;
import view.ThemSuaGhe;
import view.ThemSuaPhim;
import view.ThemSuaPhongChieu;
import view.ThemSuaSuatChieu;
import view.ThemSuaVe;
import view.XacNhan;

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
    public XacNhan xacNhan;
    public view.InVe inVe;
    public HomeController(HomeUI homeUI) {
        this.homeUI = homeUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(homeUI, "ok");
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Thêm mới phim")) {
            this.themSuaPhim = new ThemSuaPhim(homeUI);
            this.themSuaPhim.setTitle(actionCommand);
            this.themSuaPhim.setVisible(true);
        }

        if (actionCommand.equals("Thêm mới suất chiếu")) {
            this.themSuaSuatChieu = new ThemSuaSuatChieu(homeUI);
            this.themSuaSuatChieu.setTitle(actionCommand);
            this.themSuaSuatChieu.setVisible(true);
        }

        if (actionCommand.equals("Thêm mới phòng chiếu")) {
            this.themSuaPhongChieu = new ThemSuaPhongChieu(homeUI);
            this.themSuaPhongChieu.setTitle(actionCommand);
            this.themSuaPhongChieu.setVisible(true);
        }
        if (actionCommand.equals("Thêm mới ghế")) {
            this.themSuaGhe = new ThemSuaGhe(homeUI);
            this.themSuaGhe.setTitle(actionCommand);
            this.themSuaGhe.setVisible(true);
        }
        if (actionCommand.equals("Thêm mới vé")) {
            this.themSuaVe = new ThemSuaVe(homeUI);
            this.themSuaVe.setTitle(actionCommand);
            this.themSuaVe.setVisible(true);
        }
        if (actionCommand.equals("Thêm mới báo cáo")) {
            this.themSuaBaoCao = new ThemSuaBaoCao(homeUI);
            this.themSuaBaoCao.setTitle(actionCommand);
            this.themSuaBaoCao.setVisible(true);
        }
        if (actionCommand.equals("Sửa phim")) {
            int selected = this.homeUI.getjTable_Phim().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn phim");
            } else {
                this.themSuaPhim = new ThemSuaPhim(homeUI, homeUI.getPhim(selected));
                this.themSuaPhim.setTitle(actionCommand);
                this.themSuaPhim.setVisible(true);
            }
        }
        if (actionCommand.equals("Sửa suất chiếu")) {
            int selected = this.homeUI.getjTable_SuatChieu().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn suất chiếu");
            } else {
                this.themSuaSuatChieu = new ThemSuaSuatChieu(homeUI, homeUI.getSuatChieu(selected));
                this.themSuaSuatChieu.setTitle(actionCommand);
                this.themSuaSuatChieu.setVisible(true);
            }
        }
        if (actionCommand.equals("Sửa phòng chiếu")) {
            int selected = this.homeUI.getjTable_PhongChieu().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn phòng chiếu");
            } else {
                this.themSuaPhongChieu = new ThemSuaPhongChieu(homeUI, homeUI.getPhongChieu(selected));
                this.themSuaPhongChieu.setTitle(actionCommand);
                this.themSuaPhongChieu.setVisible(true);
            }
        }
        if (actionCommand.equals("Sửa ghế")) {
            int selected = this.homeUI.getjTable_Ghe().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn ghế");
            } else {
                this.themSuaGhe = new ThemSuaGhe(homeUI, homeUI.getGhe(selected));
                this.themSuaGhe.setTitle(actionCommand);
                this.themSuaGhe.setVisible(true);
            }
        }

        if (actionCommand.equals("Sửa vé")) {
            int selected = this.homeUI.getjTable_Ve().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn vé");
            } else {
                this.themSuaVe = new ThemSuaVe(homeUI, homeUI.getVe(selected));
                this.themSuaVe.setTitle(actionCommand);
                this.themSuaVe.setVisible(true);
            }
        }
        if (actionCommand.equals("Sửa báo cáo")) {
            int selected = this.homeUI.getjTable_BaoCao().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn báo cáo");
            } else {
                this.themSuaBaoCao = new ThemSuaBaoCao(homeUI, homeUI.getBaoCao(selected));
                this.themSuaBaoCao.setTitle(actionCommand);
                this.themSuaBaoCao.setVisible(true);
            }
        }
        if (actionCommand.equals("Xoá phim")) {
            int selected = this.homeUI.getjTable_Phim().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn phim");
            } else {
                this.xacNhan = new XacNhan(homeUI, homeUI.getPhim(selected));
                this.xacNhan.setTitle(actionCommand);
                this.xacNhan.setVisible(true);
            }
        }
        if (actionCommand.equals("Xoá suất chiếu")) {
            int selected = this.homeUI.getjTable_SuatChieu().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn suất chiếu");
            } else {
                this.xacNhan = new XacNhan(homeUI, homeUI.getSuatChieu(selected));
                this.xacNhan.setTitle(actionCommand);
                this.xacNhan.setVisible(true);
            }
        }
        if (actionCommand.equals("Xoá phòng chiếu")) {
            int selected = this.homeUI.getjTable_PhongChieu().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn phòng chiếu");
            } else {
                this.xacNhan = new XacNhan(homeUI, homeUI.getPhongChieu(selected));
                this.xacNhan.setTitle(actionCommand);
                this.xacNhan.setVisible(true);
            }
        }
        if (actionCommand.equals("Xoá ghế")) {
            int selected = this.homeUI.getjTable_Ghe().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn ghế");
            } else {
                this.xacNhan = new XacNhan(homeUI, homeUI.getGhe(selected));
                this.xacNhan.setTitle(actionCommand);
                this.xacNhan.setVisible(true);
            }
        }
        if (actionCommand.equals("Xoá vé")) {
            int selected = this.homeUI.getjTable_Ve().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn vé");
            } else {
                this.xacNhan = new XacNhan(homeUI, homeUI.getVe(selected));
                this.xacNhan.setTitle(actionCommand);
                this.xacNhan.setVisible(true);
            }
        }
        if (actionCommand.equals("Xoá báo cáo")) {
            int selected = this.homeUI.getjTable_BaoCao().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn báo cáo");
            } else {
                this.xacNhan = new XacNhan(homeUI, homeUI.getBaoCao(selected));
                this.xacNhan.setTitle(actionCommand);
                this.xacNhan.setVisible(true);
            }
        }
        if (actionCommand.equals("Tìm kiếm phim")) {
            String tukhoa = this.homeUI.getjTextField_TuKhoaPhim().getText();
            this.homeUI.timKiemPhim(this.timKiemPhim(tukhoa));
        }
        if (actionCommand.equals("Tìm kiếm suất chiếu")) {
            String tukhoa = this.homeUI.getjTextField_TuKhoaSuatChieu().getText();
            this.homeUI.timKiemSuatChieu(this.timKiemSuatChieu(tukhoa));
        }
        if (actionCommand.equals("Tìm kiếm phòng chiếu")) {
            String tukhoa = this.homeUI.getjTextField_TuKhoaPhongChieu().getText();
            this.homeUI.timKiemPhongChieu(this.timKiemPhongChieu(tukhoa));
        }
        if (actionCommand.equals("Tìm kiếm ghế")) {
            String tukhoa = this.homeUI.getjTextField_TuKhoaGhe().getText();
            this.homeUI.timKiemGhe(this.timKiemGhe(tukhoa));
        }
        if (actionCommand.equals("Tìm kiếm vé")) {
            String tukhoa = this.homeUI.getjTextField_TuKhoaVe().getText();
            this.homeUI.timKiemVe(this.timKiemVe(tukhoa));
        }
        if (actionCommand.equals("Tìm kiếm báo cáo")) {
            String tukhoa = this.homeUI.getjTextField_TuKhoaBaoCao().getText();
            this.homeUI.timKiemBaoCao(this.timKiemBaoCao(tukhoa));
        }
        if (actionCommand.equals("In vé")) {
            int selected = this.homeUI.getjTable_Ve().getSelectedRow();
            if (selected == -1) {
                JOptionPane.showMessageDialog(homeUI, "Bạn chưa chọn vé");
            }
            else{
                InVeModel inVeModel = InVe.getInstance().in(homeUI.getVe(selected));
                this.inVe = new view.InVe(inVeModel);
            }
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

    public ArrayList<PhimModel> timKiemPhim(String tukhoa) {
        return PhimDAO.getInstance().find(tukhoa);
    }

    public ArrayList<SuatChieuModel> timKiemSuatChieu(String tukhoa) {
        return SuatChieuDAO.getInstance().find(tukhoa);
    }

    public ArrayList<PhongChieuModel> timKiemPhongChieu(String tukhoa) {
        return PhongChieuDAO.getInstance().find(tukhoa);
    }

    public ArrayList<GheModel> timKiemGhe(String tukhoa) {
        return GheDAO.getInstance().find(tukhoa);
    }

    public ArrayList<VeModel> timKiemVe(String tukhoa) {
        return VeDAO.getInstance().find(tukhoa);
    }

    public ArrayList<BaoCaoModel> timKiemBaoCao(String tukhoa) {
        return BaoCaoDAO.getInstance().find(tukhoa);
    }
}
