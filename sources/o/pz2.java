package o;

import android.app.BackgroundServiceStartNotAllowedException;
import android.app.ForegroundServiceStartNotAllowedException;
import android.graphics.fonts.Font;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class pz2 {
    public static /* synthetic */ Font.Builder h(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ boolean p(Throwable th) {
        return th instanceof ForegroundServiceStartNotAllowedException;
    }

    public static /* bridge */ /* synthetic */ boolean s(Throwable th) {
        return th instanceof BackgroundServiceStartNotAllowedException;
    }
}
