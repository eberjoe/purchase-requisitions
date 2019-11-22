# Purchase Requests

Serviço web de inclusão e exclusão de requisições de compra.

## Requisitos técnicos

* [x] Deve ser escrito em Java com JDK mais recente: foi escolhido o JDK 11.0.5 por ser a última versão com suporte a longo prazo.

* [x] Servidor voltado ao Java: foi escolhido o Tomcat.

* [x] Banco de Dados: para armazenamento dos dados em JSON foi escolhido o MongoDB.

* [o] JRE local ou na nuvem.

* [x] Framework Spring com Maven.

* [o] API REST com JSON.

## Requisitos funcionais

* [o] Formato JSON:

```json
[
    {
        "id": long,
        "numero": long,
        "quantidade": long,
        "valor": double,
        "item": String
    }
]
```

* [o] Validações

* [o] Armazenamento

* [o] Retorno (OK, não OK)

* [o] Mostrarna tela ADM todas as ordens de compra.

* [o] Exclusão de registro com inserção de ID do registro excluído num XML.

* [o] Documentar com UML ou outros diagramas.

* [o] Ponto extra: capacidade de 5K requisições por minuto.