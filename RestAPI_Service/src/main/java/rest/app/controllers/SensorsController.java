package rest.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.app.models.Sensor;
import rest.app.services.SensorService;

@RestController
@RequestMapping("/sensors")
public class SensorsController {

    private final SensorService sensorService;

    @Autowired
    public SensorsController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @PostMapping("/registration")
    public ResponseEntity<HttpStatus> registration(@RequestBody Sensor sensor) {
        sensorService.register(sensor);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
