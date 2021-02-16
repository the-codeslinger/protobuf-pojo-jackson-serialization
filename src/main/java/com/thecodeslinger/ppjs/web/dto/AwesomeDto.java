package com.thecodeslinger.ppjs.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thecodeslinger.ppjs.proto.AwesomePowerUpOuterClass;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Demonstrates how to include a Protobuf class field and have it be converted
 * to JSON by Jackson. This does not work automatically because Protobuf classes
 * require the use of their own converter
 * {@link com.google.protobuf.util.JsonFormat.Printer}.
 */
@Data
@RequiredArgsConstructor
public class AwesomeDto {
    // Regular Java field that will be automatically picked up by Jackson.
    @JsonProperty
    private final String status;

    // Protobuf class that requires special treatment to be converted to JSON.
    @JsonSerialize(using = ProtobufSerializer.class)
    private final AwesomePowerUpOuterClass.AwesomePowerUp awesomePowerUp;
}
