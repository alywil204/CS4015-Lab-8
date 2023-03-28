public class SetContrastCommand implements Command {
    public VideoEditor receiver;
    public float contrast;
    public float backup;
    
    public SetContrastCommand(float contrast, VideoEditor receiver) {
        this.receiver = receiver;
        this.contrast = contrast;
    }

    public void execute() {
        this.backup = receiver.getContrast();
        receiver.setContrast(this.contrast);
    }

    public void undo() {
        receiver.setContrast(this.backup);
    }
}