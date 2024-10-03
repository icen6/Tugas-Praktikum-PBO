class Mobil extends Kendaraan {
    
    public Mobil(String merk) {
        super(merk); 
    }

    //Implementasi dari metode abstrak suaraMesin() 
    @Override 
    public void suaraMesin() {
        System.out.println("Mobil dengan merk " + getMerk() + " memiliki suara mesin 'vroom vroom"); 
    }
}
