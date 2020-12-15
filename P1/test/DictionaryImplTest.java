import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryImplTest {

    @Test
    void defineWord_NoNull() {
        DictionaryImpl dictionary = new DictionaryImpl();
        String word="pera";
        String definition="Se denomina pera al fruto de distintas especies del género Pyrus, integrado por árboles caducifolios conocidos comúnmente como perales.";
        dictionary.defineWord(word,definition);

        assertNotNull(dictionary.map);
        assertTrue(dictionary.map.size()>0);

        String word1="patata";
        String definition2="Solanum tuberosum, de nombre común papa";
        dictionary.defineWord(word1,definition2);

    }
    @Test
    void defineWord_CoprobaSize() {
        DictionaryImpl dictionary = new DictionaryImpl();
        String word1="pera";
        String definition1="Se denomina pera al fruto de distintas especies del género Pyrus, integrado por árboles caducifolios conocidos comúnmente como perales.";
        dictionary.defineWord(word1,definition1);

        String word2="patata";
        String definition2="Solanum tuberosum, de nombre común papa";
        dictionary.defineWord(word2,definition2);

        String word3="patata";
        String definition3="Solanum tuberosum, de nombre común papa";
        dictionary.defineWord(word3,definition2);

        assertNotNull(dictionary.map);
        assertTrue(dictionary.map.size()==3);
    }

    @Test
    void getDefinitions() {
        DictionaryImpl dictionary = new DictionaryImpl();

        

    }
}