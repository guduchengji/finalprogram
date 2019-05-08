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
public class Message {
    @Id
    private Integer id;

    private Long phone;

    private String location;

    private String province;

    private String city;

    private Date createTime;

    private Date lastTime;

}