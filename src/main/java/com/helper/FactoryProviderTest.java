
package com.helper;

import org.hibernate.SessionFactory;

public class FactoryProviderTest {
    public static void main(String[] args) {
        // Test the SessionFactory initialization
        SessionFactory factory = FactoryProvider.getSessionFactory();
        if (factory != null) {
            System.out.println("SessionFactory initialized successfully.");
        } else {
            System.out.println("Failed to initialize SessionFactory.");
        }
        
       
        FactoryProvider.closeSessionFactory();
    }
}
