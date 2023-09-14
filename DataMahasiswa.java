import javax.swing.*;

public class DataMahasiswa extends JFrame {

    private JLabel labelNIM, labelNama, labelJurusan, labelHobi, labelKota, labelStatus, labelNilai;
    private JTextField textFieldNIM, textFieldNama;
    private JRadioButton radioLaki, radioPerempuan;
    private JCheckBox checkboxMembaca, checkboxMenulis, checkboxMenggambar;
    private JList<String> listKota;
    private JComboBox<String> comboBoxJurusan;
    private JTextArea textAreaAlamat;
    private JButton buttonSimpan, buttonReset;

    public DataMahasiswa() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Data Mahasiswa");
        setSize(400, 500);
        setLayout(null);

        labelNIM = new JLabel("NIM:");
        labelNIM.setBounds(10, 10, 80, 20);

        textFieldNIM = new JTextField();
        textFieldNIM.setBounds(100, 10, 200, 20);

        labelNama = new JLabel("Nama:");
        labelNama.setBounds(10, 40, 80, 20);

        textFieldNama = new JTextField();
        textFieldNama.setBounds(100, 40, 200, 20);

        labelJurusan = new JLabel("Jurusan:");
        labelJurusan.setBounds(10, 70, 80, 20);

        String[] jurusanOptions = {"Informatika", "Sistem Informasi", "Teknik Elektro"};
        comboBoxJurusan = new JComboBox<>(jurusanOptions);
        comboBoxJurusan.setBounds(100, 70, 200, 20);

        labelHobi = new JLabel("Hobi:");
        labelHobi.setBounds(10, 100, 80, 20);

        checkboxMembaca = new JCheckBox("Membaca");
        checkboxMembaca.setBounds(100, 100, 80, 20);

        checkboxMenulis = new JCheckBox("Menulis");
        checkboxMenulis.setBounds(180, 100, 80, 20);

        checkboxMenggambar = new JCheckBox("Menggambar");
        checkboxMenggambar.setBounds(260, 100, 100, 20);

        labelKota = new JLabel("Kota:");
        labelKota.setBounds(10, 130, 80, 20);

        String[] kotaOptions = {"Jakarta", "Surabaya", "Bandung", "Yogyakarta"};
        listKota = new JList<>(kotaOptions);
        listKota.setBounds(100, 130, 200, 80);

        labelStatus = new JLabel("Status:");
        labelStatus.setBounds(10, 220, 80, 20);

        radioLaki = new JRadioButton("Laki-Laki");
        radioLaki.setBounds(100, 220, 80, 20);

        radioPerempuan = new JRadioButton("Perempuan");
        radioPerempuan.setBounds(180, 220, 100, 20);

        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(radioLaki);
        statusGroup.add(radioPerempuan);

        labelNilai = new JLabel("Nilai:");
        labelNilai.setBounds(10, 250, 80, 20);

        textAreaAlamat = new JTextArea();
        textAreaAlamat.setBounds(100, 250, 200, 80);

        buttonSimpan = new JButton("Simpan");
        buttonSimpan.setBounds(100, 350, 80, 30);

        buttonReset = new JButton("Reset");
        buttonReset.setBounds(190, 350, 80, 30);

        add(labelNIM);
        add(textFieldNIM);
        add(labelNama);
        add(textFieldNama);
        add(labelJurusan);
        add(comboBoxJurusan);
        add(labelHobi);
        add(checkboxMembaca);
        add(checkboxMenulis);
        add(checkboxMenggambar);
        add(labelKota);
        add(listKota);
        add(labelStatus);
        add(radioLaki);
        add(radioPerempuan);
        add(labelNilai);
        add(textAreaAlamat);
        add(buttonSimpan);
        add(buttonReset);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new DataMahasiswa().setVisible(true);
        });
    }
}
