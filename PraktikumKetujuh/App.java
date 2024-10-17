class Luar {
    private String outerVariable = "Variabel luar";

    class Dalam {
        String innerVariable = "Variabel dalam";

        public void bicara() {
            System.out.println(innerVariable);
            System.out.println(outerVariable);
        }
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Luar objLuar = new Luar();
        Luar.Dalam objDalam = objLuar.new Dalam();

        objDalam.bicara();
    }
}