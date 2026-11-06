package o;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class ni6 implements vc1 {
    public static final ni6 m = new ni6();
    public static final jo4 n;

    static {
        e96 e96Var = jo4.e;
        n = vt1.t("text/plain; charset=UTF-8");
    }

    @Override // o.vc1
    public final Object w(Object obj) {
        String strValueOf = String.valueOf(obj);
        int i = db6.a;
        vd5 vd5VarS = ct1.s(n);
        Charset charset = (Charset) vd5VarS.m;
        jo4 jo4Var = (jo4) vd5VarS.n;
        byte[] bytes = strValueOf.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        po8.a(bytes.length, 0L, length);
        return new cb6(jo4Var, length, bytes);
    }
}
