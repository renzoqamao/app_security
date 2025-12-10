insert into customers (email, pwd) VALUES
  ('account@custom.com', 'to_be_encoded'),
  ('cards@custom.com', 'to_be_encoded'),
  ('loans@custom.com', 'to_be_encoded'),
  ('balance@custom.com', 'to_be_encoded');

insert into roles(role_name, description, id_customer) VALUES
  ('ROLE_ACCOUNT', 'can view account endpoint', 1),
  ('ROLE_CARDS', 'can view cards endpoint', 2),
  ('ROLE_LOANS', 'can view loans endpoint', 3),
  ('ROLE_BALANCE', 'can view balance endpoint', 4);
