public class Tabungan2 {
    private int saldo;

    public Tabungan2(int initsaldo) {
        saldo = initsaldo;
    }

    public void ambilUang(int jumlah) {
        saldo -= jumlah;
    }

    public int getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Tabungan2 tabungan = new Tabungan2(5000);
        System.out.println("Saldo awal: " + tabungan.getSaldo());
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil: 2300");
        System.out.println("Saldo sekarang: " + tabungan.getSaldo());
    }
}
