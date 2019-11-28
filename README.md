# Purchase Requests

Serviço web de inclusão e exclusão de requisições de compra.

## Requisitos técnicos

### 1. Java com JDK mais recente
Foi escolhido o JDK 11.0.5, por ser a última versão com suporte a longo prazo.

### 2. Servidor voltado ao Java
Foi escolhido o Apache Tomcat, pela sua integração amigável com o *framework* Spring.

### 3. Banco de dados
Para o armazenamento dos dados em documentos JSON foi escolhido o NoSQL MongoDB, na nuvem Azure, no seu *tier* gratuito.

### 4. JRE local ou na nuvem
Atualmente está rodando localmente, mas pode-se considerar uso do recurso Web Apps da Azure para esta aplicação.

### 5. Framework
Foi escolhido o uso do Maven como gerenciador das dependências, associado ao *framework* Spring, por ser aquele utilizado no projeto Sourcing.

### 6. API REST com JSON
A gestão do serviço é facilitada pelo *framework* Spring.

## Requisitos funcionais

### 1. Formato JSON:
A coleção de documentos JSON contém os dados predeterminados e segue o seguinte padrão:

```json
{
	"id": String,
	"numero": long,
	"quantidade": long,
	"valor": double,
	"item": String
}
```

### 2. Validações
As validações são gerenciadas pelo padrão REST oferecido pelo Spring.

### 3. Armazenamento
O armazenamento dos dados e as operações *CRUD* se dão através do *driver* para MongoDB oferecido pelo Spring.

### 4. Retorno (OK, não OK)
O retorno para o *client* segue o padrão REST oferecido pelo Spring.

### 5. Mostrar na tela ADM todas as ordens de compra.
Foi implementada uma *view* num arquivo ```jsp``` com o uso de JSTL e *Expression Language (EL)* para a listagem dos dados.

### 6. Exclusão de registro com inserção do registro excluído no sistema como arquivo XML

### 7. Documentar com UML ou outros diagramas

### 8 Ponto extra: capacidade de 5K requisições por minuto
