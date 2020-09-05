package com.sem4.Model.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "seats")
public class SeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "seat_no")
    private int seat_no;
    @Column(name="room_id")
    private int room_id;
    @Column(name="row_s")
    private String row_s;
    @Column(name="status")
    private int status;
}
