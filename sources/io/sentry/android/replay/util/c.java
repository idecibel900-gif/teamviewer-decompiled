package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Paint;
import kotlin.jvm.functions.Function0;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends yz3 implements Function0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f170o;
    public static final c p;
    public final /* synthetic */ byte n;

    static {
        int i = 0;
        f170o = new c(i, (byte) 0);
        p = new c(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, byte b) {
        super(i);
        this.n = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        switch (this.n) {
            case 0:
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            default:
                return new Paint();
        }
    }
}
