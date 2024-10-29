# Padrões de Projeto em um Sistema de Pousada

Este documento visa descrever a aplicabilidade e a justificar o uso dos padrões de projeto **Singleton**, **Builder**, **Facade** e **Observer** neste sistema de pousada.

## 1. Padrão Singleton

**Singleton** é um padrão de projeto criacional que garante a existência de uma única instância de uma classe e fornece um ponto global de acesso a ela.

### Aplicabilidade

No contexto da pousada, o padrão Singleton foi aplicado na classe `Pousada` e `Notificacao` para garantir que:

- Apenas uma instância da pousada seja utilizada, representando a base de operações.
- A classe de notificações seja centralizada, permitindo que todos os funcionários observadores recebam atualizações da mesma instância.

### Justificativa

Este padrão evita a criação acidental de múltiplas instâncias da `Pousada`, centralizando as operações de reserva. Isso garante consistência nos dados e facilita o acesso ao estado atual da pousada.

#### Diagrama de Singleton

![Diagrama Singleton](https://refactoring.guru/images/patterns/diagrams/singleton/structure-pt-br.png?id=151e5e19974d89c1382c5a92899784c4)

## 2. Padrão Builder

**Builder** também é um padrão de projeto criacional que permite construir objetos complexos de maneira flexível e passo a passo.

### Aplicabilidade

Utilizamos o Builder para construir a classe `Reserva`, permitindo a criação de reservas com configurações diferentes (número de quarto, cliente, dias de estadia). Esse padrão facilita o processo de criação de objetos complexos que tem muitas opções de configuração.

### Justificativa

Esse padrão foi escolhido para que os objetos `Reserva` possam ser criados de forma legível e organizada, evitando múltiplos construtores com diferentes parâmetros e aumentando a clareza no código.

#### Diagrama de Builder

![Diagrama Builder](https://reactiveprogramming.io/_next/image?url=%2Fbooks%2Fpatterns%2Fimg%2Fpatterns-articles%2Fbuilder-diagram.png&w=1200&q=75)

## 3. Padrão Facade

O **Facade** é um padrão de projeto estrutural que tem uma interface simplificada para um conjunto de funcionalidades em um sistema complexo.

### Aplicabilidade

Implementamos o Facade na classe `PousadaFacade` pra reunir as operações principais de reserva e notificação dos funcionários. Ao invés de interagir diretamente com a `Pousada`, `Reserva`, `Funcionario` e `Notificacao`, a classe Facade oferece uma interface mais simples para registrar reservas e gerenciar as notificações.

### Justificativa

Este padrão simplifica o uso do sistema por fornecer uma interface organizada pra interações comuns, como por exemplo a criação de reservas e as notificações, reduzindo o acoplamento com classes específicas e melhorando a manutenibilidade.

#### Diagrama de Facade

![Diagrama Facade](http://www.labies.uff.br/padroesdr/assets/uploads/files/b18e4-pkg-facade-class-diagram.png)

## 4. Padrão Observer

O **Observer** é um padrão de projeto comportamental que permite que um objeto notifique automaticamente outros objetos quando o state dele muda.

### Aplicabilidade

O Observer foi usado pra que a classe `Notificacao` notifique automaticamente os funcionários cadastrados sobre novas reservas, permitindo que eles se mantenham atualizados sem que a pousada precise gerenciar essas atualizações manualmente.

### Justificativa

Esse padrão faz com que exista um baixo acoplamento entre as classes, uma vez que a pousada não precisa saber quem está recebendo as notificações. Esse design melhora a flexibilidade e a escalabilidade do sistema, permitindo a adição de novos funcionários observadores sem modificar a lógica interna.

#### Diagrama de Observer

![Diagrama Observer](https://arquivo.devmedia.com.br/artigos/Higor_Medeiros/PadraoObserver_Java/PadraoObserver_Java1.jpg)
