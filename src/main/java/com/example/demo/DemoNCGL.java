package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
//@EnableEurekaClient
public class DemoNCGL implements CommandLineRunner{
	    
	    private static Logger LOGGER = null;
	    
	    private final INCG iNCG;
	    
	    

	public DemoNCGL(INCG iNCG) {
			super();
			this.iNCG = iNCG;
		}

	public static void main(String[] args) {
		SpringApplication.run(DemoNCGL.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("test boa client");
		System.setProperty("log4j.configurationFile", "log4j2-testConfig.xml");
		LOGGER = LogManager.getLogger();
		
	//Client client= new Client();
		
		NCG ncg = new NCG();
		ncg.setIdNCGGR("ncg123");
		ncg.setNcggr("VUE");
		ncg.setNcg("896514");
		ncg.setNcgcat("CENTRAL");
		iNCG.save(ncg);
		
		NCG ncg2 = new NCG();
		ncg2.setIdNCGGR("ncg863");
		ncg.setNcggr("FORM");
		ncg.setNcg("896599");
		ncg.setNcgcat("BQCENTRAL");
		iNCG.save(ncg2);
		
		LOGGER.info("*****************info**************");
			
       // Client product = repository.findByCustomerId("A1");
        
      //  System.out.println(product.getCustomerName());
		
	}
	

	
}
