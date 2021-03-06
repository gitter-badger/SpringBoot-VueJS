package io.github.jeemv.springboot.vuejs.serializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import io.github.jeemv.springboot.vuejs.parts.VueComputed;

public class ComputedSerializer extends StdSerializer<VueComputed> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ComputedSerializer() {
		this(null);
	}
	
	protected ComputedSerializer(Class<VueComputed> t) {
		super(t);
	}

	@Override
	public void serialize(VueComputed value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeRawValue(value+"");
	}


}
