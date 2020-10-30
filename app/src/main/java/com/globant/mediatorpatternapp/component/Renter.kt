package com.globant.mediatorpatternapp.component

import android.widget.TextView
import com.globant.mediatorpatternapp.component.Person
import com.globant.mediatorpatternapp.mediator.HouseMediator

class Renter(houseMediator: HouseMediator): Person(houseMediator) {
    override fun send(message: String?, textview: TextView) {
        textview.text = textview.text.toString() + "\n\n" + "Renters releases information:$message"
        println("Renters releases information:$message")
        houseMediator.notice(this, message, textview)
    }

    override fun getNotice(message: String?, textview: TextView) {
        textview.text = textview.text.toString() + "\n\n" + "Renters received a message:$message"
        println("Renters received a message:$message")
    }
}