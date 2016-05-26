package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jjohnson on 5/25/2016.
 */
public class TextEditor {
    @Autowired
    private SpellChecker spellChecker;

    public TextEditor(){
        System.out.println("Inside TextEditor constructor.");
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
