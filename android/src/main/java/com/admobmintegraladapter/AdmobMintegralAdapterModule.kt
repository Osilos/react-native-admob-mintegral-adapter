package com.admobmintegraladapter

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.mbridge.msdk.out.MBridgeSDKFactory
import com.mbridge.msdk.MBridgeConstans

@ReactModule(name = AdmobMintegralAdapterModule.NAME)
class AdmobMintegralAdapterModule(private val reactContext: ReactApplicationContext) :
  NativeAdmobMintegralAdapterSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }
  override fun setConsent(consent: Boolean) {
    var sdk = MBridgeSDKFactory.getMBridgeSDK()
    sdk.setConsentStatus(reactContext, MBridgeConstans.IS_SWITCH_ON)
  }

  companion object {
    const val NAME = "AdmobMintegralAdapter"
  }
}
