import Hierarchical.*;
import Multilevel.*;
import Single.*;
import StaticPolymorphism.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        //implementasi single inherintance
        Mobil m1 = new Mobil("Hino"); 
        Sedan s1 = new Sedan("Vios"); 

        m1.klakson();
        s1.klakson();

        //implementasi multilevel inheritance 
        Binatang kambing = new Binatang("Kambing");
        Kucing mudreg = new Kucing("Mudreg"); 
        Cemeng mocha = new Cemeng("Mocha"); 

        kambing.bersuara();
        mudreg.bersuara();
        mocha.bersuara();

        //implementasi hierarchical
        Karyawan wahyu = new Karyawan("Wahyu"); 
        Dosen amir = new Dosen("Amir"); 
        Staff melan = new Staff("Melan"); 

        wahyu.kerja();
        amir.kerja();
        melan.kerja();

        MobilSport jaguar = new MobilSport("Jaguar"); 

        jaguar.gigi(1);
        jaguar.gigi(2);
        jaguar.gigi(3);
        jaguar.gigi(4);
        jaguar.gigi(5);
        jaguar.gigi(1, 1);
        jaguar.gigi(2, 1);
        jaguar.gigi(3, 1);
        jaguar.gigi(4, 1);
        jaguar.gigi(5, 1);
        jaguar.gigi(5, 2);
        jaguar.gigi(5, 3);
        jaguar.gigi(5, 4);
        jaguar.gigi(5, 5);
    }
}