import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PembelianBarangForm extends JFrame implements ActionListener {
    private JLabel labelNamaBarang, labelHargaBarang, labelJumlahBarang, labelTotalPembelian;
    private JTextField fieldNamaBarang, fieldHargaBarang, fieldJumlahBarang, fieldTotalPembelian;
    private JButton buttonTampilkan, buttonMessage;

    public PembelianBarangForm() {
        setTitle("Form Pembelian Barang");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        labelNamaBarang = new JLabel("Nama Barang");
        labelHargaBarang = new JLabel("Harga Barang");
        labelJumlahBarang = new JLabel("Jumlah Barang");
        labelTotalPembelian = new JLabel("Total Pembelian");

        fieldNamaBarang = new JTextField();
        fieldHargaBarang = new JTextField();
        fieldJumlahBarang = new JTextField();
        fieldTotalPembelian = new JTextField();
        fieldTotalPembelian.setEditable(false);

        buttonTampilkan = new JButton("Tampilkan");
        buttonMessage = new JButton("Message");

        buttonTampilkan.addActionListener(this);
        buttonMessage.addActionListener(this);

        setLayout(new GridLayout(5, 2));

        add(labelNamaBarang);
        add(fieldNamaBarang);
        add(labelHargaBarang);
        add(fieldHargaBarang);
        add(labelJumlahBarang);
        add(fieldJumlahBarang);
        add(labelTotalPembelian);
        add(fieldTotalPembelian);
        add(buttonTampilkan);
        add(buttonMessage);
    }

    public static void main(String[] args) {
        PembelianBarangForm form = new PembelianBarangForm();
        form.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonTampilkan) {
            // Mengambil data dari inputan
            String namaBarang = fieldNamaBarang.getText();
            int hargaBarang = Integer.parseInt(fieldHargaBarang.getText());
            int jumlahBarang = Integer.parseInt(fieldJumlahBarang.getText());

            // Menghitung total pembelian
            int totalPembelian = hargaBarang * jumlahBarang;

            // Menampilkan hasil perhitungan pada field Total Pembelian
            fieldTotalPembelian.setText(String.valueOf(totalPembelian));
        } else if (e.getSource() == buttonMessage) {
            // Menampilkan message dialog dengan hasil pembelian
            String message = "Nama Barang: " + fieldNamaBarang.getText() + "\n" +
                    "Harga Barang: " + fieldHargaBarang.getText() + "\n" +
                    "Jumlah Barang: " + fieldJumlahBarang.getText() + "\n" +
                    "Total Pembelian: " + fieldTotalPembelian.getText();
            JOptionPane.showMessageDialog(this, message, "Detail Pembelian", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
