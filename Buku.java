public class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul) {
        this.judul = judul;
    }

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public static void main(String[] args) {
        Buku buku1 = new Buku("Java Programming");
        Buku buku2 = new Buku("Data Structures and Algorithms", "John Smith");

        System.out.println("Buku 1:");
        System.out.println("Judul: " + buku1.getJudul());
        System.out.println("Penulis: " + buku1.getPenulis());

        System.out.println("\nBuku 2:");
        System.out.println("Judul: " + buku2.getJudul());
        System.out.println("Penulis: " + buku2.getPenulis());
    }
}
