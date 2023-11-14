package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class SoftDeletableEntity {

    @Column(name = "deleted", nullable = false)
    private boolean deleted;
    
}
