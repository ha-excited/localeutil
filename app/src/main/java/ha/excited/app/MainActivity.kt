package ha.excited.app

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ha.excited.localeutil.LocaleUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val languageTag = getPreferences(Context.MODE_PRIVATE).getString("languageTag", "")
        if (languageTag.isNotBlank()) LocaleUtil.setLocale(this@MainActivity, languageTag)
        setContentView(R.layout.activity_main)
        textViewCurrentLanguage.text = LocaleUtil.locale(this).toLanguageTags()

        viewChinese.setOnClickListener {
            getPreferences(Context.MODE_PRIVATE).edit().putString("languageTag", "zh-CN").apply()
            recreate()
        }

        viewEnglish.setOnClickListener {
            getPreferences(Context.MODE_PRIVATE).edit().putString("languageTag", "en").apply()
            recreate()
        }
    }
}
