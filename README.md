# springDemo6Data
  Spring Data Demo project - spring data jpa
  
  <a href="https://spring.io/projects/spring-data" target="_blank">Spring Data Home page !</a>
  
  
##Spring Data
  Mission to provide a familiar and consistent Spring-based programming model for data access while retaining the special traits
  of underlying data store
  Umbrella of several projects :
  
   Common projects
   	Spring Data Commons : 
   	
   	    1. convert Java business entities into target data source records and persist them as well convert back records to entities
   	    
   	    2. Lookup records
   	    
   	    3. Update records
   	   
   	    4. Delete records
   	    
   	    Repository Pattern - abstraction used by Spring Data to accomplish these goals - CRUDRepository
   	    
   	    	1.Spring Data JPA has a JPARepository - most popular
   	   		
   	   		2.Spring Data mongoDB has a MongoRepository
   	    	
   	    	3.Spring Data Gemfire has a GemfireRepository
   	    
  	Special traits projects
  	
##Object-Relational Mapping (ORM)

   Physical model ( Relational database) to the logical model (Java domain objects)
   
### ORM with Standard Java 
     1.Open a transaction
     2.Make a SQL query
     3.Iterate through each record 
     4.Iterate through each field in a record 
     5.Extract field, respecting data type
     6. Map to the Java object/attribute
     7.Close the transaction
     7a. For Insert/Update query - commit/rollback transaction
       
### ORM with Standard Java     
        
  Developer declares metadata to associate Java classes and attributes to database tables and columns
  Framework handles the actual database interactions
  Code is abstracted away from the database
  Lighter ,maintainable code footprint
   
### Java Persistence API: Backstory
   Mid-2000s : Hibernate , TopLink and IBATIS   (ORMs) - Code divergence -> Standard need it
   
   SUN+Industry leaders : Java Persistence API - JSR 317 (Dec 2009) => JPA 2.0
   
### Java Persistence API - Just a Specification  not an actual framework  
   
  Serveral implementation frameworks : Hibernate , TopLink , Java EE application servers provide the implementation
  
  JPA specify :
    Metadata mapping (xml files or Java annotations):
 			 Java entities <==> Tables
 			 Java attributes <==> Column/fields
 	EnityManager : create , read, update and delete entities		 
     	    
### Spring Data Repository Interfaces
  
  public interface Repository<T,ID> - just a marker interface whitout any methods
      
      T - Domain type the repository manages
      ID - Type of unique ID of the entity
      
  public interface CrudRepository<T,ID> extends Repository<T,ID>  and declares methods that create,update,read and delete entities and inherit the bounded type parameters.
      
        
   
  
  