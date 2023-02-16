/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.ConnectionToDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.BaoCaoModel;

/**
 *
 * @author nnminh322
 */
public class BaoCaoDAO implements DAOInterface<BaoCaoModel> {

    public static BaoCaoDAO getInstance() {
        return new BaoCaoDAO();
    }

    @Override
    public int insert(BaoCaoModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "INSERT INTO `BAOCAO` (`MABAOCAO`, `TENBAOCAO`, `LINK`) VALUES ('" + t.getMaBaoCao() + "', '" + t.getTenBaoCao() + "', '" + t.getLink() + "')";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BaoCaoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int delete(BaoCaoModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "DELETE FROM BAOCAO WHERE `BAOCAO`.`MABAOCAO` = '" + t.getMaBaoCao() + "'";

//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BaoCaoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public ArrayList<BaoCaoModel> selectAll() {
        ArrayList<BaoCaoModel> listBaoCaoModel = new ArrayList<BaoCaoModel>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM BAOCAO";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maBaocao = rs.getString("MABAOCAO");
                String tenBaocao = rs.getString("TENBAOCAO");
                String link = rs.getString("LINK");

                BaoCaoModel baoCaoModel = new BaoCaoModel(maBaocao, tenBaocao, link);
                listBaoCaoModel.add(baoCaoModel);

            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BaoCaoDAO.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listBaoCaoModel;
    }

    @Override
    public ArrayList<BaoCaoModel> find(String Condition) {
                ArrayList<BaoCaoModel> listBaoCaoModel = new ArrayList<BaoCaoModel>();

        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "SELECT * FROM `BAOCAO` WHERE `MABAOCAO` LIKE '%"+Condition+"%'";

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String maBaocao = rs.getString("MABAOCAO");
                String tenBaocao = rs.getString("TENBAOCAO");
                String link = rs.getString("LINK");

                BaoCaoModel baoCaoModel = new BaoCaoModel(maBaocao, tenBaocao, link);
                listBaoCaoModel.add(baoCaoModel);

            }
            ConnectionToDB.close(conn);

//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BaoCaoDAO.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return listBaoCaoModel;
    }

    @Override
    public int update(BaoCaoModel t) {
        int ketQua = 0;
        try {
            java.sql.Connection conn = new ConnectionToDB().getConnection();

            java.sql.Statement st = conn.createStatement();

            String sql = "UPDATE `BAOCAO` SET `TENBAOCAO` = '" + t.getTenBaoCao() + "', `LINK` = '" + t.getLink() + "' WHERE `BAOCAO`.`MABAOCAO` = '" + t.getMaBaoCao() + "'";
//            System.out.println(sql);
            ketQua = st.executeUpdate(sql);

            ConnectionToDB.close(conn);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(BaoCaoDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return 0;
    }

}
