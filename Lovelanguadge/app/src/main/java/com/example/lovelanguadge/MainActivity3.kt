package com.example.lovelanguadge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity3 : AppCompatActivity() {
    lateinit var btn9: Button
    lateinit var textView: TextView
    lateinit var btn10: Button
    var count=0
    val a= listOf<String>("Русский — официальный язык ООН — наряду с английским, арабским, испанским, китайским и французским."
        ,"Считается, что в русском языке есть только одно слово без корня — вынуть. Конечно, и там когда-то был корень, но со временем 'потерялся'"
        ,"Единственные слова в русском языке с тремя буквами Е подряд — это длинношеее (и прочие на —шеее: например, криво-, коротко-)."
        ,"На русском языке говорят 289 миллионов человек по всему миру, в том числе 146 миллионов в России, и он является 8-м наиболее распространенным языком в мире. Это официальный язык России, Белоруссии, Казахстана, Кыргызстана и Таджикистана, а также признанный региональный язык в Грузии, Молдове и Украине."
        ,"Многие слова, которые начинаются на «А», пришли из других языков: альянс, абрикос, абонемент. Но исконно русскими считаются «авось» и «азбука»."
        ,"Есть действия, которые в русском языке невозможно выполнить в одиночестве, а именно: победить и убедить. Только вместе мы красиво побеждаем и убеждаем. Человек не может сказать про себя по-русски: «Я побежду» или «Я убедю»."
        ,"Слова «бык» и «пчела» , однокоренные, как бы ни было странно. Это идет еще из древнерусской литературы. Там слово «пчела» писалось как «бъчела».")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btn9 = findViewById(R.id.button9)
        btn10 = findViewById(R.id.button10)
        textView = findViewById(R.id.textView6)
        btn9.setOnClickListener{
            textView.text=a[count]
            count++}
        btn10.setOnClickListener{
            textView.text=a[count]
            count--}
    }
}
