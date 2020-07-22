package com.cda.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chien {
    private int puceChien;
    private String nom;
    private String couleur;
    private int age;
}
