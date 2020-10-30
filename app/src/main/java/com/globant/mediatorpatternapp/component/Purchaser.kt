package com.globant.mediatorpatternapp.component

import android.widget.TextView
import com.globant.mediatorpatternapp.mediator.HouseMediator

//Component
class Purchaser(houseMediator: HouseMediator) : Person(houseMediator) {
    override fun send(message: String?, textview: TextView) {
        textview.text = textview.text.toString() + "\n\n"+"Purchaser release information:$message"
        println("Purchaser release information:$message")
        houseMediator.notice(this, message, textview)
    }

    override fun getNotice(message: String?, textview: TextView) {
        textview.text = textview.text.toString() + "\n\n" + "The purchaser receives a message:$message"
        println("The buyer receives a message:$message")
    }
}