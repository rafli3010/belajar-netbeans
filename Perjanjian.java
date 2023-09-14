import java.util.Scanner;

public class Perjanjian {
    private String nim;
    private String nama;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void janji() {
        System.out.println("\"Berjanji akan mengerjakan soal UTS ini dengan sungguh-sungguh dan maksimal dengan usaha sendiri, TIDAK melihat pekerjaan orang lain, serta mematuhi peraturan selama ujian. Jika saya tidak menepati janji ini, saya yang menanggung risikonya\"");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Perjanjian perjanjian = new Perjanjian();

        System.out.print("NIM   : ");
        String nim = scanner.nextLine();
        perjanjian.setNim(nim);

        System.out.print("Nama  : ");
        String nama = scanner.nextLine();
        perjanjian.setNama(nama);

        System.out.println();
        perjanjian.janji();
    }
}
