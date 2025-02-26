package domain;

public class Pedra extends Algoritmo {
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
            case PAPEL -> System.out.println("Perdeu - Papel cobre Pedra.");
            case TESOURA -> System.out.println("Ganhou - Tesoura é quebrada por Pedra.");
            case LAGARTO -> System.out.println("Ganhou - Lagarto é esmagado por Pedra.");
            case PEDRA -> System.out.println("Empatou - Pedra empata com Pedra.");
            case SPOCK -> System.out.println("Perdeu - Pedra é destruída por Spock.");
            default -> System.out.println("Opção inválida");
        }
    }
}
