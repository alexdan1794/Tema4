package cuentas;

public class Main {
    public static void main(String[] args) {

        Ccuenta cuenta1 = new Ccuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        operativa_cuenta(cuenta1, 2300);  //
        operativa_cuenta(cuenta1, 695);   //
    }

    public static void operativa_cuenta(Ccuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(cantidad);
            System.out.println("Se ha retirado: " + cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            cuenta1.ingresar(cantidad);
            System.out.println("Se ha ingresado: " + cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}