package o;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class h32 implements Cloneable {
    public cc2 m = cc2.base;
    public Charset n = xh1.b;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f945o = true;
    public int p = 1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h32 clone() {
        try {
            h32 h32Var = (h32) super.clone();
            String strName = this.n.name();
            h32Var.getClass();
            h32Var.n = Charset.forName(strName);
            h32Var.m = cc2.valueOf(this.m.name());
            return h32Var;
        } catch (CloneNotSupportedException e) {
            gk0.r(e);
            return null;
        }
    }
}
