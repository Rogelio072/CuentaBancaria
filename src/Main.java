public class Main {

    public static void main(String[] args) {

        // Dos cuentas
        CuentaBancaria cuenta1 = new CuentaBancaria("Ana Lopez", "001-123", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Carlos Ruiz", "002-456", 500);

        // Saldos iniciales
        System.out.println("Saldo inicial de " + cuenta1.getTitular() + ": $" + cuenta1.consultarSaldo());
        System.out.println("Saldo inicial de " + cuenta2.getTitular() + ": $" + cuenta2.consultarSaldo());
        System.out.println("--------------------------  ---");

        // Depósitos
        cuenta1.depositar(200);
        cuenta2.depositar(100);
        System.out.println("-----------------------------");

        // Retiros
        System.out.println("Intentando retirar $300 de la cuenta de Ana");
        if (cuenta1.retirar(300)) {
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("No se pudo retirar (saldo insuficiente)");
        }

        System.out.println("Intentando retirar $800 de la cuenta de Carlos");
        if (cuenta2.retirar(800)) {
            System.out.println("Retiro exitoso");
        } else {
            System.out.println("No se pudo retirar (saldo insuficiente)");
        }

        System.out.println("-----------------------------");

        // Usamos un ciclo for para hacer varias transacciones
        System.out.println("Simulando varias transacciones en la cuenta de Ana:");
        for (int i = 1; i <= 3; i++) {
            cuenta1.depositar(50);
            System.out.println("Transaccion " + i + " - Saldo actual: $" + cuenta1.consultarSaldo());
        }

        System.out.println("-----------------------------");

        // Mostramos los saldos finales
        System.out.println("Saldo final de " + cuenta1.getTitular() + ": $" + cuenta1.consultarSaldo());
        System.out.println("Saldo final de " + cuenta2.getTitular() + ": $" + cuenta2.consultarSaldo());
    }
}