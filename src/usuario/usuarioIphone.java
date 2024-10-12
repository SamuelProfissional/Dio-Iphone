package usuario;

import dioiphone.Iphone;
import equipamentos.AparelhoTelefonico.AparelhoTelefônico;
import equipamentos.NavegadorDeInternet.NavegadorDeInternet;
import equipamentos.ReprodutorDeMusica.ReprodutorMusical;

public class usuarioIphone {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        AparelhoTelefônico telefone = iphone;
        NavegadorDeInternet internet = iphone;
        ReprodutorMusical reprodutor = iphone;
        System.out.println("");
        telefone.ligar("15 98822-6788");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        System.out.println("");
        internet.exibirPagina("www.iphone.com") ;
        internet.adicionarNovaAba();
        internet.atualizarPagina();
        System.out.println("");
        reprodutor.selecionarMusica("toque Iphone");
        reprodutor.tocar();
        reprodutor.pausar();


    }

}
