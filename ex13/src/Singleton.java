public class Singleton {
    static Singleton instance = new Singleton();

    static Singleton getInstance(){
        return instance;
    }
}
