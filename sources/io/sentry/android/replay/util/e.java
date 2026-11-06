package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import io.sentry.android.replay.a0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import o.ds1;
import o.ea2;
import o.l54;
import o.u14;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable {
    public final u14 m;
    public final u14 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u14 f172o;

    public e() {
        c cVar = c.f170o;
        l54 l54Var = l54.n;
        this.m = ds1.X(l54Var, cVar);
        this.n = ds1.X(l54Var, new a0(this, (byte) 2));
        this.f172o = ds1.X(l54Var, c.p);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u14 u14Var = this.m;
        if (!u14Var.a() || ((Bitmap) u14Var.getValue()).isRecycled()) {
            return;
        }
        ((Bitmap) u14Var.getValue()).recycle();
    }

    public final List e(Bitmap bitmap, io.sentry.android.replay.viewhierarchy.g gVar, Matrix matrix) {
        bitmap.getClass();
        if (bitmap.isRecycled()) {
            return ea2.m;
        }
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(bitmap);
        if (matrix != null) {
            canvas.setMatrix(matrix);
        }
        gVar.a(new d(this, bitmap, matrix, arrayList, canvas));
        return arrayList;
    }
}
