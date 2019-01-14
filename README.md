# LocaleUtil

Android switch locale, languages

### Import

```
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.ha-excited:localeutil:0.1.1'
}
```

#### Example

```
LocaleUtil.setLocale(context, "zh-CN") //language tags

LocaleUtil.locale(this).toLanguageTags() //language to tags
```
