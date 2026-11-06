package o;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class hs4 {
    public final AndroidComposeView a;
    public zw4 b;
    public zw4 c;
    public zw4 d;
    public zw4 e;
    public boolean f;

    public hs4(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.es4] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.xx4] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static void b(es4 es4Var, ax5 ax5Var) {
        if (!es4Var.m.z) {
            ki3.c("visitSubtreeIf called on an unattached node");
        }
        xx4 xx4Var = new xx4(new es4[16]);
        es4 es4Var2 = es4Var.m;
        es4 es4Var3 = es4Var2.r;
        if (es4Var3 == null) {
            vn4.V(xx4Var, es4Var2);
        } else {
            xx4Var.b(es4Var3);
        }
        while (true) {
            int i = xx4Var.f2559o;
            if (i == 0) {
                return;
            }
            es4 es4Var4 = (es4) xx4Var.k(i - 1);
            if ((es4Var4.p & 32) != 0) {
                es4 es4Var5 = es4Var4;
                while (true) {
                    if (es4Var5 != null && es4Var5.z) {
                        if ((es4Var5.f737o & 32) != 0) {
                            ?? L0 = es4Var5;
                            ?? xx4Var2 = 0;
                            while (L0 != 0) {
                                if (L0 instanceof is4) {
                                    if (((is4) L0).V().o(ax5Var)) {
                                        break;
                                    }
                                } else if ((L0.f737o & 32) != 0 && (L0 instanceof vm1)) {
                                    es4 es4Var6 = ((vm1) L0).B;
                                    int i2 = 0;
                                    L0 = L0;
                                    xx4Var2 = xx4Var2;
                                    while (es4Var6 != null) {
                                        if ((es4Var6.f737o & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                xx4Var2 = xx4Var2;
                                                L0 = es4Var6;
                                            } else {
                                                if (xx4Var2 == 0) {
                                                    xx4Var2 = new xx4(new es4[16]);
                                                }
                                                if (L0 != 0) {
                                                    xx4Var2.b(L0);
                                                    L0 = 0;
                                                }
                                                xx4Var2.b(es4Var6);
                                            }
                                        }
                                        es4Var6 = es4Var6.r;
                                        L0 = L0;
                                        xx4Var2 = xx4Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                L0 = vn4.l0(xx4Var2);
                            }
                        }
                        es4Var5 = es4Var5.r;
                    }
                }
            }
            vn4.V(xx4Var, es4Var4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        vm3 vm3Var = new vm3((Object) this, (byte) 8);
        zw4 zw4Var = this.a.C0;
        if (zw4Var.g(vm3Var) >= 0) {
            return;
        }
        zw4Var.a(vm3Var);
    }
}
