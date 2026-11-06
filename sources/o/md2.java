package o;

/* JADX INFO: loaded from: classes2.dex */
public final class md2 extends td2 {
    public final String a;
    public final String b;
    public final /* synthetic */ byte c;

    public md2(String str, String str2, byte b) {
        this.c = b;
        db8.l0(str);
        this.a = us1.I(str);
        if ((str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""))) {
            db8.e0("Quoted value must have content", str2.length() > 1);
            str2 = str2.substring(1, str2.length() - 1);
        }
        this.b = us1.F(str2);
    }

    @Override // o.td2
    public final int a() {
        switch (this.c) {
            case 0:
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    @Override // o.td2
    public final boolean b(o82 o82Var, o82 o82Var2) {
        byte b = this.c;
        String str = this.b;
        String str2 = this.a;
        switch (b) {
            case 0:
                return o82Var2.r(str2) && str.equalsIgnoreCase(o82Var2.c(str2));
            case 1:
                return o82Var2.r(str2) && us1.F(o82Var2.c(str2)).contains(str);
            case 2:
                return o82Var2.r(str2) && us1.F(o82Var2.c(str2)).endsWith(str);
            case 3:
                return !str.equalsIgnoreCase(o82Var2.c(str2));
            default:
                return o82Var2.r(str2) && us1.F(o82Var2.c(str2)).startsWith(str);
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return fx3.h("[", this.a, "=", this.b, "]");
            case 1:
                return fx3.h("[", this.a, "*=", this.b, "]");
            case 2:
                return fx3.h("[", this.a, "$=", this.b, "]");
            case 3:
                return fx3.h("[", this.a, "!=", this.b, "]");
            default:
                return fx3.h("[", this.a, "^=", this.b, "]");
        }
    }
}
