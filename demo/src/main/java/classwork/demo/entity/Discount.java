package classwork.demo.entity;

import classwork.demo.enums.RoomType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
    public class Discount {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private User user;

        @Enumerated(EnumType.STRING)
        private RoomType roomType;

        private LocalDateTime checkInDateTime;
        private LocalDateTime checkOutDateTime;

        // Constructors, getters, and setters
    }

