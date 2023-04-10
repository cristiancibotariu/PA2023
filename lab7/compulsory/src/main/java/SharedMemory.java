import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SharedMemory {
    private List<Token> tokens = new ArrayList<>();
    public SharedMemory(int n) {
        for(int i=1;i<=n*n*n;i++){
            tokens.add(new Token(i));
        }
        Collections.shuffle(tokens);
    }

    SharedMemory(){}

    public synchronized List<Token> extractTokens(int howMany) {
        List<Token> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (tokens.isEmpty()) {
                break;
            }
            extracted.add(tokens.get(i));
        }
        return extracted;
    }
}
