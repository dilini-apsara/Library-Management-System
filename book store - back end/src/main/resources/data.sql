CREATE TABLE Book (
                      reg_number VARCHAR(255) PRIMARY KEY,
                      book_name VARCHAR(255) NOT NULL,
                      author VARCHAR(255) NOT NULL,
                      copies INT NOT NULL
);

INSERT INTO Book (reg_number, book_name, author, copies) VALUES ('B001', 'Effective Java', 'Joshua Bloch', 15);
INSERT INTO Book (reg_number, book_name, author, copies) VALUES ('B002', 'Clean Code', 'Robert C. Martin', 20);
INSERT INTO Book (reg_number, book_name, author, copies) VALUES ('B003', 'The Pragmatic Programmer', 'Andrew Hunt', 25);
INSERT INTO Book (reg_number, book_name, author, copies) VALUES ('B004', 'Design Patterns', 'Erich Gamma', 10);
INSERT INTO Book (reg_number, book_name, author, copies) VALUES ('B005', 'Head First Java', 'Kathy Sierra', 30);
INSERT INTO Book (reg_number, book_name, author, copies) VALUES ('B006', 'Java Concurrency in Practice', 'Brian Goetz', 12);
INSERT INTO Book (reg_number, book_name, author, copies) VALUES ('B007', 'Refactoring', 'Martin Fowler', 18);
INSERT INTO Book (reg_number, book_name, author, copies) VALUES ('B008', 'Spring in Action', 'Craig Walls', 22);
INSERT INTO Book (reg_number, book_name, author, copies) VALUES ('B009', 'Test Driven Development', 'Kent Beck', 16);
INSERT INTO Book (reg_number, book_name, author, copies) VALUES ('B010', 'Microservices Patterns', 'Chris Richardson', 19);
