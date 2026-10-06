package br.com.maximiano.tarefa_padroes_de_projeto_1;

public class Carro {
    private final Motor motor;
    private final Carroceria carroceria;

    public Carro(FabricaDeCarros fabrica) {
        this.motor = fabrica.criarMotor();
        this.carroceria = fabrica.criarCarroceria();
    }

    public void exibirDetalhes() {
        System.out.println(motor.getDescricao());
        System.out.println(carroceria.getDescricao());
    }
}