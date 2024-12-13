package com.example.recappsimples;

public class Seguranca {
    public static boolean validarLogin(String login, String senha) {
        return login.equals("usuario") && senha.equals("123456");
    }
}
