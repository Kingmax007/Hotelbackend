package classwork.demo.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import javax.persistence.*;



@Entity
    @Data
    @Table(name = "user")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String username;
        private String password;
        private String email;
        private String fullName;



        // Constructors, getters, and setters
    }



//