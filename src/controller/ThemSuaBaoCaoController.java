/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.BaoCaoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.BaoCaoModel;
import view.ThemSuaBaoCao;

/**
 *
 * @author nnminh322
 */
public class ThemSuaBaoCaoController implements ActionListener {

    private ThemSuaBaoCao themSuaBaoCao;
    private BaoCaoModel baoCaoModel;

    public ThemSuaBaoCaoController(ThemSuaBaoCao themSuaBaoCao) {
        this.themSuaBaoCao = themSuaBaoCao;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lưu")) {

            String maBaoCao = this.themSuaBaoCao.getjTextField_MaBaoCao().getText();
            String tenBaoCao = this.themSuaBaoCao.getjTextField_TenBaoCao().getText();
            String link = this.themSuaBaoCao.getjTextField_Link().getText();

            this.baoCaoModel = new BaoCaoModel(maBaoCao, tenBaoCao, link);

            if (this.themSuaBaoCao.getTitle()
                    .equals("Thêm mới báo cáo")) {
//                System.out.println(baocaoModel.toString());
                this.insert(baoCaoModel);
                JOptionPane.showMessageDialog(themSuaBaoCao, "Đã lưu!");
                this.themSuaBaoCao.dispose();
            }

        }
    }

    private int insert(BaoCaoModel baocaoModel) {
        return BaoCaoDAO.getInstance().insert(baocaoModel);
    }

}
