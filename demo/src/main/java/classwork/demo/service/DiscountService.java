package classwork.demo.service;

import classwork.demo.entity.Discount;
import classwork.demo.repositories.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiscountService {
    @Autowired
    private DiscountRepository discountRepository;

    public Discount createDiscount(Discount discount) {
        return discountRepository.save(discount)
                ;
    }

    public Discount updateDiscount(Discount discount) {
        return discountRepository.save(discount)
                ;
    }

    public void deleteDiscount(Long id) {
        discountRepository.deleteById(id)
        ;
    }

    public Optional<Discount> getDiscountById(Long id) {
        return discountRepository.findById(id)
                ;
    }

    public List<Discount> getAllDiscounts() {
        return discountRepository.findAll();
    }

    public List<Discount> getDiscountsByUserId(Long userId) {
        return discountRepository.findByUserId(userId);
    }
}
