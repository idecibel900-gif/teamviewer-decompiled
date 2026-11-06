package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kd2 extends td2 {
    public static boolean b = false;
    public final /* synthetic */ byte a;

    public /* synthetic */ kd2(byte b2) {
        this.a = b2;
    }

    @Override // o.td2
    public int a() {
        switch (this.a) {
            case 0:
                return 10;
            case 6:
                return 1;
            case 7:
                return -1;
            case 8:
                return 1;
            default:
                return super.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.td2
    public final boolean b(o82 o82Var, o82 o82Var2) {
        r82 r82Var;
        o82 o82Var3 = null;
        switch (this.a) {
            case 0:
                return true;
            case 1:
                for (x35 x35VarP = o82Var2.p(); x35VarP != null; x35VarP = x35VarP.w()) {
                    if (x35VarP instanceof et7) {
                        if (!lb7.f(((et7) x35VarP).Q())) {
                            return false;
                        }
                    } else if (!(x35VarP instanceof zw0) && !(x35VarP instanceof co8) && !(x35VarP instanceof l32)) {
                        return false;
                    }
                }
                return true;
            case 2:
                o82 o82Var4 = o82Var2.m;
                return (o82Var4 == null || (o82Var4 instanceof i32) || o82Var2 != o82Var4.d0()) ? false : true;
            case 3:
                o82 o82Var5 = o82Var2.m;
                if (o82Var5 == null || (o82Var5 instanceof i32)) {
                    return false;
                }
                for (int size = o82Var5.q.size() - 1; size >= 0; size--) {
                    x35 x35Var = (x35) o82Var5.q.get(size);
                    if (x35Var instanceof o82) {
                        o82Var3 = (o82) x35Var;
                        if (o82Var2 == o82Var3) {
                            return true;
                        }
                        return false;
                    }
                }
                if (o82Var2 == o82Var3) {
                    return true;
                }
                return false;
            case 4:
                o82 o82Var6 = o82Var2.m;
                if (o82Var6 == null || (o82Var6 instanceof i32)) {
                    return false;
                }
                if (o82Var6 == null) {
                    r82Var = new r82(0);
                } else {
                    List<o82> listU = o82Var6.U();
                    r82 r82Var2 = new r82(listU.size() - 1);
                    for (o82 o82Var7 : listU) {
                        if (o82Var7 != o82Var2) {
                            r82Var2.add(o82Var7);
                        }
                    }
                    r82Var = r82Var2;
                }
                return r82Var.isEmpty();
            case 5:
                o82 o82Var8 = o82Var2.m;
                if (o82Var8 == null || (o82Var8 instanceof i32)) {
                    return false;
                }
                int i = 0;
                for (o82 o82VarD0 = o82Var8.d0(); o82VarD0 != null; o82VarD0 = o82VarD0.v()) {
                    if (o82VarD0.p.f993o.equals(o82Var2.p.f993o)) {
                        i++;
                    }
                    if (i > 1) {
                        if (i == 1) {
                            return true;
                        }
                        return false;
                    }
                }
                if (i == 1) {
                    return true;
                }
                return false;
            case 6:
                if (o82Var instanceof i32) {
                    o82Var = o82Var.d0();
                }
                return o82Var2 == o82Var;
            case 7:
                if (o82Var2 instanceof hx5) {
                    return true;
                }
                for (x35 x35Var2 : o82Var2.a0(et7.class)) {
                    hn7 hn7Var = o82Var2.p;
                    hx5 hx5Var = new hx5(new jn7(jn7.d, null).d(hn7Var.n, null, hn7Var.m, true), o82Var2.h(), o82Var2.g());
                    x35Var2.M(hx5Var);
                    hx5Var.Q(x35Var2);
                }
                return false;
            default:
                return o82Var == o82Var2;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "*";
            case 1:
                return ":empty";
            case 2:
                return ":first-child";
            case 3:
                return ":last-child";
            case 4:
                return ":only-child";
            case 5:
                return ":only-of-type";
            case 6:
                return ":root";
            case 7:
                return ":matchText";
            default:
                return ">";
        }
    }
}
