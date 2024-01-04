package com.health.app.modules.message.`data`.model

import com.health.app.R
import com.health.app.appcomponents.di.MyApp
import kotlin.String

data class MessageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrMarcusHorizon: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_marcus_horizon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_24)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDonTHaveAny: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_don_t_have_any2)

)
