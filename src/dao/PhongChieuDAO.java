/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.PhongChieuModel;
import connection.ConnectionToDB;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author nnminh322
 */
public class PhongChieuDAO implements DAOInterface<PhongChieuModel> {

    public static PhongChieuDAO getInstance() {
        return new PhongChieuDAO();
    }

    @Override
    public int insert(PhongChieuModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `PHONGCHIEU` (`MAPHONGCHIEU`, `TENPHONGCHIEU`, `SUCCHUA`, `SOLUONGGHETRONG`) VALUES ('" + t.getMaPhongChieu() + "', '" + t.getTenPhongChieu() + "', '" + t.getSucChua() + "', '" + t.getSoLuongGheTrong() + "')";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhongChieuDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int delete(PhongChieuModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "DELETE FROM PHONGCHIEU WHERE `PHONGCHIEU`.`MAPHONGCHIEU` = '" + t.getMaPhongChieu() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhongChieuDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<PhongChieuModel> selectAll() {
        ArrayList<PhongChieuModel> listPhongChieu = new ArrayList<PhongChieuModel>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM PHONGCHIEU";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                String maPhongChieu = rs.getString("MAPHONGCHIEU");
                String tenPhongChieu = rs.getString("TENPHONGCHIEU");
                int sucChua = Integer.parseInt(rs.getString("SUCCHUA"));
                int soLuongGheTrong = Integer.parseInt(rs.getString("SOLUONGGHETRONG"));

                PhongChieuModel phongChieuModel = new PhongChieuModel(maPhongChieu, tenPhongChieu, sucChua, soLuongGheTrong);
                listPhongChieu.add(phongChieuModel);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhongChieuDAO.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listPhongChieu;
    }

    @Override
    public ArrayList<PhongChieuModel> find(String Condition) {
        ArrayList<PhongChieuModel> listPhongChieu = new ArrayList<PhongChieuModel>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM PHONGCHIEU WHERE `MAPHONGCHIEU` LIKE '%"+Condition+"%'";
            
//            System.out.println(sql);

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                String maPhongChieu = rs.getString("MAPHONGCHIEU");
                String tenPhongChieu = rs.getString("TENPHONGCHIEU");
                int sucChua = Integer.parseInt(rs.getString("SUCCHUA"));
                int soLuongGheTrong = Integer.parseInt(rs.getString("SOLUONGGHETRONG"));

                PhongChieuModel phongChieuModel = new PhongChieuModel(maPhongChieu, tenPhongChieu, sucChua, soLuongGheTrong);
                listPhongChieu.add(phongChieuModel);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhongChieuDAO.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listPhongChieu;
    }

    @Override
    public int update(PhongChieuModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();
            String sql = "UPDATE `PHONGCHIEU` SET `TENPHONGCHIEU` = '" + t.getTenPhongChieu() + "', `SUCCHUA` = '" + t.getSucChua() + "', `SOLUONGGHETRONG` = '" + t.getSoLuongGheTrong() + "' WHERE `PHONGCHIEU`.`MAPHONGCHIEU` = '" + t.getMaPhongChieu() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhongChieuDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

}
