package com.example.newsapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapp.data.entity.News

class HomePageViewModel : ViewModel() {

    var newsLists = MutableLiveData<List<News>>()

    init {


    }



    fun loadNews() {
        val list = ArrayList<News>()

        val n1 = News(
            "",
            "Haber Başlığı 1",
            "Lorem Ipsum Dolor. It request none url not responding",
            "https://s.yimg.com/ny/api/res/1.2/rr2uCHkNnpizYD5xsx5alA--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD04MDA-/https://s.yimg.com/os/creatr-uploaded-images/2023-11/8f905dc0-7f48-11ee-bf3b-a1d7773a597c",
            "",
            "en",
            "en"
        )
        val n2 = News(
            "",
            "Haber Başlığı 2",
            "Lorem Ipsum Dolor. It request none url not responding",
            "https://a57.foxnews.com/static.foxbusiness.com/foxbusiness.com/content/uploads/2023/11/0/0/GettyImages-1258553989.jpg?ve=1&tl=1",
            "",
            "en",
            "en"
        )
        val n3 = News(
            "",
            "Haber Başlığı 3",
            "Lorem Ipsum Dolor. It request none url not responding",
            "https://www.marketscreener.com/images/reuters/2019-02/2019-02-04T141305Z_1_LYNXNPEF1314N_RTROPTP_3_TESLA-LAYOFFSS.JPG",
            "",
            "en",
            "en"
        )
        val n4 = News(
            "",
            "Haber Başlığı 4",
            "Lorem Ipsum Dolor. It request none url not responding",
            " https://www.wsj.com/business/telecom/digital-discrimination-in-the-crosshairs-of-new-fcc-rule-1e0bfb59",
            "",
            "en",
            "en"
        )

        list.add(n1)
        list.add(n2)
        list.add(n3)
        list.add(n4)
        newsLists.value = list

    }
}