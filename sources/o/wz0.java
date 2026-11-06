package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class wz0 implements fz3 {
    public final ArrayList m;

    public wz0(byte b) {
        switch (b) {
            case 1:
                this.m = new ArrayList();
                break;
            default:
                this.m = new ArrayList();
                break;
        }
    }

    @Override // o.fz3
    public void a() {
        f((String[]) this.m.toArray(new String[0]));
    }

    @Override // o.fz3
    public void b(ns0 ns0Var) {
    }

    public boolean c(int i, wx2 wx2Var, Object obj) {
        ArrayList arrayList = wx2Var.a;
        if (arrayList == null) {
            d(i, wx2Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof px2)) {
                if (!(obj2 instanceof wx2)) {
                    hk0.f(obj2, "Unexpected child source info ");
                    break;
                }
                if (c(i, (wx2) obj2, obj)) {
                    d(0, wx2Var, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                d(0, wx2Var, obj2);
                return true;
            }
        }
        return false;
    }

    public void d(int i, wx2 wx2Var, Object obj) {
        this.m.add(new xz0(i, null, null));
    }

    public void e(int i, Object obj, wx2 wx2Var, Object obj2) {
        if (im3.n(obj, e01.a)) {
            d(i, wx2Var, null);
        }
    }

    public abstract void f(String[] strArr);

    @Override // o.fz3
    public void i(Object obj) {
        if (obj instanceof String) {
            this.m.add((String) obj);
        }
    }

    @Override // o.fz3
    public ez3 k(js0 js0Var) {
        return null;
    }

    @Override // o.fz3
    public void m(js0 js0Var, sy4 sy4Var) {
    }
}
