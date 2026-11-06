package o;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class un8 {
    public static final un8 a = new un8();

    public final long a(Paint paint) {
        int i = rv0.i;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(j51.T(i));
    }

    public final void c(Paint paint, long j) {
        paint.setColor(ck3.x0(j));
    }
}
