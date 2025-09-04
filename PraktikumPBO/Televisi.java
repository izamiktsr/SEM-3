// Televisi.java
public class Televisi {
    String merk;
    int ukuranLayar;
    String resolusi;
    String jenisLayar;

    void hidupkan() {
        System.out.println("Televisi " + merk + " dinyalakan.");
    }

    void matikan() {
        System.out.println("Televisi " + merk + " dimatikan.");
    }

    void gantiChannel(int channel) {
        System.out.println("Berpindah ke channel " + channel);
    }

    void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Ukuran Layar: " + ukuranLayar + " inch");
        System.out.println("Resolusi: " + resolusi);
        System.out.println("Jenis Layar: " + jenisLayar);
    }
}
