package com.admobmintegraladapter

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.mbridge.msdk.out.MBridgeSDKFactory

@ReactModule(name = AdmobMintegralAdapterModule.NAME)
class AdmobMintegralAdapterModule(reactContext: ReactApplicationContext) :
  NativeAdmobMintegralAdapterSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }
  override fun setConsent(consent: Boolean) {
    MBridgeSDK sdk = MBridgeSDKFactory.getMBridgeSDK();
    sdk.setConsentStatus(context, MBridgeConstans.IS_SWITCH_ON);
  }

  companion object {
    const val NAME = "AdmobMintegralAdapter"
  }
}
