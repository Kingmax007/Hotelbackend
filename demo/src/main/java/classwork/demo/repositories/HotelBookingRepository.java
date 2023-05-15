package classwork.demo.repositories;

import classwork.demo.dto.Discount;
import classwork.demo.dto.HotelBooking;
import classwork.demo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelBookingRepository extends JpaRepository<HotelBooking, Long> {


}
