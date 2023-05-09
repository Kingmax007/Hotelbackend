package classwork.demo.dto;

import classwork.demo.enums.RoomType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Table(name = "notification")
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
