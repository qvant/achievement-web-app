package com.example.achivementwebapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Entity
@Table(name = "consoles", schema = "achievements_hunt")
@Getter
public class Console {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "ext_id")
    private String extId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "platform_id", nullable = false)
    private Platform platform;

    public Console() {
    }

    ;
}
