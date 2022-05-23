package ru.kvt.coffeemaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kvt.coffeemaker.model.CoffeeMakerState;


@Repository
public interface CoffeeMakerStateRepository extends JpaRepository<CoffeeMakerState, Long> {
}
