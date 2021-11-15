public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());
        thread1.start();
        thread2.start();
    }

    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.getValue());
        }
    }

}
