package ru.kvt.coffeemaker.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kvt.coffeemaker.model.Event;
import ru.kvt.coffeemaker.repositories.EventRepository;


@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public Event save(Event event) {
        return eventRepository.save(event);
    }

}
