🍽️ Projeto Cardápio Digital (Spring Boot + React)
Este projeto demonstra a construção de um Cardápio Digital utilizando Spring Boot para o Backend RESTful e React para o Frontend. O objetivo é fornecer um ambiente de estudo completo sobre a comunicação entre aplicações full-stack.

🚀 Tecnologias Utilizadas
Backend (Spring Boot)
Java 17+

Spring Boot 3+

Spring Web MVC (Para a criação de APIs REST)

Spring Data JPA (Para persistência de dados)

Banco de Dados H2 (Em memória, ideal para desenvolvimento)

Lombok (Para simplificar a escrita de classes Java)

Frontend (React)
React (com Vite/CRA)

TypeScript/JavaScript

Axios ou Fetch API (Para requisições HTTP)

Vite (Geralmente mais rápido que o CRA para desenvolvimento)

🛠️ Configuração e Execução
1. Backend (Spring Boot)
O backend é responsável por gerenciar os dados do cardápio e expor a API.

Configuração de Banco de Dados
Conforme configurado em application.properties, o projeto utiliza o H2 Database em memória.

URL: jdbc:h2:mem:cardapio-db

Console Web: O console do H2 está acessível em http://localhost:8080/h2-console (use as credenciais configuradas para acessar).

Como Executar
Certifique-se de ter o Java Development Kit (JDK) 17 ou superior instalado.

Navegue até o diretório raiz do projeto backend (/cardapio).

Execute a aplicação Spring Boot via Maven ou IDE:

Bash

# Execução via Maven Wrapper
./mvnw spring-boot:run
O servidor estará rodando em: http://localhost:8080

Endpoint	Método	Descrição
/food	GET	Lista todos os itens do cardápio.
/food	POST	Cadastra um novo item no cardápio.

Exportar para as Planilhas
2. Frontend (React)
O frontend é um projeto React que consome a API do Spring Boot.

Estrutura da Requisição
Os componentes React farão requisições para o backend, por exemplo, para listar os itens:

JavaScript

// Exemplo de requisição no React
import axios from 'axios';

async function fetchFood() {
  const response = await axios.get('http://localhost:8080/food');
  return response.data;
}
Como Executar
Certifique-se de ter o Node.js e o npm ou yarn instalados.

Navegue até o diretório do seu projeto frontend (ex: /cardapio-frontend).

Instale as dependências:

Bash

npm install
# ou
yarn install
Inicie o servidor de desenvolvimento do React:

Bash

npm run dev
# ou
yarn dev
O frontend geralmente rodará em http://localhost:5173 ou http://localhost:3000.

🔒 Estudo de Caso: CORS
O seu FoodController possui a anotação @CrossOrigin(origins = "*", allowedHeaders = "*"), que é fundamental para a comunicação entre o frontend React (rodando em uma porta, ex: 3000) e o backend Spring Boot (rodando em outra porta, ex: 8080).

O que é CORS?
CORS (Cross-Origin Resource Sharing) é um mecanismo que permite que recursos restritos em uma página da web sejam solicitados a partir de outro domínio fora do domínio que serviu o primeiro recurso.

@CrossOrigin(origins = "*"): Permite requisições de qualquer origem (domínio/porta).

allowedHeaders = "*": Permite todos os cabeçalhos HTTP nas requisições.

⚠️ Observação de Estudo: Em ambientes de produção, é altamente recomendável substituir "*" pelo domínio específico do seu frontend (ex: http://seu-dominio-frontend.com).

📚 Tópicos Chave para Estudo
Este projeto é uma ótima base para estudar:

DTO Pattern (Data Transfer Object): Implementado no seu código (FoodRequestDTO e FoodResponseDTO), garante a separação entre a camada de persistência (Food) e a camada de API.

Requisições Assíncronas: Como o React lida com GET (listagem) e POST (cadastro) usando useEffect e State Management.

Mapeamento de Entidades: Como o Spring Data JPA mapeia classes Java para tabelas no banco de dados.

Injeção de Dependência: O uso de @Autowired para gerenciar as instâncias do FoodRepository.

Ciclo de Vida do H2: Como os dados são criados e destruídos a cada reinício da aplicação em um banco de dados em memória.
