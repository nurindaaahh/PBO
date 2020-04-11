import java.awt.*;


import static java.awt.Color.*;
import static java.awt.SystemColor.window;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;


public class ViewPraktikum extends JFrame {

    JLabel lNim = new JLabel("Nim : ");
    JTextField tfnim = new JTextField();
    JLabel lNamaMhs = new JLabel ("Nama Mahasiswa : ");
    JTextField tfNamaMhs = new JTextField();
    JLabel lAlamatMhs = new JLabel ("Alamat Mahasiswa : ");
    JTextField tfAlamatMhs = new JTextField();

    JButton btnTambahPanel = new JButton("Tambah");
    JButton btnBatalPanel = new JButton("Batal");
    JButton btnEditPanel = new JButton("Edit");
    JButton btnHapusPanel = new JButton("Hapus");
    JLabel lInput = new JLabel ("INPUT DATA MAHASISWA") ;
    JLabel lHasil = new JLabel("DATA MAHASISWA");

    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"NIM","Nama","Alamat"}; //membuat kolom dalam array

    public ViewPraktikum(){

        tableModel = new DefaultTableModel(namaKolom,0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        tabel.setBackground(Color.BLACK);
        tabel.setForeground(Color.WHITE);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(600, 500);
        getContentPane().setBackground(Color.YELLOW);

        //TABEL
        add(scrollPane);
        scrollPane.setBounds(20, 180, 480, 155);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(lNim);
        lNim.setBounds(5, 30, 155, 20);
        add(tfnim);
        tfnim.setBounds(140, 30, 120, 20);
        add(lNamaMhs);
        lNamaMhs.setBounds(5, 55, 150, 20);
        add(tfNamaMhs);
        tfNamaMhs.setBounds(140, 55, 120, 20);
        add(lAlamatMhs);
        lAlamatMhs.setBounds(5,80,155,20);
        add(tfAlamatMhs);
        tfAlamatMhs.setBounds(140, 80, 120, 20);

        add(lInput);
        lInput.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lInput.setBounds(5, 5, 700, 20);
        add(lHasil);
        lHasil.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lHasil.setBounds(210, 150, 720, 25);

        add(btnTambahPanel);
        btnTambahPanel.setBounds(20, 115, 90, 20);
        btnTambahPanel.setBackground(BLUE);
        add(btnBatalPanel);
        btnBatalPanel.setBounds(130, 115, 90, 20);
        add(btnEditPanel);
        btnEditPanel.setBounds(20, 350, 90, 20);
        btnEditPanel.setBackground(GREEN);
        add(btnHapusPanel);
        btnHapusPanel.setBounds(125, 350, 90, 20);
        btnHapusPanel.setBackground(red);

    }
    public String getNim(){
        return tfnim.getText();
    }

    public String getNamaMhs(){
        return tfNamaMhs.getText();
    }

    public String getAlamatMhs(){
        return tfAlamatMhs.getText();
    }
}

