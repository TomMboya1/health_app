package com.health.app.modules.bookanappointment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.health.app.R
import com.health.app.appcomponents.base.BaseActivity
import com.health.app.databinding.ActivityBookAnAppointmentBinding
import com.health.app.modules.bookanappointment.`data`.viewmodel.BookAnAppointmentVM
import kotlin.String
import kotlin.Unit

class BookAnAppointmentActivity :
    BaseActivity<ActivityBookAnAppointmentBinding>(R.layout.activity_book_an_appointment) {
  private val viewModel: BookAnAppointmentVM by viewModels<BookAnAppointmentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookAnAppointmentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowLeft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BOOK_AN_APPOINTMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BookAnAppointmentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
