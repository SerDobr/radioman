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
        rad.setCurrentRadioStation(11);
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
        rad.setCurrentRadioStation(-2);
        int expected = 10;
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
        rad.setCurrentRadioStation(10);
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
        int expected = 10;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestQuantityPrevRadioStation() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();
        int expected = 19;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTestQuantityNextRadioStation() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(29);
        rad.nextRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldTestMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        int expected = 100;
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
        rad.setCurrentVolume(100);
        rad.addVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestMaxMaxAddVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        rad.addVolume();
        int expected = 100;
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
