package org.demo.parcialmagneto.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Dna extends Base implements Serializable {
    @Column(length = 300000)
    private String dna;

    private boolean isMutant;
}
