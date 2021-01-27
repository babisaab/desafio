# desafio

## Desafio: Automação Web

O desafio consiste em automatizar dois cenários para o site: http://automationpractice.com/index.php

- Cenário 1: Pesquisar por um produto e visualizar seus detalhes.

- Cenário 2: Pesquisar por produto e finalizar o fluxo de compra.

O projeto foi desenvolvido em Java + Selenium WebDriver + Cucumber, e possui a seguinte
estrutura:

- As Features com as especificações dos cenários estão na pasta: src\test\resources\features
- Webdrivers (Chrome, Firefox, Edge e Explorer) estão na pasta:  src\main\resources\webdrivers
- O Steps de ambos os cenários estão na pasta: src\test\java\br\com\mystore\steps
- DriverFactory e DSL com métodos do Selenium estão na pasta: src\main\java\br\com\mystore\core
- Page Objects se encontram na pasta: src\main\java\br\com\mystore\page