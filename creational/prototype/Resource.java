package prototype;

import java.util.HashMap;

public class Resource implements Cloneable {

    static private HashMap<ResourceType, Resource> registry =
    			new HashMap<ResourceType, Resource>();
    static {
    		registry.put(ResourceType.DB, new DBResource());
    		registry.put(ResourceType.Net, new NetworkResource());
    }

    enum ResourceType {
            DB, Net
    }

    /**
     * Vraća novu instancu resursa korišćenjem <i>plitkog</i> kopiranja
     * @param type Tip resursa
     * @return Nova instanca zahtevanog tipa resursa.
     * @throws ResourceTypeNotSupported Unchecked izuzetak ukoliko tip nije registrovan
     *         jer je ovo znak programerske greške.
     */
    public static Resource getResource(ResourceType type) throws ResourceTypeNotSupported{
            Resource newResource = null;
            try {
                    newResource = (Resource)((Resource)registry.get(type)).clone();
            } catch (CloneNotSupportedException e) {
                    throw new ResourceTypeNotSupported();
            }
            return newResource;
    }

    public Object clone() throws CloneNotSupportedException{
            return super.clone(); //"plitko" kopiranje!!!
    }

}
