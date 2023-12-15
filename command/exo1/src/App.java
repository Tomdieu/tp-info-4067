import com.command.Command;
import com.command.ConcreteCommand;
import com.invoker.Invoker;
import com.reciever.Reciever;

public class App {
    public static void main(String[] args) throws Exception {
        Reciever reciever = new Reciever();

        Command command =  new ConcreteCommand(reciever);

        Invoker invoker = new Invoker();

        invoker.setCommand(command);

        invoker.executeCommand();
    }
}
