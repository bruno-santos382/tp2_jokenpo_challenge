package domain;

public class Spock extends Algoritmo {
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL -> System.out.println("Perdeu - Papel refuta Spock.");
            case TESOURA -> System.out.println("Ganhou - Spock destrói Tesoura.");
            case LAGARTO -> System.out.println("Perdeu - Lagarto envenena Spock.");
            case PEDRA -> System.out.println("Ganhou - Spock vaporiza Pedra.");
            case SPOCK -> System.out.println("Empatou - Spock empata com Spock.");
            default -> System.out.println("Opção inválida");
        }
    }
}
