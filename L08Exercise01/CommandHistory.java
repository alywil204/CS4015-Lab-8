import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<Command>();

    public void push(Command c) {
        this.history.push(c);
    }

    public Command pop() {
        return this.history.pop();
    }
}