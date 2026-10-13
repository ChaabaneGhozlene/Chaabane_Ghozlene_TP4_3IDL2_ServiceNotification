package com.example.demo.controlleur;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.NotificationDTO;
import com.example.demo.entites.Notification;
import com.example.demo.services.NotificationService;

import jakarta.annotation.PostConstruct;
@RequestMapping("/notify")
public class NotificationControlleur {
    
private final NotificationService notificationService = null;
@GetMapping("/test")
public String test() {
    return "Controller OK!";
}

@PostConstruct
public void init() {
    System.out.println(">>> NotificationController LOADED <<<");
}
    // Endpoint POST pour tester depuis Postman
    @PostMapping("/send")
    public ResponseEntity<String> sendNotification(@RequestBody NotificationDTO request) {
        return ResponseEntity.ok("Notification envoyée !");
    }
    // Endpoint GET pour récupérer toutes les notifications
    @GetMapping("/logs")
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

}
