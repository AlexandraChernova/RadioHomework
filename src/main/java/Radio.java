public class Radio {
    private int currentStation;
    private int currentVolume;

    public void next() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume(){
        if(currentVolume > 0){
            currentVolume = currentVolume -1;
        }else{
            currentVolume = 0;
        }
    }

        public int getCurrentStation () {
            return currentStation;
        }

        public int getCurrentVolume () {
            return currentVolume;
        }

        public void setCurrentStation ( int currentStation){
            if (currentStation < 0) {
                return;
            }
            if (currentStation > 9) {
                return;
            }
            this.currentStation = currentStation;
        }

        public void setCurrentVolume ( int currentVolume){
            if (currentVolume < 0) {
                return;
            }
            if (currentVolume > 100) {
                return;
            }
            this.currentVolume = currentVolume;
        }
    }
