import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldTestMaxRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMaxMaxRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMinRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMinMinRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestMaxNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.prevRadioStation();
        int expected = 7;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMinPrevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldTestMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTestAddVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.addVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMaxAddVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.addVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMaxMaxAddVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.addVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldTestMinReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldTestMinMinReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.reduceVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

}
