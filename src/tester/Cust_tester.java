package tester;

import static utils.CustUtils.populateCustomer;
import static vallidations.Validations.validateAll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.core.Customer;
import com.core.Serviceplan;

public class Cust_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))
		{
        Map<String,Customer> custMap=new HashMap<>();
        custMap=populateCustomer();
        int choice=0;
        boolean exit=false;
        while(!exit)
        {
        	System.out.println("enter the choice");
        	choice=sc.nextInt();
        	try {
        		switch(choice)
        		{
        		case 1:
        			System.out.println("enter customer details");
        			Customer newCustomer=validateAll(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),custMap);
        			custMap.putIfAbsent(newCustomer.getId(), newCustomer);
        			break;
        		case 2:
        			custMap.forEach((k,v) ->   System.out.println(v));
        			break;
        		case 3:
        			TreeMap<String,Customer> tm=new TreeMap<>();
        			tm.putAll(custMap);
        			tm.forEach((k,v) -> System.out.println(v));
        			break;
        		case 4:
        			List<Customer> collect = custMap.values().stream().sorted((c1,c2) -> c1.getDob().compareTo(c2.getDob())).collect(Collectors.toList());
        			collect.forEach(c -> System.out.println(c));
        			break;
        		case 5:
        			System.out.println("enter the id");
        			System.out.println("removed"+custMap.remove(sc.next()));
        			break;
        		case 6:
        			System.out.println("enter the name");
        			String name=sc.next();
        			Iterator<Customer> itr=custMap.values().iterator();
        			while(itr.hasNext())
        			{
        				for(Customer c:custMap.values())
        				{
            				itr.next();
        					if(c.getFname().equals(name))
        					{
        			        	itr.remove();
        					}
        				}
        			}
        		case 7:
        			System.out.println("enter the name");
        			name=sc.next();
        			//custMap.values().stream().filter(c -> c.getFname().equals(sc.next())).forEach(c -> c.setLname("Korde"));
        			for(Customer c :custMap.values())
        			{
        				if(c.getLname().equals(name))
        				{
        					c.setLname("Korade");
        	
        				}
        			}
        			break;
        		case 8:
        			exit=true;
        			break;
        		}
        	}catch(Exception e)
        	{
        		System.out.println(e);
        	}
        }
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
