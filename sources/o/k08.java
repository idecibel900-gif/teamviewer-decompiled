package o;

/* JADX INFO: loaded from: classes.dex */
public final class k08 {
    public final iy4 a;
    public final wx4 b = new wx4(Boolean.FALSE);
    public gl0 c;

    public k08(iy4 iy4Var) {
        this.a = iy4Var;
    }

    public final void a() {
        this.b.f2457o.setValue(Boolean.FALSE);
    }

    public final boolean b() {
        wx4 wx4Var = this.b;
        return ((Boolean) wx4Var.n.getValue()).booleanValue() || ((Boolean) wx4Var.f2457o.getValue()).booleanValue();
    }

    public final Object c(ay4 ay4Var, og7 og7Var) {
        j08 j08Var = new j08(this, ay4Var, new vg1(this, null, (byte) 2), null);
        iy4 iy4Var = this.a;
        iy4Var.getClass();
        Object objJ = hm3.j(new gy4(ay4Var, iy4Var, j08Var, null), og7Var);
        return objJ == ne1.m ? objJ : f88.a;
    }
}
