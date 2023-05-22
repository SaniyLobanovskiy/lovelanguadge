package com.example.lovelanguadge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var textView: TextView
    lateinit var next:ConstraintLayout
    var count=0
    var count1=0
    var zvzd=0
    lateinit var textView5: TextView
    val a= listOf<String>("молоко","арбуз","ерундопель","абандон","гайдроп","гипербатон","адинатон","аллювий","кулан","загути","агути","голый землекоп"
        ,"Киренаики","Центромера")
    val b= listOf<String>(" питательная жидкость, вырабатываемая молочными железами самок млекопитающих.","летательный апарат зеленого цвета","зверек семейства беличьих","отказ страхователя от прав на имущество","многолетнее вьющееся растение",
        "мутант,обладающий телом особо крупных размеров","сплав титана,железа и никеля. Один из самых прочных материалов на земле","элемент таблицы Менделеева, тяжелый металл","Копытное животное. Напоминает,как осла так и лошадь"
        ,"Музыкальный инструмент, напоминающий гусли","Грызуны, внешне напоминающие морских свинок"
        ,"Группа поражённых клеток поджелудочной железы"," Представители античной философской школы, последователи Аристиппа из Кирены."
        ,"Основная единица измерения в палеонтологии.")
    val c= listOf<String>("кислый фрукт, имеющий белую мякоть","большая ягода с зеленой мякотью и красной кожурой","закусочный салат из икры, рыбы и овощей","средство контрацепции барьерного типа","плащ из непромокаемой прорезининой ткани",
        "бог обжорства у древних персидских племен","вид гиперболы, когда что-то трудное или невозможное сопостовляется с какой-то абсолютно нереальной ситуацией"," несцементированные отложения постоянных водных потоков"
        ,"минерал из группы алюмосиликатов"," вид грызунов из подсемейства хутиевых семейства щетинистых крыс.","группа воинственных племен, проживающих в канадской провинции онтарио"
        ,"Символ революционного движения,участники которого — рабочие и крестьяне Моравии и Богемии","Форма короткого ироничного стихотворения, появившаяся в XVIII веке во Франции."
        ,"Красный карлик, относящийся к звёздной системе Кастор")
    val d= listOf<String>("вода покрашенная в белый цвет","вид цветковых растений семейства тыквенных","несерьезный человек","древнеримское название северного ветра","толстый длинный канат,используемый в авиации",
        "литературный прием, заключающийся в выделении темы высказывания путем перестановки в начало или конец фразы","бог любви у древних хеттов. Выглядел как свинья с женскими ногами","помощник адвоката, отвечающий за изучеение материалов дела"
        ,"Форма рельефа.По сути, холм, окруженный оврагами","малый жанр фольклора, популярный у народов крайнего севера","Головной убор, элемент военной формы индейцев"
        ,"Небольшой роющий грызун. Уникален тем,что практически не стареет","Одно из подсемейств попугаевых. Обитают в Новой Гвинее. Длина тела достигает 25 сантиметров."
        ,"Участок, в котором соединяются плечи хромосомы.")
    val e= listOf<String>(" питательная жидкость, вырабатываемая молочными железами самок млекопитающих.","вид цветковых растений семейства тыквенных","закусочный салат из икры, рыбы и овощей"
        ,"отказ страхователя от прав на имущество", "толстый длинный канат,используемый в авиации","литературный прием, заключающийся в выделении темы высказывания путем перестановки в начало или конец фразы",
        "вид гиперболы, когда что-то трудное или невозможное сопостовляется с какой-то абсолютно нереальной ситуацией"," несцементированные отложения постоянных водных потоков"
        ,"Копытное животное. Напоминает,как осла так и лошадь"," вид грызунов из подсемейства хутиевых семейства щетинистых крыс.","Грызуны, внешне напоминающие морских свинок"
        ,"Небольшой роющий грызун. Уникален тем,что практически не стареет"," Представители античной философской школы, последователи Аристиппа из Кирены."
        ,"Участок, в котором соединяются плечи хромосомы.")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_main2)
            btn4 = findViewById(R.id.button4)
            btn5 = findViewById(R.id.button5)
            btn6 = findViewById(R.id.button6)
            textView = findViewById(R.id.textView4)
            next = findViewById(R.id.next)
            textView5 = findViewById(R.id.textView5)
            textView.text = a[count]
            btn4.text = b[count]
            btn5.text = c[count]
            btn6.text = d[count]
             next.setOnClickListener(null)
            btn4.setOnClickListener {
                Correct(btn4,btn5,btn6)
            }
            btn5.setOnClickListener {
                Correct(btn5,btn4,btn6)
            }
            btn6.setOnClickListener {
                Correct(btn6,btn4,btn5)
            }

    }
    fun Count_Answer(){
        next.setOnClickListener(null)
        if(count != a.size-1)
        {
            count++
            textView.text=a[count]
            btn4.text=b[count]
            btn5.text=c[count]
            btn6.text=d[count]
        }
        else{
            startActivity(Intent(this,MainActivity5::class.java))
        }
    }
    fun Correct(btn:Button,btn_n1:Button,btn_n2: Button){
        next.setOnClickListener(null)
        if (btn.text == e[count]) {
            btn_n1.setBackgroundResource(R.drawable.obvodka2)
            btn_n2.setBackgroundResource(R.drawable.obvodka2)
            zvzd++
            textView5.text=zvzd.toString()
            next.setOnClickListener {
               Count_Answer()
                btn_n2.setBackgroundResource(R.drawable.obvodka)
                btn_n1.setBackgroundResource(R.drawable.obvodka)
            }

        } else {
           Count_Answer()
        }
    }
}