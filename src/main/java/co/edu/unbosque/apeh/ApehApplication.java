package co.edu.unbosque.apeh;

import co.edu.unbosque.apeh.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class ApehApplication {
           @Autowired
           private MailService service;
               
	public static void main(String[] args) {
        SpringApplication.run(ApehApplication.class, args);
	}
            
            @EventListener(ApplicationReadyEvent.class)
            public void triggerMail(){
            service.sendEmail("lecastron@unbosque.edu.co", "Saludos, estoy enviando el correo desde el spring boot\nYá los arhivos están en una branch llamada mail", "Envio de correo");
        }
}
