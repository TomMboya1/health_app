package com.health.app.modules.schedule.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.health.app.R
import com.health.app.appcomponents.base.BaseFragment
import com.health.app.databinding.FragmentScheduleBinding
import com.health.app.modules.schedule.`data`.model.ScheduleRowModel
import com.health.app.modules.schedule.`data`.viewmodel.ScheduleVM
import com.health.app.modules.signup.ui.SignupActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScheduleFragment : BaseFragment<FragmentScheduleBinding>(R.layout.fragment_schedule) {
  private val viewModel: ScheduleVM by viewModels<ScheduleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val scheduleAdapter = ScheduleAdapter(viewModel.scheduleList.value?:mutableListOf())
    binding.recyclerSchedule.adapter = scheduleAdapter
    scheduleAdapter.setOnItemClickListener(
    object : ScheduleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ScheduleRowModel) {
        onClickRecyclerSchedule(view, position, item)
      }
    }
    )
    viewModel.scheduleList.observe(requireActivity()) {
      scheduleAdapter.updateData(it)
    }
    binding.scheduleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSchedule(
    view: View,
    position: Int,
    item: ScheduleRowModel
  ): Unit {
    when(view.id) {
      R.id.btnCancel ->  {
        onClickRecyclerScheduleBtnCancel(view, position, item)
      }
      R.id.btnReschedule ->  {
        onClickRecyclerScheduleBtnReschedule(view, position, item)
      }
    }
  }

  fun onClickRecyclerScheduleBtnCancel(
    view: View,
    position: Int,
    item: ScheduleRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = SignupActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
      1 ->  {
        val destIntent = SignupActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  fun onClickRecyclerScheduleBtnReschedule(
    view: View,
    position: Int,
    item: ScheduleRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = SignupActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
      1 ->  {
        val destIntent = SignupActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "SCHEDULE_FRAGMENT"

  }
}
