-- Inserções para CIDADE
INSERT INTO cidade ( nome, estado, pais) VALUES ( 'São Paulo', 'SP', 'Brasil');
INSERT INTO cidade ( nome, estado, pais) VALUES ( 'Rio de Janeiro', 'RJ', 'Brasil');
INSERT INTO cidade ( nome, estado, pais) VALUES ( 'Belo Horizonte', 'MG', 'Brasil');
INSERT INTO cidade ( nome, estado, pais) VALUES ( 'Curitiba', 'PR', 'Brasil');
INSERT INTO cidade ( nome, estado, pais) VALUES ( 'Porto Alegre', 'RS', 'Brasil');
INSERT INTO cidade ( nome, estado, pais) VALUES ('Salvador', 'BA', 'Brasil');
INSERT INTO cidade ( nome, estado, pais) VALUES ( 'Fortaleza', 'CE', 'Brasil');
INSERT INTO cidade ( nome, estado, pais) VALUES ( 'Brasília', 'DF', 'Brasil');
INSERT INTO cidade ( nome, estado, pais) VALUES ( 'Manaus', 'AM', 'Brasil');
INSERT INTO cidade ( nome, estado, pais) VALUES ( 'Recife', 'PE', 'Brasil');

-- Inserções para ENDEREÇO
INSERT INTO endereco ( cep, logradouro, bairro, numero, complemento, cidade_id) VALUES ( '01001-000', 'Av. Paulista', 'Bela Vista', 1000, 'Apto 101', 1);
INSERT INTO endereco ( cep, logradouro, bairro, numero, complemento, cidade_id) VALUES ( '20031-170', 'Rua da Assembleia', 'Centro', 200, 'Sala 502', 2);
INSERT INTO endereco ( cep, logradouro, bairro, numero, complemento, cidade_id) VALUES ( '30140-002', 'Av. Afonso Pena', 'Centro', 300, 'Bloco B', 3);
INSERT INTO endereco ( cep, logradouro, bairro, numero, complemento, cidade_id) VALUES ( '80010-000', 'Rua XV de Novembro', 'Centro', 400, NULL, 4);
INSERT INTO endereco ( cep, logradouro, bairro, numero, complemento, cidade_id) VALUES ( '90010-320', 'Av. Borges de Medeiros', 'Centro Histórico', 500, 'Cobertura', 5);
INSERT INTO endereco ( cep, logradouro, bairro, numero, complemento, cidade_id) VALUES ('40020-000', 'Av. Sete de Setembro', 'Vitória', 600, NULL, 6);
INSERT INTO endereco ( cep, logradouro, bairro, numero, complemento, cidade_id) VALUES ( '60025-000', 'Av. Dom Manuel', 'Centro', 700, 'Ap 302', 7);
INSERT INTO endereco ( cep, logradouro, bairro, numero, complemento, cidade_id) VALUES ( '70040-010', 'Esplanada dos Ministérios', 'Zona Cívico-Administrativa', 800, NULL, 8);
INSERT INTO endereco ( cep, logradouro, bairro, numero, complemento, cidade_id) VALUES ( '69005-070', 'Av. Eduardo Ribeiro', 'Centro', 900, 'Loja 10', 9);
INSERT INTO endereco ( cep, logradouro, bairro, numero, complemento, cidade_id) VALUES ( '50030-230', 'Rua do Bom Jesus', 'Recife Antigo', 100, 'Casa 1', 10);

-- Inserções para PESSOA
INSERT INTO pessoa ( nome, sobrenome, email, sexo, endereco_id) VALUES ( 'Ana', 'Silva', 'ana.silva@email.com', 'F', 1);
INSERT INTO pessoa ( nome, sobrenome, email, sexo, endereco_id) VALUES ( 'Bruno', 'Souza', 'bruno.souza@email.com', 'M', 2);
INSERT INTO pessoa ( nome, sobrenome, email, sexo, endereco_id) VALUES ( 'Carla', 'Ferreira', 'carla.ferreira@email.com', 'F', 3);
INSERT INTO pessoa ( nome, sobrenome, email, sexo, endereco_id) VALUES ( 'Daniel', 'Lima', 'daniel.lima@email.com', 'M', 4);
INSERT INTO pessoa ( nome, sobrenome, email, sexo, endereco_id) VALUES ( 'Eduarda', 'Costa', 'eduarda.costa@email.com', 'F', 5);
INSERT INTO pessoa ( nome, sobrenome, email, sexo, endereco_id) VALUES ('Felipe', 'Moura', 'felipe.moura@email.com', 'M', 6);
INSERT INTO pessoa ( nome, sobrenome, email, sexo, endereco_id) VALUES ( 'Gabriela', 'Rocha', 'gabriela.rocha@email.com', 'F', 7);
INSERT INTO pessoa ( nome, sobrenome, email, sexo, endereco_id) VALUES ( 'Henrique', 'Pires', 'henrique.pires@email.com', 'M', 8);
INSERT INTO pessoa ( nome, sobrenome, email, sexo, endereco_id) VALUES ( 'Isabela', 'Martins', 'isabela.martins@email.com', 'F', 9);
INSERT INTO pessoa ( nome, sobrenome, email, sexo, endereco_id) VALUES ( 'João', 'Almeida', 'joao.almeida@email.com', 'M', 10);