package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import io.sentry.android.replay.c0;
import kotlin.jvm.functions.Function0;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class j extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f167o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, byte b) {
        super(0);
        this.n = b;
        this.f167o = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.n;
        k kVar = this.f167o;
        switch (b) {
            case 0:
                Matrix matrix = new Matrix();
                c0 c0Var = (c0) kVar.c;
                matrix.preScale(c0Var.c, c0Var.d);
                return matrix;
            default:
                return new Canvas((Bitmap) kVar.g);
        }
    }
}
