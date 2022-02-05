package service.impl;

import model.Condition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ConditionRepository;
import service.ConditionService;

@Service
public class ConditionServiceImpl implements ConditionService {
    @Autowired
    ConditionRepository conditionRepository;

    @Override
    public void addIndicator(Condition condition) {
        conditionRepository.save(condition);

    }

    @Override
    public Condition getIndicatorsByControllerId(String controllerId) {
      return conditionRepository.getById(controllerId);
    }
}
