package o;

/* JADX INFO: loaded from: classes.dex */
public final class tf6 extends uf0 {
    @Override // o.uf0
    public final void o(kx6 kx6Var, float f, float f2) {
        kx6Var.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        gx6 gx6Var = new gx6(0.0f, 0.0f, f3, f3);
        gx6Var.f = 180.0f;
        gx6Var.g = 90.0f;
        kx6Var.f.add(gx6Var);
        ex6 ex6Var = new ex6(gx6Var);
        kx6Var.a(180.0f);
        kx6Var.g.add(ex6Var);
        kx6Var.d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        kx6Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        kx6Var.c = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
