package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class eb8 {
    public static final io.sentry.android.replay.screenshot.h a = new io.sentry.android.replay.screenshot.h(u65.a, 0, 0);

    public static final e18 a(tg8 tg8Var, xo xoVar) {
        e18 e18VarC = tg8Var.c(xoVar);
        int length = xoVar.n.length();
        xo xoVar2 = e18VarC.a;
        v65 v65Var = e18VarC.b;
        int length2 = xoVar2.n.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(v65Var.q(i), length2, i);
        }
        b(v65Var.q(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(v65Var.k(i2), length, i2);
        }
        c(v65Var.k(length2), length, length2);
        return new e18(xoVar2, new io.sentry.android.replay.screenshot.h(v65Var, xoVar.n.length(), xoVar2.n.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbJ = fx3.j(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbJ.append(i2);
        sbJ.append("]");
        ni3.c(sbJ.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbJ = fx3.j(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbJ.append(i2);
        sbJ.append("]");
        ni3.c(sbJ.toString());
    }
}
