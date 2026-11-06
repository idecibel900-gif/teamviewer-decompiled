package o;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class en4 extends r0 {
    public final /* synthetic */ byte m;
    public final Object n;

    public /* synthetic */ en4(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // o.r0
    public final int a() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return ((fn4) obj).a.groupCount() + 1;
            default:
                return ((zj5) obj).n;
        }
    }

    public cn4 b(int i) {
        Matcher matcher = ((fn4) this.n).a;
        yk3 yk3VarB0 = ct1.b0(matcher.start(i), matcher.end(i));
        if (yk3VarB0.m < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new cn4(strGroup, yk3VarB0);
    }

    @Override // o.r0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.m) {
            case 0:
                if (obj == null ? true : obj instanceof cn4) {
                    return super.contains((cn4) obj);
                }
                return false;
            default:
                return ((zj5) this.n).containsValue(obj);
        }
    }

    @Override // o.r0, java.util.Collection, java.util.List
    public boolean isEmpty() {
        switch (this.m) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.m) {
            case 0:
                return new g18(new h18(new fx(new yk3(0, size() - 1, 1), (byte) 1), new fj3((Object) this, (byte) 11)));
            default:
                s28 s28Var = ((zj5) this.n).m;
                t28[] t28VarArr = new t28[8];
                for (int i = 0; i < 8; i++) {
                    t28VarArr[i] = new u28((byte) 2);
                }
                return new hk5(s28Var, t28VarArr);
        }
    }
}
