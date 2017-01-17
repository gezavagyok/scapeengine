package org.tek.scape.sequences.questions;

import org.tek.scape.sequences.answers.Answers;
import org.tek.scape.sequences.texts.StoryLine;

public class StoryQuestion extends StoryLine {

    Answers answers;

    public StoryQuestion(String text, Answers answers) {
        super(text);
        this.answers = answers;
    }

    @Override
    public Answers getAnswers() {
        return answers;
    }

    @Override
    public Boolean hasAnswers() {
        return true;
    }
}
