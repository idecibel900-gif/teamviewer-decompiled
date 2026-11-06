package io.sentry.android.replay;

import o.e41;
import o.fx3;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;

    public c0(int i, int i2, float f, float f2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.a == c0Var.a && this.b == c0Var.b && Float.compare(this.c, c0Var.c) == 0 && Float.compare(this.d, c0Var.d) == 0 && this.e == c0Var.e && this.f == c0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + fx3.a(this.e, e41.e(this.d, e41.e(this.c, fx3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
        sb.append(this.a);
        sb.append(", recordingHeight=");
        sb.append(this.b);
        sb.append(", scaleFactorX=");
        sb.append(this.c);
        sb.append(", scaleFactorY=");
        sb.append(this.d);
        sb.append(", frameRate=");
        sb.append(this.e);
        sb.append(", bitRate=");
        return e41.j(sb, this.f, ')');
    }
}
