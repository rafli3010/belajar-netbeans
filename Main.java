abstract class Bentuk {
    abstract double hitungLuas();
    abstract double hitungKeliling();
}

class Segiempat extends Bentuk {
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

class Segitiga extends Bentuk {
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

class Lingkaran extends Bentuk {
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

public class Main {
    public static void main(String[] args) {
        Bentuk segiempat = new Segiempat(4, 5);
        Bentuk segitiga = new Segitiga(3, 4);
        Bentuk lingkaran = new Lingkaran(7);
        
        System.out.println("Segiempat:");
        System.out.println("Luas: " + segiempat.hitungLuas());
        System.out.println("Keliling: " + segiempat.hitungKeliling());
        
        System.out.println("Segitiga:");
        System.out.println("Luas: " + segitiga.hitungLuas());
        System.out.println("Keliling: " + segitiga.hitungKeliling());
        
        System.out.println("Lingkaran:");
        System.out.println("Luas: " + lingkaran.hitungLuas());
        System.out.println("Keliling: " + lingkaran.hitungKeliling());
    }
}
