public class testReferencia2 {
    public static void main(String[] args) {
        cliente Diego = new cliente();
        Diego.nombre = "Diego";
        Diego.documento = "45485466630";
        Diego.telefono = "5514259862";

        cuenta cuentaDiego = new cuenta();
        cuentaDiego.titular = Diego;

        System.out.println(cuentaDiego.titular.documento);

    }
}
