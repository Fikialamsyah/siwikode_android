package com.example.siwikode.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Travel(
    var travelTitle: String? = null,
    var travelRate: String? = null,
    var travelType: String? = null,
    var travelDesc: String? = null,
    var travelOpens: String? = null,
    var travelAddress: String? = null,
    var travelPhones: String? = null,
    var imgUrls1: String? = null,
    var imgUrls2: String? = null,
    var imgUrls3: String? = null,
    var travelMaps: String? = null
): Parcelable