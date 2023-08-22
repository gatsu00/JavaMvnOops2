package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int quantityRadioStation =10;
    private int minStation = 0;
    private int maxStation = quantityRadioStation - 1;
    private int currentRadioStation = minStation;

    public void next() {
        if (currentRadioStation < maxStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minStation;
        }
    }

    public void prev() {
        if (currentRadioStation > minStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minStation) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public Radio() {

    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
        this.maxStation = quantityRadioStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }


}