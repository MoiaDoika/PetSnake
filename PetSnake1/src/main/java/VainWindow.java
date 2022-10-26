import javax.swing.*;

public class VainWindow extends JFrame {

    public VainWindow() {
        setTitle("Snakey");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }
    public static void main(String[] args) {
        VainWindow sn = new VainWindow();
    }
}
