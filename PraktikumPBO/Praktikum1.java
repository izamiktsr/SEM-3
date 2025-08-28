public class Praktikum1 {
    // Fungsi (method) untuk mobil
    static void nyalakanMesin(String namaMobil) {
        System.out.println("Mesin " + namaMobil + " dinyalakan.");
    }

    static void matikanMesin(String namaMobil) {
        System.out.println("Mesin " + namaMobil + " dimatikan.");
    }

    public static void main(String[] args) {
        // 3 atribut: merk, warna, kecepatan
        String merk1 = "Toyota"; String warna1 = "Hitam"; int kecepatan1 = 120;
        String merk2 = "Honda";  String warna2 = "Putih"; int kecepatan2 = 100;
        String merk3 = "Suzuki"; String warna3 = "Merah"; int kecepatan3 = 110;
        String merk4 = "Mitsubishi"; String warna4 = "Abu"; int kecepatan4 = 90;
        String merk5 = "Ford"; String warna5 = "Biru"; int kecepatan5 = 130;
        String merk6 = "BMW"; String warna6 = "Hitam"; int kecepatan6 = 150;
        String merk7 = "Mercedes"; String warna7 = "Silver"; int kecepatan7 = 160;
        String merk8 = "Hyundai"; String warna8 = "Hijau"; int kecepatan8 = 95;
        String merk9 = "Kia"; String warna9 = "Coklat"; int kecepatan9 = 105;
        String merk10 = "Nissan"; String warna10 = "Putih"; int kecepatan10 = 115;

        // Pemanggilan fungsi
        nyalakanMesin(merk1);
        matikanMesin(merk2);
    }
}
