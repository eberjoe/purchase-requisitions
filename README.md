# Purchase Requests

Serviço web de inclusão e exclusão de requisições de compra.

## Requisitos técnicos

* [x] Deve ser escrito em Java com JDK mais recente: foi escolhido o JDK 11.0.5 por ser a última versão com suporte a longo prazo.

* [x] Servidor voltado ao Java: foi escolhido o Tomcat.

* [x] Banco de Dados: para armazenamento dos dados em JSON foi escolhido o MongoDB (considerar uso do MongoDB Atlas da Azure)

* [ ] JRE local ou na nuvem (considerar uso do Web Apps da Azure)

* [x] Framework Spring com Maven.

* [ ] API REST com JSON.

## Requisitos funcionais

* [ ] Formato JSON:

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

* [ ] Validações

* [ ] Armazenamento

* [ ] Retorno (OK, não OK)

* [ ] Mostrarna tela ADM todas as ordens de compra.

* [ ] Exclusão de registro com inserção de ID do registro excluído num XML.

* [ ] Documentar com UML ou outros diagramas.

* [ ] Ponto extra: capacidade de 5K requisições por minuto.