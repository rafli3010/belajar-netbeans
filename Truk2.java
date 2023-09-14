public class Truk2 {
    private double muatan;
    private double muatanmaks;
    
    public Truk2(double beratmaks) {
        muatanmaks = beratmaks;
    }
    
    public double getMuatan() {
        return muatan;
    }
    
    public double getMuatanMaks() {
        return muatanmaks;
    }
    
    public void tambahMuatan(double berat) {
        if (muatan + berat <= muatanmaks) {
            muatan += berat;
            System.out.println("Muatan ditambahkan: " + berat);
        } else {
            System.out.println("Muatan melebihi batas maksimal!");
        }
    }
    
    public static void main(String args[]) {
        Truk2 truk = new Truk2(1000);
        System.out.println("Muatan maksimal: " + truk.getMuatanMaks());
        
        truk.tambahMuatan(500.0);
        truk.tambahMuatan(350.0);
        truk.tambahMuatan(100.0);
        truk.tambahMuatan(150.0);
        
        System.out.println("Muatan sekarang = " + truk.getMuatan());
    }
}
