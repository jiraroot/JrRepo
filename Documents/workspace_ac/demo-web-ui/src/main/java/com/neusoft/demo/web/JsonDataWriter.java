package com.neusoft.demo.web;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonDataWriter {
	public void writeOne(Map<String, Object> object, Writer writer) throws IOException {

		if (object == null) {
			throw new IllegalArgumentException("Parameter 'object' cannot be null.");
		}
		if (writer == null) {
			throw new IllegalArgumentException("Parameter 'writer' cannot be null.");
		}

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(writer, object);	
	}

}
