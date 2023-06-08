public class Radio {
    private int currentVolume;
    private int currentChannel;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }


    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel > 9) {
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
        if (currentChannel == 9) {
            currentChannel = 0;
        } else {
            currentChannel = currentChannel + 1;
        }
    }

    public void prevChannel() {
        if (currentChannel == 0) {
            currentChannel = 9;
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
