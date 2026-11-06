package o;

/* JADX INFO: loaded from: classes2.dex */
public class rd2 extends td2 {
    public final int a;
    public final int b;
    public final /* synthetic */ byte c;

    public rd2(int i, int i2, byte b) {
        this.c = b;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091 A[RETURN] */
    @Override // o.td2
    public final boolean b(o82 o82Var, o82 o82Var2) {
        int iZ;
        o82 o82Var3 = o82Var2.m;
        if (o82Var3 != null && !(o82Var3 instanceof i32)) {
            switch (this.c) {
                case 0:
                    iZ = o82Var2.Z() + 1;
                    break;
                case 1:
                    o82 o82Var4 = o82Var2.m;
                    if (o82Var4 == null) {
                        iZ = 0;
                    } else {
                        iZ = (o82Var4.q.size() == 0 ? 0 : o82Var4.U().size()) - o82Var2.Z();
                    }
                    break;
                case 2:
                    if (o82Var2.m == null) {
                        iZ = 0;
                    } else {
                        int i = 0;
                        for (o82 o82VarV = o82Var2; o82VarV != null; o82VarV = o82VarV.v()) {
                            if (o82VarV.p.f993o.equals(o82Var2.p.f993o)) {
                                i++;
                            }
                        }
                        iZ = i;
                    }
                    break;
                default:
                    o82 o82Var5 = o82Var2.m;
                    if (o82Var5 == null) {
                        iZ = 0;
                    } else {
                        int size = o82Var5.q.size();
                        iZ = 0;
                        for (int i2 = 0; i2 < size; i2++) {
                            x35 x35VarI = o82Var5.i(i2);
                            if (x35VarI.A().equals(o82Var2.p.f993o)) {
                                iZ++;
                            }
                            if (x35VarI == o82Var2) {
                            }
                        }
                    }
                    break;
            }
            int i3 = this.a;
            int i4 = this.b;
            if (i3 != 0) {
                int i5 = iZ - i4;
                if (i5 * i3 >= 0 && i5 % i3 == 0) {
                    return true;
                }
            } else if (iZ == i4) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str;
        String str2;
        int i = this.b;
        int i2 = this.a;
        if (i2 == 0) {
            str = ":%s(%3$d)";
        } else {
            str = i == 0 ? ":%s(%2$dn)" : ":%s(%2$dn%3$+d)";
        }
        switch (this.c) {
            case 0:
                str2 = "nth-child";
                break;
            case 1:
                str2 = "nth-last-child";
                break;
            case 2:
                str2 = "nth-last-of-type";
                break;
            default:
                str2 = "nth-of-type";
                break;
        }
        return String.format(str, str2, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
