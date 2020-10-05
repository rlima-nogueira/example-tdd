package br.com.exampletdd;

public class Login {

    private String user, password;

    public Login (String user, String password){
        this.user = user;
        this.password = password;
    }

    public String sucessLogin(){
        if(user == "user" && password == "12345678"){
            System.out.println("Sucesso");
        }
        return "Sucesso";

    }

    public String failLogin(){
        if(user != "user" || password != "12345678"){
            System.out.println("Falha no login");
        }
        return "Falha no login";
    }
}
