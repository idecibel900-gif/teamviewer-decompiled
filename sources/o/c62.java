package o;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class c62 implements xd3 {
    public final Drawable a;

    public c62(Drawable drawable) {
        this.a = drawable;
    }

    @Override // o.xd3
    public final int a() {
        return ya8.a(this.a);
    }

    @Override // o.xd3
    public final int b() {
        return ya8.b(this.a);
    }

    @Override // o.xd3
    public final boolean c() {
        return false;
    }

    @Override // o.xd3
    public final void d(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c62) && im3.n(this.a, ((c62) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    @Override // o.xd3
    public final long o() {
        Drawable drawable = this.a;
        long jB = ((long) ya8.b(drawable)) * 4 * ((long) ya8.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
