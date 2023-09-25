package com.aastha.drivingapp.controller;

import com.aastha.drivingapp.model.Alert;
import com.aastha.drivingapp.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    private AlertService alertService;

    @PostMapping("/createAlertEvent")
    private int createAlertEvent(@RequestBody Alert alert){
        alert.setTimestamp(new Date().toString());
        alertService.save(alert);
        return alert.getAlertId();
    }

    @GetMapping("/alert/{alertId}")
    private Alert getAlert(@PathVariable("alertId") int id){
        Alert response = null;
        response = alertService.getAlertById(id);
        return response;
    }
}
