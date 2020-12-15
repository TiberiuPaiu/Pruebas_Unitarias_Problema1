import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryImpl implements Dictionary {

    public Map<String, String> map = new HashMap<String, String>();
    @Override
    public void defineWord(String word, String definition) {

    }

    @Override
    public List<String> getDefinitions(String word) throws NotDefinedException {
        return null;
    }
}
