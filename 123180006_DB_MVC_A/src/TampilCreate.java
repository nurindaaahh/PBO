
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class TampilCreate extends JFrame {

    JLabel ljudul,lnama,lno_hp,lumur,lemail;
    JTextField tfnama,tfno_hp,tfumur,tfemail;
    JButton btnTambah,btnLihat;

    public TampilCreate() {
        setTitle("INPUT DATA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(227, 141, 185));
        setForeground(new java.awt.Color(178, 227, 147));
        setLayout(null);
        setVisible(true);
        setSize(450,400);
        setLocationRelativeTo(null);

        ljudul = new JLabel("Tambah Contact");
        ljudul.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lnama = new JLabel("Nama");
        lno_hp = new JLabel("No HP");
        lumur = new JLabel("Umur");
        lemail = new JLabel("Email");

        tfnama = new JTextField();
        tfno_hp = new JTextField();
        tfumur = new JTextField();
        tfemail = new JTextField();
        btnTambah = new JButton("Tambah");
        btnLihat = new JButton("Lihat Contact");

        add(ljudul);
        add(lnama);
        add(lno_hp);
        add(lumur);
        add(lemail);
        add(tfnama);
        add(tfno_hp);
        add(tfumur);
        add(tfemail);
        add(btnTambah);
        add(btnLihat);

        ljudul.setBounds(110, 15, 330, 20);
        lnama.setBounds(55, 65, 50, 20);
        lno_hp.setBounds(55, 105, 50, 20);
        lumur.setBounds(55, 145, 50, 20);
        lemail.setBounds(55, 185, 50, 20);
        tfnama.setBounds(130,65,190,20);
        tfno_hp.setBounds(130, 105, 190, 20);
        tfumur.setBounds(130, 145, 190, 20);
        tfemail.setBounds(130, 185, 190, 20);
        btnTambah.setBounds(85, 230, 80, 20);
        btnLihat.setBounds(85, 260, 125, 20);

        setSize(400, 400);
    }

    public String getnama () {
        return tfnama.getText();
    }
    public String getno_hp () {
        return tfno_hp.getText();
    }
    public String getumur () {
        return tfumur.getText();
    }
    public String getemail () {
        return tfemail.getText();
    }

}
