
/**
 * Escreva uma descrição da classe AppRegistraAluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppRegistraAluno
{
    public static void main(String args[]){
        
        
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();
        
        ana.setNome("Ana Machado");
        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");
        
        System.out.println(ana.getNome());
        
        System.out.println("Contador: "+RegistraAluno.getQuantidadeAlunos());
    }
}
