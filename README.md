# Projeto de Consulta de CEP

Este projeto é uma aplicação Java que permite consultar endereços a partir de um CEP (Código de Endereçamento Postal) utilizando a API ViaCEP. A aplicação também salva o endereço consultado em um arquivo JSON.

## Estrutura do Projeto

- `src/Endereco.java`: Define a classe `Endereco` como um record para armazenar os dados do endereço.
- `src/geradorDeArquivo.java`: Contém a classe `geradorDeArquivo` responsável por salvar o endereço em um arquivo JSON.
- `src/consultaCep.java`: Contém a classe `consultaCep` que faz a consulta do endereço utilizando a API ViaCEP.
- `src/Main.java`: Classe principal que executa a aplicação.

## Dependências

- [Gson](https://github.com/google/gson): Biblioteca para serialização e desserialização de objetos Java para JSON.

## Uso

1. Ao executar a aplicação, você será solicitado a digitar um CEP.
2. A aplicação consultará o endereço correspondente ao CEP informado.
3. O endereço será exibido no console e salvo em um arquivo JSON nomeado com o CEP.

## Exemplo de Uso

```sh
Digite o CEP que deseja consultar:
01001-000
Endereco[logradouro=Praça da Sé, complemento=lado ímpar, bairro=Sé, localidade=São Paulo, uf=SP, cep=01001-000, unidade=]
