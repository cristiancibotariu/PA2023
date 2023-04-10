import java.util.Arrays;
import java.util.List;

public class ExplorationMap {
    private Cell[][] matrix;

    ExplorationMap(){}

    public void setMatrix(Cell[][] matrix){
        this.matrix=matrix;
    }

    public boolean visit(int row, int col, Robot robot) {
            synchronized (matrix[row][col]) {
                if (matrix[row][col]==null) {
                    List<Token> tokens =
                    matrix[row][col] = tokens;
                    System.out.println("Robotul " + robot + " a vizitat celula " + matrix[row][col] + " cu succes");
                    return true;
                } return false;
        }
    }

    @Override
    public String toString() {
        return "ExplorationMap{" +
                "matrix=" + Arrays.toString(matrix) +
                '}';
    }
}
