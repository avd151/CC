DROP TABLE IF EXISTS owners;

CREATE TABLE owners (
    owner_id INT NOT NULL primary key,
    name VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS dogs;
  
CREATE TABLE dogs (
    dog_id INT NOT NULL,
    name VARCHAR(250) NOT NULL,
    age INT NOT NULL,
    owner_id INT NOT NULL,
    FOREIGN key
        (owner_id) REFERENCES owners (owner_id)
);

create view dogs_n_owners as
select d.dog_id as id, o.name as dog_owner, d.name as dog
from dogs as d inner join owners as o on d.owner_id = o.owner_id;


INSERT INTO owners (owner_id, name) VALUES (1, 'Selvyn');
INSERT INTO owners (owner_id, name) VALUES (2, 'Martina');

INSERT INTO dogs (dog_id, name, age, owner_id) VALUES (1, 'Einstein', 3, 1);
INSERT INTO dogs (dog_id, name, age, owner_id) VALUES (2, 'Kaya', 5, 2);
INSERT INTO dogs (dog_id, name, age, owner_id) VALUES (3, 'Lassie', 7, 2);