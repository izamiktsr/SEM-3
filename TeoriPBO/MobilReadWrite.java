class Mobil {
    private String merek;
    private int kecepatan;

    // Constructor
    public Mobil(String merek) {
        this.merek = merek;
    }

    // Getter untuk merek (read-only)
    public String getMerek() {
        return merek;
    }

    // Setter untuk kecepatan (write-only)
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Method tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}
