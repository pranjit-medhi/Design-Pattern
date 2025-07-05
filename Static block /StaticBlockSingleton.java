class StaticBlockSingleton{
    private static StaticBlockSingleton ins;


    private StaticBlockSingleton() {
        System.out.println("Init");
    }
    
    static {
        try {
            ins = new StaticBlockSingleton();
        }
        catch (Exception e)
        {
            throw new RuntimeException("Exception");
        }
    }
    
    public static StaticBlockSingleton getInstance()
    {
        return ins;
    }
}
