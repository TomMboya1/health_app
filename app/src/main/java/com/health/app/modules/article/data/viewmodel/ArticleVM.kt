package com.health.app.modules.article.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.health.app.modules.article.`data`.model.ArticleModel
import com.health.app.modules.article.`data`.model.NinetyfourRowModel
import com.health.app.modules.article.`data`.model.TrendingsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ArticleVM : ViewModel(), KoinComponent {
  val articleModel: MutableLiveData<ArticleModel> = MutableLiveData(ArticleModel())

  var navArguments: Bundle? = null

  val trendingsList: MutableLiveData<MutableList<TrendingsRowModel>> =
      MutableLiveData(mutableListOf())

  val ninetyFourList: MutableLiveData<MutableList<NinetyfourRowModel>> =
      MutableLiveData(mutableListOf())
}
