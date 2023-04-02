CREATE TABLE product (
    id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price INTEGER NOT NULL,
    stock INTEGER NOT NULL,
    category_id VARCHAR(30),
    image TEXT,
    created_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_by VARCHAR(50),
    updated_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_by VARCHAR(50)
);

INSERT INTO ecommerce.product (id, name, description, price, stock, category_id, image, created_by, updated_by) VALUES
('p001', 'Product 1', 'This is the description for Product 1', 100, 50, 'c001', 'http://localhost:8844/api/images/Product1.png', 'admin', 'admin'),
('p002', 'Product 2', 'This is the description for Product 2', 150, 25, 'c002', 'http://localhost:8844/api/images/Product2.png', 'admin', 'admin'),
('p003', 'Product 3', 'This is the description for Product 3', 200, 10, 'c003', 'http://localhost:8844/api/images/Product3.png', 'admin', 'admin'),
('p004', 'Product 4', 'This is the description for Product 4', 300, 5, 'c002', 'http://localhost:8844/api/images/Product4.png', 'admin', 'admin'),
('p005', 'Product 5', 'This is the description for Product 5', 50, 100, 'c001', 'http://localhost:8844/api/images/Product5.png', 'admin', 'admin');
