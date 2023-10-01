import java.util.Stack;

// INVOKER
public class RemoteControl {
    private Command command;

    private Stack<Command> undoStack = new Stack<>();


    public void setCommand(Command command) {
        this.command = command;
    }

    //Consider a simple remote control that can turn on and off a light
    public void pressButton(){
        command.execute();
        undoStack.push(command); // Add to undo stack
    }

    public void undoButton() {
        if (!undoStack.isEmpty()) {
            Command lastCommand = undoStack.pop(); //Removes and returns the element at the top of the stack.
            lastCommand.undo();
        }
    }
}
