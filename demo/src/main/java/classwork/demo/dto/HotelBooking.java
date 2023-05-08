package classwork.demo.dto;

import classwork.demo.enums.RoomType;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class HotelBooking {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    private LocalDateTime checkInDateTime;
    private LocalDateTime checkOutDateTime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // Constructors, getters, and setters
}
