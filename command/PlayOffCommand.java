package command;

public class PlayOffCommand implements Command{
    public Play play;
    
    public PlayOffCommand(Play play) {
        this.play = play;
    }
    
    @Override
    public void execute() {
        this.play.off();
    }
    
}
