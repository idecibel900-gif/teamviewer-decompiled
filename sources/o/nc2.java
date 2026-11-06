package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nc2 implements nw3 {
    public final Enum[] a;
    public final kh7 b;

    public nc2(String str, Enum[] enumArr) {
        this.a = enumArr;
        this.b = new kh7(new ql1(this, str, (byte) 3));
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.a;
        int iW0 = cx.W0(r5, enumArr);
        if (iW0 != -1) {
            fq6 fq6VarD = d();
            fq6VarD.getClass();
            bb7Var.q(fq6VarD.f(iW0));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strA = d().a();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strA);
        sb.append(", must be one of ");
        sb.append(string);
        throw new nq6(sb.toString());
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        int iE = aj1Var.e(d());
        Enum[] enumArr = this.a;
        if (iE >= 0 && iE < enumArr.length) {
            return enumArr[iE];
        }
        throw new nq6(iE + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // o.nw3
    public final fq6 d() {
        return (fq6) this.b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + '>';
    }
}
