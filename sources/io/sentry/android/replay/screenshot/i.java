package io.sentry.android.replay.screenshot;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.jvm.functions.Function0;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends yz3 implements Function0 {
    public static final i n = new i(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        return paint;
    }
}
