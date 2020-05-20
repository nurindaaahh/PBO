import javax.swing.*;
import java.awt.*;

public class ViewHome extends JFrame {

    JPanel panel = new JPanel();

    JLabel lTitle = new JLabel("PERPUSTAKAAN");

    JButton bHome = new JButton("Home");
    JButton bPinjam = new JButton("Pinjam");
    JButton bTampil = new JButton("Tampil");
    JButton bAbout = new JButton("About Us");
    JButton bLogout = new JButton("Logout");

    public ViewHome(){
        setDefaultCloseOperation(3);
        setLocation(350, 100);
        setResizable(false);
        setVisible(false);
        setLayout(null);
        setSize(600, 500);
        setTitle("PERPUSTAKAAN");

        panel.setBounds(0,0,600,500);
        panel.setBorder(BorderFactory.createLineBorder(Color.white));
        panel.setVisible(true);
        panel.setLayout(null);
        add(panel);

        lTitle.setBounds(250,100,100,20);
        lTitle.setVisible(true);
        bHome.setBounds(100,300,100,40);
        bPinjam.setBounds(200,300,100,40);
        bTampil.setBounds(300,300,100,40);
        bAbout.setBounds(400,300,100,40);
        bLogout.setBounds(450, 20, 100, 40);
       
        bHome.setVisible(true);
        bPinjam.setVisible(true);
        bTampil.setVisible(true);
        bAbout.setVisible(true);

        panel.add(lTitle);
        
        panel.add(bHome);
        panel.add(bPinjam);
        panel.add(bTampil);
        panel.add(bAbout);
        panel.add(bLogout);
    }
}