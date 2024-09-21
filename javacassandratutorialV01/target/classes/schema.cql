CREATE KEYSPACE IF NOT EXISTS my_keyspace WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};
CREATE TABLE IF NOT EXISTS my_keyspace.greetings (id UUID PRIMARY KEY, message text);

# Insert queries:
 > INSERT INTO my_keyspace.greetings (id, message) VALUES (uuid(), 'Hello, Cassandra!');
 > INSERT INTO my_keyspace.greetings (id, message) VALUES (uuid(), 'Greetings from Spring Boot!');