package usuario;

import apple.Iphone;
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class UsuarioSymon {

    public static void main(String[] args) {
        
        Iphone iphoneSymon = new Iphone();

        ReprodutorMusical reprodutorMusical = iphoneSymon;
        NavegadorInternet navegadorInternet = iphoneSymon;
        AparelhoTelefonico aparelhoTelefonico = iphoneSymon;

        System.out.println("--------------------------Reprodutor de Música--------------------------");

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

        System.out.println("--------------------------Navegando na Internet--------------------------");

        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        System.out.println("--------------------------Aparelho Telefonico--------------------------");

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

    }

}
