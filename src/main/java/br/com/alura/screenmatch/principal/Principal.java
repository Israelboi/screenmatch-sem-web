package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumoApi;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private final String ENDERECO = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=d13fb7fb";

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        var consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
    }
}
