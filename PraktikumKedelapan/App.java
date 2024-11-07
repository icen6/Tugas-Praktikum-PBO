class StaticTest {
    
    //non-static methode 
    int multiply(int a, int b) {
        return a + b; 
    }

    //static methode 
    static int add(int a, int b) {
        return a + b;
    }
}

public class App {
    public static void main(String[] args) {
        
        StaticTest st = new StaticTest(); 

        System.err.println(" 2 * 2 = " + st.multiply(2, 2));

        System.out.println(" 2 + 3 = " + StaticTest.add(2, 3));
    }
}
