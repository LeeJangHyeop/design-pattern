package pattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LeeJangHyeop on 2018. 7. 5..
 */
public class MemoryStorage {
    private static MemoryStorage memoryStorage;

    private Map<String, String> storage = new HashMap<>();

    private MemoryStorage() {
        super();
    }

    static MemoryStorage getInstance() {
        if(memoryStorage == null) {
            synchronized (MemoryStorage.class) {
                memoryStorage= new MemoryStorage();
            }
        }
        return memoryStorage;
    }
    public Map<String, String> getStorage() {
        return storage;
    }

    public void setStorage(Map<String, String> storage) {
        this.storage = storage;
    }
}
