public class Radio {


    private int minStation = 0;
    private int maxStation;
    private int currentRadioStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume  ;

    public Radio(){
        this.maxStation = 10;
    }

    public Radio(int quantityStation){
        this.maxStation = quantityStation - 1;
    }

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


    public void nextRadioStation() {
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            this.currentRadioStation = minStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            this.currentRadioStation = maxStation;
        }
    }


    public void addVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}