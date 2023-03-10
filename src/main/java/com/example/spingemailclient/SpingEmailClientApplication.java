package com.example.spingemailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpingEmailClientApplication {

    @Autowired
    private EmailSenderService service;

    public static void main(String[] args) {
        SpringApplication.run(SpingEmailClientApplication.class, args);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void triggerMail() throws MessagingException, jakarta.mail.MessagingException {
        /* service.sendSimpleEmail("felipe.fariasfcf@outlook.com", "This is the Email Body....", "This is the Email Subject");*/

        service.sendEmailWithAttachment("aldo.santos.oliveira95@gmail.com",
                "This is Email Body with Attachment...","FELIZ  NATAL E UM PRÓSPERO ANO NOVO!!!","C:\\Imagens\\image.png");

    }



}
