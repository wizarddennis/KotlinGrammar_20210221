package kr.co.tjoeun.kotlingrammar_20210221

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

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

        // Int, Double, String, Boolean 자료형 자동 대입 예제
        val num3 = 30 // num3는 30이 Int니까 자동으로 Int로 설정.
        val num4 = 3.14 // num4는 3.14가 Double 이므로 알아서 Double 로 설정
        val teacherName = "조경진" // String 자동 할당
        val isMale = true // Boolean 자동 할당
        
        // 변수에 담긴 강사 이름 로그로 출력
        Log.d("강사이름:", teacherName)
        

    }
}