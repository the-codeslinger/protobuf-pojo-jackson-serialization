package com.thecodeslinger.ppjs.web.dto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;

import java.io.IOException;

/**
 * Custom Jackson serialize for Protobuf messages. This class is not specifically
 * tailored towards {@link com.thecodeslinger.ppjs.proto.AwesomePowerUpOuterClass.AwesomePowerUp}
 * but instead works with all Protobuf {@link Message} instances.
 */
public class ProtobufSerializer extends JsonSerializer<Message> {

    private final JsonFormat.Printer protobufJsonPrinter = JsonFormat.printer();

    @Override
    public void serialize(Message anyProtobufMessage, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        // The magic sauce: use the Protobuf JSON converter to write a raw JSON
        // string of the Protobuf message instance.
        jsonGenerator.writeRawValue(protobufJsonPrinter.print(anyProtobufMessage));
    }
}
