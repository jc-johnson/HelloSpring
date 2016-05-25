package com.tutorialspoint;

/**
 * Created by jjohnson on 5/25/2016.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public TextEditor(SpellChecker spellChecker, String name) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
