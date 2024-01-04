package com.health.app.modules.cart.`data`.model

import com.health.app.R
import com.health.app.appcomponents.di.MyApp
import kotlin.String

data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTopDoctor: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentDetail: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConsultation: String? = MyApp.getInstance().resources.getString(R.string.lbl_consultation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdminFee: String? = MyApp.getInstance().resources.getString(R.string.lbl_admin_fee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice1: String? = MyApp.getInstance().resources.getString(R.string.lbl_01_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAditionalDiscount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_aditional_discount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWidget: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice2: String? = MyApp.getInstance().resources.getString(R.string.lbl_61_00)
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
  var txtVISA: String? = MyApp.getInstance().resources.getString(R.string.lbl_visa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal1: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice3: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_98)

)
