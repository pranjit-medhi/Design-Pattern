class EagerInit{
   private static  final  EagerInit instance =  new EagerInit();
    private EagerInit(){
        System.out.println("Init");
    }
    public static  EagerInit getInstance(){
        return instance;
    }
}
public class Eagars {
    public static void main(String[] args) {
        final EagerInit instance = EagerInit.getInstance();
        final EagerInit instance2 = EagerInit.getInstance();
        System.out.println(instance == instance2);
    }
}
