package o;

/* JADX INFO: loaded from: classes.dex */
public final class by3 {
    public final float[] a = new float[4];
    public final float[] b = new float[4];
    public final long[] c = new long[4];
    public float d;
    public float e;

    public final void a(float f, float f2, long j) {
        long[] jArr;
        int i = -1;
        int i2 = 0;
        while (true) {
            jArr = this.c;
            if (i2 >= 4) {
                break;
            }
            long j2 = jArr[i2];
            if (j2 == 0) {
                break;
            }
            if (j2 < j - 200) {
                i = i2;
            }
            i2++;
        }
        if (i2 == 4 && i < 0) {
            i = 0;
        }
        if (i == i2) {
            i--;
        }
        float[] fArr = this.a;
        float[] fArr2 = this.b;
        if (i >= 0) {
            int i3 = i + 1;
            int i4 = 3 - i;
            System.arraycopy(fArr, i3, fArr, 0, i4);
            System.arraycopy(fArr2, i3, fArr2, 0, i4);
            System.arraycopy(jArr, i3, jArr, 0, i4);
            i2 -= i3;
        }
        fArr[i2] = f;
        fArr2[i2] = f2;
        jArr[i2] = j;
        int i5 = i2 + 1;
        if (i5 < 4) {
            jArr[i5] = 0;
        }
    }
}
