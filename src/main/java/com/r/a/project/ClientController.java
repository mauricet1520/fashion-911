package com.r.a.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by crci1 on 3/17/2017.
 */

@RestController
public class ClientController {

    @Autowired
    ClientRepository clients;

    @RequestMapping(path = "/add_client.json", method = RequestMethod.POST)
    public Client addClient(@RequestBody Client client) {

        client = new Client(client.getFirstName(), client.getLastName(), client.getAddress(), client.getEmail(), client.getPhoneNumber(),
                client.getHeight(), client.getSize(), client.getBodyType(), client.getEventType(), client.getColorsLiked(), client.getColorsDisliked(),
                client.getZipCode(), client.getCity(), client.getState(),java.sql.Timestamp.valueOf(LocalDateTime.of(2017, Month.from(Month.APRIL), 28, 1, 5)), client.getImage());

        clients.save(client);
        return client;
    }
}
