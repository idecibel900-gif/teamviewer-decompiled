package o;

import android.text.Layout;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a90 implements Function1 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f308o;
    public final /* synthetic */ Serializable p;
    public final /* synthetic */ Object q;

    public /* synthetic */ a90(long j, float[] fArr, i76 i76Var, h76 h76Var) {
        this.n = j;
        this.f308o = fArr;
        this.p = i76Var;
        this.q = h76Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        f88 f88Var;
        float[] fArr;
        int i;
        float fA;
        float fA2;
        byte b = this.m;
        f88 f88Var2 = f88.a;
        Object obj2 = this.q;
        Serializable serializable = this.p;
        Object obj3 = this.f308o;
        switch (b) {
            case 0:
                v56 v56Var = (v56) obj3;
                k76 k76Var = (k76) serializable;
                long j2 = this.n;
                tv0 tv0Var = (tv0) obj2;
                d14 d14Var = (d14) obj;
                d14Var.a();
                float f = v56Var.a;
                float f2 = v56Var.b;
                nl0 nl0Var = d14Var.m;
                ((xc0) nl0Var.n.f1103o).V(f, f2);
                try {
                    u52.C0(d14Var, (vi) k76Var.m, j2, 0L, 0.0f, tv0Var, 0, 890);
                    return f88Var2;
                } finally {
                    ((xc0) nl0Var.n.f1103o).V(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                i76 i76Var = (i76) serializable;
                h76 h76Var = (h76) obj2;
                cf5 cf5Var = (cf5) obj;
                int i2 = cf5Var.b;
                mj mjVar = cf5Var.a;
                int iE = cf5Var.c;
                long j3 = this.n;
                int iF = i2 > gt7.f(j3) ? cf5Var.b : gt7.f(j3);
                if (iE >= gt7.e(j3)) {
                    iE = gt7.e(j3);
                }
                long jA = h57.a(cf5Var.d(iF), cf5Var.d(iE));
                int i3 = i76Var.m;
                ts7 ts7Var = mjVar.d;
                int iF2 = gt7.f(jA);
                int iE2 = gt7.e(jA);
                Layout layout = ts7Var.f;
                int length = layout.getText().length();
                if (iF2 < 0) {
                    li3.a("startOffset must be > 0");
                }
                if (iF2 >= length) {
                    li3.a("startOffset must be less than text length");
                }
                if (iE2 <= iF2) {
                    li3.a("endOffset must be greater than startOffset");
                }
                if (iE2 > length) {
                    li3.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i3 < (iE2 - iF2) * 4) {
                    li3.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iF3 = ts7Var.f(iF2);
                int iF4 = ts7Var.f(iE2 - 1);
                c63 c63Var = new c63(ts7Var);
                if (iF3 <= iF4) {
                    while (true) {
                        int lineStart = layout.getLineStart(iF3);
                        j = jA;
                        int iE3 = ts7Var.e(iF3);
                        int iMax = Math.max(iF2, lineStart);
                        int iMin = Math.min(iE2, iE3);
                        float fH = ts7Var.h(iF3);
                        float fD = ts7Var.d(iF3);
                        f88Var = f88Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(iF3) == 1;
                        int i4 = i3;
                        int i5 = iMax;
                        while (i5 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i5);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fA3 = c63Var.a(i5, false, false, false);
                                    i = iMin;
                                    fA = c63Var.a(i5 + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fA = c63Var.a(i5, false, false, false);
                                        fA2 = c63Var.a(i5 + 1, true, true, false);
                                    } else {
                                        fA2 = c63Var.a(i5, false, false, true);
                                        fA = c63Var.a(i5 + 1, true, true, true);
                                    }
                                }
                                fArr[i4] = fA;
                                fArr[i4 + 1] = fH;
                                fArr[i4 + 2] = fA2;
                                fArr[i4 + 3] = fD;
                                i4 += 4;
                                i5++;
                                iMin = i;
                            } else {
                                fA = c63Var.a(i5, z, z, true);
                                i = iMin;
                                fA2 = c63Var.a(i5 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i4] = fA;
                            fArr[i4 + 1] = fH;
                            fArr[i4 + 2] = fA2;
                            fArr[i4 + 3] = fD;
                            i4 += 4;
                            i5++;
                            iMin = i;
                        }
                        if (iF3 != iF4) {
                            iF3++;
                            jA = j;
                            i3 = i4;
                            f88Var2 = f88Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jA;
                    f88Var = f88Var2;
                    fArr = fArr2;
                }
                int iD = (gt7.d(j) * 4) + i76Var.m;
                for (int i6 = i76Var.m; i6 < iD; i6 += 4) {
                    int i7 = i6 + 1;
                    float f3 = fArr[i7];
                    float f4 = h76Var.m;
                    fArr[i7] = f3 + f4;
                    int i8 = i6 + 3;
                    fArr[i8] = fArr[i8] + f4;
                }
                i76Var.m = iD;
                h76Var.m += mjVar.f;
                return f88Var;
        }
    }

    public /* synthetic */ a90(v56 v56Var, k76 k76Var, long j, t70 t70Var) {
        this.f308o = v56Var;
        this.p = k76Var;
        this.n = j;
        this.q = t70Var;
    }
}
