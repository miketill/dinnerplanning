# --- !Ups
create table recipe (
    id bigint auto_increment
    , name varchar
);

create table recipe_ingredient (
    recipe_id bigint
    , name varchar
);
# --- !Downs
drop table recipe_ingredient;
drop table recipe;
