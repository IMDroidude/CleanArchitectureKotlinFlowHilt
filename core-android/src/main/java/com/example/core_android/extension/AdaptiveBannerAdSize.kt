package com.example.core_android.extension

// FIXME: 20/09/2021  remove this class to admob module...
///import com.google.android.gms.ads.InterstitialAd

// # https://github.com/ovso/Hotkey/blob/bd5c71c786a6ba6918e76ad2a59f69acc386c5ff/app/src/main/kotlin/kr/blogspot/ovsoce/hotkey/adaptiveBannerAdSize.kt
/*private fun Activity.adaptiveBannerAdSize(): AdSize {
    // FIXME: 19/09/2021 update display code here
    val display = windowManager.defaultDisplay
    val outMetrics = DisplayMetrics()
    display.getMetrics(outMetrics)


    ///val outMetrics = Resources.getSystem().displayMetrics

    val density = outMetrics.density

    var adWidthPixels = 0f
    if (adWidthPixels == 0f) {
        adWidthPixels = outMetrics.widthPixels.toFloat()
    }

    val adWidth = (adWidthPixels / density).toInt()
    return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this, adWidth)
}

private fun Fragment.adaptiveBannerAdSize(): AdSize {
    // FIXME: 19/09/2021 update display code here
    val context = requireActivity()
    val display = context.windowManager.defaultDisplay
    val outMetrics = DisplayMetrics()
    display.getMetrics(outMetrics)

    val density = outMetrics.density

    var adWidthPixels = 0f
    if (adWidthPixels == 0f) {
        adWidthPixels = outMetrics.widthPixels.toFloat()
    }

    val adWidth = (adWidthPixels / density).toInt()
    return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adWidth)
}

@JvmOverloads
fun Activity.loadAdaptiveBanner(container: ViewGroup) {
    val adView = AdView(container.context)
    container.addView(adView)

    @SuppressLint("MissingPermission")
    fun load() {
        // FIXME: 19/09/2021   pass unit id as paramter.
        //adView.adUnitId = getString(R.string.ads_unit_id_banner)
        adView.adSize = adaptiveBannerAdSize()
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }

    load()
}

@JvmOverloads
fun ViewGroup.loadBanner() {
    val adView = AdView(this.context)
    this.addView(adView)

    fun load() {
        // FIXME: 19/09/2021   pass unit id as paramter.
        ///adView.adUnitId = context.getString(R.string.ads_unit_id_banner)
        adView.adSize = AdSize.BANNER
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }

    load()
}

@JvmOverloads
fun Fragment.loadAdaptiveBanner(container: ViewGroup, unitId: String) {
    val adView = AdView(container.context)
    container.addView(adView)

    fun load() {
        adView.adUnitId = unitId
        adView.adSize = adaptiveBannerAdSize()
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }

    load()
}*/



/*
@JvmOverloads
fun Activity.loadInterstitial(): InterstitialAd {
    return InterstitialAd(applicationContext).apply {
        // FIXME: 19/09/2021   pass unit id as paramter.
        //adUnitId = getString(R.string.ads_unit_id_interstitial)
        //loadAd(AdRequest.Builder().build())
    }
}*/
