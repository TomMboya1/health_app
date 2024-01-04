package com.health.app.modules.drdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.health.app.modules.drdetails.`data`.model.DatesRowModel
import com.health.app.modules.drdetails.`data`.model.DrDetailsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DrDetailsVM : ViewModel(), KoinComponent {
  val drDetailsModel: MutableLiveData<DrDetailsModel> = MutableLiveData(DrDetailsModel())

  var navArguments: Bundle? = null

  val datesList: MutableLiveData<MutableList<DatesRowModel>> = MutableLiveData(mutableListOf())
}
