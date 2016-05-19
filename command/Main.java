package command;

public class Main {
    public static void main(String[] args) {
        PlayerMusicControl musicControl = new PlayerMusicControl();
        
        Play play = new Play();
        
        PlayOnCommand playOn = new PlayOnCommand(play);
        PlayOffCommand playOff = new PlayOffCommand(play);
    
        musicControl.setCommand(playOn);
        musicControl.executeCommand();
        
        musicControl.setCommand(playOff);
        musicControl.executeCommand();
    }
}
