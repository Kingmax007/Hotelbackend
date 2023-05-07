package classwork.demo.entity;

import classwork.demo.enums.RoomType;
import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Notification {
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
