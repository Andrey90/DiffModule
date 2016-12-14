package other;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lay on 14/12/2016.
 */
public class BlockDemo {
    private final static Set<String> NAMES = new HashSet<String>(){
        {
            add("test");
            add("test1");
            add("test2");
            add("test3");
        }
    };
}
