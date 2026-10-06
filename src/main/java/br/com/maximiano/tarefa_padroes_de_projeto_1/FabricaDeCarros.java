package br.com.maximiano.tarefa_padroes_de_projeto_1;

public interface FabricaDeCarros {
    Motor criarMotor();
    Carroceria criarCarroceria();
}