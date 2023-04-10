import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ControlPanel extends JPanel {
    final Mainframe frame;
    JButton exitBtn = new JButton("Exit");
    //create all buttons (Load, Exit, etc.)
    JButton loadBtn = new JButton("Load");
    public ControlPanel(Mainframe frame) {
        this.frame = frame; init();
    }
    private void init() {

        add(exitBtn,LEFT_ALIGNMENT);
        add(loadBtn, RIGHT_ALIGNMENT);
        //add all buttons ...TODO
        //configure listeners for all buttons

        exitBtn.addActionListener(this::exitGame);
//        loadBtn.addActionListener(this::loadGame);
    }
    private void exitGame(ActionEvent e) {
        frame.dispose();
    }

    private void loadGame(ActionEvent e) {
        //
    }
}