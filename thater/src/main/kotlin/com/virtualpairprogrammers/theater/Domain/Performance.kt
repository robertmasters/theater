package com.virtualpairprogrammers.theater.Domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Performance(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long,
    val title : String) {
    override fun toString() = "Title $title"
}