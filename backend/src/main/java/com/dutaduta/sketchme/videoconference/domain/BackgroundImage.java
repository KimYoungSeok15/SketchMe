package com.dutaduta.sketchme.videoconference.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "backgroundimage")
@Builder
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BackgroundImage {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 1024)
    private String name;
    @Column(name = "url", length = 1024)
    private String url;
}

