
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Dictionary;

import static org.junit.jupiter.api.Assertions.*;

class DiscographyTest {
    Discography test = new Discography("test");
    Discography yesArtist = new Discography("Yes");
    Record closeToTheEdge = new Record("Close to the edge",LocalDate.now());
    Track andYouAndI = new Track("And You and I", 608, false);
    Track america = new Track("America",252, true);
    Record uderProduction = new Record("Under Production", LocalDate.of(2074, Month.OCTOBER,6));
    LocalDate ld = LocalDate.of(2074,Month.OCTOBER,6);
    Discography futureArits = new Discography("Future Artist");

    @Test
    void test1() {
        closeToTheEdge.addTrack(andYouAndI);
        yesArtist.addRecord(closeToTheEdge);
        assertTrue(andYouAndI.getPlaytimeD() == 608);
        test.displayTime(andYouAndI.getPlaytimeD());
        assertFalse(andYouAndI.isBonusTrack);
        assertTrue(closeToTheEdge.getPlaytime() == 608);
        assertTrue(closeToTheEdge.getType() == "single");
    }

    @Test
    void test2(){
        assertTrue(america.isBonusTrack);
        assertTrue(america.getPlaytimeD() == 252);
        test.displayTime(america.getPlaytimeD());
        closeToTheEdge.addTrack(america);
    }

    @Test
    void test3(){
        assertTrue(uderProduction.getDate() == ld);
    }

    @Test
    void test4(){
        closeToTheEdge.addTrack(america);
        closeToTheEdge.addTrack(andYouAndI);
        //Checks if track count is updated
        assertTrue(closeToTheEdge.getTrackCount() == 2);
        //Checks if closeToTheEdge got total playtime.
        assertTrue((america.getPlaytimeD()+andYouAndI.getPlaytimeD())== closeToTheEdge.getPlaytime());
        //Checks if type is album
        assertTrue(closeToTheEdge.getType() == "album");
        yesArtist.addRecord(closeToTheEdge);
        System.out.println(yesArtist.getDisplay());
    }

    @Test
    void test5(){
        assertTrue(futureArits.getRecordCount() == 0);
        System.out.println(futureArits.getDisplay());
    }
}