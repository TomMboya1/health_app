package com.health.app.modules.settigns.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.health.app.R
import com.health.app.appcomponents.base.BaseActivity
import com.health.app.databinding.ActivitySettignsBinding
import com.health.app.modules.settigns.`data`.model.SettignsRowModel
import com.health.app.modules.settigns.`data`.viewmodel.SettignsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SettignsActivity : BaseActivity<ActivitySettignsBinding>(R.layout.activity_settigns) {
  private val viewModel: SettignsVM by viewModels<SettignsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val settignsAdapter = SettignsAdapter(viewModel.settignsList.value?:mutableListOf())
    binding.recyclerSettigns.adapter = settignsAdapter
    settignsAdapter.setOnItemClickListener(
    object : SettignsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SettignsRowModel) {
        onClickRecyclerSettigns(view, position, item)
      }
    }
    )
    viewModel.settignsList.observe(this) {
      settignsAdapter.updateData(it)
    }
    binding.settignsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSettigns(
    view: View,
    position: Int,
    item: SettignsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SETTIGNS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettignsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
