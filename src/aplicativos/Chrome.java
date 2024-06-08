package aplicativos;

import operacoes.NavegadorInternet;

public class Chrome implements NavegadorInternet {
    @Override
    public void conectar() {
        System.out.println("CHROME CONECTADO");
    }
}
