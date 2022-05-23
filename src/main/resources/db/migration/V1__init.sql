create table state
(
    id         bigserial primary key,
    is_coffee_maker_enabled  boolean  not null,
    coffee_strength   int not null,
    boiling_mode      text not null

);

create table events
(
    id         bigserial primary key,
    message       text not null,
    created_at timestamp default current_timestamp

);

insert into state (is_coffee_maker_enabled, coffee_strength, boiling_mode)
values (false, 0, 'WATER');