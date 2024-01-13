package interface_.ex;

public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV turn on");
    }
    @Override
    public void turnOff() {
        System.out.println("TV turn off");
    }
    @Override
    public void setVolume(int volume) {
        if(MAX_VOLUME < volume){
            this.volume = MAX_VOLUME;
        }else if(MIN_VOLUME > volume){
            this.volume = MIN_VOLUME;
        }else{
            this.volume = volume;
        }

        System.out.println("now Television's volume is "+this.volume);
    }
    @Override
    public void search(String url) {
        System.out.println("now Search "+ url);
    }
}
