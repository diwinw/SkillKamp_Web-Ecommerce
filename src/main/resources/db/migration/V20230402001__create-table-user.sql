CREATE TABLE ecommerce.user (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(255),
  last_name VARCHAR(255) ,
  email VARCHAR(255) UNIQUE NOT NULL,
  password VARCHAR(255) NOT NULL,
  phone VARCHAR(20),
  address VARCHAR(255),
    created_date TIMESTAMP DEFAULT NOW(),
    updated_date TIMESTAMP DEFAULT NOW()
);


INSERT INTO ecommerce.user (first_name, last_name, email, password, phone, address)
VALUES ('John', 'Doe', 'test@example.com', 'test', '555-5555', '123 Main St');
