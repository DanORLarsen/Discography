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



    public void displayTime(long time){
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
}
