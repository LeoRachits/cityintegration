# 🌍 CityIntegration API

## 🎯 Objetivo
O projeto **CityIntegration API** foi desenvolvido para a disciplina de Integração de Sistemas, com o objetivo de demonstrar como construir e documentar uma API REST em **Spring Boot**, integrando informações de cidades e aplicando boas práticas de desenvolvimento.

## ⚙️ Descrição funcional
- API REST baseada em **Spring Boot**
- Endpoints que retornam informações de status e cidades
- Tratamento de erros customizados
- Integração e testes via Postman/Insomnia

## 🏗 Arquitetura da API
A aplicação segue arquitetura em camadas:
- **Controller** → expõe os endpoints REST
- **Service** → lógica de negócio
- **Exception** → tratamento centralizado de erros

📌 O diagrama está disponível em [`/docs/arquitetura.png`](docs/arquitetura.png)

## 🚀 Como executar
No terminal (PowerShell), dentro da pasta do projeto:

```bash
mvn spring-boot:run
