public class Radio {
    private int currentVolume;
    private int currentChannel;

    private int maxChannel;

    public Radio() {
        maxChannel = 9;
    }

    public Radio(int channelsNumber){
        maxChannel = channelsNumber - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }


    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel > maxChannel) {
            return;
        }
        if (newCurrentChannel < 0) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void nextChannel() {
        if (currentChannel == maxChannel) {
            currentChannel = 0;
        } else {
            currentChannel = currentChannel + 1;
        }
    }

    public void prevChannel() {
        if (currentChannel == 0) {
            currentChannel = maxChannel;
        } else {
            currentChannel = currentChannel - 1;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
