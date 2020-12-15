import java.util.List;

public interface Dictionary {
    void defineWord(String word, String definition);
    List<String> getDefinitions(String word) throws NotDefinedException;
}
