import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;

public class Record {
    private String type;
    private String title;
    private LocalDate date;
    private int trackCount = 0;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    private Long playtime;

    public void addTrack(Track track){
        tracks.add(track);
        trackCount++;
        playtime+= track.playtimeD;
        if (trackCount == 1){type = "single";}
        else {type = "album";}
    }

    public Record(String title, LocalDate date) {
        this.title = title;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public Long getPlaytime() {
        return playtime;
    }
}
