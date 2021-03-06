import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class LihatDataMahasiswa extends JFrame {
    String[] [] data = new String[500][3];
    String [] kolom = {"Nim", "Nama", "Alamat"};
    JTable table;
    JScrollPane scrollPane;
    String DBurl = "jdbc:mysql://localhost/praktikumku";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    ResultSet resultSet;

    public LihatDataMahasiswa(){
        setTitle("Data Mahasiswa");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBusername, DBpassword);
            statement = koneksi.createStatement();
            String sql = "select * from mahasiswa";
            resultSet = statement.executeQuery(sql);
            int p = 0;
            while (resultSet.next()) {
                data[p][0] = resultSet.getString("nim");
                data[p][1] = resultSet.getString("nama");
                data[p][2] = resultSet.getString("alamat");
                p++;
            }
            statement.close();
            koneksi.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!", "Hasil", JOptionPane.ERROR_MESSAGE);
        }
        table = new JTable(data, kolom);
        scrollPane = new JScrollPane(table);

        setLayout(new FlowLayout());
        add(scrollPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }

    public static  void  main(String[] args){
        new LihatDataMahasiswa();
    }
}