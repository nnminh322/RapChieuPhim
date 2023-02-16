/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.SuatChieuDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.SuatChieuModel;
import view.ThemSuaPhongChieu;
import view.ThemSuaSuatChieu;

/**
 *
 * @author nnminh322
 */
public class ThemSuaSuatChieuController implements ActionListener {

    private ThemSuaSuatChieu themSuaSuatChieu;
    private SuatChieuModel suatChieuModel;

    public ThemSuaSuatChieuController(ThemSuaSuatChieu themSuaSuatChieu) {
        this.themSuaSuatChieu = themSuaSuatChieu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lưu")) {

            String maSuatChieu = this.themSuaSuatChieu.getjTextField_MaSuatChieu().getText();
            String khungGio = this.themSuaSuatChieu.getjTextField_KhungGio().getText();
            String maPhim = this.themSuaSuatChieu.getjTextField_MaPhim().getText();

            this.suatChieuModel = new SuatChieuModel(maSuatChieu, khungGio, maPhim);

            if (this.themSuaSuatChieu.getTitle().equals("Thêm mới suất chiếu")) {
                this.insert(suatChieuModel);
            }
            if (this.themSuaSuatChieu.getTitle().equals("Sửa suất chiếu")) {
                this.update(suatChieuModel);
            }

            JOptionPane.showMessageDialog(themSuaSuatChieu, "Đã lưu!");
            this.themSuaSuatChieu.dispose();
        }
    }

    private int insert(SuatChieuModel suatChieuModel) {
        return SuatChieuDAO.getInstance().insert(suatChieuModel);
    }

    private int update(SuatChieuModel suatchieuModel) {
        return SuatChieuDAO.getInstance().update(suatchieuModel);
    }
}
