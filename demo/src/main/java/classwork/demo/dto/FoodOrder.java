package classwork.demo.dto;


import classwork.demo.enums.FoodType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name = "foodorder")
    public class FoodOrder {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private User user;

        private String roomNumber;

        @Enumerated(EnumType.STRING)
        private FoodType foodType;

        private LocalDateTime orderDateTime;

        // Constructors, getters, and setters
    }

