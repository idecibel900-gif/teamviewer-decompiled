package o;

import android.icu.text.SimpleDateFormat;
import android.icu.util.TimeZone;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationNotificationViewModelNative;

/* JADX INFO: loaded from: classes.dex */
public final class v11 extends oe8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final SimpleDateFormat f2262o;
    public final ConditionalAccessAuthenticationNotificationViewModelNative n;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        simpleDateFormat.setTimeZone(TimeZone.GMT_ZONE);
        f2262o = simpleDateFormat;
    }

    public v11(ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative) {
        this.n = conditionalAccessAuthenticationNotificationViewModelNative;
    }

    @Override // o.oe8
    public final void U0() {
        this.n.a();
    }
}
