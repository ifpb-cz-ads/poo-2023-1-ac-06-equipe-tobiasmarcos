
/**
 * Escreva uma descrição da classe TesteIgualdade3 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TesteIgualdade3
{
   
    public static void main(String args []){
        String frase1;
        String frase2;
        frase1 = new String("Testando igualdade!");
        frase2 = new String("Testando igualdade!");
        System.out.println("Frase 1: "+frase1);
        System.out.println("Frase 2: "+frase2);
        System.out.println("Frase 1 e Frase 2 possuem o mesmo conteúdo R: "+(frase1.equals(frase2)));
    }
}
