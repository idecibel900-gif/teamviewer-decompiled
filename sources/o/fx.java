package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class fx implements zp6 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ fx(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.zp6
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new j1((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new da4(this);
            case 3:
                return ct1.M((hw2) obj);
            case 4:
                return (Iterator) obj;
            case 5:
                return new dq6(obj, (byte) 0);
            case 6:
                return new ca4((CharSequence) obj);
            default:
                return new ry2(this);
        }
    }
}
