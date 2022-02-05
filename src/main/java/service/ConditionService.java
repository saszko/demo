package service;

import model.Condition;
import org.springframework.stereotype.Service;

@Service
public interface ConditionService {
     void addIndicator(Condition condition);
    Condition getIndicatorsByControllerId(String controllerId);
}
