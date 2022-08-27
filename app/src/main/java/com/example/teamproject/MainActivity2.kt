package com.example.teamproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teamproject.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    // 번호에 이름 붙이기 (열거형)
    enum class ScreenItem {
        MISSION1,
        TEAM1,
        EARTH1,
        MYPAGE1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 추가!
        setContentView(binding.root) // (변경!)

        // 하단 탭의 버튼을 눌렀을 때
        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.tab1 -> {
                    onFragmentChanged(ScreenItem.MISSION1)
                }
                R.id.tab2 -> {
                    onFragmentChanged(ScreenItem.TEAM1)
                }
                R.id.tab3 -> {
                    onFragmentChanged(ScreenItem.EARTH1)
                }
                R.id.tab4 -> {
                    onFragmentChanged(ScreenItem.MYPAGE1)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
            // 화면이 보일 때 첫 부분화면을 보여주세요
            onFragmentChanged(ScreenItem.MISSION1)
        }
        fun onFragmentChanged(index:ScreenItem) {
            when (index) {
                ScreenItem.MISSION1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, missionFragment()).commit()
                }
                ScreenItem.TEAM1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, teamFragment()).commit()
                }
                ScreenItem.EARTH1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, earthFragment()).commit()
                }
                ScreenItem.MYPAGE1 -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, mypageFragment()).commit()
                }
            }
        }

}