package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel {

    private String toEmailId;

    private String ccEmailId;

    private String emailSubject;

    private String emailBody;

    private String emailAttachment;


}
