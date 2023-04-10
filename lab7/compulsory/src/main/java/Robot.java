public class Robot implements Runnable {
    private String name;
    private boolean running;
    Exploration explore;
    int row;
    int col;

    public Robot(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        while (running) {
            //pick a new cell to explore
            explore.getMap().visit(row, col, this);
            //sleep
        }
    }
}