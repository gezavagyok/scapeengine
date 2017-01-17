package org.tek.scape.sequences.questions;

import android.graphics.drawable.Drawable;

import org.tek.scape.sequences.answers.Answers;
import org.tek.scape.sequences.speech.CharacterSpeech;

public abstract class CharacterQuestion extends CharacterSpeech {
    String question;
    Answers answers;

    public CharacterQuestion(Drawable profileImage, String question, Answers answers) {
        super(profileImage, question);
        this.question = question;
        this.answers = answers;
    }

    @Override
    public Boolean hasAnswers() {
        return Boolean.TRUE;
    }

    @Override
    public Answers getAnswers() {
        return answers;
    }
}
