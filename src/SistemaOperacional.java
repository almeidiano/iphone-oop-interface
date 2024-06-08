import operacoes.NavegadorInternet;
import operacoes.ReprodutorMusical;

public class SistemaOperacional implements NavegadorInternet, ReprodutorMusical {
    public void conectar() {
        System.out.println("CONECTANDO AO NAVEGADOR DA INTERNET VIA OS");
    }

    public void reproduzir() {
        System.out.println("REPRODUZINDO MUSICA VIA OS");
    }

    public void ligar() {
        System.out.println("LIGANDO VIA OS");
    }
}
