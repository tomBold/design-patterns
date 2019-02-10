package designpattern.example.Command;

public class FlipDownCommand implements Command {
    private Light theLight;

    public FlipDownCommand(Light light){
        this.theLight=light;
    }

    public void execute(){
        theLight.turnOff();
    }
}
