🍽️ Projeto Cardápio Digital (Spring Boot + React)
O Cardápio Digital é um projeto desenvolvido para demonstrar a criação de uma aplicação full-stack completa, integrando um Backend RESTful robusto em Spring Boot com um Frontend dinâmico em React.

O foco principal é o estudo da comunicação CORS e o uso do padrão DTO (Data Transfer Object) na criação e listagem de recursos.

📚 Funcionalidades Implementadas
O sistema permite a gestão básica dos itens de um cardápio:

Listagem de Itens: Recuperação e exibição de todos os pratos cadastrados via API.

Cadastro de Novos Itens: Criação de novos pratos através de um endpoint POST.

API REST Completa: Estrutura de endpoints utilizando o padrão RESTful.

Comunicação Cross-Origin: Configuração explícita de CORS para permitir a comunicação segura entre o servidor Spring (porta 8080) e o cliente React (porta típica 3000 ou 5173).

---

## 🛠 Tecnologias utilizadas

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white"/>
 <img src="https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB"/>
  <img src="https://img.shields.io/badge/Bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white"/>
  <img src="https://img.shields.io/badge/H2-Database-0F3D91?style=for-the-badge&logo=h2&logoColor=white"/>

</div>

---
Exportar para as Planilhas
🚀 Configuração e Execução
1. Backend (Spring Boot)
Configuração
O banco de dados H2 está configurado para rodar em memória. Isso significa que a cada reinício da aplicação, os dados são perdidos, garantindo um ambiente de desenvolvimento limpo.

Console do H2: Para visualização dos dados e tabelas, acesse: http://localhost:8080/h2-console

Como Executar
Navegue até o diretório raiz do projeto backend (/cardapio).

Inicie a aplicação utilizando o Maven:

Bash

./mvnw spring-boot:run
O servidor estará rodando em: http://localhost:8080

Endpoint	Método	Descrição
/food	GET	Retorna a lista de itens do cardápio.
/food	POST	Recebe dados e cadastra um novo item de comida.

Exportar para as Planilhas
2. Frontend (React)
O projeto React deve ser configurado para consumir a API exposta em http://localhost:8080/food.

Navegue até o diretório do seu projeto React.

Instale as dependências: npm install (ou yarn install).

Inicie o servidor de desenvolvimento: npm run dev (ou yarn dev).

💡 Pontos de Estudo e Discussão
Este projeto é uma excelente ferramenta para aprofundar os seguintes conceitos:

Mapeamento DTO: O FoodController utiliza FoodRequestDTO para receber dados e FoodResponseDTO para retornar dados, garantindo que o cliente só veja as informações necessárias.

Regras de Negócio no Controller: O uso de Food foodData = new Food(data); no POST demonstra a conversão do DTO de entrada para a entidade de persistência.

CORS Aberto: O uso de @CrossOrigin(origins = "*") no controller é intencional para fins de estudo, permitindo que o React em qualquer porta se comunique. Em produção, este valor deve ser restrito ao domínio do cliente.

👨‍💻 Autor
Diego Leite

Contato: dev.diegocba@gmail.com

Licença: Este projeto é destinado a fins de estudo e aprendizado. Sinta-se à vontade para explorar e modificar.
