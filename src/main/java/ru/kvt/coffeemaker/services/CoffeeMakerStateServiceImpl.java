package ru.kvt.coffeemaker.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kvt.coffeemaker.model.CoffeeMakerState;
import ru.kvt.coffeemaker.repositories.CoffeeMakerStateRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CoffeeMakerStateServiceImpl implements CoffeeMakerStateService {

    private final CoffeeMakerStateRepository coffeeMakerStateRepository;

    public Optional<CoffeeMakerState> findById(Long id) {
        return coffeeMakerStateRepository.findById(id);
    }

    public CoffeeMakerState save(CoffeeMakerState coffeeMakerState) {
        return coffeeMakerStateRepository.save(coffeeMakerState);
    }

}
