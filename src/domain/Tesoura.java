package domain;

public class Tesoura extends Algoritmo {
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL -> System.out.println("Ganhou - Tesoura corta Papel.");
            case TESOURA -> System.out.println("Empatou - Tesoura empata com Tesoura.");
            case LAGARTO -> System.out.println("Ganhou - Tesoura decapita Lagarto.");
            case PEDRA -> System.out.println("Perdeu - Pedra é mais forte que Tesoura.");
            case SPOCK -> System.out.println("Perdeu - Spock destrói Tesoura.");
            default -> System.out.println("Opção inválida");
        }
    }
}
