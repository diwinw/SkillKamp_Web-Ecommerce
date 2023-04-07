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
('p001', 'เสื้อสีเขียว', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 100, 50, 'c001', 'http://localhost:8844/api/images/Product1.png', 'admin', 'admin'),
('p002', 'เสื้อสีชมพู', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 150, 25, 'c001', 'http://localhost:8844/api/images/Product2.png', 'admin', 'admin'),
('p003', 'เสื้อสีขาวลายน้ำเงิน', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 200, 10, 'c001', 'http://localhost:8844/api/images/Product3.png', 'admin', 'admin'),
('p004', 'เสื้อสีแดง', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 300, 5, 'c001', 'http://localhost:8844/api/images/Product4.png', 'admin', 'admin'),
('p005', 'เสื้อลายตาราง', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 50, 100, 'c001', 'http://localhost:8844/api/images/Product5.png', 'admin', 'admin'),
('p006', 'เสื้อลายมินิมอล', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing.It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 50, 100, 'c001', 'http://localhost:8844/api/images/Product6.png', 'admin', 'admin'),
('p007', 'ขุดบอดี้สูทขาว', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 50, 100, 'c002', 'http://localhost:8844/api/images/Product7.png', 'admin', 'admin'),
('p008', 'ขุดบอดี้สูทจุดแดง', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 50, 100, 'c002', 'http://localhost:8844/api/images/Product8.png', 'admin', 'admin'),
('p009', 'ขุดบอดี้สูท', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 50, 100, 'c002', 'http://localhost:8844/api/images/Product9.png', 'admin', 'admin'),
('p010', 'ขุดบอดี้สูท2', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 50, 100, 'c002', 'http://localhost:8844/api/images/Product10.png', 'admin', 'admin'),
('p011', 'ขุดบอดี้สูทดำ', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 50, 100, 'c002', 'http://localhost:8844/api/images/Product11.png', 'admin', 'admin'),
('p012', 'ขุดบอดี้สูท3', 'This t-shirt is made with high-quality fabric that is soft, comfortable, and breathable. It features a classic fit with a round neck and short sleeves, making it perfect for everyday wear. The t-shirt has a stylish design with vibrant colors that wont fade after washing. It is available in a range of sizes and colors to suit your style. Whether youre dressing up or down, this t-shirt is a versatile addition to your wardrobe that youll love to wear again and again.', 50, 100, 'c002', 'http://localhost:8844/api/images/Product12.png', 'admin', 'admin');
