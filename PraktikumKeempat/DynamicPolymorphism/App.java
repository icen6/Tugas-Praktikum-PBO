package DynamicPolymorphism;

public class App {
    public static void main(String[] args) throws Exception {
        BangunDatar bangunDatar = new BangunDatar();
        Persegi p = new Persegi(3);
        Segitiga s = new Segitiga(4, 4);
        Lingkaran el = new Lingkaran(7);
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.print("\n");
        System.out.println("Luas persegi: " + p.luas());
        System.out.println("keliling persegi: " + p.keliling());
        System.out.print("\n");
        System.out.println("Luas segitiga: " + s.luas());
        System.out.print("\n");
        System.out.println("Luas lingkaran: " + el.luas());
        System.out.println("keliling lingkaran: " + el.keliling());
    }
}