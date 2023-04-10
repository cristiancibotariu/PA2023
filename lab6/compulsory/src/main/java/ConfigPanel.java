import jdk.internal.icu.util.CodePointMap;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ConfigPanel extends JPanel {
    final Mainframe frame;
    JLabel dotsLabel, linesLabel;
    JSpinner dotsSpinner;
    JComboBox linesCombo;
    JButton createButton;
    private int numVertices;
    public ConfigPanel(Mainframe frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        setLayout(new FlowLayout());

        dotsLabel = new JLabel("Number of dots:");
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 100, 1));
        numVertices = (int) dotsSpinner.getValue();
        createButton = new JButton("Create");

        add(dotsLabel); //JPanel uses FlowLayout by default
        add(dotsSpinner);
        add(createButton);

        createButton.addActionListener(this::createVertices);
    }

    private void createVertices(ActionEvent e){
        frame.canvas.canvasUpdate();
    }
}