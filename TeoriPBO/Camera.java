public class Camera {
    // Atribut
    private String merk;
    private double resolusi;
    private String jenisLensa;
    private int kapasitasMemori;

    // Constructor
    public Camera(String merk, double resolusi, String jenisLensa, int kapasitasMemori) {
        this.merk = merk;
        this.resolusi = resolusi;
        this.jenisLensa = jenisLensa;
        this.kapasitasMemori = kapasitasMemori;
    }

    // Method
    public void ambilFoto() {
        System.out.println("Foto diambil dengan kamera " + merk + " beresolusi " + resolusi + " MP.");
    }

    public void rekamVideo() {
        System.out.println("Rekaman video dimulai dengan kamera " + merk + ".");
    }

    public void tampilkanGambar() {
        System.out.println("Menampilkan gambar dari kamera " + merk + ".");
    }
}
