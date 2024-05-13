public class Operadores {

    public static void main(String[] args) {
        // Concatenação de Texto
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto); // LINGUAGEMJAVA

        // Concatenação numero e textos
        String concatenacao = "?"; // ?

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1"; // 31

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1; 

        System.out.println(concatenacao); // 1111

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao); // 1111

        concatenacao = "1" + (1 + 1 + 1); 

        System.out.println(concatenacao); // 13

        // Operador de Soma
        int numero = 5; 

        System.out.println(numero); // 5

        numero = - numero; 

        System.out.println(numero); // -5

        numero = + numero;

        System.out.println(numero); // -5

        numero = numero * -1;

        System.out.println(numero); // 5

        // Incrementação de um valor para repetição
        int numeroRepeticao = 5;

        System.out.println(numeroRepeticao); // 5

        numeroRepeticao = numeroRepeticao + 1;

        System.out.println(numeroRepeticao); // 6

        numeroRepeticao--;

        System.out.println(numeroRepeticao); // 5

        numeroRepeticao++;

        System.out.println(numeroRepeticao); // 6

        System.out.println("Regra importante");

        System.out.println(numeroRepeticao -- ); // 6

        System.out.println(numeroRepeticao); // 5

        System.out.println(++ numeroRepeticao); // 6

        // Operador de Condição (IF/ELSE)
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        // metodo cumprido - antigo
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado); // falso

        // metodo ótimizado - Operador de Condição Ternário
        String result = a == b ? "verdadeiro" : "falso"; // Boolean tipo String

        System.out.println(result); // falso

        int resposta = a == b ? 1 : 0 ; // Boolean tipo Integer

        System.out.println(resposta); // 0


        // Operadores Relacionais - Integer

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("a nossa condição é verdadeira: " + simNao); // 0
        }

        System.out.println("numero1 é igual numero2: " + simNao); // 0

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente numero2: " + simNao); // 0

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior numero2: " + simNao); // 0

        simNao = numero1 < numero2;

        System.out.println("numero1 é menor numero2: " + simNao); // 0

        // Operadores Relacionais - String

        String nomeUm = "Yenny";
        String nomeDois = "Yenny";
        String nomeTres = new String("Yenny");

        System.out.println("nomeUm é igual nomeDois " + (nomeUm == nomeDois)); // True
        System.out.println("nomeDois é igual nomeTres " + (nomeUm == nomeTres)); // Falso

        // Metodo correto para comparação de String
        System.out.println("nomeUm é igual nomeDois " + nomeUm.equals(nomeDois)); // True
        System.out.println("nomeDois é igual nomeTres " + nomeDois.equals(nomeTres)); // True

        
        // Operadores Lógicos

        Boolean condicao1 = true;
        Boolean condicao2 = true;
        Boolean condicao3 = false;

        // AND
        if (condicao1 && condicao2){
            System.out.println("as duas condição são verdadeiras "); // True
        }

        // OR
        if (condicao1 || condicao3){
            System.out.println("Uma das condições é verdadeiras "); // True
        } 

        // AND
        if (condicao1 && ( 7 > 4 )){
            System.out.println("as duas condição são verdadeiras "); // True
        }





    }

}
