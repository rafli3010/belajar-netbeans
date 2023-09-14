import java.util.Scanner;

public class BentukGeometri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bentuk geometri:");
        System.out.println("1. Segiempat");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan panjang: ");
            double panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = scanner.nextDouble();

            Segiempat segiempat = new Segiempat(panjang, lebar);
            System.out.println("Luas segiempat: " + segiempat.hitungLuas());
            System.out.println("Keliling segiempat: " + segiempat.hitungKeliling());
        } else if (pilihan == 2) {
            System.out.print("Masukkan alas: ");
            double alas = scanner.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = scanner.nextDouble();
            System.out.print("Masukkan sisi1: ");
            double sisi1 = scanner.nextDouble();
            System.out.print("Masukkan sisi2: ");
            double sisi2 = scanner.nextDouble();
            System.out.print("Masukkan sisi3: ");
            double sisi3 = scanner.nextDouble();

            Segitiga segitiga = new Segitiga(alas, tinggi, sisi1, sisi2, sisi3);
            System.out.println("Luas segitiga: " + segitiga.hitungLuas());
            System.out.println("Keliling segitiga: " + segitiga.hitungKeliling());
        } else if (pilihan == 3) {
            System.out.print("Masukkan radius: ");
            double radius = scanner.nextDouble();

            Lingkaran lingkaran = new Lingkaran(radius);
            System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
            System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}

class Segiempat extends BentukGeometri {
    private double panjang;
    private double lebar;

    public Segiempat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Segitiga extends BentukGeometri {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

class Lingkaran extends BentukGeometri {
    private double radius;
    private final double PI = 3.14159;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return PI * radius * radius;
    }

    public double hitungKeliling() {
        return 2 * PI * radius;
    }
}
