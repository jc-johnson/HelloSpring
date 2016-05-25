package com.tutorialspoint;

/**
 * Created by jjohnson on 5/25/2016.
 */
public class TextEditor {
    private SpellChecker spellChecker;

    // A setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    // a getter method to return spellChecker
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
