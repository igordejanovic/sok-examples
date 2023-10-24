package prototype;

import java.util.Random;

public class PrototypeClient {

    public static void main(String[] args) throws ResourceTypeNotSupported {

            Random rand = new Random();

            DBResource.resetCounter();
            NetworkResource.resetCounter();

            System.out.println("Klasično instanciranje");
            for(int i=0; i<1000; i++){
                    if( rand.nextInt()%2 == 0 ){
                            @SuppressWarnings("unused")
                            Resource r = new DBResource();
                    }else{
                            @SuppressWarnings("unused")
                            Resource r = new NetworkResource();
                    }
            }
            System.out.println("Broj poziva dugih inicijalizacija = " +
                            (DBResource.getInitializationCounter()+
                            NetworkResource.getInitializationCounter()));

            DBResource.resetCounter();
            NetworkResource.resetCounter();

            System.out.println("Prototype instanciranje");
            for(int i=0; i<1000; i++){
                    if( rand.nextInt()%2 == 0 ){
                            @SuppressWarnings("unused")
                            Resource r = (Resource) Resource.getResource(
                            		Resource.ResourceType.DB);
                    }else{
                            @SuppressWarnings("unused")
                            Resource r = (Resource) Resource.getResource(
                            		Resource.ResourceType.Net);
                    }
            }

            System.out.println("Broj poziva dugih inicijalizacija = " +
                            (DBResource.getInitializationCounter()+
                            NetworkResource.getInitializationCounter()));

    }

}
