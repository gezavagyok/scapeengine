package org.tek.scape.sequences.questions;

import android.graphics.drawable.Drawable;

import org.tek.scape.sequences.answers.Answers;

public class UserQuestion extends CharacterQuestion {

    public UserQuestion(Drawable profileImage, String question, Answers answers) {
        super(profileImage, question, answers);
    }
}
