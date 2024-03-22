/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avtoservis;

/**
 *
 * @author Ксюша
 */
public class Dictionary {
     private String word;
    private String meaning;

    public String getMark() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setMeaning (String meaning) {
        this.meaning = meaning;
    }

    public Dictionary(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return word + meaning;
    }
}