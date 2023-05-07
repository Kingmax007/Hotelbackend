package classwork.demo.entity;


import classwork.demo.enums.FoodType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
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

