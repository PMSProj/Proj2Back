package org.pk.Proj2Backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.model.User;

public class App 
{
    public static void main( String[] args )
    {
    	 AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
         context.scan("com.*");
         context.refresh();
         
         User user=new User();
         user.setEmail("p@gmail.com");
         user.setFirstname("Priya");
         user.setLastname("K");
         user.setContactnumber("786156223");
         user.setPassword("pk");
         user.setOnline(true);
        
       
         System.out.println("Completed");
    }
}
