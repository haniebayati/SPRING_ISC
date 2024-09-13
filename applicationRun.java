package q1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@SpringBootApplication
public class applicationRun {
	
//	@PersistenceContext
	//private static EntityManager entityManager;

    public static void main(String[] args)
    {
        SpringApplication.run(applicationRun.class, args);
        
        

    }

}
