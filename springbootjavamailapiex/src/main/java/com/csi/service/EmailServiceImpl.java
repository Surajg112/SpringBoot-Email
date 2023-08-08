package com.csi.service;

import com.csi.dao.EmailDaoImpl;
import com.csi.model.EmailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class EmailServiceImpl {

    @Autowired
    EmailDaoImpl emailDaoImpl;

    public void sendEmail(EmailModel emailModel) throws MessagingException {
        emailDaoImpl.sendEmail(emailModel);
    }
}
