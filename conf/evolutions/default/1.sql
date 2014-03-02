# --- !Ups
create table recipe (
    id bigint identity
    , name varchar not null
);

create table recipe_ingredient (
    recipe_id bigint not null
    , name varchar not null
);
# --- !Downs
drop table recipe_ingredient;
drop table recipe;
