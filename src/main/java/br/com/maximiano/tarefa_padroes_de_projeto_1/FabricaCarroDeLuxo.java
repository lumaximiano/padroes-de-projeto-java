package br.com.maximiano.tarefa_padroes_de_projeto_1;

public class FabricaCarroDeLuxo implements FabricaDeCarros {
    @Override
    public Motor criarMotor() {
        return new MotorLuxo();
    }

    @Override
    public Carroceria criarCarroceria() {
        return new CarroceriaLuxo();
    }
}