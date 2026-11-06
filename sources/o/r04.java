package o;

/* JADX INFO: loaded from: classes.dex */
public interface r04 extends um1 {
    default int H(rg4 rg4Var, zn4 zn4Var, int i) {
        return a(new nm3(rg4Var, rg4Var.getLayoutDirection()), new fk1(zn4Var, m45.m, n45.m, (byte) 2), t61.b(0, 0, 0, i, 7)).b();
    }

    eo4 a(fo4 fo4Var, zn4 zn4Var, long j);

    default int a0(rg4 rg4Var, zn4 zn4Var, int i) {
        return a(new nm3(rg4Var, rg4Var.getLayoutDirection()), new fk1(zn4Var, m45.n, n45.m, (byte) 2), t61.b(0, 0, 0, i, 7)).b();
    }

    default int g(rg4 rg4Var, zn4 zn4Var, int i) {
        return a(new nm3(rg4Var, rg4Var.getLayoutDirection()), new fk1(zn4Var, m45.n, n45.n, (byte) 2), t61.b(0, i, 0, 0, 13)).a();
    }

    default int r0(rg4 rg4Var, zn4 zn4Var, int i) {
        return a(new nm3(rg4Var, rg4Var.getLayoutDirection()), new fk1(zn4Var, m45.m, n45.n, (byte) 2), t61.b(0, i, 0, 0, 13)).a();
    }
}
