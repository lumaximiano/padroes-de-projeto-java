package br.com.maximiano.tarefa_padroes_de_projeto_1;

public class FabricaCarroPopular implements FabricaDeCarros {
    @Override
    public Motor criarMotor() {
        return new MotorPopular();
    }

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaPopular();
    }
}