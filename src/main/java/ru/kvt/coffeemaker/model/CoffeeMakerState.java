package ru.kvt.coffeemaker.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "state")
public class CoffeeMakerState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "is_coffee_maker_enabled")
    private Boolean isCoffeeMakerEnabled;

    @Column(name = "coffee_strength")
    private Integer coffeeStrength;

    @Enumerated(EnumType.STRING)
    @Column(name = "boiling_mode")
    private BoilingMode boilingMode;

}
