package org.tek.scape.episodes;

import android.util.Pair;

import com.pontsystems.tekprojekt.onboarding.Sequence;

import org.tek.scape.Point;

import java.util.List;

import rx.Observable;

public abstract class Episode {
    EpisodeId id;
    List<Sequence> sequences;
    EpisodeId next;
    public abstract Observable<Pair<EpisodeId,Point>> play();

    public Episode(EpisodeId id, List<Sequence> sequences) {
        this.id = id;
        this.sequences = sequences;
    }

    public EpisodeId getNext() {
        return next;
    }

    public void setNext(EpisodeId next) {
        this.next = next;
    }

    public EpisodeId getId() {
        return id;
    }

    public List<Sequence> getSequences() {
        return sequences;
    }
}
