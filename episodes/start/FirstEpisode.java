package org.tek.scape.episodes.start;


import android.util.Pair;

import com.pontsystems.tekprojekt.onboarding.Sequence;

import org.tek.scape.episodes.Episode;
import org.tek.scape.episodes.EpisodeId;

import java.util.List;

import rx.Observable;

public class FirstEpisode extends Episode {

    public FirstEpisode(EpisodeId id, List<Sequence> sequences) {
        super(id, sequences);
    }

    @Override
    public Observable<Pair<Integer, Integer>> play() {
        return null;
    }
}
