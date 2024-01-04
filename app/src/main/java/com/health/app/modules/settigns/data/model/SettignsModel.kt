package com.health.app.modules.settigns.`data`.model

import com.health.app.R
import com.health.app.appcomponents.di.MyApp
import kotlin.String

data class SettignsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAmeliaRenata: String? = MyApp.getInstance().resources.getString(R.string.lbl_amelia_renata)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMySaved: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_saved)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppointment: String? = MyApp.getInstance().resources.getString(R.string.lbl_appointment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFAQs: String? = MyApp.getInstance().resources.getString(R.string.lbl_faqs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessages: String? = MyApp.getInstance().resources.getString(R.string.lbl_messages)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppointment1: String? = MyApp.getInstance().resources.getString(R.string.lbl_appointment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
