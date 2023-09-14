import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BiodataForm extends JFrame implements ActionListener {
    private JLabel labelNIM, labelNama, labelProdi, labelAlamat, labelHobby;
    private JTextField textFieldNIM, textFieldNama, textFieldProdi, textFieldAlamat, textFieldHobby;
    private JButton buttonSimpan, buttonUbah, buttonHapus, buttonKeluar;

    public BiodataForm() {
        setTitle("Form Biodata");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        labelNIM = new JLabel("NIM");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(labelNIM, constraints);

        textFieldNIM = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(textFieldNIM, constraints);

        labelNama = new JLabel("Nama");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(labelNama, constraints);

        textFieldNama = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(textFieldNama, constraints);

        labelProdi = new JLabel("Prodi");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(labelProdi, constraints);

        textFieldProdi = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(textFieldProdi, constraints);

        labelAlamat = new JLabel("Alamat");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(labelAlamat, constraints);

        textFieldAlamat = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(textFieldAlamat, constraints);

        labelHobby = new JLabel("Hobby");
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(labelHobby, constraints);

        textFieldHobby = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 4;
        panel.add(textFieldHobby, constraints);

        buttonSimpan = new JButton("Simpan");
        constraints.gridx = 0;
        constraints.gridy = 5;
        panel.add(buttonSimpan, constraints);

        buttonUbah = new JButton("Ubah");
        constraints.gridx = 1;
        constraints.gridy = 5;
        panel.add(buttonUbah, constraints);

        buttonHapus = new JButton("Hapus");
        constraints.gridx = 0;
        constraints.gridy = 6;
        panel.add(buttonHapus, constraints);

        buttonKeluar = new JButton("Keluar");
        constraints.gridx = 1;
        constraints.gridy = 6;
        panel.add(buttonKeluar, constraints);

        buttonSimpan.addActionListener(this);
        buttonUbah.addActionListener(this);
        buttonHapus.addActionListener(this);
        buttonKeluar.addActionListener(this);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonSimpan) {
            String nim = textFieldNIM.getText();
            String nama = textFieldNama.getText();
            String prodi = textFieldProdi.getText();
            String alamat = textFieldAlamat.getText();
            String hobby = textFieldHobby.getText();

            // Proses simpan data biodata
            System.out.println("NIM: " + nim);
            System.out.println("Nama: " + nama);
            System.out.println("Prodi: " + prodi);
            System.out.println("Alamat: " + alamat);
            System.out.println("Hobby: " + hobby);
        } else if (e.getSource() == buttonUbah) {
            // Proses ubah data biodata
            System.out.println("Tombol Ubah ditekan");
        } else if (e.getSource() == buttonHapus) {
            // Proses hapus data biodata
            System.out.println("Tombol Hapus ditekan");
        } else if (e.getSource() == buttonKeluar) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BiodataForm();
            }
        });
    }
}
