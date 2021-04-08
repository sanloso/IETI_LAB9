package eci.ieti;

import eci.ieti.data.CustomerRepository;
import eci.ieti.data.ProductRepository;
import eci.ieti.data.TodoRepository;
import eci.ieti.data.UserRepository;
import eci.ieti.data.model.Customer;
import eci.ieti.data.model.Product;

import eci.ieti.data.model.Todo;
import eci.ieti.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {


    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");


        customerRepository.save(new Customer("Alice", "Smith"));
        customerRepository.save(new Customer("Bob", "Marley"));
        customerRepository.save(new Customer("Jimmy", "Page"));
        customerRepository.save(new Customer("Freddy", "Mercury"));
        customerRepository.save(new Customer("Michael", "Jackson"));

        productRepository.save(new Product(1L, "Samsung S8", "All new mobile phone Samsung S8"));
        productRepository.save(new Product(2L, "Samsung S8 plus", "All new mobile phone Samsung S8 plus"));
        productRepository.save(new Product(3L, "Samsung S9", "All new mobile phone Samsung S9"));
        productRepository.save(new Product(4L, "Samsung S9 plus", "All new mobile phone Samsung S9 plus"));
        productRepository.save(new Product(5L, "Samsung S10", "All new mobile phone Samsung S10"));
        productRepository.save(new Product(6L, "Samsung S10 plus", "All new mobile phone Samsung S10 plus"));
        productRepository.save(new Product(7L, "Samsung S20", "All new mobile phone Samsung S20"));
        productRepository.save(new Product(8L, "Samsung S20 plus", "All new mobile phone Samsung S20 plus"));
        productRepository.save(new Product(9L, "Samsung S20 ultra", "All new mobile phone Samsung S20 ultra"));

        todoRepository.save(new Todo("Services", "4", "Willie", "Ready", new Date("08/25/2020")));
        todoRepository.save(new Todo("Accounting", "2", "Esther", "In progress", new Date("07/03/2020")));
        todoRepository.save(new Todo("Training", "9", "Herrick", "Ready", new Date("05/14/2020")));
        todoRepository.save(new Todo("Accounting", "4", "Kelley", "Pending", new Date("03/19/2021")));
        todoRepository.save(new Todo("Engineering", "7", "Shirline", "Pending", new Date("06/26/2020")));
        todoRepository.save(new Todo("Accounting", "3", "Keeley", "In progress", new Date("03/13/2021")));
        todoRepository.save(new Todo("Sales", "8", "Milicent", "Pending", new Date("06/12/2020")));
        todoRepository.save(new Todo("Marketing", "10", "Lenora", "In progress", new Date("04/19/2020")));
        todoRepository.save(new Todo("Support", "7", "Madison", "Ready", new Date("12/13/2020")));
        todoRepository.save(new Todo("Services", "3", "Gwendolin", "Pending", new Date("10/16/2020")));
        todoRepository.save(new Todo("Legal", "4", "Bibby", "In progress", new Date("02/23/2021")));
        todoRepository.save(new Todo("Research and development of the computer security seedbed for the practice to be carried out given the quarantine and breaks that have been sold giving for reasons beyond the control of our respected company.",
                "4", "Lorrin", "Pending",  new Date("10/25/2020")));
        todoRepository.save(new Todo("Human Resources", "4", "Fey", "In progress", new Date("01/22/2021")));
        todoRepository.save(new Todo("Marketing", "7", "Siffre", "Pending", new Date("04/21/2020")));
        todoRepository.save(new Todo("Support", "8", "Danita", "In progress", new Date("10/17/2020")));
        todoRepository.save(new Todo("Services", "4", "Lenora", "Ready", new Date("04/02/2021")));
        todoRepository.save(new Todo("Legal", "9", "Sheffie", "Ready", new Date("04/17/2020")));
        todoRepository.save(new Todo("Support", "10", "Lezlie", "In progress", new Date("09/08/2020")));
        todoRepository.save(new Todo("Sales", "9", "Selig", "Ready", new Date("12/27/2020")));
        todoRepository.save(new Todo("Accounting", "7", "Law", "Ready", new Date("09/20/2020")));
        todoRepository.save(new Todo("Human Resources", "1", "Aretha", "In progress", new Date("10/20/2020")));
        todoRepository.save(new Todo("Marketing", "6", "Lenora", "Ready", new Date("02/09/2021")));
        todoRepository.save(new Todo("Research and Development", "1", "Danita", "In progress", new Date("10/29/2020")));
        todoRepository.save(new Todo("Services", "1", "Bill", "Pending", new Date("12/09/2020")));
        todoRepository.save(new Todo("Human Resources", "5", "Corbie", "Ready", new Date("08/05/2020")));


        userRepository.save(new User("Santiago", "santiago@hotmail.com"));
        userRepository.save(new User("Tatiana", "tatis23@hotmail.com"));
        userRepository.save(new User("Daniel", "daniel@hotmail.com"));
        userRepository.save(new User("Engracia", "engracia@hotmail.com"));
        userRepository.save(new User("Alejandra", "alejandra@hotmail.com"));
        userRepository.save(new User("Enrique", "enrique@hotmail.com"));
        userRepository.save(new User("Richard", "richard@hotmail.com"));
        userRepository.save(new User("Obdulia", "obdulia@hotmail.com"));
        userRepository.save(new User("Rufina", "rufina@hotmail.com"));
        userRepository.save(new User("Agustina", "agustina@hotmail.com"));

//        Query query = new Query();
//        query.addCriteria(Criteria.where("firstName").is("Alice"));
//
//        Customer customer = mongoOperation.findOne(query, Customer.class);
//        System.out.println("Paginated search of CUSTOMER by firstName:");
//        System.out.println("-------------------------------");
//        System.out.println(customer);
//        System.out.println();
//
//        System.out.println("Paginated search of TODO by responsible:");
//        System.out.println("-------------------------------");
//        todoRepository.findByResponsible("Santiago", PageRequest.of(0, 2)).stream()
//                .forEach(System.out::println);
//        todoRepository.findAll().forEach(System.out::println);
//        System.out.println();

        System.out.println("Paginated search of TODO by dueDate, found by Interface::");
        System.out.println("-------------------------------");
        todoRepository.findByDueDateBetween(new Date("12/09/2020"),null, PageRequest.of(0, 15)).stream()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Paginated search of TODO by dueDate, found by Query:");
        System.out.println("-------------------------------");
        Query query = new Query();
        query.addCriteria(Criteria.where("dueDate").lt(new Date("12/09/2020")));
        List<Todo> todoListByDueDate = mongoOperation.find(query, Todo.class);
        todoListByDueDate.forEach(todo -> System.out.println(todo));
        System.out.println();

        System.out.println("Paginated search of TODO by priority, found by Interface:");
        System.out.println("-------------------------------");
        todoRepository.findByResponsibleAndPriorityGreaterThan("Lenora", "5", PageRequest.of(0, 15)).stream()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Paginated search of TODO by priority, found by Query:");
        System.out.println("-------------------------------");
        Query query1 = new Query();
        query1.addCriteria(Criteria.where("responsible").regex("lenora"));
        query1.addCriteria(Criteria.where("priority").gte("5"));
        List<Todo> todoListByPriority = mongoOperation.find(query1, Todo.class);
        todoListByPriority.forEach(todo -> System.out.println(todo));
        System.out.println();

        System.out.println("Todos that contains a description with a length greater than 30 characters, found by Query:");
        System.out.println("-------------------------------");
        Query query2 = new Query();
        query2.addCriteria(Criteria.where("description").regex("[a-z,A-Z,0-9,' ']{30,}"));
        List<Todo> todoListByDescription = mongoOperation.find(query2, Todo.class);
        todoListByDescription.forEach(todo -> System.out.println(todo));
        System.out.println();

//        System.out.println("Users found with findByName():");
//        System.out.println("-------------------------------");
//        userRepository.findByName("Tatiana").stream().forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("Customers found with findAll():");
//        System.out.println("-------------------------------");
//        customerRepository.findAll().stream().forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("Paginated search of products by criteria:");
//        System.out.println("-------------------------------");
//        productRepository.findByDescriptionContaining("plus", PageRequest.of(0, 2)).stream()
//                .forEach(System.out::println);
//        System.out.println();

        userRepository.deleteAll();
        todoRepository.deleteAll();
        productRepository.deleteAll();
        customerRepository.deleteAll();
    }

}
