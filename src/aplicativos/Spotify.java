package aplicativos;

import operacoes.ReprodutorMusical;

public class Spotify implements ReprodutorMusical {
    @Override
    public void reproduzir() {
        System.out.println("SPOTIFY REPRODUZINDO");
    }
}
