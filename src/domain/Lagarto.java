package domain;

public class Lagarto extends Algoritmo {
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL -> System.out.println("Ganhou - Lagarto come Papel.");
            case TESOURA -> System.out.println("Perdeu - Tesoura decapita Lagarto.");
            case LAGARTO -> System.out.println("Empatou - Lagarto empata com Lagarto.");
            case PEDRA -> System.out.println("Perdeu - Pedra esmaga Lagarto.");
            case SPOCK -> System.out.println("Ganhou - Lagarto envenena Spock.");
            default -> System.out.println("Opção inválida");
        }
    }
}
