/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.GheDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.GheModel;
import view.ThemSuaGhe;

/**
 *
 * @author nnminh322
 */
public class ThemSuaGheController implements ActionListener {

    private ThemSuaGhe themSuaGhe;
    private GheModel gheModel;

    public ThemSuaGheController(ThemSuaGhe themSuaGhe) {
        this.themSuaGhe = themSuaGhe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lưu")) {

            String maGhe = themSuaGhe.getjTextField_MaGhe().getText();
            String maPhong = themSuaGhe.getjTextField_MaPhong().getText();
            int giaGhe = Integer.parseInt(themSuaGhe.getjTextField_GiaGhe().getText());
            int soGhe = Integer.parseInt(themSuaGhe.getjTextField_GiaGhe().getText());
            int hangGhe = Integer.parseInt(themSuaGhe.getjTextField_HangGhe().getText());
            boolean trangThaiGhe = "1".equals(themSuaGhe.getjTextField_TrangThaiGhe().getText()) || "true".equals(themSuaGhe.getjTextField_TrangThaiGhe().getText());

            this.gheModel = new GheModel(maGhe, maPhong, giaGhe, soGhe, hangGhe, trangThaiGhe);

            if (this.themSuaGhe.getTitle().equals("Thêm mới ghế")) {
//                System.out.println(gheModel.toString());
                this.insert(gheModel);

            }
            if (this.themSuaGhe.getTitle().equals("Sửa ghế")) {
//                System.out.println(gheModel.toString());
                this.update(gheModel);

            }
            JOptionPane.showMessageDialog(themSuaGhe, "Đã lưu!");
            this.themSuaGhe.dispose();
        }
    }

    private int insert(GheModel gheModel) {
        return GheDAO.getInstance().insert(gheModel);
    }

    private int update(GheModel gheModel) {
        return GheDAO.getInstance().update(gheModel);
    }
}
