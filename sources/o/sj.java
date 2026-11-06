package o;

import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class sj {
    public final PathMeasure a;

    public sj(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final void a(float f, float f2, rj rjVar) {
        this.a.getSegment(f, f2, rjVar.a, true);
    }
}
