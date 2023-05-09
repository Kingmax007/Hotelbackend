package classwork.demo.dto;

import classwork.demo.enums.RoomType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name = "discount")

    public class Discount {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

//        @OneToMany(cascade = CascadeType.ALL)
////        @JoinColumn (name = "user_Id")
////        private User user;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "discount")
    private List <User> users;


    @Enumerated(EnumType.STRING)
        private RoomType roomType;

        private LocalDateTime checkInDateTime;
        private LocalDateTime checkOutDateTime;

        // Constructors, getters, and setters
    }

