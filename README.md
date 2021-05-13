# Projeto Java de Relatório com Quarkus/Swagger (Singleton e CDI)

Atividade solicitada pelo professor: Manoel Campos (https://github.com/manoelcampos) para a disciplina de Padrões de Projeto.



## Alterações solicitadas pelo professor:

- Altere o código de tal método para *this.config = newConfig;* 
- Crie uma nova classe de recurso chamada *RelatorioResource* como uma cópia da *ConfigResource,* alterando a anotação *@Path* para para *@Path("/relatorio")*

Tal classe simula a geração de um relatório que precisará acessar nosso Singleton *Config* também. Agora temos dois serviços REST disponíveis: /config e  /relatorio. Acesse os métodos nos dois e informe qual o problema  ocorrido com a alteração do código do *updateConfig*.

### Problema ocorrido:

Cada método updateConfig() das classes ConfigResource.java e RelatorioResource.java recebe uma instância diferente do objeto config e não uma única instância como propõe o Design Pattern Singleton.

Resultado: GET http://localhost:8080/config

{"formatoRelatorios":"png","tiposGraficos":"pizza"}



Resultado: GET http://localhost:8080/relatorio

{"formatoRelatorios":"jpg","tiposGraficos":"linhas"}



# singleton-cdi project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/singleton-cdi-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.html.

## Provided examples

### RESTEasy JAX-RS example

REST is easy peasy with this Hello World RESTEasy resource.

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)