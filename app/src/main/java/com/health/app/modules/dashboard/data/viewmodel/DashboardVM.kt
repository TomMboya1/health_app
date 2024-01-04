package com.health.app.modules.dashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.health.app.modules.dashboard.`data`.model.DashboardModel
import com.health.app.modules.dashboard.`data`.model.DoctorRowModel
import com.health.app.modules.dashboard.`data`.model.EighteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DashboardVM : ViewModel(), KoinComponent {
  val dashboardModel: MutableLiveData<DashboardModel> = MutableLiveData(DashboardModel())

  var navArguments: Bundle? = null

  val eighteenList: MutableLiveData<MutableList<EighteenRowModel>> =
      MutableLiveData(mutableListOf())

  val doctorList: MutableLiveData<MutableList<DoctorRowModel>> = MutableLiveData(mutableListOf())
}
