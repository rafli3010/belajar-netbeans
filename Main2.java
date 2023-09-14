import java.util.Scanner;

interface Bentuk {
    double hitungLuas();
    double hitungKeliling();
}

class Segiempat implements Bentuk {
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

class Segitiga implements Bentuk {
    private double alas;
    private double tinggi;
    
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    
    public double hitungKeliling() {
        // Anggap segitiga siku-siku
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}

class Lingkaran implements Bentuk {
    private double radius;
    
    public Lingkaran(double radius) {
        this.radius = radius;
    }
    
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }
    
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih bentuk:");
        System.out.println("1. Segiempat");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang segiempat: ");
                double panjangSegiempat = scanner.nextDouble();
                System.out.print("Masukkan lebar segiempat: ");
                double lebarSegiempat = scanner.nextDouble();
                
                Bentuk segiempat = new Segiempat(panjangSegiempat, lebarSegiempat);
                System.out.println("Segiempat:");
                System.out.println("Luas: " + segiempat.hitungLuas());
                System.out.println("Keliling: " + segiempat.hitungKeliling());
                break;
                
            case 2:
                System.out.print("Masukkan alas segitiga: ");
                double alasSegitiga = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggiSegitiga = scanner.nextDouble();
                
                Bentuk segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
                System.out.println("Segitiga:");
                System.out.println("Luas: " + segitiga.hitungLuas());
                System.out.println("Keliling: " + segitiga.hitungKeliling());
                break;
                
            case 3:
                System.out.print("Masukkan radius lingkaran: ");
                double radiusLingkaran = scanner.nextDouble();
                
                Bentuk lingkaran = new Lingkaran(radiusLingkaran);
                System.out.println("Lingkaran:");
                System.out.println("Luas: " + lingkaran.hitungLuas());
                System.out.println("Keliling: " + lingkaran.hitungKeliling());
                break;
                
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        
        scanner.close();
    }
}
