# Sistema de Triagem de Pronto-Socorro

Este é um sistema simples de triagem de pacientes para pronto-socorro, desenvolvido em **Java 17**, utilizando **Spring Boot**, com arquitetura baseada em camadas (Controller, Service, Repository e Model).

## Como executar

1. Certifique-se de ter o **Java 17+** e **Maven** instalados.
2. No terminal, navegue até a pasta do projeto e execute:

```bash
./mvnw spring-boot:run
```

3. A API será inicializada em `http://localhost:8080`.

## Endpoints principais

- `GET /pacientes` – Lista todos os pacientes
- `POST /pacientes` – Cadastra um novo paciente
- `GET /health` – Verificação de status da aplicação

## Organização

- `controller/` – Endpoints da API
- `service/` – Regras de negócio
- `repository/` – Integração com o banco
- `model/` – Entidades
