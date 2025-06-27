-- Sample cho brand
INSERT INTO brand (id, name) VALUES
                                 (1, 'Dell'),
                                 (2, 'HP'),
                                 (3, 'ASUS'),
                                 (4, 'Lenovo'),
                                 (5, 'MSI'),
                                 (6, 'Acer');

-- Sample cho laptop (khớp brand_id)
INSERT INTO laptop (name, cpu, ram, price, brand_id) VALUES
                                                         ('Acer Aspire 5 A515-58GM', 'Intel Core i5-13420H', '16GB', 16990000, 6),
                                                         ('Dell Inspiron 15 3530', 'Intel Core i5-1335U', '8GB', 14890000, 1),
                                                         ('HP Pavilion 15 eg2082TU', 'Intel Core i7-1255U', '16GB', 20990000, 2);