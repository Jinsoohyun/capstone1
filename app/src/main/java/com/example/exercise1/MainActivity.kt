package com.example.exercise1

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercise1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var Question1: Int= 0
        binding.radioGroup1.setOnCheckedChangeListener{ _, checkedId->
            when(checkedId) {
                R.id.Answer1 -> {
                    Question1 = 1
                }
                R.id.Answer2 -> {
                    Question1 = 0
                }
            }
        }
        var Question2: Int= 0
        binding.radioGroup2.setOnCheckedChangeListener{ _, checkedId->
            when(checkedId) {
                R.id.Answer3 -> {
                    Question2 = 1
                }
                R.id.Answer4 -> {
                    Question2 = 0
                }
            }
        }
        var Question3: Int= 0
        binding.radioGroup3.setOnCheckedChangeListener{ _, checkedId->
            when(checkedId) {
                R.id.Answer5 -> {
                    Question3 = 1
                }
                R.id.Answer6 -> {
                    Question3 = 0
                }
            }
        }
        var ExTitle1: String ="가슴운동을 추천드립니다."
        var ExTitle2: String ="가슴운동이 필요하지 않습니다."
    binding.result1.setOnClickListener {
    AlertDialog.Builder(this@MainActivity).setTitle("설문조사 결과")
        .setMessage(
            if(Question1+Question2+Question3>=2){
                "${ExTitle1}"
            }
            else{
               "${ExTitle2}"
            }
        )
        .show()
    }
    }
}