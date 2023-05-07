package classwork.demo.repositories;

import classwork.demo.entity.Discount;
import classwork.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelBookingRepository extends JpaRepository<User, Long> {
    List<Discount> findByUserId(Long userId);
}
