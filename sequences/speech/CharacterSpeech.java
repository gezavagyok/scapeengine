package org.tek.scape.sequences.speech;

import android.graphics.drawable.Drawable;

import org.tek.scape.sequences.SequenceElement;
import org.tek.scape.sequences.answers.Answers;

public abstract class CharacterSpeech implements SequenceElement {

    Drawable profileImage;
    String text;

    public CharacterSpeech(Drawable profileImage, String text) {
        this.profileImage = profileImage;
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Boolean hasImage() {
        return true;
    }

    @Override
    public Drawable getImage() {
        return profileImage;
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
