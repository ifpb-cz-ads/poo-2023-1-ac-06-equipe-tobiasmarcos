public class ContaBancariaSimplificada {
    public String nomeDoCorrentista;
    public double saldo;
    public boolean contaEEspecial;

    public void abreContaSimples(String nome, double valorInicial) {
        if (valorInicial >= 100.00) {
            nomeDoCorrentista = nome;
            saldo = valorInicial;
            contaEEspecial = false;
        } else {
            System.out.println("Valor mínimo para abertura de conta é de R$ 100,00");
        }
    }


    public void  deposita(float valor) {
        saldo = saldo + valor;
    }

    public boolean retira(float valor) {
        if (!contaEEspecial) {
            if (valor <= saldo) {
                saldo = saldo - valor;
                return true;
            } else {
                return false;
            }
        } else {
            saldo = saldo - valor;
            return true;
        }
    }

    public void mostraDados() {
        System.out.println("O nome do correntista é: " + nomeDoCorrentista);
        System.out.println("O saldo é:" + saldo);
        if (contaEEspecial) {
            System.out.println("A conta é especial");
            if (saldo < 0) {
                System.out.println("Atenção: saldo negativo!");
            }
        } else {
            System.out.println("A conta é comum");
        }
    }

}
