// DemoTelevisi.java
public class DemoTelevisi {
    public static void main(String[] args) {
        // Objek pertama
        Televisi tv1 = new Televisi();
        tv1.merk = "Samsung";
        tv1.ukuranLayar = 43;
        tv1.resolusi = "4K";
        tv1.jenisLayar = "LED";

        // Objek kedua
        Televisi tv2 = new Televisi();
        tv2.merk = "LG";
        tv2.ukuranLayar = 55;
        tv2.resolusi = "Full HD";
        tv2.jenisLayar = "OLED";

        // Tampilkan info & jalankan method
        tv1.displayInfo();
        tv1.hidupkan();
        tv1.gantiChannel(7);
        tv1.matikan();

        System.out.println("----------------------");

        tv2.displayInfo();
        tv2.hidupkan();
        tv2.gantiChannel(15);
        tv2.matikan();
    }
}
