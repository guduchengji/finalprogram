package com.xlx.entity;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Whitelist {
    @Id
    private Long id;

    private String phone;

    private Date createTime;

    private Date lastTime;

    private String location;
}