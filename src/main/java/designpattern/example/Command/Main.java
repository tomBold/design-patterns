package designpattern.example.Command;

public class Main {
    public static void main(String args[]) {
        Light lamp = new Light();
        Command switchUp=new FlipUpCommand(lamp );
        Command switchDown=new FlipDownCommand(lamp );

        Switch s=new Switch(switchUp,switchDown);

        try {
            if (args[0].equalsIgnoreCase("ON")){
                s.flipUp();
                System.exit(0);
            }
            if (args[0].equalsIgnoreCase("OFF")){
                s.flipDown();
                System.exit(0);
            }
            System.out.println("Argument \"ON\" or \"OFF\" is required.");
        } catch (Exception e){
            System.out.println("Argument's required.");
        }
    }
}
