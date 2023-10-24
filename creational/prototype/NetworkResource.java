package prototype;

public class NetworkResource extends Resource {

    protected static int initializationCounter = 0;
    protected int state = 0;

    public NetworkResource(){
            super();
            longRunningInitialization();
    }

    public static int getInitializationCounter(){
            return initializationCounter;
    }

    public static void resetCounter(){
            initializationCounter = 0;
    }

    protected void longRunningInitialization(){
            // ... inicijalizacija koja se dugo izvršava
            state = 2; //i rezultuje postavljanjem određenog stanja objekta
            initializationCounter++;
    }
}
