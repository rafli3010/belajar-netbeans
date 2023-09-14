public class Truk {
    private double muatan;
    private double muatanMaks;

    public Truk(double beratMaks) {
        muatan = 0;
        muatanMaks = beratMaks;
    }

    public double getMuatan() {
        return muatan;
    }

    public double getMuatanMaks() {
        return muatanMaks;
    }

    public boolean tambahMuatan(double berat) {
        double totalMuatan = muatan + berat;
        if (totalMuatan <= muatanMaks) {
            muatan = totalMuatan;
            return true;
        }
        return false;
    }

    public void setMuatan(double berat) {
        muatan = berat;
    }

    public double newtsToKilo(double berat) {
        return berat / 9.8;
    }

    public double kiloToNewts(double berat) {
        return berat * 9.8;
    }

    public static void main(String[] args) {
        Truk truk = new Truk(900);
        boolean status;

        System.out.println("Muatan maksimal: " + truk.getMuatanMaks());

        status = truk.tambahMuatan(500.0);
        System.out.print("Tambah muatan: 500");
        if (status)
            System.out.println(" ok");
        else
            System.out.println(" gagal");

        status = truk.tambahMuatan(300.0);
        System.out.print("Tambah muatan: 300");
        if (status)
            System.out.println(" ok");
        else
            System.out.println(" gagal");

        status = truk.tambahMuatan(150.0);
        System.out.print("Tambah muatan: 150");
        if (status)
            System.out.println(" ok");
        else
            System.out.println(" gagal");

        status = truk.tambahMuatan(50.0);
        System.out.print("Tambah muatan: 50");
        if (status)
            System.out.println(" ok");
        else
            System.out.println(" gagal");

        truk.setMuatan(849.9999999999999);
        System.out.println("Muatan sekarang = " + truk.getMuatan());
    }
}
