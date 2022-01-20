package com.virtualpairprogrammers.theater.domain

import javax.persistence.*

data class Booking(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long,
    val customerName: String) {
    @ManyToOne
    lateinit var seat : Seat
    @ManyToOne
    lateinit var performance: Performance
}