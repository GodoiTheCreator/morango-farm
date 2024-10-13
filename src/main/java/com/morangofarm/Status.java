package com.morangofarm;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Status {

    @Id
    @SequenceGenerator(
            name = "status_id_sequence",
            sequenceName = "status_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "status_id_sequence"
    )

    private Integer id;
    private String date;
    private boolean moisture;
    private boolean sunLight;
    private boolean waterWasActivated;




}
