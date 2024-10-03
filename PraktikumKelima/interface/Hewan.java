abstract class Hewan {
    private String nama; 

    public Hewan(String nama) {
        this.nama = nama; 
    }

    public String getNama() {
        return nama; 
    }

    //metode abstrak yang akan diimplementasikan oleh subclass
    public abstract void bergerak();
}
