package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class cz {
    public final /* synthetic */ byte a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ cz(Integer num, Integer num2, byte b) {
        this.a = b;
        this.b = num;
        this.c = num2;
    }

    public final Bundle a() {
        byte b = this.a;
        Integer num = this.c;
        Integer num2 = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                if (num2 != null) {
                    bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num2.intValue());
                }
                if (num != null) {
                    bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num.intValue());
                }
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                if (num2 != null) {
                    bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num2.intValue());
                }
                if (num != null) {
                    bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num.intValue());
                }
                return bundle2;
        }
    }
}
