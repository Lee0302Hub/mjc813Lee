package com.spacrud.band_jpa.band.vo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "BandEntity")
@Table(name = "band_tbl")
public class BandEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 35)
    ///@Size(min = 6, max = 10)
    private String name;
    @Column(unique = true, nullable = false, length = 35)
    private String leader;

    private String guitarFirst;
    private String guitarSecond;
    private String drum;
    private String bass;
    private String keyboard;
    private String vocal;
}
