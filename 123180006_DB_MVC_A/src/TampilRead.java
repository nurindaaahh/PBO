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

public class TampilRead extends JFrame {
    JLabel ljudul = new JLabel("Daftar Contact");
    JButton btnAdd = new JButton("Tambah");
    JButton btnHapus = new JButton("Hapus Data");

    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Nama","No hp","Umur","Email"};

    public TampilRead() {
        setTitle("DATA CONTACT");
        tabelModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);
        tabel.setBackground(Color.BLACK);
        tabel.setForeground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(500, 500);
        getContentPane().setBackground(Color.YELLOW);

        ljudul.setFont(new Font("Times New Roman", Font.BOLD, 25));

        add(scrollPane);
        add(ljudul);
        add(btnAdd);
        add(btnHapus);

        scrollPane.setBounds(20, 80, 380, 155);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ljudul.setBounds(110, 15, 330, 20);
        btnAdd.setBounds(85, 300, 100, 20);
        btnHapus.setBounds(185, 300, 100, 20);

        setSize(600, 600);
    }
}