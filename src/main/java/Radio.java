public class Radio {


    public int minStation = 0;
    public int maxStation = 9;
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minStation) {
            this.currentRadioStation = maxStation;
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            this.currentRadioStation = minStation;
            return;
        }

        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else this.currentRadioStation = minStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else this.currentRadioStation = maxStation;
    }


    public int minVolume = 0;
    public int maxVolume = 10;
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (newCurrentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void addVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}