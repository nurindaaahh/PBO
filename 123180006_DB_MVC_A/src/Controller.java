import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller  {

    public Controller(Model model,TampilCreate tcreate , TampilRead tread, TampilUpdate tupdate, TampilDelete tdelete){

        tread.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tcreate.setVisible(true);
                tread.setVisible(false);
            }
        });

        tread.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tdelete.setVisible(true);
                tread.setVisible(false);
            }
        });

        tcreate.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tcreate.getnama();
                String no_hp = tcreate.getno_hp();
                String umur = tcreate.getumur();
                String email = tcreate.getemail();

                model.inputKontak(nama, no_hp, umur, email);
                String contact[][] = model.HasilData();
                tread.tabel.setModel(new JTable(contact, tread.namaKolom).getModel());
                tread.setVisible(true);
                tcreate.setVisible(false);
                tcreate.tfnama.setText(null);
                tcreate.tfno_hp.setText(null);
                tcreate.tfumur.setText(null);
                tcreate.tfemail.setText(null);
            }
        });

        tcreate.btnLihat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contact[][] = model.HasilData();
                tread.tabel.setModel(new JTable(contact, tread.namaKolom).getModel());
                tread.setVisible(true);
                tcreate.setVisible(false);
                tcreate.tfnama.setText(null);
                tcreate.tfno_hp.setText(null);
                tcreate.tfumur.setText(null);
                tcreate.tfemail.setText(null);
            }
        });

        tread.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = tread.tabel.getSelectedRow();
                int col = tread.tabel.getSelectedColumn();

                String pilih = tread.tabel.getValueAt(row, 0). toString();
                System.out.println(pilih);

                int updateData = JOptionPane.showConfirmDialog(null, "Update Data " + pilih + " ?", "Pilihan", JOptionPane.YES_NO_OPTION);
                if (updateData == 0) {
                    tupdate.lnamabaru.setText(pilih);
                    tread.setVisible(false);
                    tupdate.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Update Data");
                }
            }
        });

        tupdate.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tupdate.lnamabaru.getText();
                String no_hp = tupdate.tfno_hp.getText();
                String umur = tupdate.tfumur.getText();
                String email = tupdate.tfemail.getText();
                model.updateData(nama, no_hp, umur, email);
                String contact[][] = model.HasilData();
                tread.tabel.setModel(new JTable(contact, tread.namaKolom).getModel());
                tupdate.setVisible(false);
                tread.setVisible(true);
                tupdate.tfno_hp.setText(null);
                tupdate.tfumur.setText(null);
                tupdate.tfemail.setText(null);
            }
        });

        tupdate.btnBatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tupdate.setVisible(false);
                tread.setVisible(true);
                tupdate.tfno_hp.setText(null);
                tupdate.tfumur.setText(null);
                tupdate.tfemail.setText(null);
            }
        });

        tdelete.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = tdelete.getName();

                model.hapusData(nama);
                String contact[][] = model.HasilData();
                tread.tabel.setModel(new JTable(contact, tread.namaKolom).getModel());
                tread.setVisible(true);
                tdelete.setVisible(false);
                tdelete.tfnama.setText(null);
            }
        });

        tdelete.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tdelete.setVisible(false);
                tread.setVisible(true);
                tdelete.tfnama.setText(null);
            }
        });

    }

}
