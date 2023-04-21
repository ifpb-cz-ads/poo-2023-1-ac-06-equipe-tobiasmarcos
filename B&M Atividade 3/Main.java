 public class Main {
        public static void main(String[] args) {
            ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada();
            conta1.abreContaSimples("João");
            conta1.deposita(1000.00f);
            conta1.mostraDados();

            ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada();
            conta2.abreContaSimples("Maria");
            conta2.deposita(100.00f);
            conta2.retira(700.00f);
            conta2.mostraDados();
        }
    }
