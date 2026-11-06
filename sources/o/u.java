package o;

/* JADX INFO: loaded from: classes.dex */
public final class u implements hw2 {
    public static final u n = new u(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f2156o = new u(1);
    public static final u p = new u(2);
    public static final u q = new u(3);
    public static final u r = new u(4);
    public final /* synthetic */ byte m;

    public /* synthetic */ u(byte b) {
        this.m = b;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        pw2 pw2Var;
        switch (this.m) {
            case 0:
                vp vpVar = (vp) obj;
                bp4 bp4Var = (bp4) obj2;
                vpVar.getClass();
                bp4Var.getClass();
                return vpVar.c.get(bp4Var);
            case 1:
                vp vpVar2 = (vp) obj;
                bp4 bp4Var2 = (bp4) obj2;
                vpVar2.getClass();
                bp4Var2.getClass();
                return vpVar2.b.get(bp4Var2);
            case 2:
                return Boolean.FALSE;
            case 3:
                long j = ((rv0) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(j51.U(j));
            default:
                m3 m3Var = (m3) obj;
                m3 m3Var2 = (m3) obj2;
                if (m3Var == null || (str = m3Var.a) == null) {
                    str = m3Var2.a;
                }
                if (m3Var == null || (pw2Var = m3Var.b) == null) {
                    pw2Var = m3Var2.b;
                }
                return new m3(str, pw2Var);
        }
    }
}
