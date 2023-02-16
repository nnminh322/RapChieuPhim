/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import java.util.ArrayList;
import model.GheModel;
import java.sql.*;

/**
 *
 * @author nnminh322
 */
public class GheDAO implements DAOInterface<GheModel> {

    public static GheDAO getInstance() {
        return new GheDAO();
    }

    @Override
    public int insert(GheModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `GHE` (`MAGHE`, `MAPHONG`, `GIAGHE`, `SOGHE`, `HANGGHE`, `TRANGTHAIGHE`) VALUES ('" + t.getMaGhe() + "', '" + t.getMaPhong() + "', '" + t.getGiaGhe() + "', '" + t.getSoGhe() + "', '" + t.getHangGhe() + "', '" + (t.isTrangThaiGhe() ? 1 : 0) + "')";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SuatChieuDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int delete(GheModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "DELETE FROM GHE WHERE `GHE`.`MAGHE` = '" + t.getMaGhe() + "'";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(GheDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<GheModel> selectAll() {
        ArrayList<GheModel> listGhe = new ArrayList<GheModel>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM GHE";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                String maGhe = rs.getString("MAGHE");
                String maPhong = rs.getString("MAPHONG");
                int giaGhe = Integer.parseInt(rs.getString("GIAGHE"));
                int soGhe = Integer.parseInt(rs.getString("SOGHE"));
                int hangGhe = rs.getInt("HANGGHE");
                boolean trangThaiGhe = rs.getBoolean("TRANGTHAIGHE");
                GheModel gheModel = new GheModel(maGhe, maPhong, giaGhe, soGhe, hangGhe, trangThaiGhe);
                listGhe.add(gheModel);
            }
            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(GheDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listGhe;
    }

    @Override
    public ArrayList<GheModel> find(String Condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(GheModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "UPDATE `GHE` SET `MAPHONG` = '" + t.getMaPhong() + "', `GIAGHE` = '" + t.getGiaGhe() + "', `SOGHE` = '" + t.getSoGhe() + "', `HANGGHE` = '" + t.getHangGhe() + "', `TRANGTHAIGHE` = '" + (t.isTrangThaiGhe() ? 1 : 0) + "' WHERE `GHE`.`MAGHE` = '" + t.getMaGhe() + "'";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(GheDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

}
