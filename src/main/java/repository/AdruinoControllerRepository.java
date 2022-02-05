package repository;

import model.ArduinoController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface AdruinoControllerRepository extends JpaRepository<ArduinoController, String> {

}
