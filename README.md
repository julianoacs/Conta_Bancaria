## Conta Bancaria
 
Este é um simples programa de simulação de conta bancária em Java. O programa permite ao usuário consultar o saldo, transferir valores e receber valores em uma conta bancária fictícia.

Funcionalidades:  
O programa apresenta as seguintes funcionalidades:

1. Consultar Saldo: Permite ao usuário visualizar o saldo atual da conta.
2. Transferir Valor: Permite ao usuário transferir um valor da conta, subtraindo o valor especificado do saldo atual.
3. Receber Valor: Permite ao usuário adicionar um valor à conta, somando o valor especificado ao saldo atual.
4. Sair: Encerra o programa

---
### Como Usar

1. Clone o repositório:
~~~java
git clone https://github.com/seu-usuario/ContaBancaria.git
cd ContaBancaria
~~~

2. Compile o código:
~~~java
javac ContaBancaria.java
~~~

3. Execute o programa:
~~~java
java ContaBancaria
~~~

4. Siga as instruções no console:  
Digite o número correspondente à ação que deseja realizar.  
Para transferir ou receber valores, digite o valor desejado quando solicitado.

---

### Estrutura do Código  
O código principal está contido na classe ContaBancaria. A seguir está um breve resumo das principais partes do código:  

* Declaração de variáveis: As variáveis nome, tipoConta, saldo e opcao são declaradas e inicializadas.
* Exibição dos dados da conta: As informações da conta são exibidas no início do programa.
* Menu de opções: Um menu de opções é exibido ao usuário em um loop while.
* Manipulação do saldo: Dependendo da escolha do usuário, o saldo é consultado, atualizado ou uma mensagem de erro é exibida.

### Requisitos
Java Development Kit (JDK) 8 ou superior

### Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.
