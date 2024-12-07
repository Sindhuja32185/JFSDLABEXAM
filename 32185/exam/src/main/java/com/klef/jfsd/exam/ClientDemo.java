package com.klef.jfsd.exam;

import java.util.List;

public class ClientDemo {

    public static void main(String[] args) {
        
        // Step 1: Create SessionFactory and Session
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Client.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            // Step 2: Create a new Client object
            Client newClient = new Client("John Doe", "Male", 28, "New York", "johndoe@example.com", "1234567890");

            // Step 3: Start a transaction
            session.beginTransaction();

            // Step 4: Save the client object (Insert record)
            session.save(newClient);

            // Commit the transaction
            session.getTransaction().commit();

            System.out.println("Client saved: " + newClient);

            // Step 5: Get a new session and begin transaction for fetching all clients
            session = factory.getCurrentSession();
            session.beginTransaction();

            // Create HQL query to fetch all Client records
            Query<Client> query = session.createQuery("from Client", Client.class);

            // Execute query and get result list
            List<Client> clients = query.getResultList();

            // Step 6: Print all Clients
            for (Client client : clients) {
                System.out.println(client);
            }

            // Commit the transaction
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
