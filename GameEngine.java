package org.tek.scape;


import android.util.Pair;

import org.tek.scape.episodes.Episode;
import org.tek.scape.episodes.EpisodeId;

import java.util.HashMap;
import java.util.List;

import rx.Observable;
import rx.functions.Func1;

public class GameEngine {
    List<Episode> episodes;
    HashMap<EpisodeId,List<EpisodeId>> nextEpisodes;

    Point userCollectedPoints;

    public GameEngine(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public void newGame() {
        playEpisode(EpisodeId.from("first"));
    }

    void playEpisode(EpisodeId id) {
        playNext(id)
                .doOnNext(episodeIdPointPair -> {
                    // update user points
                    userCollectedPoints = userCollectedPoints.plus(episodeIdPointPair.second);
                    // play next episode
                    playEpisode(episodeIdPointPair.first);
                }).subscribe();
    }

    Observable<Pair<EpisodeId, Point>> playNext(EpisodeId id) {
        return Observable.from(episodes).filter(episode -> episode.getId().equals(id)).first().flatMap(new Func1<Episode, Observable<Pair<EpisodeId, Point>>>() {
            @Override
            public Observable<Pair<EpisodeId, Point>> call(Episode episode) {
                List<EpisodeId> nextOnes = nextEpisodes.get(episode.getId());
                return Observable.just(new Pair<>(episode.getNext(), new Point(1)));
            }
        });
    }

}
