package mikaeldionitoharbigantara.gmail.com

import android.support.v7.app.AppCompatActivity
import android.R.layout.simple_list_item_1
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Data yang digunakan adalah Array
        val languages = listOf("Java", "Kotlin", "JavaScript", "PHP", "Phyton")
        // mendeklarasikan sebuah isian untuk adapter
        lv_languages.adapter = ArrayAdapter(this, simple_list_item_1, languages)
        // mendeklarasikan penempatan array pada variabel lv_languages di layout activity_main

        lv_languages.setOnItemClickListener { parent, view, position, id -> Toast.makeText(this,
            "Anda Memilih: ${languages[position]}",Toast.LENGTH_SHORT).show() }
        // mendeklarasikan Toast Jika item diclick sesuai dengan id dan position
    }
}

