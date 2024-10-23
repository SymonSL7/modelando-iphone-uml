package apple;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void tocar() {
        System.out.println("Iphone, tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone, pausando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Iphone, selecionando música."); 
    }

    @Override
    public void exibirPagina() {
        System.out.println("Iphone, exibindo página de navegação.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iphone, adicionando nova aba de navegação.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Iphone, atualizando página de navegação.");
    }

    @Override
    public void ligar() {
        System.out.println("Iphone, fazendo chamada.");
    }

    @Override
    public void atender() {
        System.out.println("Iphone, atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone, iniciando o Correio de Voz.");
    }

}
