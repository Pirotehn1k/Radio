import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void test() {
        Radio radio = new Radio(20);

        radio.setCurrentChannel(16);

        int expected = 16;
        int actual = radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(5);

        int expected = 5;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setChannelUpperMax() {
        Radio radio = new Radio();

        radio.setCurrentChannel(11);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setChannelBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentChannel(-2);

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchChannelUp() {
        Radio radio = new Radio();

        radio.setCurrentChannel(5);


        radio.nextChannel();

        int expected = 6;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchChannelDown() {
        Radio radio = new Radio();

        radio.setCurrentChannel(5);


        radio.prevChannel();

        int expected = 4;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchChannelBelowMin() {
        Radio radio = new Radio();


        radio.prevChannel();

        int expected = 9;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchChannelUpperMax() {
        Radio radio = new Radio();

        radio.setCurrentChannel(9);


        radio.nextChannel();

        int expected = 0;
        int actual = radio.getCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchVolumeUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);


        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchVolumeDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(20);


        radio.decreaseVolume();

        int expected = 19;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchVolumeUpperMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);


        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchVolumeLowerMin() {
        Radio radio = new Radio();


        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}
