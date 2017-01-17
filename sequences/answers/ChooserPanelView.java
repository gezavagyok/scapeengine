package org.tek.scape.sequences.answers;

import android.content.Context;
import android.support.annotation.IdRes;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

import rx.Observable;

/**
 * Created by gezacsorba on 28/09/2016.
 */

public class ChooserPanelView<V> extends LinearLayout {

    public ChooserPanelView(Context context) {
        super(context);

    }

    public ChooserPanelView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ChooserPanelView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Button leftChoise;
    Button rightChoise;

    V leftValue;
    V rightValue;

    public void setButtonIds(@IdRes int left, @IdRes int right) {
        leftChoise = (Button) findViewById(left);
        rightChoise = (Button) findViewById(right);
    }

    public void setValues(V left, V right) {
        leftValue = left;
        rightValue = right;
    }

    public Observable<V> getChoise() {
        return Observable.create(subscriber -> {
            leftChoise.setOnClickListener(v -> {
                subscriber.onNext(leftValue);
                subscriber.onCompleted();
            });
            rightChoise.setOnClickListener(v -> {
                subscriber.onNext(rightValue);
                subscriber.onCompleted();
            });
        });
    }

}
