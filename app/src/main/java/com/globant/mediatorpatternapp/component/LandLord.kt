package com.globant.mediatorpatternapp.component

import android.widget.TextView
import com.globant.mediatorpatternapp.mediator.HouseMediator

//Component

class Landlord(houseMediator: HouseMediator) : Person(houseMediator) {
    override fun send(message: String?, textview: TextView) {
        textview.text = textview.text.toString() + "\n\n" + "Landlords releases information:$message"
        println("The landlord releases information:$message")
        houseMediator.notice(this, message, textview)
    }

    override fun getNotice(message: String?, textview: TextView) {
        textview.text = textview.text.toString() + "\n\n" + "Landlords received a message:$message"
        println("The landlord received a message:$message")
    }
}