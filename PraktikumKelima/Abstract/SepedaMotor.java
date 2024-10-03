class SepedaMotor extends Kendaraan {
    
    public SepedaMotor(String merk) {
        super(merk);  
    }

    //Implementasi dari metode abstrak suaraMesin() 
    @Override
    public void suaraMesin() {
        System.out.println("Sepeda motor dengan merk " + getMerk() + " memiliki suara mesin 'brom brom'");
    }
}
