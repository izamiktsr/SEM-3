// DemoPersegi.java
public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 10;
        pp.lebar = 5;

        pp.displayInfo();
        System.out.println("Luas: " + pp.getLuas());
        System.out.println("Keliling: " + pp.getKeliling());
    }
}
