package com.globant.mediatorpatternapp.component

import android.widget.TextView
import com.globant.mediatorpatternapp.component.Person
import com.globant.mediatorpatternapp.mediator.HouseMediator

class Seller(houseMediator: HouseMediator): Person(houseMediator) {
    override fun send(message: String?, textview: TextView) {
        textview.text = textview.text.toString() + "\n\n" + "Sellers releases information:$message"
        println("Sellers releases information:$message")
        houseMediator.notice(this, message, textview)
    }

    override fun getNotice(message: String?, textview: TextView) {
        textview.text = textview.text.toString() + "\n\n" + "Sellers received a message:$message"
        println("Sellers received a message:$message")
    }
}