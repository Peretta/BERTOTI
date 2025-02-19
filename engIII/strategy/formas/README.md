# Padrões de Projeto: Strategy e Herança

Este repositório contém dois diagramas UML que ilustram a diferença entre o uso do **Padrão Strategy** e **Herança** na modelagem de formas geométricas.

## 📌 Padrão Herança

No primeiro diagrama, utilizamos o conceito de **Herança**. A classe `Forma` é a classe base, enquanto `Retangulo` e `Circulo` herdam dela. Esse modelo segue a abordagem tradicional de reutilização de código por meio da herança.

### 📷 Diagrama de Herança:
![Diagrama de Herança](Diagrama%20Herança.png)

#### 🔹 Características:
- **Herança direta**: `Retangulo` e `Circulo` estendem `Forma`.
- **Acoplamento maior**: A estrutura é rígida, dificultando a introdução de novas formas sem modificar a superclasse.
- **Código reutilizável**: Métodos e atributos comuns podem ser compartilhados pela classe base.

## 📌 Padrão Strategy

No segundo diagrama, utilizamos o **Padrão Strategy** para desacoplar o cálculo da área das formas. A interface `CalculadoraDeForma` define um contrato que permite diferentes implementações para `Retangulo` e `Circulo`. A classe `Forma` pode usar qualquer implementação dessa interface, tornando o sistema mais flexível e extensível.

### 📷 Diagrama de Strategy:
![Diagrama Strategy](Diagrama%20Strategy.png)

#### 🔹 Características:
- **Desacoplamento**: `Forma` não depende diretamente das classes concretas, apenas da interface `CalculadoraDeForma`.
- **Flexibilidade**: Novas formas podem ser adicionadas sem modificar a classe base.
- **Facilidade de manutenção**: A lógica de cálculo da área pode ser alterada independentemente das classes que usam a interface.

## 🎯 Conclusão

- O **Padrão Herança** é útil quando há uma hierarquia clara e as subclasses compartilham muitos comportamentos comuns.
- O **Padrão Strategy** permite maior flexibilidade e modularidade, reduzindo o acoplamento e facilitando a expansão do sistema sem modificar as classes existentes.

Se o objetivo for criar um sistema mais extensível e desacoplado, o **Strategy** é a melhor escolha. No entanto, a **Herança** pode ser útil para modelagens simples e onde a hierarquia é bem definida.

---

✍️ Desenvolvido para estudo de padrões de projeto.
