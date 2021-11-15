public final class Singleton {

    private static volatile Singleton instance;

    private String value = "Hello";

    private Singleton() {
    }

    public static Singleton getInstance() {
        Singleton result = instance;

        if (result != null) {
            return result;
        }

        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }

            return instance;
        }
    }

    public String getValue() {
        return value;
    }

}
