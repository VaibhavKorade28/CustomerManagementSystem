package utils;

import java.util.HashMap;
import java.util.Map;
import static vallidations.Validations.*;
import com.core.Customer;

import exceptions.CustomerExceptions;

public class CustUtils {
     public static Map<String,Customer> populateCustomer() throws CustomerExceptions
     {
    	 Map<String,Customer> custMap=new HashMap<>();
			custMap.putIfAbsent("e1",validateAll("e1","Vaibhav","Korade","vsk@gmail.com","vsk","GOLD","2000-01-10",2000,custMap));
			custMap.putIfAbsent("e2",validateAll("e2","Vaibhav","Sharma","ro@gmail.com","hittu","silver","1999-01-10",1000,custMap));
			custMap.putIfAbsent("e3",validateAll("e3","Virat","Kohli","vk@gmail.com","vk","platinum","1998-02-10",5000,custMap));
			custMap.putIfAbsent("e4",validateAll("e4","Surya","Yadav","sky@gmail.com","sky","diamond","2000-05-11",10000,custMap));
			custMap.putIfAbsent("e5",validateAll("e5","Tilak","Varma","tk@gmail.com","tk","GOLD","2001-01-10",2000,custMap));
			return custMap;	
     }
}
