class Mobil {
    private String merek;
    private int kecepatan;

    // Constructor
    public Mobil(String merek, int kecepatan) {
        this.merek = merek;
        this.kecepatan = kecepatan;
    }

    // Getter & Setter untuk merek
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Getter & Setter untuk kecepatan
    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Method tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}
