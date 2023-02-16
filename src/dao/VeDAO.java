/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VeModel;

/**
 *
 * @author nnminh322
 */
public class VeDAO implements DAOInterface<VeModel> {

    public static VeDAO getInstance() {
        return new VeDAO();
    }

    @Override
    public int insert(VeModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `VE` (`MAVE`, `MAGHE`, `MASUATCHIEU`, `MAPHIM`) VALUES ('" + t.getMaVe() + "', '" + t.getMaGhe() + "', '" + t.getMaSuatChieu() + "', '" + t.getMaPhim() + "')";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(VeDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int delete(VeModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "DELETE FROM VE WHERE `VE`.`MAVE` = '" + t.getMaVe() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(VeDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<VeModel> selectAll() {
        ArrayList<VeModel> listVeModel = new ArrayList<VeModel>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM VE";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maVe = rs.getString("MAVE");
                String maGhe = rs.getString("MAGHE");
                String maSuatChieu = rs.getString("MASUATCHIEU");
                String maPhim = rs.getString("MAPHIM");

                VeModel veModel = new VeModel(maVe, maGhe, maSuatChieu, maPhim);
                listVeModel.add(veModel);
            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(VeDAO.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listVeModel;
    }

    @Override
    public ArrayList<VeModel> find(String Condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(VeModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "UPDATE `VE` SET `MAGHE` = '" + t.getMaGhe() + "', `MASUATCHIEU` = '" + t.getMaSuatChieu() + "', `MAPHIM` = '" + t.getMaPhim() + "' WHERE `VE`.`MAVE` = '" + t.getMaVe() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(VeDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

}
