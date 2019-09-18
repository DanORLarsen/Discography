import java.time.Duration;

public class Track {
    String title;
    int playtimeD;
    boolean isBonusTrack;

    public Track(String title, int playtimeD, boolean isBonusTrack) {
        this.title = title;
        this.playtimeD = playtimeD;
        this.isBonusTrack = isBonusTrack;
    }

    public String getTitle() {
        return title;
    }

    public int getPlaytimeD() {
        return playtimeD;
    }

    public boolean isBonusTrack() {
        return isBonusTrack;
    }
}
