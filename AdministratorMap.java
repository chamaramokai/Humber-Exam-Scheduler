
package scheduler.master;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author leiroux
 */
public class AdministratorMap {
      private Map<String, Administrator> AdministratorMap;
    
        
    public Iterator getAdministratorMap() {
        return new ArrayList<>().iterator();
    }
    
      public AdministratorMap() {
        
    }
    
    public boolean addAdministratorMap(Administrator administrator) {
        return true;
    }
    
    public boolean removeAdministratorMap(String administrator) {
        return true;
    }
    
    
    public humber.user.User getAdministratorMap(String administrator) {
        return new Administrator("","");
    }
    
    
    
}
