public class Main {
    public static void main(String[] args) {
        Bentuk b = new Bentuk("Biru");
        System.out.println("===== BENTUK =====");
        b.printInfo();
        System.out.println();

        BujurSangkar bj = new BujurSangkar(6, "Kuning");
        System.out.println("===== BUJUR SANGKAR =====");
        bj.printInfo();
        System.out.println();

        Lingkaran L = new Lingkaran(6, "Abu");
        System.out.println("===== Lingkaran =====");
        L.printInfo();
        System.out.println();

        Silinder S = new Silinder( 7,4, "Merah");
        System.out.println("===== SILINDER =====");
        S.printInfo();
        System.out.println();
    }
}
