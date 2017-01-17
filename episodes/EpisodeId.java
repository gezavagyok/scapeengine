package org.tek.scape.episodes;

public class EpisodeId {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static EpisodeId from(String string){
        EpisodeId id = new EpisodeId();
        id.setId(string);
        return id;
    }
}
