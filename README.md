Projeto criado na aula do Professor Leonardo (Desenvolvimento Mobile), projeto: Cadastro de usuario 

# 📱 Cadastro de Usuário Mobile

Projeto desenvolvido na disciplina de **Desenvolvimento Mobile**, com o professor **Leonardo**, com foco na construção de um aplicativo Android para cadastro e exibição de usuários utilizando boas práticas.

---

## 🧠 Descrição do Projeto

Este aplicativo permite ao usuário:

- Inserir **nome completo**
- Inserir **email**
- Salvar os dados informados
- Visualizar os usuários cadastrados em uma lista dinâmica

📌 Os dados são armazenados temporariamente em memória durante a execução do aplicativo.

---

## 🛠️ Tecnologias Utilizadas

- Java
- Android Studio
- XML (Layouts)
- Material Design Components
- RecyclerView

---

## 📂 Estrutura do Projeto

### 🔹 MainActivity

Responsável pela tela principal do app:

- Exibe a lista de usuários com **RecyclerView**
- Possui botão para navegar até a tela de cadastro
- Atualiza automaticamente a lista ao retornar (`onResume`)

---

### 🔹 CreateUser

Tela de cadastro de usuários:

- Captura os dados inseridos (nome e email)
- Realiza validação básica
- Adiciona o usuário à lista compartilhada (`listaNomes`)
- Retorna automaticamente para a tela principal

---

### 🔹 UserAdapter

Classe responsável pelo funcionamento da lista:

- Cria os itens da lista (`onCreateViewHolder`)
- Vincula os dados aos componentes (`onBindViewHolder`)
- Controla a quantidade de itens (`getItemCount`)
- Utiliza o padrão **ViewHolder** para melhor performance

---

## 📋 Funcionalidades

- ✅ Cadastro de usuários
- ✅ Validação básica de campos
- ✅ Exibição dinâmica com RecyclerView
- ✅ Atualização automática da lista
- ✅ Navegação entre telas (Intent)

---

## ⚙️ Funcionamento Interno

Os dados são armazenados em uma lista estática:

```java
public static List<String> listaNomes = new ArrayList<>();
```

Isso permite compartilhar dados entre as telas enquanto o app está em execução.

---
