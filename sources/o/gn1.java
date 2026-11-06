package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gn1 implements zp6 {
    public final CharSequence a;
    public final int b;
    public final hw2 c;

    public gn1(CharSequence charSequence, int i, hw2 hw2Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = hw2Var;
    }

    @Override // o.zp6
    public final Iterator iterator() {
        return new fn1(this);
    }
}
