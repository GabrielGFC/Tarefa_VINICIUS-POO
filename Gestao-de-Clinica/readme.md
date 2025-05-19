### Sistema de Gestão de Clínica Multiespecialidades

## Como organizei meu projeto

Dividi meu projeto em algumas partes para tentar deixar menos bagunçado:

- **apresentacao:** onde fica o menu e as coisas que aparecem pro usuário
- **negocio:** onde coloquei as regras do sistema (tipo cadastrar, agendar, etc)
- **dados:** onde ficam as listas dos cadastros (em memória)
- **dominio:** aqui ficam as “classes” principais, tipo Paciente, Profissional, etc

## O que usei de Programação Orientada a Objetos (POO)

### 1. Classes e Objetos

Fiz uma classe pra cada coisa importante: Paciente, ProfissionalSaude, Administrador, Atendimento, etc.

Quando cadastro um paciente, por exemplo, crio um objeto dessa classe.

### 2. Encapsulamento

Coloquei os atributos como privados (tipo `private String nome;`) e só deixei mexer neles pelos métodos (get/set).

Assim ninguém de fora mexe direto, só por esses métodos.

### 3. Herança e Polimorfismo

Criei uma classe `Usuario` que é meio genérica, e aí Paciente, ProfissionalSaude e Administrador “herdam” dela.

Dá pra tratar todo mundo como Usuario se quiser, mas cada um tem coisa própria também.

### 4. Abstração

A `Usuario` é abstrata, então não pode criar um usuário direto, só filho dela.

Serve pra forçar a usar Paciente, Profissional, etc.

### 5. Separação em pacotes

Tentei separar tudo em pastas (pacotes) pra não virar aquela zona.

Acho que ficou mais fácil de achar as coisas.

### 6. Camadas

O menu só chama as funções do negócio, que só mexe com os dados.

Fica menos embolado, cada parte faz uma coisa só.

### 7. Padrão de Projeto

Usei o Singleton no repositório (classe Repositorio).

Assim só tem UMA lista central pras coisas, não fica criando várias sem querer.

```java
public class Repositorio {
    private static Repositorio instancia;
    // ...
    public static Repositorio getInstancia() {
        if (instancia == null) instancia = new Repositorio();
        return instancia;
    }
}

```

## Como funciona o controle de permissões

Separo o que cada tipo de usuário pode fazer, tipo só admin pode cadastrar profissional, paciente só agenda/cancela dele mesmo.

(Se precisar mais complicado, dá pra criar uns métodos pra checar antes de fazer as ações.)

## O que tá funcionando

- Cadastro de pacientes, profissionais e admin
- Agendar, cancelar, listar atendimentos
- Consultar histórico clínico
- Cada tipo de usuário faz só o que pode

## Conclusão

Consegui usar os conceitos de POO, organizar em camadas, usar Singleton e deixar o sistema pronto pra crescer se precisar.

Acho que ficou mais organizado do que eu costumo fazer, mas tá aí!

```bash
C:\Program Files\Java\jdk-17.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\lib\idea_rt.jar=52748:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\aluno05\IdeaProjects\Gestao-de-Clinica\out\production\Gestao-de-Clinica apresentacao.Main

===== MENU =====
1 - Cadastrar paciente
2 - Cadastrar profissional
3 - Agendar atendimento
4 - Listar atendimentos
5 - Sair
Escolha uma opção: 3
Cadastre pelo menos um paciente e um profissional.

===== MENU =====
1 - Cadastrar paciente
2 - Cadastrar profissional
3 - Agendar atendimento
4 - Listar atendimentos
5 - Sair
Escolha uma opção: 1
Nome do paciente: GABRIEL
Paciente cadastrado!

===== MENU =====
1 - Cadastrar paciente
2 - Cadastrar profissional
3 - Agendar atendimento
4 - Listar atendimentos
5 - Sair
Escolha uma opção: 2
Nome do profissional: ZEZINHO
Profissional cadastrado!

===== MENU =====
1 - Cadastrar paciente
2 - Cadastrar profissional
3 - Agendar atendimento
4 - Listar atendimentos
5 - Sair
Escolha uma opção: 3
Escolha o paciente:
1 - GABRIEL
1
Escolha o profissional:
1 - ZEZINHO
1
Data do atendimento (ex: 2025-05-20): 2025-05-20
Atendimento agendado!

===== MENU =====
1 - Cadastrar paciente
2 - Cadastrar profissional
3 - Agendar atendimento
4 - Listar atendimentos
5 - Sair
Escolha uma opção: 4
Atendimentos:
Paciente: GABRIEL | Profissional: ZEZINHO | Data: 2025-05-20

===== MENU =====
1 - Cadastrar paciente
2 - Cadastrar profissional
3 - Agendar atendimento
4 - Listar atendimentos
5 - Sair
Escolha uma opção: 
```
