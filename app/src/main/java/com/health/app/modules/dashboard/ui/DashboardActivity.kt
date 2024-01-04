package com.health.app.modules.dashboard.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.health.app.R
import com.health.app.appcomponents.base.BaseActivity
import com.health.app.databinding.ActivityDashboardBinding
import com.health.app.modules.ambulance.ui.AmbulanceActivity
import com.health.app.modules.article.ui.ArticleActivity
import com.health.app.modules.dashboard.`data`.model.DoctorRowModel
import com.health.app.modules.dashboard.`data`.model.EighteenRowModel
import com.health.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.health.app.modules.drdetails.ui.DrDetailsActivity
import com.health.app.modules.drlist.ui.DrListActivity
import com.health.app.modules.messagetabcontainer.ui.MessageTabContainerActivity
import com.health.app.modules.pharmacy.ui.PharmacyActivity
import com.health.app.modules.scheduletabcontainer.ui.ScheduleTabContainerActivity
import com.health.app.modules.settigns.ui.SettignsActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard) {
  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val eighteenAdapter = EighteenAdapter(viewModel.eighteenList.value?:mutableListOf())
    binding.recyclerEighteen.adapter = eighteenAdapter
    eighteenAdapter.setOnItemClickListener(
    object : EighteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EighteenRowModel) {
        onClickRecyclerEighteen(view, position, item)
      }
    }
    )
    viewModel.eighteenList.observe(this) {
      eighteenAdapter.updateData(it)
    }
    val doctorAdapter = DoctorAdapter(viewModel.doctorList.value?:mutableListOf())
    binding.recyclerDoctor.adapter = doctorAdapter
    doctorAdapter.setOnItemClickListener(
    object : DoctorAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DoctorRowModel) {
        onClickRecyclerDoctor(view, position, item)
      }
    }
    )
    viewModel.doctorList.observe(this) {
      doctorAdapter.updateData(it)
    }
    binding.dashboardVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.linearHome.setOnClickListener {
      // TODO please, add your navigation code here
    }
    binding.linearProfile.setOnClickListener {
      val destIntent = SettignsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAppointment.setOnClickListener {
      val destIntent = ScheduleTabContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMessage.setOnClickListener {
      val destIntent = MessageTabContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSeeAll1.setOnClickListener {
      val destIntent = ArticleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSeeAll.setOnClickListener {
      val destIntent = DrListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerEighteen(
    view: View,
    position: Int,
    item: EighteenRowModel
  ): Unit {
    when(view.id) {
      R.id.btnUser ->  {
        onClickRecyclerEighteenBtnUser(view, position, item)
      }
    }
  }

  fun onClickRecyclerDoctor(
    view: View,
    position: Int,
    item: DoctorRowModel
  ): Unit {
    when(view.id) {
      R.id.linearDoctor ->  {
        val destIntent = DrDetailsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    fun onClickRecyclerEighteenBtnUser(
      view: View,
      position: Int,
      item: EighteenRowModel
    ) {
      /** TODO As per your logic, Add constant type for item click.*/
      when(0) {
        0 ->  {
          val destIntent = ArticleActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        1 ->  {
          val destIntent = PharmacyActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        2 ->  {
          val destIntent = AmbulanceActivity.getIntent(this, null)
          startActivity(destIntent)
        }
        3 ->  {
          val destIntent = DrListActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }
    }

    companion object {
      const val TAG: String = "DASHBOARD_ACTIVITY"

    }
  }
