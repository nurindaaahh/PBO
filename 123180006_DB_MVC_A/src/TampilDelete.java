import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

public class TampilDelete extends JFrame {

    JLabel ljudul = new JLabel("Hapus Contact");
    JLabel lnama = new JLabel("Input Nama Kontak yang ingin dihapus");
    JTextField tfnama = new JTextField();
    JButton btnHapus = new JButton("Delete");
    JButton btnBatal = new JButton("Cancel");

    public TampilDelete() {
        setTitle("HAPUS DATA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(227, 66, 66));
        setForeground(new java.awt.Color(166, 227, 221));

        ljudul.setFont(new Font("Times New Roman", Font.BOLD, 25));

        setLayout(null);
        add(ljudul);
        add(lnama);
        add(tfnama);
        add(btnHapus);
        add(btnBatal);

        ljudul.setBounds(110, 15, 330, 20);
        lnama.setBounds(55, 65, 300, 20);
        tfnama.setBounds(80,140,120,20);
        btnHapus.setBounds(85, 200, 80, 20);
        btnBatal.setBounds(185, 200, 100, 20);

        setSize(450, 400);
    }
            public String getnama () {
                return tfnama.getText();
    }
}