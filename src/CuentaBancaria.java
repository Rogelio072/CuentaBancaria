public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Método para depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("Se depositaron $" + monto);
        } else {
            System.out.println("El monto debe ser positivo");
        }
    }

    // Método para retirar
    public boolean retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
            return true;
        } else {
            return false;
        }
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Métodos para obtener el nombre y el número de cuenta
    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}