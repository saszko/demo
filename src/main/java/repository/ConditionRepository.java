package repository;

import model.Condition;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConditionRepository extends JpaRepository<Condition, String> {
}
