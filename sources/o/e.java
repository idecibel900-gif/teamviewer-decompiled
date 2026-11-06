package o;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i70 i70Var, byte b) {
        super(i70Var);
        this.c = b;
    }

    @Override // io.sentry.l6
    public final String t() throws d55 {
        switch (this.c) {
            case 0:
                iu iuVar = (iu) this.b;
                if (((i70) this.a).n < 48) {
                    throw d55.a();
                }
                StringBuilder sb = new StringBuilder();
                D(8, sb);
                int iQ = iu.q(48, 2, (i70) iuVar.f1103o);
                sb.append("(392");
                sb.append(iQ);
                sb.append(')');
                sb.append(iuVar.l(50, null).b);
                return sb.toString();
            case 1:
                iu iuVar2 = (iu) this.b;
                i70 i70Var = (i70) iuVar2.f1103o;
                if (((i70) this.a).n < 48) {
                    throw d55.a();
                }
                StringBuilder sb2 = new StringBuilder();
                D(8, sb2);
                int iQ2 = iu.q(48, 2, i70Var);
                sb2.append("(393");
                sb2.append(iQ2);
                sb2.append(')');
                int iQ3 = iu.q(50, 10, i70Var);
                if (iQ3 / 100 == 0) {
                    sb2.append('0');
                }
                if (iQ3 / 10 == 0) {
                    sb2.append('0');
                }
                sb2.append(iQ3);
                sb2.append(iuVar2.l(60, null).b);
                return sb2.toString();
            default:
                StringBuilder sb3 = new StringBuilder();
                sb3.append("(01)");
                int length = sb3.length();
                iu iuVar3 = (iu) this.b;
                sb3.append(iu.q(4, 4, (i70) iuVar3.f1103o));
                E(sb3, 8, length);
                return iuVar3.k(48, sb3);
        }
    }
}
