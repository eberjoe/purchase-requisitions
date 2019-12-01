package com.neogrid.prequisition.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "deletedInXml")
@JacksonXmlRootElement
public class Deleted {
	
	@Id
	private String id;
	private Long numero;
	private Long quantidade;
	private Double valor;
	private String item;
		
}