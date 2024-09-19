package  prak02;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ican", 19, "Depok"); 
        person1.displayInfo();

    // Ubah nilai atribut menggunakan setter 
    person1.setName("Zidan"); 
    person1.setAge(19); 

    // Tampilkan kembali informasi 
    System.out.println("Updated Information: "); 
    person1.displayInfo(); 
    } 
}
