package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite ingresar y retirar dinero, además de consultar el saldo.
 */
public class Ccuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;

    /** Número de cuenta bancaria */
    private String cuenta;

    /** Saldo actual en la cuenta */
    private double saldo;

    /** Tipo de interés aplicado a la cuenta */
    private double tipoInteres;

    /**
     * Constructor por defecto.
     */
    public Ccuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
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
     * @return Saldo disponible en la cuenta.
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
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre Nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta bancaria.
     *
     * @return Número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta bancaria.
     *
     * @param cuenta Número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     *
     * @return Tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés aplicado a la cuenta.
     *
     * @param tipoInteres Nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
