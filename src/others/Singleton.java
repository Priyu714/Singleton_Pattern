package others;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        System.out.println("others.Singleton Initiated");
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        System.out.println(Singleton.instance);
        return instance;

    }
    public void getConnection(){
        System.out.println("connection");
    }

    public static void main(String[] args) {


        Singleton.getInstance().getConnection();
    }
}
