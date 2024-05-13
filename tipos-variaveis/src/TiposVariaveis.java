public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String meuNome = "Yenny Odalis";

        int salarioMinimo = 2500;

        double outroSalario = 2.5;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;        
        System.out.println("primeiro: " + numero);

        numero = 10;
        System.out.println("segundo: " + numero);

        final double VALOR_DO_PI = 3.14;
    }
}
