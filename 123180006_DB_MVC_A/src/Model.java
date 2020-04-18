import java.sql.*;
import javax.swing.JOptionPane;

public class Model {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String dbUrl = "jdbc:mysql://localhost/dbcontact";
    static final String user = "root";
    static final String pass = "";

    Connection koneksi;
    Statement statement;

    public Model() {
        try {
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection)DriverManager.getConnection(dbUrl, user, pass);
            System.out.println("Koneksi Berhasil!");
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal!");
        }
    }

    public void inputKontak(String nama, String no_hp, String umur, String email) {
        try {
            String query = "INSERT INTO `contact` (`nama`,`no_hp`,`umur`,`email`) VALUES ( '" +nama+ "' , '" +no_hp+ "' , '" +umur+ "' , '" +email+ "')";
            statement = (Statement)koneksi.createStatement();
            statement.executeUpdate(query);
            System.out.println("Kontak Berhasil Ditambahkan!");
            JOptionPane.showMessageDialog(null, "Kontak Berhasil Ditambahkan!");
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String[][] HasilData() {
        int contact = 0;
        try {
            String data[][] = new String [ getJumlah() ][4];
            String query = "SELECT * FROM contact";
            ResultSet rS = statement.executeQuery(query);
            while(rS.next()) {
                data[contact][0] = rS.getString("Nama");
                data[contact][1] = rS.getString("NoHP");
                data[contact][2] = rS.getString("Umur");
                data[contact][3] = rS.getString("Email");
                contact = contact + 1;
            }
            return data;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Database Error!");
            return null;
        }
    }

    public int getJumlah() {
        int contact = 0;
        try {
            statement = (Statement)koneksi.createStatement();
            String query = "SELECT * FROM contact";
            ResultSet rS = statement.executeQuery(query);
            while(rS.next()) {
                contact = contact + 1;
            }
            return contact;
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Database Error!");
            return 0;
        }
    }

    public void updateData (String nama, String no_hp, String umur, String email) {
        try {
            String query = "UPDATE contact SET no_hp = '" +no_hp+ "', umur = '" +umur+ "', email = '" +email+ "' WHERE nama = '" +nama+ "' ";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Kontak Berhasil Diubah!");
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void hapusData (String nama) {
        try{
            String query = "DELETE FROM `contact` WHERE `nama` = '"+nama+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Kontak Berhasil Dihapus!");

        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }

}
