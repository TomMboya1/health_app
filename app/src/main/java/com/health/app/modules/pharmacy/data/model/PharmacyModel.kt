package com.health.app.modules.pharmacy.`data`.model

import com.health.app.R
import com.health.app.appcomponents.di.MyApp
import kotlin.String

data class PharmacyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTopDoctor: String? = MyApp.getInstance().resources.getString(R.string.lbl_pharmacy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEarlyProtection: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_quickly_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_popular_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductOnSale: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_product_on_sale)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll1: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
