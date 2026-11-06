package o;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class r67 {
    public final l70 a;
    public final int b;
    public final int c;
    public Rect d;
    public boolean e;

    public r67(byte[] bArr, int i, int i2, int i3, int i4) {
        this.a = new l70(bArr, i, i2);
        this.c = i4;
        this.b = i3;
        if (i * i2 <= bArr.length) {
            return;
        }
        StringBuilder sbJ = fx3.j(i, i2, "Image data does not match the resolution. ", "x", " > ");
        sbJ.append(bArr.length);
        throw new IllegalArgumentException(sbJ.toString());
    }
}
