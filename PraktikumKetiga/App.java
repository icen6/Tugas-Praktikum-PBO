public class App {
    public static void main(String[] args) throws Exception {
        
        Karyawan Ridho = new Karyawan("12345", "Ridho");

        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Ridho.absenPulang();

        Karyawan Melan = new Karyawan("123456", "Melan");

        Melan.getInfo();
        Melan.absenPagi();
        Melan.kerja();
        Melan.absenPulang();

        Dosen Andiani = new Dosen("23455", "332211", "Andiani");

        Andiani.getInfo();
        Andiani.absenPagi();
        Andiani.ngajar();
        Andiani.absenPulang();

        Dosen Ionia = new Dosen("23456", "332212", "Ionia");

        Ionia.getInfo();
        Ionia.absenPagi();
        Ionia.kerja();
        Ionia.absenPulang();
    }
}