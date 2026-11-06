package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: loaded from: classes.dex */
public enum dj4 {
    Main(2131231147, 2131231148, 0.0f, -180.0f),
    Right(2131231152, 0, 0.0f, -50.0f),
    Middle(2131231150, 2131231151, -50.0f, -130.0f),
    Left(2131231149, 0, -130.0f, -180.0f),
    Invalid(0, 0, 0.0f, 0.0f);

    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f628o;
    public final float p;
    public Bitmap q;
    public Bitmap r;
    public boolean s = true;

    dj4(int i, int i2, float f, float f2) {
        this.m = i;
        this.n = i2;
        this.f628o = f;
        this.p = f2;
    }

    public final void a(Resources resources) {
        this.q = BitmapFactory.decodeResource(resources, this.m);
        int i = this.n;
        if (i != 0) {
            this.r = BitmapFactory.decodeResource(resources, i);
        }
    }
}
