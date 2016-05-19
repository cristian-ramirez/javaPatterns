package command;

public class PlayOnCommand implements Command{
    public Play play;
    
    public PlayOnCommand(Play play) {
        this.play = play;
    }
    
    @Override
    public void execute() {
        this.play.on();
    }
    
}
