package br.com.systemsgs.googleauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = "/api/googleoauth")
public class GoogleOAuthController {

    @GetMapping(value = "/auth")
    public String deuCerto(){
        return "Autenticação Feita com Sucesso!!!";
    }

    @GetMapping(value = "/certo")
    public Principal user(Principal principal){
        System.out.println("User: " + principal.getName());
        return principal;
    }

}
