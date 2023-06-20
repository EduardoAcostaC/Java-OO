public class testReferencia {
    public static void main(String[] args) {
        cuenta primeraCuenta = new cuenta();
        primeraCuenta.saldo = 200;

        cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = 100;

        System.out.println("Saldo primera Cuenta"+ primeraCuenta.saldo);
        System.out.println("Saldo segunda Cuenta"+ segundaCuenta.saldo);

        segundaCuenta.saldo += 400;
        System.out.println("Saldo primera Cuenta" + primeraCuenta.saldo);

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        
    }
}
