import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class TampilUpdate extends JFrame {
    JLabel ljudul = new JLabel("Edit Data Kontak");
    JLabel lnama = new JLabel("Nama");
    JLabel lno_hp = new JLabel("No HP");
    JLabel lumur = new JLabel("Umur");
    JLabel lemail = new JLabel("Email");
    JLabel lnamabaru = new JLabel();
    JTextField tfno_hp = new JTextField();
    JTextField tfumur = new JTextField();
    JTextField tfemail = new JTextField();
    JButton btnUpdate = new JButton("Edit");
    JButton btnBatal = new JButton("Hapus");

    public TampilUpdate() {
        setTitle("UPDATE DATA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(227, 66, 66));
        setForeground(new java.awt.Color(166, 227, 221));

        ljudul.setFont(new Font("Times New Roman", Font.BOLD, 25));

        setLayout(null);
        add(ljudul);
        add(lnama);
        add(lno_hp);
        add(lumur);
        add(lemail);
        add(lnamabaru);
        add(tfno_hp);
        add(tfumur);
        add(tfemail);
        add(btnUpdate);
        add(btnBatal);

        ljudul.setBounds(130, 80, 40, 35);
        lnama.setBounds(75, 50, 30, 20);
        lnamabaru.setBounds(75, 50, 30, 20);
        lno_hp.setBounds(75, 75, 50, 20);
        lumur.setBounds(75, 125, 50, 20);
        lemail.setBounds(75, 150, 50, 20);
        tfno_hp.setBounds(150, 75, 150, 20);
        tfumur.setBounds(150, 125, 150, 100);
        tfemail.setBounds(150, 125, 150, 100);
        btnUpdate.setBounds(85, 200, 80, 20);
        btnBatal.setBounds(185, 200, 100, 20);

        setSize(450, 400);
    }
}