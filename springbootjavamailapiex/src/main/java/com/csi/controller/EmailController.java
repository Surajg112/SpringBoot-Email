package com.csi.controller;

import com.csi.model.EmailModel;
import com.csi.service.EmailServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@RequestMapping("/api")
@Slf4j
public class EmailController {

    @Autowired
    EmailServiceImpl emailServiceImpl;

    @PostMapping("/sendemail")
    public ResponseEntity<String> sendEmail(@RequestBody EmailModel emailModel) throws MessagingException {
        log.info("######Sending mail TO: " + emailModel.getToEmailId());
        emailServiceImpl.sendEmail(emailModel);
        return ResponseEntity.ok("Email Sent Successfully");
    }
}
