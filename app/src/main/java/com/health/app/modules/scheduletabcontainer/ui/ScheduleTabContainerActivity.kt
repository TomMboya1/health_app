package com.health.app.modules.scheduletabcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.health.app.R
import com.health.app.appcomponents.base.BaseActivity
import com.health.app.databinding.ActivityScheduleTabContainerBinding
import com.health.app.modules.scheduletabcontainer.`data`.viewmodel.ScheduleTabContainerVM
import kotlin.String
import kotlin.Unit

class ScheduleTabContainerActivity :
    BaseActivity<ActivityScheduleTabContainerBinding>(R.layout.activity_schedule_tab_container) {
  private val viewModel: ScheduleTabContainerVM by viewModels<ScheduleTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scheduleTabContainerVM = viewModel
    val adapter = ScheduleTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabBarView.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerTabBarView) { tab, position ->
      tab.text = ScheduleTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SCHEDULE_TAB_CONTAINER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ScheduleTabContainerActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
