# 🐾 TP3 – DDD, CQRS e Event Sourcing com Axon Framework

Projeto desenvolvido para o **TP3 da disciplina de Arquitetura de Software Escalável e DDD**, aplicando os conceitos de **DDD**, **CQRS** e **Event Sourcing** utilizando **Axon Framework** no contexto do domínio **Pet Friends**, trabalhando a entidade **Pedido**.

---

## 📘 Swagger – Testar as APIs

Acesse o Swagger UI em:

👉 **http://localhost:8080/swagger-ui/index.html**

### **Endpoints**

#### 🔹 Commands
`POST /api/pedidos` – Cria um novo Pedido

**Payload exemplo:**
```json
{
  "clienteId": "cliente-001"
}

---

```md
## 🗄️ H2 Console (Event Store + Read Model)

Acesse o console do banco em:

👉 **http://localhost:8080/h2-console**

### 🔧 Configurações do H2

JDBC URL: jdbc:h2:mem:tp3ddd  
User: SA  
Password: (vazio)
