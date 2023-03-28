import java.util.EmptyStackException;

public class Application {
    private static CommandHistory history = new CommandHistory();
    private static VideoEditor editor = new VideoEditor();

    public static void main(String[] args) {
        System.out.println("Set text:");
        System.out.println(editor);
        Application.setText("hello world");
        System.out.println(editor);
        System.out.println("Undo:");
        System.out.println(editor);
        Application.undo();
        System.out.println(editor);

        System.out.println();

        System.out.println("Set contrast:");
        System.out.println(editor);
        Application.setContrast(1);
        System.out.println(editor);
        Application.setContrast(0);
        System.out.println(editor);
        System.out.println("Undo:");
        System.out.println(editor);
        Application.undo();
        System.out.println(editor);
        Application.undo();
        System.out.println(editor);

        System.out.println();

        System.out.println("Set contrast and text");
        System.out.println(editor);
        Application.setContrast(1);
        System.out.println(editor);
        Application.setText("Operation 2");
        System.out.println(editor);
        Application.setContrast(3);
        System.out.println(editor);
        System.out.println("Undo:");
        System.out.println(editor);
        Application.undo();
        System.out.println(editor);
        Application.undo();
        System.out.println(editor);
        Application.undo();
        System.out.println(editor);
    }

    public static void setText(String text) {
        Application.executeCommand(new SetTextCommand(text, Application.editor));
    }

    public static void setContrast(float contrast) {
        Application.executeCommand(new SetContrastCommand(contrast, Application.editor));
    }

    public static void executeCommand(Command c) {
        c.execute();
        Application.history.push(c);
    }

    public static void undo() {
        try {
            Command c = Application.history.pop();
            c.undo();
        } catch (EmptyStackException e) {
            // do nothing
        }
    }
}