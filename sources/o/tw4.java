package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class tw4 implements ew4 {
    public final List a;
    public final List b;
    public final eo1 c;
    public final eo1 d;
    public qk4 e;

    public tw4(List list) {
        this.a = list;
        this.b = list;
        final byte b = 0;
        this.c = d57.b(new Function0(this) { // from class: o.sw4
            public final /* synthetic */ tw4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                boolean z;
                boolean z2;
                byte b2 = b;
                boolean z3 = true;
                tw4 tw4Var = this.n;
                fj5 fj5Var = fj5.a;
                switch (b2) {
                    case 0:
                        List list2 = tw4Var.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!im3.n(((dj5) obj).getStatus(), fj5Var)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = tw4Var.b;
                        if (!list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                gj5 status = ((dj5) it.next()).getStatus();
                                status.getClass();
                                if (!status.equals(fj5Var)) {
                                    if (!((List) tw4Var.c.getValue()).isEmpty()) {
                                        z3 = false;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z3);
                    default:
                        List<dj5> list4 = tw4Var.b;
                        if (list4.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                gj5 status2 = ((dj5) it2.next()).getStatus();
                                status2.getClass();
                                if (status2.equals(fj5Var)) {
                                    z = false;
                                } else {
                                    if (!(status2 instanceof ej5)) {
                                        gk0.s();
                                        return null;
                                    }
                                    z = ((ej5) status2).a;
                                }
                                if (z) {
                                    if (!list4.isEmpty()) {
                                        for (dj5 dj5Var : list4) {
                                            gj5 status3 = dj5Var.getStatus();
                                            status3.getClass();
                                            if (!status3.equals(fj5Var)) {
                                                gj5 status4 = dj5Var.getStatus();
                                                status4.getClass();
                                                if (status4.equals(fj5Var)) {
                                                    z2 = false;
                                                } else {
                                                    if (!(status4 instanceof ej5)) {
                                                        gk0.s();
                                                        return null;
                                                    }
                                                    z2 = ((ej5) status4).a;
                                                }
                                                if (!z2) {
                                                    z3 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
        final byte b2 = 1;
        d57.b(new Function0(this) { // from class: o.sw4
            public final /* synthetic */ tw4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                boolean z;
                boolean z2;
                byte b3 = b2;
                boolean z3 = true;
                tw4 tw4Var = this.n;
                fj5 fj5Var = fj5.a;
                switch (b3) {
                    case 0:
                        List list2 = tw4Var.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!im3.n(((dj5) obj).getStatus(), fj5Var)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = tw4Var.b;
                        if (!list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                gj5 status = ((dj5) it.next()).getStatus();
                                status.getClass();
                                if (!status.equals(fj5Var)) {
                                    if (!((List) tw4Var.c.getValue()).isEmpty()) {
                                        z3 = false;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z3);
                    default:
                        List<dj5> list4 = tw4Var.b;
                        if (list4.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                gj5 status2 = ((dj5) it2.next()).getStatus();
                                status2.getClass();
                                if (status2.equals(fj5Var)) {
                                    z = false;
                                } else {
                                    if (!(status2 instanceof ej5)) {
                                        gk0.s();
                                        return null;
                                    }
                                    z = ((ej5) status2).a;
                                }
                                if (z) {
                                    if (!list4.isEmpty()) {
                                        for (dj5 dj5Var : list4) {
                                            gj5 status3 = dj5Var.getStatus();
                                            status3.getClass();
                                            if (!status3.equals(fj5Var)) {
                                                gj5 status4 = dj5Var.getStatus();
                                                status4.getClass();
                                                if (status4.equals(fj5Var)) {
                                                    z2 = false;
                                                } else {
                                                    if (!(status4 instanceof ej5)) {
                                                        gk0.s();
                                                        return null;
                                                    }
                                                    z2 = ((ej5) status4).a;
                                                }
                                                if (!z2) {
                                                    z3 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
        final byte b3 = 2;
        this.d = d57.b(new Function0(this) { // from class: o.sw4
            public final /* synthetic */ tw4 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                boolean z;
                boolean z2;
                byte b4 = b3;
                boolean z3 = true;
                tw4 tw4Var = this.n;
                fj5 fj5Var = fj5.a;
                switch (b4) {
                    case 0:
                        List list2 = tw4Var.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!im3.n(((dj5) obj).getStatus(), fj5Var)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = tw4Var.b;
                        if (!list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                gj5 status = ((dj5) it.next()).getStatus();
                                status.getClass();
                                if (!status.equals(fj5Var)) {
                                    if (!((List) tw4Var.c.getValue()).isEmpty()) {
                                        z3 = false;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z3);
                    default:
                        List<dj5> list4 = tw4Var.b;
                        if (list4.isEmpty()) {
                            z3 = false;
                        } else {
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                gj5 status2 = ((dj5) it2.next()).getStatus();
                                status2.getClass();
                                if (status2.equals(fj5Var)) {
                                    z = false;
                                } else {
                                    if (!(status2 instanceof ej5)) {
                                        gk0.s();
                                        return null;
                                    }
                                    z = ((ej5) status2).a;
                                }
                                if (z) {
                                    if (!list4.isEmpty()) {
                                        for (dj5 dj5Var : list4) {
                                            gj5 status3 = dj5Var.getStatus();
                                            status3.getClass();
                                            if (!status3.equals(fj5Var)) {
                                                gj5 status4 = dj5Var.getStatus();
                                                status4.getClass();
                                                if (status4.equals(fj5Var)) {
                                                    z2 = false;
                                                } else {
                                                    if (!(status4 instanceof ej5)) {
                                                        gk0.s();
                                                        return null;
                                                    }
                                                    z2 = ((ej5) status4).a;
                                                }
                                                if (!z2) {
                                                    z3 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                }
            }
        });
    }

    @Override // o.ew4
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // o.ew4
    public final List b() {
        return this.b;
    }

    @Override // o.ew4
    public final void c() {
        qk4 qk4Var = this.e;
        if (qk4Var == null) {
            hk0.l("ActivityResultLauncher cannot be null");
            return;
        }
        List list = this.b;
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((dj5) it.next()).a());
        }
        qk4Var.a(arrayList.toArray(new String[0]), null);
    }
}
