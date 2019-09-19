import java.util.ArrayList;

public class Discography {
    private String artistName;
    private int recordCount = 0;
    private ArrayList<Record> records = new ArrayList<Record>();

    public Discography(String artistName) {
        this.artistName = artistName;
    }

    public void addRecord(Record record){
        getRecords().add(record);
        recordCount++;
    }

//lav modulus time og /time for at vise det som krævet

    public void displayTime(int time){
        int sec = (int)time%60;
        time-=sec;
        int min = (int) (time/60);
        System.out.println("Playtime: "+ min + " minutes, " + sec + " seconds" );
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getDisplay() {
        if (this.getRecords().size() != 0){
        return artistName + "\n" + recordCount + " record(s)\n"  + getRecords().get(0).getTrackCount() + " Track(s)";}
        else {return artistName + "\n" + recordCount + " record(s)\n";}
    }
}

