/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import model.PhimModel;
import java.sql.*;
import connection.ConnectionToDB;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nnminh322
 */
public class PhimDAO implements DAOInterface<PhimModel> {

    public static PhimDAO getInstance() {
        return new PhimDAO();
    }

    @Override
    public int delete(PhimModel t) {
        try {
            int ketQua = 0;
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "DELETE FROM PHIM WHERE `PHIM`.`MAPHIM` = '" + t.getMaPhim() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhimDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<PhimModel> selectAll() {
        ArrayList<PhimModel> listPhimModel = new ArrayList<PhimModel>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM PHIM";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maPhim = rs.getString("MAPHIM");
                String tenPhim = rs.getString("TENPHIM");
                String theLoai = rs.getString("THELOAI");
                String nhaSX = rs.getString("NHASX");
                int nam = Integer.parseInt(rs.getString("NAM"));
                int thoiLuong = Integer.parseInt(rs.getString("THOILUONG"));
                int doTuoi = Integer.parseInt(rs.getString("DOTUOI"));
                int gia = Integer.parseInt(rs.getString("GIA"));

                PhimModel phimModel = new PhimModel(maPhim, tenPhim, theLoai, nhaSX, nam, thoiLuong, doTuoi, gia);
                listPhimModel.add(phimModel);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhimDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listPhimModel;

    }

    @Override
    public ArrayList<PhimModel> find(String Condition) {
        ArrayList<PhimModel> listPhimModel = new ArrayList<PhimModel>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM `PHIM` WHERE `MAPHIM` LIKE '%" + Condition + "%'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maPhim = rs.getString("MAPHIM");
                String tenPhim = rs.getString("TENPHIM");
                String theLoai = rs.getString("THELOAI");
                String nhaSX = rs.getString("NHASX");
                int nam = Integer.parseInt(rs.getString("NAM"));
                int thoiLuong = Integer.parseInt(rs.getString("THOILUONG"));
                int doTuoi = Integer.parseInt(rs.getString("DOTUOI"));
                int gia = Integer.parseInt(rs.getString("GIA"));

                PhimModel phimModel = new PhimModel(maPhim, tenPhim, theLoai, nhaSX, nam, thoiLuong, doTuoi, gia);
                listPhimModel.add(phimModel);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhimDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listPhimModel;
    }

    @Override
    public int insert(PhimModel t) {
        try {
            int ketQua = 0;
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();
            String sql = "INSERT INTO `PHIM` (`MAPHIM`, `TENPHIM`, `THELOAI`, `NHASX`, `NAM`, `THOILUONG`, `DOTUOI`, `GIA`) VALUES ('" + t.getMaPhim() + "', '" + t.getTenPhim() + "', '" + t.getTheLoai() + "', '" + t.getNhaSX() + "', '" + t.getNam() + "', '" + t.getThoiLuong() + "', '" + t.getDoTuoi() + "', '" + t.getGia() + "')";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhimDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int update(PhimModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();
            String sql = "UPDATE `PHIM` SET `TENPHIM` = '" + t.getTenPhim() + "', `THELOAI` = '" + t.getTheLoai() + "', `NHASX` = '" + t.getNhaSX() + "', `NAM` = '" + t.getNam() + "', `THOILUONG` = '" + t.getThoiLuong() + "', `DOTUOI` = '" + t.getDoTuoi() + "', `GIA` = '" + t.getGia() + "' WHERE `PHIM`.`MAPHIM` = '" + t.getMaPhim() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PhimDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

}
