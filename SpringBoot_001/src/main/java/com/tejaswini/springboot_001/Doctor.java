package com.tejaswini.springboot_001;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Doctor {
    private int doctorId;
    private String doctorName;
    private String specialization;
}
