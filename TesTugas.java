public class TesTugas {
    private int saldo;
    private int proteksi;

    public TesTugas(int saldo, int proteksi) {
        this.saldo = saldo;
        this.proteksi = proteksi;
    }

    public boolean ambilUang(int jumlah) {
        if (jumlah <= saldo - proteksi) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        TesTugas tabungan = new TesTugas(5000, 1000);

        System.out.println("Uang yang ditabung: 5000");
        System.out.println("Uang yang diproteksi: 1000");
        System.out.println();

        System.out.println("Uang yang akan diambil: 4500 -> " + tabungan.ambilUang(4500));
        System.out.println("Saldo sekarang: " + tabungan.getSaldo());
        System.out.println();

        System.out.println("Uang yang akan diambil: 2500 -> " + tabungan.ambilUang(2500));
        System.out.println("Saldo sekarang: " + tabungan.getSaldo());
    }
}
