package o;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    public final String c;
    public final String d;

    public f(i70 i70Var, String str, String str2) {
        super(i70Var);
        this.c = str2;
        this.d = str;
    }

    @Override // o.h
    public final void F(int i, StringBuilder sb) {
        sb.append('(');
        sb.append(this.d);
        sb.append(i / 100000);
        sb.append(')');
    }

    @Override // io.sentry.l6
    public final String t() throws d55 {
        if (((i70) this.a).n != 84) {
            throw d55.a();
        }
        StringBuilder sb = new StringBuilder();
        D(8, sb);
        H(sb, 48, 20);
        int iQ = iu.q(68, 16, (i70) ((iu) this.b).f1103o);
        if (iQ != 38400) {
            sb.append('(');
            sb.append(this.c);
            sb.append(')');
            int i = iQ % 32;
            int i2 = iQ / 32;
            int i3 = (i2 % 12) + 1;
            int i4 = i2 / 12;
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i3 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i3);
            if (i / 10 == 0) {
                sb.append('0');
            }
            sb.append(i);
        }
        return sb.toString();
    }
}
