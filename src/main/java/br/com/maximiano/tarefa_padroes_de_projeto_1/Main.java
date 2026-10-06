package br.com.maximiano.tarefa_padroes_de_projeto_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Carro Popular ===");
        FabricaDeCarros fabricaPopular = new FabricaCarroPopular();
        Carro carroPopular = new Carro(fabricaPopular);
        carroPopular.exibirDetalhes();

        System.out.println("\n=== Carro de Luxo ===");
        FabricaDeCarros fabricaLuxo = new FabricaCarroDeLuxo();
        Carro carroLuxo = new Carro(fabricaLuxo);
        carroLuxo.exibirDetalhes();
    }
}