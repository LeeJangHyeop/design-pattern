package patterns.creational.singleton;

/**
 * Created by LeeJangHyeop on 2018. 7. 5..
 */
public class SingletonMain {
    public static void main(String[] args) {
        MemoryStorage memoryStorage = MemoryStorage.getInstance();
        memoryStorage.getStorage().put("name", "mason");

        MemoryStorage memoryStorage2 = MemoryStorage.getInstance();
        String name = memoryStorage2.getStorage().get("name");

        System.out.println("memoryStorage == memoryStorage2 : " + (memoryStorage == memoryStorage2));
        System.out.print("name : " + name);
    }
}
