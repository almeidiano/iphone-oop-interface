package aplicativos;

import operacoes.NavegadorInternet;

public class Firefox implements NavegadorInternet {
    @Override
    public void conectar() {
        System.out.println("FIREFOX CONECTADO");
    }
}
