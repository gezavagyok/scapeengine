package org.tek.scape.sequences;

import android.graphics.drawable.Drawable;

import org.tek.scape.sequences.answers.Answers;

/**
 * Created by gezacsorba.
 */

public interface SequenceElement {
    String getText();
    Boolean hasImage();
    Drawable getImage();
    Boolean hasAnswers();
    Answers getAnswers();
}
