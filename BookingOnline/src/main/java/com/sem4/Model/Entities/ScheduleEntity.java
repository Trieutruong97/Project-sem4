package com.sem4.Model.Entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "schedule")
public class ScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "movie_id")
    private int movie_id;
    @Column(name = "room_id")
    private int room_id;
    @Column(name = "schedule_date")
    private Date schedule_date;
    @Column(name = "schedule_start")
    private Time schedule_start;
    @Column(name = "schedule_end")
    private Time schedule_end;


}
