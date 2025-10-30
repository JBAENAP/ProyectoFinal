package repositories;
import java.util.HashMap;

import java.util.Map;

import models.Administrator;

public class AdminRepository {
	
	    private Map<String, Administrator> data = new HashMap<>();
	   
	    
	    public void save(Administrator admin) {
	        data.put(admin.getUserName(), admin);
	    }



	   public Administrator findByUsername(String username) {
	        return data.get(username);}
	    
	
}
