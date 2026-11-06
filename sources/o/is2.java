package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class is2 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile n77 b = new n77(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new js2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new js2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new js2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new js2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(200, new js2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.b(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        mi3.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static hs2 a(float f) {
        float fB;
        hs2 js2Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        n77 n77Var = b;
        int i = (int) (f * 100.0f);
        n77Var.getClass();
        hs2 hs2Var = (hs2) ck3.u(n77Var, i);
        if (hs2Var != null) {
            return hs2Var;
        }
        n77 n77Var2 = b;
        int iS = j51.s(n77Var2.f1550o, i, n77Var2.m);
        if (iS >= 0) {
            return (hs2) b.d(iS);
        }
        int i2 = -(iS + 1);
        int i3 = i2 - 1;
        if (i2 >= b.f1550o) {
            js2 js2Var2 = new js2(new float[]{1.0f}, new float[]{f});
            b(f, js2Var2);
            return js2Var2;
        }
        if (i3 < 0) {
            js2Var = new js2(fArr, fArr);
            fB = 1.0f;
        } else {
            fB = b.b(i3) / 100.0f;
            js2Var = (hs2) b.d(i3);
        }
        float fB2 = b.b(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fB == fB2 ? 0.0f : (f - fB) / (fB2 - fB))) * 1.0f) + 0.0f;
        hs2 hs2Var2 = (hs2) b.d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB3 = js2Var.b(f2);
            fArr2[i4] = ((hs2Var2.b(f2) - fB3) * fMax) + fB3;
        }
        js2 js2Var3 = new js2(fArr, fArr2);
        b(f, js2Var3);
        return js2Var3;
    }

    public static void b(float f, js2 js2Var) {
        synchronized (c) {
            n77 n77VarClone = b.clone();
            n77VarClone.c((int) (f * 100.0f), js2Var);
            b = n77VarClone;
        }
    }
}
