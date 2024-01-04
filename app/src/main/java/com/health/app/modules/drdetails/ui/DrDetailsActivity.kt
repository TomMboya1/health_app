package com.health.app.modules.drdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.health.app.R
import com.health.app.appcomponents.base.BaseActivity
import com.health.app.databinding.ActivityDrDetailsBinding
import com.health.app.modules.bookanappointment.ui.BookAnAppointmentActivity
import com.health.app.modules.chat.ui.ChatActivity
import com.health.app.modules.drdetails.`data`.model.DatesRowModel
import com.health.app.modules.drdetails.`data`.viewmodel.DrDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DrDetailsActivity : BaseActivity<ActivityDrDetailsBinding>(R.layout.activity_dr_details) {
  private val viewModel: DrDetailsVM by viewModels<DrDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val datesAdapter = DatesAdapter(viewModel.datesList.value?:mutableListOf())
    binding.recyclerDates.adapter = datesAdapter
    datesAdapter.setOnItemClickListener(
    object : DatesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DatesRowModel) {
        onClickRecyclerDates(view, position, item)
      }
    }
    )
    viewModel.datesList.observe(this) {
      datesAdapter.updateData(it)
    }
    binding.drDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBookAppointment.setOnClickListener {
      val destIntent = BookAnAppointmentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
    binding.btnCar.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDates(
    view: View,
    position: Int,
    item: DatesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DR_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DrDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
