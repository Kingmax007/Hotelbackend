package classwork.demo.repositories;
import java.util.List;
import jakarta.validation.Valid;


import classwork.demo.dto.Room;
import classwork.demo.enums.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findAllByOrderByBasePriceAsc();
    List<Room> findAllByOrderByBasePriceDesc();

    List<Room> findByBasePriceGreaterThan(double price);




    List<Room> findByTypeAndBasePriceLessThan(RoomType type, double price);
}

