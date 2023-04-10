import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DrawingPanel extends JPanel {
    public int numVertices;
    final Mainframe frame;
    final static int W = 800, H = 600;
    private Random random = new Random();

    public DrawingPanel(Mainframe frame) {
        this.frame = frame;
        initPanel();
    }
    private void initPanel() {

        setPreferredSize(new Dimension(W, H));
        setBorder(BorderFactory.createEtchedBorder());
    }
    @Override
    protected void paintComponent(Graphics g) {
        Map<Integer, Integer> coordinates = new HashMap<Integer, Integer>();

        super.paintComponent(g);
        for(int i=0; i<numVertices;i++){
            int x = random.nextInt(W);
            int y = random.nextInt(H);
            coordinates.put(x, y);
            g.setColor(Color.BLACK);
            g.fillRect(x, y, 10, 10);
        }


    }

    public void canvasUpdate(){
        numVertices = (int) frame.configPanel.dotsSpinner.getValue();
        repaint();
    }
}