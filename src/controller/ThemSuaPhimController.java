/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.PhimDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.PhimModel;
import view.ThemSuaPhim;

/**
 *
 * @author nnminh322
 */
public class ThemSuaPhimController implements ActionListener {

    private ThemSuaPhim themSuaPhim;
    private PhimModel phimModel;

    public ThemSuaPhimController(ThemSuaPhim themSuaPhim) {
        this.themSuaPhim = themSuaPhim;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lưu")) {
            String maPhim = this.themSuaPhim.getjTextField_MaPhim().getText();
            String tenPhim = this.themSuaPhim.getjTextField_TenPhim().getText();
            String theLoai = this.themSuaPhim.getjTextField_TheLoai().getText();
            int doTuoi = Integer.parseInt(this.themSuaPhim.getjTextField_DoTuoi().getText());
            String nhaSX = this.themSuaPhim.getjTextField_NhaSanXuat().getText();
            int thoiLuong = Integer.parseInt(this.themSuaPhim.getjTextField_ThoiLuong().getText());

            this.phimModel = new PhimModel(maPhim, tenPhim, theLoai, nhaSX, thoiLuong, doTuoi);
            if (this.themSuaPhim.getTitle().equals("Thêm mới phim")) {
                this.insert(phimModel);
                JOptionPane.showMessageDialog(themSuaPhim, "Đã lưu!");
                this.themSuaPhim.dispose();
            }

        }
    }
    private int insert(PhimModel phimModel){
        return PhimDAO.getInstance().insert(phimModel);
    }

}
