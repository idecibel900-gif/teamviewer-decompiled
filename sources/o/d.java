package o;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(i70 i70Var, byte b) {
        super(i70Var);
        this.c = b;
    }

    @Override // o.h
    public final void F(int i, StringBuilder sb) {
        switch (this.c) {
            case 0:
                sb.append("(3103)");
                break;
            default:
                if (i >= 10000) {
                    sb.append("(3203)");
                } else {
                    sb.append("(3202)");
                }
                break;
        }
    }

    @Override // o.h
    public final int G(int i) {
        switch (this.c) {
            case 0:
                return i;
            default:
                return i < 10000 ? i : i - 10000;
        }
    }

    @Override // io.sentry.l6
    public final String t() throws d55 {
        if (((i70) this.a).n != 60) {
            throw d55.a();
        }
        StringBuilder sb = new StringBuilder();
        D(5, sb);
        H(sb, 45, 15);
        return sb.toString();
    }
}
