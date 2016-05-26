package com.tutorialspoint;


import javax.annotation.Resource;

/**
 * Created by jjohnson on 5/25/2016.
 */
public class TextEditor {

    private SpellChecker spellChecker;

    @Resource(name = "spellChecker")
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
