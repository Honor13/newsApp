package com.example.newsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.newsapp.R
import com.example.newsapp.data.viewpageritems.HomeScreenViewPagerItems
import com.example.newsapp.databinding.FragmentHomePageBinding
import com.example.newsapp.ui.adapter.HomeScreenViewPagerAdapter

class HomePageFragment : Fragment() {
    private lateinit var binding:FragmentHomePageBinding
    private lateinit var viewPagerAdapter: HomeScreenViewPagerAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_home_page, container, false)
        setViewPagersItems()
        setupIndicators()
        setCurrentIndicator(0)
        return binding.root
    }


    fun setViewPagersItems(){
        viewPagerAdapter = HomeScreenViewPagerAdapter(listOf(
            HomeScreenViewPagerItems(
                viewPageImage = "https://s.yimg.com/ny/api/res/1.2/rr2uCHkNnpizYD5xsx5alA--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD04MDA-/https://s.yimg.com/os/creatr-uploaded-images/2023-11/8f905dc0-7f48-11ee-bf3b-a1d7773a597c",
                title = "Lorem İpsum Dolor",
                description = "Lorem Ipsum is simply dummy text of the printing."
            ),
            HomeScreenViewPagerItems(
                viewPageImage = "https://a57.foxnews.com/static.foxbusiness.com/foxbusiness.com/content/uploads/2023/11/0/0/GettyImages-1258553989.jpg?ve=1&tl=1",
                title = "Lorem İpsum Dolor",
                description = "Lorem Ipsum is simply dummy text of the printing."
            ),

        ))

        binding.newsViewPager.adapter = viewPagerAdapter
        binding.newsViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })

    }

    private fun setCurrentIndicator(position : Int) {
        val childCount = binding.indicatorsContainer.childCount
        for (i in 0 until childCount){
            val imageView = binding.indicatorsContainer.getChildAt(i) as ImageView
            if (i == position) {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.indicator_active_background
                    )
                )
            }else {
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.indicator_inactive_background
                    )
                )
            }
        }
    }

    private fun setupIndicators() {
        val indicators = arrayOfNulls<ImageView>(viewPagerAdapter.itemCount)
        val layoutParams : LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(8,0,8,0)
        for (i in indicators.indices){
            indicators[i] = ImageView(requireContext())
            indicators[i]?.let {
                it.setImageDrawable(
                    ContextCompat.getDrawable(
                        requireContext(),
                        R.drawable.indicator_inactive_background
                    )
                )
                it.layoutParams = layoutParams
                binding.indicatorsContainer.addView(it)
            }
        }

    }
}
