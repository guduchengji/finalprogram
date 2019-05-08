package com.xlx.entity;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User {
    @Id
    private String id;

    private String name;

    private String password;
}