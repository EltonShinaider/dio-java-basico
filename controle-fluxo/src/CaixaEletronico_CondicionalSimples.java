public class CaixaEletronico_CondicionalSimples {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("O saldo atual é de: " + saldo);
        }
    }
}
