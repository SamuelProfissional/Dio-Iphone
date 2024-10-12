package dioiphone;

import equipamentos.ReprodutorDeMusica.ReprodutorMusical;
import equipamentos.NavegadorDeInternet.NavegadorDeInternet;
import equipamentos.AparelhoTelefonico.AparelhoTelefônico;


public class Iphone implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefônico {


    
    @Override
    public void tocar() {
        System.out.println("tocando musica no Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("musica pausada no Iphone");

    }

    @Override
    public String selecionarMusica(String musica) {
        System.out.println("selecionando musica : " + musica + " no Iphone");
        return musica;
    }

    @Override
    public String exibirPagina(String url) {
        System.out.println("Abrindo pagina " + url + " no Iphone");
        return url;

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Iphone");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina no Iphone");
    }

    @Override
    public String ligar(String numero) {
        System.out.println("Ligando para o numero " + numero + " no Iphone");
        return numero;
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciar o correio de Voz no Iphone");
    }

}
