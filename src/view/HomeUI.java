/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.HomeController;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.BaoCaoModel;
import model.GheModel;
import model.PhimModel;
import model.PhongChieuModel;
import model.SuatChieuModel;
import model.VeModel;

/**
 *
 * @author nnminh322
 */
public class HomeUI extends javax.swing.JFrame {

    /**
     * Creates new form HomeUI
     */
    public HomeUI() {
        initComponents();
        init();
        hienthi();
    }

    public void init() {
        this.homeController = new HomeController(this);
        ActionListener action = new HomeController(this);
        this.jButton_InVe.addActionListener(action);
        this.jButton_SuaBaoCao.addActionListener(action);
        this.jButton_SuaGhe.addActionListener(action);
        this.jButton_SuaPhim.addActionListener(action);
        this.jButton_SuaPhongChieu.addActionListener(action);
        this.jButton_SuaSuatChieu.addActionListener(action);
        this.jButton_SuaVe.addActionListener(action);
        this.jButton_ThemMoiBaoCao.addActionListener(action);
        this.jButton_ThemMoiGhe.addActionListener(action);
        this.jButton_ThemMoiPhim.addActionListener(action);
        this.jButton_ThemMoiPhongChieu.addActionListener(action);
        this.jButton_ThemMoiSuatChieu.addActionListener(action);
        this.jButton_ThemMoiVe.addActionListener(action);
        this.jButton_TimKiemPhim.addActionListener(action);
        this.jButton_TimKiemBaoCao.addActionListener(action);
        this.jButton_TimKiemGhe.addActionListener(action);
        this.jButton_TimKiemPhongChieu.addActionListener(action);
        this.jButton_TimKiemSuatChieu.addActionListener(action);
        this.jButton_TimKiemVe.addActionListener(action);
        this.jButton_XoaBaoCao.addActionListener(action);
        this.jButton_XoaGhe.addActionListener(action);
        this.jButton_XoaPhim.addActionListener(action);
        this.jButton_XoaPhongChieu.addActionListener(action);
        this.jButton_XoaSuatChieu.addActionListener(action);
        this.jButton_XoaVe.addActionListener(action);
    }

    public void hienthi() {
        this.hienThiPhim();
        this.hienThiSuatChieu();
        this.hienThiPhongChieu();
        this.hienThiGhe();
        this.hienThiVe();
        this.hienThiBaoCao();
    }

    public void hienThiPhim() {
        ArrayList<PhimModel> listPhimModel = this.homeController.hienThiPhim();
        DefaultTableModel model = (DefaultTableModel) jTable_Phim.getModel();
        model.setRowCount(0);
        for (PhimModel phimModel : listPhimModel) {
            Object[] row = {
                phimModel.getMaPhim(),
                phimModel.getTenPhim(),
                phimModel.getTheLoai(),
                phimModel.getDoTuoi(),
                phimModel.getThoiLuong(),
                phimModel.getGia(),};
            model.addRow(row);
        }
    }

    public void hienThiSuatChieu() {
        ArrayList<SuatChieuModel> listSuatChieu = this.homeController.hienThiSuatChieu();
        DefaultTableModel model = (DefaultTableModel) jTable_SuatChieu.getModel();
        model.setRowCount(0);
        for (SuatChieuModel suatChieuModel : listSuatChieu) {
            Object[] row = {
                suatChieuModel.getMaSuatChieu(),
                suatChieuModel.getMaPhim(),
                suatChieuModel.getTenPhim(),
                suatChieuModel.getKhungGio(),};

            model.addRow(row);
        }
    }

    public void hienThiPhongChieu() {
        ArrayList<PhongChieuModel> listPhongChieu = this.homeController.hienThiPhongChieu();
        DefaultTableModel model = (DefaultTableModel) jTable_PhongChieu.getModel();
        model.setRowCount(0);
        for (PhongChieuModel phongChieuModel : listPhongChieu) {
            Object[] row = {
                phongChieuModel.getMaPhongChieu(),
                phongChieuModel.getTenPhongChieu(),
                phongChieuModel.getSucChua(),
                phongChieuModel.getSoLuongGheTrong(),};

            model.addRow(row);
        }
    }

    public void hienThiGhe() {
        ArrayList<GheModel> listGheModel = this.homeController.hienThiGhe();
        DefaultTableModel model = (DefaultTableModel) jTable_Ghe.getModel();
        model.setRowCount(0);
        for (GheModel gheModel : listGheModel) {
            Object[] row = {
                gheModel.getMaGhe(),
                gheModel.getHangGhe(),
                gheModel.getSoGhe(),
                gheModel.isTrangThaiGhe(),
                gheModel.getMaPhong(),
                gheModel.getGiaGhe()};

            model.addRow(row);
        }
    }

    public void hienThiVe() {
        ArrayList<VeModel> listVeModel = this.homeController.hienThiVe();
        DefaultTableModel model = (DefaultTableModel) jTable_Ve.getModel();
        model.setRowCount(0);
        for (VeModel veModel : listVeModel) {
            Object[] row = {
                veModel.getMaVe(),
                veModel.getMaPhim(),
                veModel.getMaSuatChieu(),
                veModel.getMaGhe(),};

            model.addRow(row);
        }
    }

    public void hienThiBaoCao() {
        ArrayList<BaoCaoModel> listBaoCaoModel = this.homeController.hienThiBaoCao();
        DefaultTableModel model = (DefaultTableModel) jTable_BaoCao.getModel();
        model.setRowCount(0);
        for (BaoCaoModel baoCaoModel : listBaoCaoModel) {
            Object[] row = {
                baoCaoModel.getMaBaoCao(),
                baoCaoModel.getTenBaoCao(),
                baoCaoModel.getLink(),};
            model.addRow(row);
        }
    }

    public void timKiemPhim(ArrayList<PhimModel> listPhimModel) {
        DefaultTableModel model = (DefaultTableModel) jTable_Phim.getModel();
        model.setRowCount(0);
        for (PhimModel phimModel : listPhimModel) {
            Object[] row = {
                phimModel.getMaPhim(),
                phimModel.getTenPhim(),
                phimModel.getTheLoai(),
                phimModel.getDoTuoi(),
                phimModel.getThoiLuong(),
                phimModel.getGia(),};
            model.addRow(row);
        }

    }

    public void timKiemSuatChieu(ArrayList<SuatChieuModel> listSuatChieuModel) {
        DefaultTableModel model = (DefaultTableModel) jTable_SuatChieu.getModel();
        model.setRowCount(0);
        for (SuatChieuModel suatChieuModel : listSuatChieuModel) {
            Object[] row = {
                suatChieuModel.getMaSuatChieu(),
                suatChieuModel.getMaPhim(),
                suatChieuModel.getTenPhim(),
                suatChieuModel.getKhungGio(),};

            model.addRow(row);
        }
    }

    public void timKiemPhongChieu(ArrayList<PhongChieuModel> listPhongChieuModel) {
        DefaultTableModel model = (DefaultTableModel) jTable_PhongChieu.getModel();
        model.setRowCount(0);
        for (PhongChieuModel phongChieuModel : listPhongChieuModel) {
            Object[] row = {
                phongChieuModel.getMaPhongChieu(),
                phongChieuModel.getTenPhongChieu(),
                phongChieuModel.getSucChua(),
                phongChieuModel.getSoLuongGheTrong(),};

            model.addRow(row);
        }
    }

    public void timKiemGhe(ArrayList<GheModel> listGheModel) {
        DefaultTableModel model = (DefaultTableModel) jTable_Ghe.getModel();
        model.setRowCount(0);
        for (GheModel gheModel : listGheModel) {
            Object[] row = {
                gheModel.getMaGhe(),
                gheModel.getHangGhe(),
                gheModel.getSoGhe(),
                gheModel.isTrangThaiGhe(),
                gheModel.getMaPhong(),
                gheModel.getGiaGhe()};

            model.addRow(row);
        }
    }

    public void timKiemVe(ArrayList<VeModel> listVeModel) {
        DefaultTableModel model = (DefaultTableModel) jTable_Ve.getModel();
        model.setRowCount(0);
        for (VeModel veModel : listVeModel) {
            Object[] row = {
                veModel.getMaVe(),
                veModel.getMaPhim(),
                veModel.getMaSuatChieu(),
                veModel.getMaGhe(),};

            model.addRow(row);
        }
    }

    public void timKiemBaoCao(ArrayList<BaoCaoModel> listBaoCaoModel) {
        DefaultTableModel model = (DefaultTableModel) jTable_BaoCao.getModel();
        model.setRowCount(0);
        for (BaoCaoModel baoCaoModel : listBaoCaoModel) {
            Object[] row = {
                baoCaoModel.getMaBaoCao(),
                baoCaoModel.getTenBaoCao(),
                baoCaoModel.getLink(),};
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_TuKhoaPhim = new javax.swing.JTextField();
        jButton_TimKiemPhim = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton_SuaPhim = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Phim = new javax.swing.JTable();
        jButton_ThemMoiPhim = new javax.swing.JButton();
        jButton_XoaPhim = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_TuKhoaSuatChieu = new javax.swing.JTextField();
        jButton_TimKiemSuatChieu = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton_SuaSuatChieu = new javax.swing.JButton();
        jButton_XoaSuatChieu = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_SuatChieu = new javax.swing.JTable();
        jButton_ThemMoiSuatChieu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_TuKhoaPhongChieu = new javax.swing.JTextField();
        jButton_TimKiemPhongChieu = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_PhongChieu = new javax.swing.JTable();
        jButton_SuaPhongChieu = new javax.swing.JButton();
        jButton_XoaPhongChieu = new javax.swing.JButton();
        jButton_ThemMoiPhongChieu = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_TuKhoaGhe = new javax.swing.JTextField();
        jButton_TimKiemGhe = new javax.swing.JButton();
        jButton_SuaGhe = new javax.swing.JButton();
        jButton_XoaGhe = new javax.swing.JButton();
        jButton_ThemMoiGhe = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_Ghe = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_TuKhoaVe = new javax.swing.JTextField();
        jButton_TimKiemVe = new javax.swing.JButton();
        jButton_ThemMoiVe = new javax.swing.JButton();
        jButton_SuaVe = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable_Ve = new javax.swing.JTable();
        jButton_XoaVe = new javax.swing.JButton();
        jButton_InVe = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_TuKhoaBaoCao = new javax.swing.JTextField();
        jButton_TimKiemBaoCao = new javax.swing.JButton();
        jButton_ThemMoiBaoCao = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable_BaoCao = new javax.swing.JTable();
        jButton_SuaBaoCao = new javax.swing.JButton();
        jButton_XoaBaoCao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Từ khoá");

        jButton_TimKiemPhim.setText("Tìm kiếm phim");

        jButton_SuaPhim.setText("Sửa phim");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButton_SuaPhim)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jButton_SuaPhim)
                .addGap(51, 51, 51))
        );

        jTable_Phim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phim", "Tên phim", "Thể loại", "Độ tuổi", "Thời lượng", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Phim);

        jScrollPane2.setViewportView(jScrollPane1);

        jButton_ThemMoiPhim.setText("Thêm mới phim");

        jButton_XoaPhim.setText("Xoá phim");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_ThemMoiPhim))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 27, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(98, 98, 98)
                                .addComponent(jTextField_TuKhoaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton_TimKiemPhim)
                                .addGap(254, 254, 254))
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_XoaPhim))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_TimKiemPhim)
                            .addComponent(jTextField_TuKhoaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_ThemMoiPhim)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_XoaPhim)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý Phim", jPanel1);

        jLabel2.setText("Từ khoá");

        jButton_TimKiemSuatChieu.setText("Tìm kiếm suất chiếu");

        jButton_SuaSuatChieu.setText("Sửa suất chiếu");

        jButton_XoaSuatChieu.setText("Xoá suất chiếu");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_SuaSuatChieu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_XoaSuatChieu, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton_SuaSuatChieu)
                .addGap(32, 32, 32)
                .addComponent(jButton_XoaSuatChieu)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTable_SuatChieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã suất chiếu", "Mã phim", "Tên phim", "Khung giờ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_SuatChieu);

        jScrollPane4.setViewportView(jScrollPane3);

        jButton_ThemMoiSuatChieu.setText("Thêm mới suất chiếu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addGap(79, 79, 79)
                        .addComponent(jTextField_TuKhoaSuatChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton_TimKiemSuatChieu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_ThemMoiSuatChieu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_TuKhoaSuatChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_TimKiemSuatChieu)
                    .addComponent(jButton_ThemMoiSuatChieu))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 252, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý Suất chiếu", jPanel2);

        jLabel3.setText("Từ khoá");

        jButton_TimKiemPhongChieu.setText("Tìm kiếm phòng chiếu");

        jTable_PhongChieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng chiếu", "Tên phòng chiếu", "Sức chứa", "Số lượng ghế trống"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable_PhongChieu);

        jScrollPane6.setViewportView(jScrollPane5);

        jButton_SuaPhongChieu.setText("Sửa phòng chiếu");

        jButton_XoaPhongChieu.setText("Xoá phòng chiếu");

        jButton_ThemMoiPhongChieu.setText("Thêm mới phòng chiếu");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField_TuKhoaPhongChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton_TimKiemPhongChieu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_ThemMoiPhongChieu))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_SuaPhongChieu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_XoaPhongChieu, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jButton_SuaPhongChieu)
                .addGap(83, 83, 83)
                .addComponent(jButton_XoaPhongChieu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_TuKhoaPhongChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_TimKiemPhongChieu)
                    .addComponent(jButton_ThemMoiPhongChieu))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Quản lý Phòng chiếu", jPanel3);

        jLabel4.setText("Từ khoá");

        jButton_TimKiemGhe.setText("Tìm kiếm ghế");

        jButton_SuaGhe.setText("Sửa ghế");

        jButton_XoaGhe.setText("Xoá ghế");

        jButton_ThemMoiGhe.setText("Thêm mới ghế");

        jTable_Ghe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ghế", "Hàng ghế", "Số ghế", "Trạng thái ghế", "Mã phòng", "Giá ghế"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable_Ghe);

        jScrollPane8.setViewportView(jScrollPane7);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel4)
                        .addGap(83, 83, 83)
                        .addComponent(jTextField_TuKhoaGhe, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButton_TimKiemGhe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addComponent(jButton_ThemMoiGhe))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_XoaGhe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_SuaGhe, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_TuKhoaGhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_TimKiemGhe)
                    .addComponent(jButton_ThemMoiGhe))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton_SuaGhe)
                        .addGap(101, 101, 101)
                        .addComponent(jButton_XoaGhe)
                        .addContainerGap(248, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Quản lý Ghế", jPanel4);

        jLabel5.setText("Từ khoá");

        jButton_TimKiemVe.setText("Tìm kiếm vé");

        jButton_ThemMoiVe.setText("Thêm mới vé");

        jButton_SuaVe.setText("Sửa vé");

        jTable_Ve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã vé", "Mã phim", "Mã suất chiếu", "Mã ghế"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable_Ve);

        jScrollPane10.setViewportView(jScrollPane9);

        jButton_XoaVe.setText("Xoá vé");

        jButton_InVe.setText("In vé");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel5)
                        .addGap(61, 61, 61)
                        .addComponent(jTextField_TuKhoaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jButton_TimKiemVe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_ThemMoiVe))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_SuaVe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_XoaVe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_InVe, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(48, 48, 48))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_TuKhoaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_TimKiemVe)
                    .addComponent(jButton_ThemMoiVe))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton_SuaVe)
                        .addGap(63, 63, 63)
                        .addComponent(jButton_XoaVe)
                        .addGap(68, 68, 68)
                        .addComponent(jButton_InVe))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý Vé", jPanel5);

        jLabel6.setText("Từ khoá");

        jButton_TimKiemBaoCao.setText("Tìm kiếm báo cáo");

        jButton_ThemMoiBaoCao.setText("Thêm mới báo cáo");

        jTable_BaoCao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã báo cáo", "Tên báo cáo", "Link"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTable_BaoCao);

        jScrollPane12.setViewportView(jScrollPane11);

        jButton_SuaBaoCao.setText("Sửa báo cáo");

        jButton_XoaBaoCao.setText("Xoá báo cáo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addGap(91, 91, 91)
                .addComponent(jTextField_TuKhoaBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jButton_TimKiemBaoCao)
                .addGap(103, 103, 103)
                .addComponent(jButton_ThemMoiBaoCao)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_SuaBaoCao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_XoaBaoCao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_TuKhoaBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_TimKiemBaoCao)
                    .addComponent(jButton_ThemMoiBaoCao))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton_SuaBaoCao)
                        .addGap(91, 91, 91)
                        .addComponent(jButton_XoaBaoCao)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Quản lý Báo cáo", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeUI().setVisible(true);
            }
        });
    }
    private HomeController homeController;
    private ThemSuaPhim themSuaPhim;
    private ThemSuaPhongChieu themSuaPhongChieu;
    private ThemSuaSuatChieu themSuaSuatChieu;
    private ThemSuaGhe themSuaGhe;
    private ThemSuaVe themSuaVe;
    private ThemSuaBaoCao themSuaBaoCao;
    private InVe inVe;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_InVe;
    private javax.swing.JButton jButton_SuaBaoCao;
    private javax.swing.JButton jButton_SuaGhe;
    private javax.swing.JButton jButton_SuaPhim;
    private javax.swing.JButton jButton_SuaPhongChieu;
    private javax.swing.JButton jButton_SuaSuatChieu;
    private javax.swing.JButton jButton_SuaVe;
    private javax.swing.JButton jButton_ThemMoiBaoCao;
    private javax.swing.JButton jButton_ThemMoiGhe;
    private javax.swing.JButton jButton_ThemMoiPhim;
    private javax.swing.JButton jButton_ThemMoiPhongChieu;
    private javax.swing.JButton jButton_ThemMoiSuatChieu;
    private javax.swing.JButton jButton_ThemMoiVe;
    private javax.swing.JButton jButton_TimKiemBaoCao;
    private javax.swing.JButton jButton_TimKiemGhe;
    private javax.swing.JButton jButton_TimKiemPhim;
    private javax.swing.JButton jButton_TimKiemPhongChieu;
    private javax.swing.JButton jButton_TimKiemSuatChieu;
    private javax.swing.JButton jButton_TimKiemVe;
    private javax.swing.JButton jButton_XoaBaoCao;
    private javax.swing.JButton jButton_XoaGhe;
    private javax.swing.JButton jButton_XoaPhim;
    private javax.swing.JButton jButton_XoaPhongChieu;
    private javax.swing.JButton jButton_XoaSuatChieu;
    private javax.swing.JButton jButton_XoaVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_BaoCao;
    private javax.swing.JTable jTable_Ghe;
    private javax.swing.JTable jTable_Phim;
    private javax.swing.JTable jTable_PhongChieu;
    private javax.swing.JTable jTable_SuatChieu;
    private javax.swing.JTable jTable_Ve;
    private javax.swing.JTextField jTextField_TuKhoaBaoCao;
    private javax.swing.JTextField jTextField_TuKhoaGhe;
    private javax.swing.JTextField jTextField_TuKhoaPhim;
    private javax.swing.JTextField jTextField_TuKhoaPhongChieu;
    private javax.swing.JTextField jTextField_TuKhoaSuatChieu;
    private javax.swing.JTextField jTextField_TuKhoaVe;
    // End of variables declaration//GEN-END:variables

    public ThemSuaPhim getThemSuaPhim() {
        return themSuaPhim;
    }

    public void setThemSuaPhim(ThemSuaPhim themSuaPhim) {
        this.themSuaPhim = themSuaPhim;
    }

    public ThemSuaPhongChieu getThemSuaPhongChieu() {
        return themSuaPhongChieu;
    }

    public void setThemSuaPhongChieu(ThemSuaPhongChieu themSuaPhongChieu) {
        this.themSuaPhongChieu = themSuaPhongChieu;
    }

    public ThemSuaSuatChieu getThemSuaSuatChieu() {
        return themSuaSuatChieu;
    }

    public void setThemSuaSuatChieu(ThemSuaSuatChieu themSuaSuatChieu) {
        this.themSuaSuatChieu = themSuaSuatChieu;
    }

    public ThemSuaGhe getThemSuaGhe() {
        return themSuaGhe;
    }

    public void setThemSuaGhe(ThemSuaGhe themSuaGhe) {
        this.themSuaGhe = themSuaGhe;
    }

    public ThemSuaVe getThemSuaVe() {
        return themSuaVe;
    }

    public void setThemSuaVe(ThemSuaVe themSuaVe) {
        this.themSuaVe = themSuaVe;
    }

    public ThemSuaBaoCao getThemSuaBaoCao() {
        return themSuaBaoCao;
    }

    public void setThemSuaBaoCao(ThemSuaBaoCao themSuaBaoCao) {
        this.themSuaBaoCao = themSuaBaoCao;
    }

    public JButton getjButton_InVe() {
        return jButton_InVe;
    }

    public void setjButton_InVe(JButton jButton_InVe) {
        this.jButton_InVe = jButton_InVe;
    }

    public JButton getjButton_SuaGhe() {
        return jButton_SuaGhe;
    }

    public void setjButton_SuaGhe(JButton jButton_SuaGhe) {
        this.jButton_SuaGhe = jButton_SuaGhe;
    }

    public JButton getjButton_SuaPhim() {
        return jButton_SuaPhim;
    }

    public void setjButton_SuaPhim(JButton jButton_SuaPhim) {
        this.jButton_SuaPhim = jButton_SuaPhim;
    }

    public JButton getjButton_SuaPhongChieu() {
        return jButton_SuaPhongChieu;
    }

    public void setjButton_SuaPhongChieu(JButton jButton_SuaPhongChieu) {
        this.jButton_SuaPhongChieu = jButton_SuaPhongChieu;
    }

    public JButton getjButton_SuaSuatChieu() {
        return jButton_SuaSuatChieu;
    }

    public void setjButton_SuaSuatChieu(JButton jButton_SuaSuatChieu) {
        this.jButton_SuaSuatChieu = jButton_SuaSuatChieu;
    }

    public JButton getjButton_SuaVe() {
        return jButton_SuaVe;
    }

    public void setjButton_SuaVe(JButton jButton_SuaVe) {
        this.jButton_SuaVe = jButton_SuaVe;
    }

    public JButton getjButton_ThemMoiBaoCao() {
        return jButton_ThemMoiBaoCao;
    }

    public void setjButton_ThemMoiBaoCao(JButton jButton_ThemMoiBaoCao) {
        this.jButton_ThemMoiBaoCao = jButton_ThemMoiBaoCao;
    }

    public JButton getjButton_ThemMoiGhe() {
        return jButton_ThemMoiGhe;
    }

    public void setjButton_ThemMoiGhe(JButton jButton_ThemMoiGhe) {
        this.jButton_ThemMoiGhe = jButton_ThemMoiGhe;
    }

    public JButton getjButton_ThemMoiPhim() {
        return jButton_ThemMoiPhim;
    }

    public void setjButton_ThemMoiPhim(JButton jButton_ThemMoiPhim) {
        this.jButton_ThemMoiPhim = jButton_ThemMoiPhim;
    }

    public JButton getjButton_ThemMoiVe() {
        return jButton_ThemMoiVe;
    }

    public void setjButton_ThemMoiVe(JButton jButton_ThemMoiVe) {
        this.jButton_ThemMoiVe = jButton_ThemMoiVe;
    }

    public JButton getjButton_ThemPhongChieu() {
        return jButton_ThemMoiPhongChieu;
    }

    public void setjButton_ThemPhongChieu(JButton jButton_ThemPhongChieu) {
        this.jButton_ThemMoiPhongChieu = jButton_ThemPhongChieu;
    }

    public JButton getjButton_ThemSuatChieu() {
        return jButton_ThemMoiSuatChieu;
    }

    public void setjButton_ThemSuatChieu(JButton jButton_ThemSuatChieu) {
        this.jButton_ThemMoiSuatChieu = jButton_ThemSuatChieu;
    }

    public JButton getjButton_TimKiemBaoCao() {
        return jButton_TimKiemBaoCao;
    }

    public void setjButton_TimKiemBaoCao(JButton jButton_TimKiemBaoCao) {
        this.jButton_TimKiemBaoCao = jButton_TimKiemBaoCao;
    }

    public JButton getjButton_TimKiemGhe() {
        return jButton_TimKiemGhe;
    }

    public void setjButton_TimKiemGhe(JButton jButton_TimKiemGhe) {
        this.jButton_TimKiemGhe = jButton_TimKiemGhe;
    }

    public JButton getjButton_TimKiemPhim() {
        return jButton_TimKiemPhim;
    }

    public void setjButton_TimKiemPhim(JButton jButton_TimKiemPhim) {
        this.jButton_TimKiemPhim = jButton_TimKiemPhim;
    }

    public JButton getjButton_TimKiemPhongChieu() {
        return jButton_TimKiemPhongChieu;
    }

    public void setjButton_TimKiemPhongChieu(JButton jButton_TimKiemPhongChieu) {
        this.jButton_TimKiemPhongChieu = jButton_TimKiemPhongChieu;
    }

    public JButton getjButton_TimKiemSuatChieu() {
        return jButton_TimKiemSuatChieu;
    }

    public void setjButton_TimKiemSuatChieu(JButton jButton_TimKiemSuatChieu) {
        this.jButton_TimKiemSuatChieu = jButton_TimKiemSuatChieu;
    }

    public JButton getjButton_TimKiemVe() {
        return jButton_TimKiemVe;
    }

    public void setjButton_TimKiemVe(JButton jButton_TimKiemVe) {
        this.jButton_TimKiemVe = jButton_TimKiemVe;
    }

    public JButton getjButton_XoaGhe() {
        return jButton_XoaGhe;
    }

    public void setjButton_XoaGhe(JButton jButton_XoaGhe) {
        this.jButton_XoaGhe = jButton_XoaGhe;
    }

    public JButton getjButton_XoaPhim() {
        return jButton_XoaPhim;
    }

    public void setjButton_XoaPhim(JButton jButton_XoaPhim) {
        this.jButton_XoaPhim = jButton_XoaPhim;
    }

    public JButton getjButton_XoaPhongChieu() {
        return jButton_XoaPhongChieu;
    }

    public void setjButton_XoaPhongChieu(JButton jButton_XoaPhongChieu) {
        this.jButton_XoaPhongChieu = jButton_XoaPhongChieu;
    }

    public JButton getjButton_XoaSuatChieu() {
        return jButton_XoaSuatChieu;
    }

    public void setjButton_XoaSuatChieu(JButton jButton_XoaSuatChieu) {
        this.jButton_XoaSuatChieu = jButton_XoaSuatChieu;
    }

    public JButton getjButton_XoaVe() {
        return jButton_XoaVe;
    }

    public void setjButton_XoaVe(JButton jButton_XoaVe) {
        this.jButton_XoaVe = jButton_XoaVe;
    }

    public JTable getjTable_BaoCao() {
        return jTable_BaoCao;
    }

    public void setjTable_BaoCao(JTable jTable_BaoCao) {
        this.jTable_BaoCao = jTable_BaoCao;
    }

    public JTable getjTable_Ghe() {
        return jTable_Ghe;
    }

    public void setjTable_Ghe(JTable jTable_Ghe) {
        this.jTable_Ghe = jTable_Ghe;
    }

    public JTable getjTable_Phim() {
        return jTable_Phim;
    }

    public void setjTable_Phim(JTable jTable_Phim) {
        this.jTable_Phim = jTable_Phim;
    }

    public JTable getjTable_PhongChieu() {
        return jTable_PhongChieu;
    }

    public void setjTable_PhongChieu(JTable jTable_PhongChieu) {
        this.jTable_PhongChieu = jTable_PhongChieu;
    }

    public JTable getjTable_SuatChieu() {
        return jTable_SuatChieu;
    }

    public void setjTable_SuatChieu(JTable jTable_SuatChieu) {
        this.jTable_SuatChieu = jTable_SuatChieu;
    }

    public JTable getjTable_Ve() {
        return jTable_Ve;
    }

    public void setjTable_Ve(JTable jTable_Ve) {
        this.jTable_Ve = jTable_Ve;
    }

    public JButton getjButton_SuaBaoCao() {
        return jButton_SuaBaoCao;
    }

    public void setjButton_SuaBaoCao(JButton jButton_SuaBaoCao) {
        this.jButton_SuaBaoCao = jButton_SuaBaoCao;
    }

    public JButton getjButton_XoaBaoCao() {
        return jButton_XoaBaoCao;
    }

    public void setjButton_XoaBaoCao(JButton jButton_XoaBaoCao) {
        this.jButton_XoaBaoCao = jButton_XoaBaoCao;
    }

    public JTextField getjTextField_TuKhoaBaoCao() {
        return jTextField_TuKhoaBaoCao;
    }

    public void setjTextField_TuKhoaBaoCao(JTextField jTextField_TuKhoaBaoCao) {
        this.jTextField_TuKhoaBaoCao = jTextField_TuKhoaBaoCao;
    }

    public JTextField getjTextField_TuKhoaGhe() {
        return jTextField_TuKhoaGhe;
    }

    public void setjTextField_TuKhoaGhe(JTextField jTextField_TuKhoaGhe) {
        this.jTextField_TuKhoaGhe = jTextField_TuKhoaGhe;
    }

    public JTextField getjTextField_TuKhoaPhim() {
        return jTextField_TuKhoaPhim;
    }

    public void setjTextField_TuKhoaPhim(JTextField jTextField_TuKhoaPhim) {
        this.jTextField_TuKhoaPhim = jTextField_TuKhoaPhim;
    }

    public JTextField getjTextField_TuKhoaPhongChieu() {
        return jTextField_TuKhoaPhongChieu;
    }

    public void setjTextField_TuKhoaPhongChieu(JTextField jTextField_TuKhoaPhongChieu) {
        this.jTextField_TuKhoaPhongChieu = jTextField_TuKhoaPhongChieu;
    }

    public JTextField getjTextField_TuKhoaSuatChieu() {
        return jTextField_TuKhoaSuatChieu;
    }

    public void setjTextField_TuKhoaSuatChieu(JTextField jTextField_TuKhoaSuatChieu) {
        this.jTextField_TuKhoaSuatChieu = jTextField_TuKhoaSuatChieu;
    }

    public JTextField getjTextField_TuKhoaVe() {
        return jTextField_TuKhoaVe;
    }

    public void setjTextField_TuKhoaVe(JTextField jTextField_TuKhoaVe) {
        this.jTextField_TuKhoaVe = jTextField_TuKhoaVe;
    }

    public PhimModel getPhim(int selected) {
        String maPhim = this.jTable_Phim.getValueAt(selected, 0).toString();
        String tenPhim = this.jTable_Phim.getValueAt(selected, 1).toString();
        String theLoai = this.jTable_Phim.getValueAt(selected, 2).toString();
        int thoiLuong = Integer.parseInt(this.jTable_Phim.getValueAt(selected, 3).toString());
        int doTuoi = Integer.parseInt(this.jTable_Phim.getValueAt(selected, 4).toString());
        int gia = Integer.parseInt(this.jTable_Phim.getValueAt(selected, 5).toString());
        return new PhimModel(maPhim, tenPhim, theLoai, thoiLuong, doTuoi, gia);
    }

    public SuatChieuModel getSuatChieu(int selected) {
        String maSuatChieu = this.jTable_SuatChieu.getValueAt(selected, 0).toString();
        String maPhim = this.jTable_SuatChieu.getValueAt(selected, 1).toString();
        String tenPhim = this.jTable_SuatChieu.getValueAt(selected, 2).toString();
        String khungGio = this.jTable_SuatChieu.getValueAt(selected, 3).toString();
        return new SuatChieuModel(maSuatChieu, khungGio, tenPhim, maPhim);
    }

    public PhongChieuModel getPhongChieu(int selected) {
        String maPhongChieu = this.jTable_PhongChieu.getValueAt(selected, 0).toString();
        String tenPhongChieu = this.jTable_PhongChieu.getValueAt(selected, 1).toString();
        int sucChua = Integer.parseInt(this.jTable_PhongChieu.getValueAt(selected, 2).toString());
        int soLuongGheTrong = Integer.parseInt(this.jTable_PhongChieu.getValueAt(selected, 3).toString());
        return new PhongChieuModel(maPhongChieu, tenPhongChieu, sucChua, soLuongGheTrong);
    }

    public GheModel getGhe(int selected) {
        String maGhe = this.jTable_Ghe.getValueAt(selected, 0).toString();
        int hangGhe = Integer.parseInt(this.jTable_Ghe.getValueAt(selected, 1).toString());
        int soGhe = Integer.parseInt(this.jTable_Ghe.getValueAt(selected, 2).toString());
        boolean trangThaiGhe = "1".equals(this.jTable_Ghe.getValueAt(selected, 3).toString()) || "true".equals(this.jTable_Ghe.getValueAt(selected, 3).toString());
        String maPhong = this.jTable_Ghe.getValueAt(selected, 4).toString();
        int giaGhe = Integer.parseInt(this.jTable_Ghe.getValueAt(selected, 4).toString());
        return new GheModel(maGhe, maPhong, giaGhe, soGhe, hangGhe, trangThaiGhe);
    }

    public VeModel getVe(int selected) {
        String maVe = this.jTable_Ve.getValueAt(selected, 0).toString();
        String maPhim = this.jTable_Ve.getValueAt(selected, 1).toString();
        String maSuatChieu = this.jTable_Ve.getValueAt(selected, 2).toString();
        String maGhe = this.jTable_Ve.getValueAt(selected, 3).toString();
        return new VeModel(maVe, maGhe, maSuatChieu, maPhim);
    }

    public BaoCaoModel getBaoCao(int selected) {
        String maBaocao = this.jTable_BaoCao.getValueAt(selected, 0).toString();
        String tenBaocao = this.jTable_BaoCao.getValueAt(selected, 1).toString();
        String link = this.jTable_BaoCao.getValueAt(selected, 2).toString();
        return new BaoCaoModel(maBaocao, tenBaocao, link);
    }
}
