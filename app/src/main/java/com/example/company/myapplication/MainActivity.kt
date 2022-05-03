/*
* Загрузите, распакуйте и импортируйте проект Android-приложения по ссылке.

Напишите программу, которая проверяет введенное в editText (id editText) число, простое ли оно.
* Ответ должен отображаться в textView(id textView) при нажатии кнопки (id checkBtn).
* В случае, когда число простое "prime", если число не простое, то  "not prime".
* В случае ошибки textView должен отображать "error"

Для того, чтобы выполнить проверку запустите espresso-тесты.
* Если вы выполнили задание верно, то все тесты пройдут успешно.
* После того, как это произойдет найдете в Logcat строку c tag == CHECKER.
* Скопируйте всю строку целиком (включая метку времени) в поле ниже.
*
* Основные мелочи которые можно упустить:
1) Пустая строка это ошибка (отображать error)
2) Число 1 это не простое число (отображать not prime)
3) Отрицательные числа это не ошибка, это числа не являющиеся простыми (отображать not prime)
*
* var k = 2
    while (k * k <= x && x % k != 0) k ++
    return x > 1 && k * k > x
* add.setOnClickListener(::add)
* */

package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun isPrime (x: Int?): Boolean {
        var k = 2
        while (k * k <= x!! && x % k != 0) k++
        return x > 1 && k * k > x
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBtn.setOnClickListener {
            val num = editText.text.toString().toIntOrNull()

            if (num == null) {
                textView.text = "error"
            }
            else if (isPrime(num)) {
                textView.text = "prime"
            }
            else if (!isPrime(num)) {
                textView.text = "not prime"
            }

        }

    }
}
