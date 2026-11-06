package o;

import android.content.Context;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class iy extends oe8 {
    public final hy n;

    public iy(hy hyVar) {
        this.n = hyVar;
    }

    public final void V0(String str) {
        str.getClass();
        try {
            this.n.a(str);
        } catch (IllegalArgumentException unused) {
            ye4.c("AttractionGuidViewModel", "Attraction GUID is not well-formatted: ".concat(str));
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.attractionGuid_invalid);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
        }
    }
}
