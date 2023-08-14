package g4.kits2023_g4_ecofootprint.repository;

import g4.kits2023_g4_ecofootprint.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
