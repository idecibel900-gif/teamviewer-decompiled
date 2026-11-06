package o;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class qi8 extends er {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi8(String str, String str2, byte b) {
        super(str, str2, (byte) 2);
        this.e = b;
    }

    @Override // o.fr
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                int i = mi8.a;
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? dq.g(currentWebViewPackage) : (long) currentWebViewPackage.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !ri8.a("MULTI_PROCESS")) {
                    return false;
                }
                int i2 = mi8.a;
                if (ri8.b.b()) {
                    return ti8.a.getStatics().isMultiProcessEnabled();
                }
                yq4.r("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (ri8.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
