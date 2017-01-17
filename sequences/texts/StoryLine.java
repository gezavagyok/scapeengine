package org.tek.scape.sequences.texts;

import android.graphics.drawable.Drawable;

import org.tek.scape.sequences.SequenceElement;
import org.tek.scape.sequences.answers.Answers;

public class StoryLine implements SequenceElement {

    String text;

    public StoryLine(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Boolean hasImage() {
        return false;
    }

    @Override
    public Drawable getImage() {
        return null;
    }

    @Override
    public Boolean hasAnswers() {
        return false;
    }

    @Override
    public Answers getAnswers() {
        return null;
    }

}
