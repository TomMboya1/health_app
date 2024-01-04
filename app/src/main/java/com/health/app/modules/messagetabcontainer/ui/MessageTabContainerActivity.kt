package com.health.app.modules.messagetabcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.health.app.R
import com.health.app.appcomponents.base.BaseActivity
import com.health.app.databinding.ActivityMessageTabContainerBinding
import com.health.app.modules.messagetabcontainer.`data`.viewmodel.MessageTabContainerVM
import kotlin.String
import kotlin.Unit

class MessageTabContainerActivity :
    BaseActivity<ActivityMessageTabContainerBinding>(R.layout.activity_message_tab_container) {
  private val viewModel: MessageTabContainerVM by viewModels<MessageTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.messageTabContainerVM = viewModel
    val adapter = MessageTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabBarView.adapter = adapter
    TabLayoutMediator(binding.tabLayoutTabview,binding.viewPagerTabBarView) { tab, position ->
      tab.text = MessageTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "MESSAGE_TAB_CONTAINER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, MessageTabContainerActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
