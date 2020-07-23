package com.cda.bean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Compte {
    private String login;
    private String password;
    private int idUtilisateur;
}
