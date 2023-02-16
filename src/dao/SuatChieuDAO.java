/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.SuatChieuModel;
import connection.ConnectionToDB;
import java.util.ArrayList;
import model.PhimModel;
import java.sql.*;

/**
 *
 * @author nnminh322
 */
public class SuatChieuDAO implements DAOInterface<SuatChieuModel> {

    public static SuatChieuDAO getInstance() {
        return new SuatChieuDAO();
    }

    @Override
    public int insert(SuatChieuModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `SUATCHIEU` (`MASUATCHIEU`, `KHUNGGIO`, `MAPHIM`) VALUES ('" + t.getMaSuatChieu() + "', '" + t.getKhungGio() + "', '" + t.getMaPhim() + "')";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SuatChieuDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int delete(SuatChieuModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "DELETE FROM SUATCHIEU WHERE `SUATCHIEU`.`MASUATCHIEU` = '" + t.getMaSuatChieu() + "'";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SuatChieuDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<SuatChieuModel> selectAll() {
        ArrayList<SuatChieuModel> listSuatChieu = new ArrayList<SuatChieuModel>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT SC.MASUATCHIEU, SC.MAPHIM, P.TENPHIM, SC.KHUNGGIO FROM SUATCHIEU SC JOIN PHIM P ON SC.MAPHIM = P.MAPHIM;";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maSuatChieu = rs.getString("MASUATCHIEU");
                String khungGio = rs.getString("KHUNGGIO");
                String tenPhim = rs.getString("TENPHIM");
                String maPhim = rs.getString("MAPHIM");

                SuatChieuModel suatChieuModel = new SuatChieuModel(maSuatChieu, khungGio, tenPhim, maPhim);
                listSuatChieu.add(suatChieuModel);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhimDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listSuatChieu;
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<SuatChieuModel> find(String Condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(SuatChieuModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "UPDATE `SUATCHIEU` SET `KHUNGGIO` = '"+t.getKhungGio()+"', `MAPHIM` = '"+t.getMaPhim()+"' WHERE `SUATCHIEU`.`MASUATCHIEU` = '"+t.getMaSuatChieu()+"'";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SuatChieuDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

}
