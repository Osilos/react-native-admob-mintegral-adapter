#import "AdmobMintegralAdapter.h"
#import <MTGSDK/MTGSDK.h>

@implementation AdmobMintegralAdapter
RCT_EXPORT_MODULE()

- (void) setConsent:(BOOL)value {
  [[MTGSDK sharedInstance] setConsentStatus:YES];
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeAdmobMintegralAdapterSpecJSI>(params);
}

@end
