package practica;
 /*
  * 
  */
public class main {
	

    public static void main(String[] args) {

        CCuenta cuentaUno;

        double saldoActual;


        cuentaUno = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

        saldoActual = cuentaUno.estado();

        System.out.println("El saldo actual es"+ saldoActual );


        operacuenta(cuentaUno, 10);

    }

	private static void operacuenta(CCuenta cuentaUno, float cantidad) {
		try {

            cuentaUno.retirar(2300);

        } catch (Exception e) {

            System.out.print("Fallo al retirar");

        }

        try {

            System.out.println("Ingreso en cuenta");

            cuentaUno.ingresar(695);

        } catch (Exception e) {

            System.out.print("Fallo al ingresar");

        }
	}

}



