package com.virtualpairprogrammers.theater.data

import com.virtualpairprogrammers.theater.Domain.Seat
import org.springframework.data.jpa.repository.JpaRepository

interface SeatRepository : JpaRepository<Seat, Long>