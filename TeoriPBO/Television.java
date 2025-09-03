public class Television {
    // Atribut
    private String merk;
    private double ukuranLayar;
    private String resolusi;
    private String jenisLayar;

    // Constructor
    public Television(String merk, double ukuranLayar, String resolusi, String jenisLayar) {
        this.merk = merk;
        this.ukuranLayar = ukuranLayar;
        this.resolusi = resolusi;
        this.jenisLayar = jenisLayar;
    }

    // Method
    public void hidupkan() {
        System.out.println("Televisi " + merk + " dinyalakan.");
    }

    public void matikan() {
        System.out.println("Televisi " + merk + " dimatikan.");
    }

    public void gantiChannel(int channel) {
        System.out.println("Channel diganti ke " + channel + ".");
    }
}
