package kr.co.tjoeun.kotlingrammar_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 변수로 => 정수를 담을 공간. JAVA : int num1;
        var num1 : Int

        num1 = 10
        num1 = 20

        //상수로 => 정수를 담을 공간
        val num2 : Int
        num2 = 10
        //num2 = 20. 한번 대입하고 나면 변경 불가

    }
}