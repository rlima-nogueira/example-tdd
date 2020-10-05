package br.com.exampletdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testeLogin {

    public testeLogin(){

    }

    @Test
    public void testeLogin(){
        String user = "user";
        String password = "12345678";
        String retorno1 = "Sucesso";
        String retorno2 = "Falha no login";

        Login login = new Login(user, password);
        assertEquals(retorno1, login.sucessLogin());
        assertEquals(retorno2, login.failLogin());
    }
}
