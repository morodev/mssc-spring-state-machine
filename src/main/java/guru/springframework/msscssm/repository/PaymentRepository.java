package guru.springframework.msscssm.repository;

import guru.springframework.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Luca MOro on 14/02/2021
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
