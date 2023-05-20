package vallidations;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.core.Customer;
import com.core.Serviceplan;

import exceptions.CustomerExceptions;

public class Validations {
     public static Customer validateAll(String id, String fname, String lname, String email, String passwd, String plan,String dob,double amt,Map<String,Customer> custMap) throws CustomerExceptions
     {
    	 Serviceplan servicePlan=validateServicePlan(plan);
    	 double amount=validatePlanAmt(amt, servicePlan);
    	 LocalDate birthDate=parseAndValidateDob(dob);
    	 return new Customer(id,fname,lname,email,passwd,servicePlan,birthDate,amount);
     }
     
     public static Serviceplan validateServicePlan(String plan)
     {
    	 return Serviceplan.valueOf(plan.toUpperCase());
     }
     
     public static double validatePlanAmt(double amt,Serviceplan plan) throws CustomerExceptions
     {
    	 if(plan.getPrice()!=amt)
    	 {
    		 throw new CustomerExceptions("Amount doesnt match with the plan");
    	 }
    	 else {
    		 return amt;
    	 }
     }
     
     public static LocalDate parseAndValidateDob(String dob) throws CustomerExceptions
     {
    	 LocalDate birthDate=LocalDate.parse(dob);
    	 if(Period.between(birthDate, LocalDate.now()).getYears()>21)
    	 {
    		 return birthDate;
    	 }
    	 else {
    		 throw new CustomerExceptions("You are underage");
    	 }
     }
}
