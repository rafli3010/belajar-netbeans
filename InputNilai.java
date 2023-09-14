import java.util.Scanner;

class Jurusan {
    private String nama;

    public Jurusan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Mahasiswa {
    private String nim;
    private String nama;
    private Jurusan jurusan;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Mahasiswa(String nim, String nama, Jurusan jurusan, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public double getNilaiAkhir() {
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    public String getGradeNilai() {
        double nilaiAkhir = getNilaiAkhir();
        if (nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 60) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}

public class InputNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Layar Masukan");
            System.out.print("NIM           : ");
            String nim = scanner.nextLine();
            System.out.print("Nama          : ");
            String nama = scanner.nextLine();

            System.out.println("Pilih Jurusan : ");
            System.out.println("1. Teknik Informatika");
            System.out.println("2. Sistem Informasi");
            System.out.println("3. Teknologi Informasi");
            System.out.print("Pilihan       : ");
            int pilihanJurusan = scanner.nextInt();
            scanner.nextLine(); // Membaca karakter newline

            Jurusan jurusan;
            switch (pilihanJurusan) {
                case 1:
                    jurusan = new Jurusan("Teknik Informatika");
                    break;
                case 2:
                    jurusan = new Jurusan("Sistem Informasi");
                    break;
                case 3:
                    jurusan = new Jurusan("Teknologi Informasi");
                    break;
                default:
                    jurusan = new Jurusan("Jurusan Tidak Valid");
                    break;
            }

            System.out.print("Nilai Tugas   : ");
            double nilaiTugas = scanner.nextDouble();
            System.out.print("Nilai UTS     : ");
            double nilaiUTS = scanner.nextDouble();
            System.out.print("Nilai UAS     : ");
            double nilaiUAS = scanner.nextDouble();
            scanner.nextLine(); // Membaca karakter newline

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, jurusan, nilaiTugas, nilaiUTS, nilaiUAS);

            System.out.println("\nLayar Keluaran");
            System.out.println("NIM           : " + mahasiswa.getNim());
            System.out.println("Nama          : " + mahasiswa.getNama());
            System.out.println("Jurusan       : " + mahasiswa.getJurusan().getNama());
            System.out.println("Nilai Akhir   : " + mahasiswa.getNilaiAkhir());
            System.out.println("Grade Nilai   : " + mahasiswa.getGradeNilai());

            System.out.print("\nApakah Anda ingin memasukkan data lagi (Y/N) ? ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("Y"));

        System.out.println("Program selesai.");
    }
}
