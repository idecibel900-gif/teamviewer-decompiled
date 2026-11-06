package o;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf3 implements mx5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wf3 b;

    public /* synthetic */ vf3(wf3 wf3Var, byte b) {
        this.a = b;
        this.b = wf3Var;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    @Override // o.mx5
    public final void a(g60 g60Var, List list) {
        boolean z;
        byte b = this.a;
        wf3 wf3Var = this.b;
        switch (b) {
            case 0:
                g60Var.getClass();
                list.getClass();
                int i = g60Var.a;
                eg3 eg3Var = eg3.m;
                if (i == 0) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                lx5 lx5Var = (lx5) it.next();
                                if (lx5Var != null && lx5Var.a() == 1) {
                                    eg3Var = eg3.f712o;
                                }
                            } else if (wf3Var.h) {
                                eg3Var = eg3.n;
                            }
                        }
                    } else if (wf3Var.h) {
                        eg3Var = eg3.n;
                    }
                    zv6 zv6Var = wf3Var.f;
                    if (zv6Var != null) {
                        zv6Var.invoke(eg3Var);
                    }
                } else {
                    zv6 zv6Var2 = wf3Var.f;
                    if (zv6Var2 != null) {
                        zv6Var2.invoke(eg3Var);
                    }
                }
                break;
            default:
                g60Var.getClass();
                list.getClass();
                if (g60Var.a == 0) {
                    if (list.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                lx5 lx5Var2 = (lx5) it2.next();
                                if ((lx5Var2 != null && lx5Var2.a() == 2) || (lx5Var2 != null && lx5Var2.a() == 1)) {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                        }
                    }
                    boolean z2 = wf3Var.h && !z;
                    Function1 function1 = wf3Var.e;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(z2));
                    }
                } else {
                    Function1 function2 = wf3Var.e;
                    if (function2 != null) {
                        function2.invoke(Boolean.FALSE);
                    }
                }
                break;
        }
    }
}
