# Purchase Requests

Serviço web de inclusão e exclusão de requisições de compra.

## Requisitos técnicos

[x] Deve ser escrito em Java com JDK mais recente: foi escolhido o JDK 11.0.5 por ser a última versão com suporte a longo prazo.

[x] Servidor voltado ao Java: foi escolhido o Tomcat.

[x] Banco de Dados: para armazenamento dos dados em JSON foi escolhido o MongoDB.

[_] JRE local ou na nuvem.

[x] Framework Spring com Maven.

[_] API REST com JSON.

## Requisitos funcionais

[_] Formato JSON:

```json
[
    {
        "id": long,
        "numero": long,
        "quantidade": long,
        "valor": double,
        "item": String
    }
]```

[_] Validações

[_] Armazenamento

[_] Retorno (OK, não OK)

[_] Mostrarna tela ADM todas as ordens de compra.

[_] Exclusão de registro com inserção de ID do registro excluído num XML.

[_] Documentar com UML ou outros diagramas.

[_] Ponto extra: capacidade de 5K requisições por minuto.