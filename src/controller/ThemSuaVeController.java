/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.VeDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.VeModel;
import view.ThemSuaVe;

/**
 *
 * @author nnminh322
 */
public class ThemSuaVeController implements ActionListener {

    private ThemSuaVe themSuaVe;
    private VeModel veModel;

    public ThemSuaVeController(ThemSuaVe themSuaVe) {
        this.themSuaVe = themSuaVe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lưu")) {

            String maVe = this.themSuaVe.getjTextField_MaVe().getText();
            String maGhe = this.themSuaVe.getjTextField_MaGhe().getText();
            String maSuatChieu = this.themSuaVe.getjTextField_MaSuatChieu().getText();
            String maPhim = this.themSuaVe.getjTextField_MaPhim().getText();

            this.veModel = new VeModel(maVe, maGhe, maSuatChieu, maPhim);

            if (this.themSuaVe.getTitle().equals("Thêm mới vé")) {
//                System.out.println(veModel.toString());
                this.insert(veModel);

            }

            if (this.themSuaVe.getTitle().equals("Thêm mới vé")) {
//                System.out.println(veModel.toString());
                this.update(veModel);

            }
            JOptionPane.showMessageDialog(themSuaVe, "Đã lưu!");
            this.themSuaVe.dispose();
        }
    }

    private int insert(VeModel veModel) {
        return VeDAO.getInstance().insert(veModel);
    }

    private int update(VeModel veModel) {
        return VeDAO.getInstance().update(veModel);
    }
}
