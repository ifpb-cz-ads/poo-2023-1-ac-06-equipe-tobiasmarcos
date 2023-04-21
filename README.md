<h1>B&M Atividade 1 </h1>
<br>
Lampada<br>
Atributos:<br>
-voltagemLampada<br>
-vidaUtil<br>
-onOff<br>
<br>
Métodos:<br>
-acenderLampada()<br>
-apagarLampada()<br>

<br>
<h1>B&M Atividade 2</h1>
<br>
Time de Futebol<br>
Atributos:<br>
-vitorias<br>
-derrotas<br>
-posicao<br>
Métodos:<br>
-subirTime()<br>
-rebaixarTime()<br>

<h1>B&M Atividade 3</h1>
void mostraDados() { <br>
        System.out.println("O nome do correntista é: " + nomeDoCorrentista);<br>
        System.out.println("O saldo é:" + saldo);<br>
        if (contaÉEspecial){<br>
        System.out.println("A conta é especial");<br>
        if (saldo < 0) {<br>
        System.out.println("Atenção: saldo negativo!");<br>
        }<br>
        } else {<br>
        System.out.println("A conta é comum");<br>
        }<br>
        }<br>


<h1>B&M Atividade 7</h1> <br>
A falta do modificador de acesso na declaração dos campos da classe. Por padrão, caso não seja especificado, o modificador de acesso é o "default", que significa que o campo só pode ser acessado por outras classes que pertençam ao mesmo pacote. Portanto, é recomendável sempre especificar o modificador de acesso de cada campo, como por exemplo private ou public. <br>

<h1>B&M Atividade 8</h1><br>
Na linha 10, o método maior está declarado com retorno do tipo int, mas dentro do método está retornando um valor do tipo boolean (true ou false). O correto seria declarar o método com retorno do tipo boolean.<br>
Na linha 11, o método maior está comparando num1 e num2, mas esses campos não foram inicializados, portanto, seus valores são desconhecidos. É necessário atribuir valores a eles antes de realizar a comparação.<br>
Na linha 16, o método menor está declarado com retorno do tipo void, mas dentro do método está tentando retornar um valor do tipo int (num1 ou num2). O correto seria declarar o método com retorno do tipo int e incluir um comando return no final do método para retornar o resultado.<br>
Na linha 20, o método menor está retornando o valor de num2 quando num1 é menor que num2. O correto seria retornar o valor de num1.<br>

<h1>B&M Atividade 9</h1><br>
Falta a palavra-chave "public" antes da palavra-chave "class" na linha 1. A assinatura correta de uma classe em Java é "public class NomeDaClasse".<br>
Falta a palavra-chave "static" antes da palavra-chave "void" na declaração do método "main" na linha 3. O método "main" é um método estático, ou seja, ele pode ser chamado sem que haja uma instância da classe TesteImpressao. A declaração correta do método main é "public static void main(String[] args)".<br>
