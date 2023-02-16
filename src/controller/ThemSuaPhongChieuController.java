/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.PhongChieuDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.PhongChieuModel;
import view.ThemSuaPhongChieu;

/**
 *
 * @author nnminh322
 */
public class ThemSuaPhongChieuController implements ActionListener {

    private ThemSuaPhongChieu themSuaPhongChieu;
    private PhongChieuModel phongChieuModel;

    public ThemSuaPhongChieuController(ThemSuaPhongChieu themSuaPhongChieu) {
        this.themSuaPhongChieu = themSuaPhongChieu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lưu")) {

            String maPhongChieu = this.themSuaPhongChieu.getjTextField_MaPhongChieu().getText();
            String tenPhongChieu = this.themSuaPhongChieu.getjTextField_TenPhongChua().getText();
            int sucChua = Integer.parseInt(this.themSuaPhongChieu.getjTextField_SucChua().getText());
            int soLuongGheTrong = Integer.parseInt(this.themSuaPhongChieu.getjTextField_SoLuongGheTrong().getText());
            this.phongChieuModel = new PhongChieuModel(maPhongChieu, tenPhongChieu, sucChua, soLuongGheTrong);
            if (this.themSuaPhongChieu.getTitle().equals("Thêm mới phòng chiếu")) {
                this.insert(phongChieuModel);
                JOptionPane.showMessageDialog(themSuaPhongChieu, "Đã lưu!");
                this.themSuaPhongChieu.dispose();
            }

        }
    }

    private int insert(PhongChieuModel phongChieuModel) {
        return PhongChieuDAO.getInstance().insert(phongChieuModel);
    }
}
