package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jjohnson on 5/25/2016.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker){
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
