package classwork.demo.repositories;

import classwork.demo.dto.Discount;
import classwork.demo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodOrderRepository extends JpaRepository<User, Long> {
    List<Discount> findByUserId(Long userId);
}
