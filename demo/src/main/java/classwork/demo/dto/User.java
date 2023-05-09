package classwork.demo.dto;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Builder
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String email;
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;



    // Constructors, getters, and setters
}


//