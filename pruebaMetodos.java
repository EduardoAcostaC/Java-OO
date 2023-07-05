public class pruebaMetodos {
    public static void main(String[] args) {
        cuenta miCuenta = new cuenta();
        miCuenta.saldo = 300;
        miCuenta.depositar(200);
        System.out.println(miCuenta.saldo);
        
        miCuenta.retirar(100);
        System.out.println(miCuenta.saldo);


        cuenta cuentaExterna = new cuenta();
        cuentaExterna.depositar(1000);
        boolean puedeTransferir =  cuentaExterna.transferir(400, miCuenta);
        if(puedeTransferir){
            System.out.println("Transferencia exitosa");
        }


        System.out.println(cuentaExterna.saldo);
        System.out.println(miCuenta.saldo);
    }
}
