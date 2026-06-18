# Calculadora de Aposentadoria

Aplicativo Android desenvolvido em Kotlin para calcular quanto tempo falta para uma pessoa atingir a idade de aposentadoria, considerando sexo e idade informados pelo utilizador.

## Sobre o Projeto

Este projeto foi desenvolvido no Android Studio utilizando Kotlin e componentes do Material Design para criar uma interface simples e fácil de utilizar.

## Funcionalidades

* Seleção do sexo (Masculino ou Feminino);
* Introdução da idade do utilizador;
* Validação dos dados informados;
* Cálculo do tempo restante para aposentadoria;
* Apresentação do resultado na própria aplicação.

## Regras Utilizadas

| Sexo      | Idade de Aposentadoria |
| --------- | ---------------------- |
| Masculino | 65 anos                |
| Feminino  | 60 anos                |

## Tecnologias Utilizadas

* Kotlin
* Android Studio
* Android SDK
* Material Design Components
* ConstraintLayout

## Como Executar

### Requisitos

* Android Studio
* JDK 11 ou superior
* Android SDK 21 ou superior

### Passos

1. Clonar o repositório:

```bash
git clone https://github.com/seu-usuario/calculadora-aposentadoria.git
```

2. Abrir o projeto no Android Studio.

3. Sincronizar as dependências do Gradle.

4. Executar a aplicação em um emulador ou dispositivo Android.

## Estrutura do Projeto

```text
app/
├── src/main/java/
│   └── MainActivity.kt
├── src/main/res/
│   ├── layout/
│   ├── drawable/
│   └── values/
└── AndroidManifest.xml
```

## Validações

* O campo idade não pode ficar vazio;
* Apenas valores numéricos são aceites;
* Tratamento de entradas inválidas.

## Melhorias Futuras

* Histórico de cálculos;
* Tema escuro;
* Suporte para múltiplos idiomas;
* Compartilhamento de resultados;
* Novas regras de aposentadoria.

## Autor

Lucian Alfred

## Licença

Este projeto está disponível para fins académicos e de aprendizagem.
