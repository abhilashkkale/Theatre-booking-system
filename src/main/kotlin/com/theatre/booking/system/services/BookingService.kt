package com.theatre.booking.system.services

import com.theatre.booking.system.domain.Seat
import org.springframework.stereotype.Service

@Service
class BookingService() {

    fun isSeatFree(seat: Seat): Boolean {
        return true
    }

}