package org.tek.scape.sequences.answers;

import android.util.Pair;

import org.tek.scape.Point;

import java.util.List;

import rx.Observable;

public class Answers {
    List<Pair<Point,String>> answers;

    public Observable<Pair<Point,String>> getAnswers(){
        return Observable.from(answers);
    }
}
