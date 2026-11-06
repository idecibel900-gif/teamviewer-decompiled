package o;

/* JADX INFO: loaded from: classes.dex */
public final class sq2 {
    public static final sq2 b = new sq2();
    public static final sq2 c = new sq2();
    public static final sq2 d = new sq2();
    public final xx4 a = new xx4(new uq2[16]);

    public static void a(sq2 sq2Var) {
        sq2Var.getClass();
        if (sq2Var == b) {
            hk0.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (sq2Var == c) {
            hk0.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        xx4 xx4Var = sq2Var.a;
        int i = xx4Var.f2559o;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = xx4Var.m;
        for (int i2 = 0; i2 < i; i2++) {
            um1 um1Var = (uq2) objArr[i2];
            if (!((es4) um1Var).m.z) {
                ki3.c("visitChildren called on an unattached node");
            }
            xx4 xx4Var2 = new xx4(new es4[16]);
            es4 es4Var = ((es4) um1Var).m;
            es4 es4Var2 = es4Var.r;
            if (es4Var2 == null) {
                vn4.V(xx4Var2, es4Var);
            } else {
                xx4Var2.b(es4Var2);
            }
            while (true) {
                int i3 = xx4Var2.f2559o;
                if (i3 == 0) {
                    break;
                }
                es4 es4VarL0 = (es4) xx4Var2.k(i3 - 1);
                if ((es4VarL0.p & 1024) == 0) {
                    vn4.V(xx4Var2, es4VarL0);
                } else {
                    while (es4VarL0 != null) {
                        if ((es4VarL0.f737o & 1024) != 0) {
                            xx4 xx4Var3 = null;
                            while (es4VarL0 != null) {
                                if (es4VarL0 instanceof br2) {
                                    if (((br2) es4VarL0).c1(7)) {
                                        break;
                                    }
                                } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                    int i4 = 0;
                                    for (es4 es4Var3 = ((vm1) es4VarL0).B; es4Var3 != null; es4Var3 = es4Var3.r) {
                                        if ((es4Var3.f737o & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                es4VarL0 = es4Var3;
                                            } else {
                                                if (xx4Var3 == null) {
                                                    xx4Var3 = new xx4(new es4[16]);
                                                }
                                                if (es4VarL0 != null) {
                                                    xx4Var3.b(es4VarL0);
                                                    es4VarL0 = null;
                                                }
                                                xx4Var3.b(es4Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                es4VarL0 = vn4.l0(xx4Var3);
                            }
                            break;
                        }
                        es4VarL0 = es4VarL0.r;
                    }
                }
            }
        }
    }
}
