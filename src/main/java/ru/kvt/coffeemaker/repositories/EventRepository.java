package ru.kvt.coffeemaker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kvt.coffeemaker.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
