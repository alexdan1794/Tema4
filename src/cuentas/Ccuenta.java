package cuentas;

/**
 * Permite ingresar y retirar dinero, además de consultar el saldo.
 */
public class Ccuenta {

    private String nombre;

    private String cuenta;

    private double saldo;

    private double tipoInteres;

    /**
     * Constructor por defecto.
     */
    public Ccuenta() {
    }

    /**
     * Parámetros para inicializar la cuenta.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta bancaria.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés aplicado.
     */
    public Ccuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa dinero en la cuenta.
     *
     * @param cantidad Monto a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira dinero de la cuenta.
     *
     * @param cantidad Monto a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o si el saldo es insuficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    // Getters y Setters

    /**
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return
     */
    public String getCuenta() {
        return cuenta;
    }

    /**

     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
