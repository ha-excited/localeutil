package ha.excited.localeutil


import android.content.Context
import android.content.res.Resources
import android.support.v4.os.ConfigurationCompat
import android.support.v4.os.LocaleListCompat

object LocaleUtil {
    fun locale(context: Context) = locale(context.resources)
    fun locale(resources: Resources) = ConfigurationCompat.getLocales(resources.configuration)
    fun locale(languageTag: String) = LocaleListCompat.forLanguageTags(languageTag)

    fun setLocale(context: Context, languageTag: String) = setLocale(context.resources, languageTag)
    fun setLocale(resources: Resources, languageTag: String) {
        setLocale(resources, locale(languageTag))
    }

    fun setLocale(context: Context, localeListCompat: LocaleListCompat) = setLocale(context.resources, localeListCompat)
    fun setLocale(resources: Resources, localeListCompat: LocaleListCompat) {
        if (!localeListCompat.isEmpty) {
            resources.updateConfiguration(resources.configuration.apply { this.locale = localeListCompat[0] }, resources.displayMetrics)
        }
    }
}
