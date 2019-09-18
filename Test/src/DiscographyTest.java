
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

    @Test
    void test1() {
        closeToTheEdge.addTrack(andYouAndI);
        yesArtist.addRecord(closeToTheEdge);
        assertTrue(andYouAndI.getPlaytimeD() == 608);
        test.displayTime(andYouAndI.getPlaytimeD());
        assertFalse(andYouAndI.isBonusTrack);
        assertTrue(closeToTheEdge.getPlaytime() == 608);
    }

    @Test
    void test2(){
        assertTrue(america.isBonusTrack);
        assertTrue(america.getPlaytimeD() == 252);
        test.displayTime(america.getPlaytimeD());
    }

    @Test
    void test3(){
        assertTrue(uderProduction.getDate() == ld);
    }

}