package com.example.paypalwebsocketstest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class controler {

    @PostMapping("/receive")
    public ResponseEntity<String> receiveWebhook(@RequestBody String payload) {

        System.out.println("Webhook Recieved\n\n");

        System.out.println(payload);

        System.out.println("\nDONE\n");

        return ResponseEntity.ok("Webhook received successfully");
    }
}
