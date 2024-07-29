import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        selecaoCandidatos();        
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while( candidatosSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                candidatosSelecionado++;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
            }
            candidatoAtual++;
        }
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }            
        else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra propuesta.");
        }
        else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }

    }
}
