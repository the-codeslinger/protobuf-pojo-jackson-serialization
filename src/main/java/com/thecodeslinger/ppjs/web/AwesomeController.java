package com.thecodeslinger.ppjs.web;

import com.thecodeslinger.ppjs.proto.AwesomePowerUpOuterClass;
import com.thecodeslinger.ppjs.web.dto.AwesomeDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple controller to demonstrate that a regular Java POJO can be returned and
 * automatically converted to JSON although it contains a Protobuf Java class
 * field.
 */
@RestController
public class AwesomeController {

    @GetMapping(value = "/awesome", produces = MediaType.APPLICATION_JSON_VALUE)
    public AwesomeDto getAwesome() {
        return new AwesomeDto(
                "Everything is AWESOME, when you're part of a team <sing>",
                AwesomePowerUpOuterClass.AwesomePowerUp.newBuilder()
                        .setName("Extra Armor")
                        .setLevel(100)
                        .build());
    }
}
