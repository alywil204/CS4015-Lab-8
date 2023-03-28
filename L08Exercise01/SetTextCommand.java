public class SetTextCommand implements Command {
    private VideoEditor receiver;
    private String text;
    
    public SetTextCommand(String text, VideoEditor receiver) {
        this.receiver = receiver;
        this.text = text;
    }

    public void execute() {
        receiver.setText(this.text);
    }

    public void undo() {
        receiver.removeText();
    }
}