/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import connection.ConnectionToDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import model.InVeModel;

/**
 *
 * @author nnminh322
 */
public class InVe {

    public InVeModel inVeModel;

    public static InVe getInstance() {
        return new InVe();
    }

    public InVeModel in(VeModel veModel) {
        ArrayList<InVeModel> listInVeModel = new ArrayList<InVeModel>();
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();
            String sql = "SELECT PHIM.TENPHIM, SUATCHIEU.KHUNGGIO, GHE.MAPHONG, GHE.HANGGHE, GHE.SOGHE, (GHE.GIAGHE + PHIM.GIA) AS GIA FROM VE JOIN GHE ON VE.MAGHE = GHE.MAGHE JOIN PHIM ON VE.MAPHIM = PHIM.MAPHIM JOIN SUATCHIEU ON VE.MASUATCHIEU = SUATCHIEU.MASUATCHIEU WHERE VE.MAVE = '" + veModel.getMaVe() + "'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String tenPhim = rs.getString("TENPHIM");
                String khungGio = rs.getString("KHUNGGIO");
                String phongChieu = rs.getString("MAPHONG");
                String hangGhe = rs.getString("HANGGHE");
                String soGhe = rs.getString("SOGHE");
                String gia = rs.getString("GIA");
                inVeModel = new InVeModel(tenPhim, khungGio, phongChieu, hangGhe, soGhe, gia);
                listInVeModel.add(inVeModel);
            }
            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            Logger.getLogger(InVe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listInVeModel.get(0);
    }
}
