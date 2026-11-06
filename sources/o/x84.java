package o;

import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x84 {
    public final boolean b;
    public final r98 d;
    public int e;
    public boolean f;
    public boolean g;
    public m84 i;
    public final l97 j;
    public df6 a = new df6((byte) 21);
    public iu c = new iu((byte) 25);
    public final ArrayList h = new ArrayList();

    public x84(LifecycleOwner lifecycleOwner, boolean z) {
        this.b = z;
        this.d = new r98(lifecycleOwner);
        m84 m84Var = m84.n;
        this.i = m84Var;
        this.j = im3.k(m84Var);
    }

    public final void a(u84 u84Var) {
        s84 sk1Var;
        w84 w84Var;
        LifecycleOwner lifecycleOwner;
        l84 l84Var;
        u84Var.getClass();
        c("addObserver");
        m84 m84Var = this.i;
        m84 m84Var2 = m84.m;
        if (m84Var != m84Var2) {
            m84Var2 = m84.n;
        }
        w84 w84Var2 = new w84();
        w84Var2.a = m84Var2;
        HashMap map = f94.a;
        boolean z = u84Var instanceof s84;
        boolean z2 = u84Var instanceof DefaultLifecycleObserver;
        byte b = 2;
        Object obj = null;
        byte b2 = 0;
        if (z && z2) {
            sk1Var = new sk1((DefaultLifecycleObserver) u84Var, (s84) u84Var, b2);
        } else if (z2) {
            sk1Var = new sk1((DefaultLifecycleObserver) u84Var, obj, b2);
        } else if (z) {
            sk1Var = (s84) u84Var;
        } else {
            Class<?> cls = u84Var.getClass();
            if (f94.b(cls) == 2) {
                Object obj2 = f94.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    f94.a((Constructor) list.get(0), u84Var);
                    throw null;
                }
                int size = list.size();
                by2[] by2VarArr = new by2[size];
                if (size > 0) {
                    f94.a((Constructor) list.get(0), u84Var);
                    throw null;
                }
                sk1Var = new u56(by2VarArr, b);
            } else {
                sk1Var = new sk1(u84Var);
            }
        }
        w84Var2.b = sk1Var;
        iu iuVar = this.c;
        iuVar.getClass();
        jx4 jx4Var = (jx4) iuVar.f1103o;
        sh2 sh2Var = (sh2) jx4Var.g(u84Var);
        if (sh2Var != null) {
            w84Var = sh2Var.n;
        } else {
            sh2 sh2Var2 = new sh2(u84Var, w84Var2);
            jx4Var.m(u84Var, sh2Var2);
            sh2 sh2Var3 = (sh2) iuVar.n;
            if (sh2Var3 == null) {
                iuVar.p = sh2Var2;
                iuVar.n = sh2Var2;
            } else {
                sh2Var3.f2022o = sh2Var2;
                sh2Var2.p = sh2Var3;
                iuVar.n = sh2Var2;
            }
            w84Var = null;
        }
        if (w84Var == null && (lifecycleOwner = (LifecycleOwner) this.d.a.get()) != null) {
            b2 = (this.e != 0 || this.f) ? (byte) 1 : (byte) 0;
            m84 m84VarB = b(u84Var);
            this.e++;
            while (w84Var2.a.compareTo(m84VarB) < 0) {
                iu iuVar2 = this.c;
                iuVar2.getClass();
                if (!((jx4) iuVar2.f1103o).c(u84Var)) {
                    break;
                }
                m84 m84Var3 = w84Var2.a;
                ArrayList arrayList = this.h;
                arrayList.add(m84Var3);
                j84 j84Var = l84.Companion;
                m84 m84Var4 = w84Var2.a;
                j84Var.getClass();
                m84Var4.getClass();
                int iOrdinal = m84Var4.ordinal();
                if (iOrdinal == 1) {
                    l84Var = l84.ON_CREATE;
                } else if (iOrdinal != 2) {
                    l84Var = iOrdinal != 3 ? null : l84.ON_RESUME;
                } else {
                    l84Var = l84.ON_START;
                }
                if (l84Var == null) {
                    hk0.n(w84Var2.a, "no event up from ");
                    return;
                } else {
                    w84Var2.a(lifecycleOwner, l84Var);
                    qv0.f0(arrayList);
                    m84VarB = b(u84Var);
                }
            }
            if (b2 == 0) {
                g();
            }
            this.e--;
        }
    }

    public final m84 b(u84 u84Var) {
        iu iuVar = this.c;
        iuVar.getClass();
        u84Var.getClass();
        sh2 sh2Var = (sh2) ((jx4) iuVar.f1103o).g(u84Var);
        sh2 sh2Var2 = sh2Var != null ? sh2Var.p : null;
        m84 m84Var = sh2Var2 != null ? sh2Var2.n.a : null;
        ArrayList arrayList = this.h;
        m84 m84Var2 = arrayList.isEmpty() ? null : (m84) ua5.j(1, arrayList);
        m84 m84Var3 = this.i;
        if (m84Var == null || m84Var.compareTo(m84Var3) >= 0) {
            m84Var = m84Var3;
        }
        return (m84Var2 == null || m84Var2.compareTo(m84Var) >= 0) ? m84Var : m84Var2;
    }

    public final void c(String str) {
        if (this.b) {
            yv.u().getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            an4.g(fx3.g("Method ", str, " must be called on the main thread"));
        }
    }

    public final void d(l84 l84Var) {
        l84Var.getClass();
        c("handleLifecycleEvent");
        e(l84Var.a());
    }

    public final void e(m84 m84Var) {
        if (this.i == m84Var) {
            return;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.d.a.get();
        m84 m84Var2 = this.i;
        m84 m84Var3 = m84.n;
        m84 m84Var4 = m84.m;
        if (m84Var2 == m84Var3 && m84Var == m84Var4) {
            throw new IllegalStateException(("State must be at least '" + m84.f1446o + "' to be moved to '" + m84Var + "' in component " + lifecycleOwner).toString());
        }
        if (m84Var2 == m84Var4 && m84Var2 != m84Var) {
            throw new IllegalStateException(("State is '" + m84Var4 + "' and cannot be moved to `" + m84Var + "` in component " + lifecycleOwner).toString());
        }
        this.i = m84Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.i == m84Var4) {
            this.c = new iu((byte) 25);
        }
    }

    public final void f(u84 u84Var) {
        u84Var.getClass();
        c("removeObserver");
        iu iuVar = this.c;
        iuVar.getClass();
        sh2 sh2Var = (sh2) ((jx4) iuVar.f1103o).k(u84Var);
        if (sh2Var == null) {
            return;
        }
        sh2 sh2Var2 = sh2Var.p;
        sh2 sh2Var3 = sh2Var.f2022o;
        if (sh2Var2 == null) {
            iuVar.p = sh2Var3;
        } else {
            sh2Var2.f2022o = sh2Var3;
        }
        sh2 sh2Var4 = sh2Var.f2022o;
        if (sh2Var4 == null) {
            iuVar.n = sh2Var2;
        } else {
            sh2Var4.p = sh2Var2;
        }
        sh2Var.q = true;
    }

    public final void g() {
        Object obj = this.d.a.get();
        if (obj == null) {
            hk0.l("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
        while (true) {
            iu iuVar = this.c;
            final byte b = 0;
            if (((jx4) iuVar.f1103o).e == 0) {
                break;
            }
            sh2 sh2Var = (sh2) iuVar.p;
            if (sh2Var == null) {
                an4.j("Collection is empty.");
                return;
            }
            m84 m84Var = sh2Var.n.a;
            sh2 sh2Var2 = (sh2) iuVar.n;
            if (sh2Var2 == null) {
                an4.j("Collection is empty.");
                return;
            }
            m84 m84Var2 = sh2Var2.n.a;
            if (m84Var == m84Var2 && this.i == m84Var2) {
                break;
            }
            this.g = false;
            m84 m84Var3 = this.i;
            if (sh2Var == null) {
                an4.j("Collection is empty.");
                return;
            }
            if (m84Var3.compareTo(m84Var) < 0) {
                iu iuVar2 = this.c;
                Function1 function1 = new Function1(this) { // from class: o.v84
                    public final /* synthetic */ x84 n;

                    {
                        this.n = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l84 l84Var;
                        byte b2 = b;
                        f88 f88Var = f88.a;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        x84 x84Var = this.n;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (b2) {
                            case 0:
                                entry.getClass();
                                u84 u84Var = (u84) entry.getKey();
                                w84 w84Var = (w84) entry.getValue();
                                while (true) {
                                    m84 m84Var4 = w84Var.a;
                                    m84 m84Var5 = x84Var.i;
                                    ArrayList arrayList = x84Var.h;
                                    if (m84Var4.compareTo(m84Var5) <= 0 || x84Var.g) {
                                        return f88Var;
                                    }
                                    iu iuVar3 = x84Var.c;
                                    iuVar3.getClass();
                                    u84Var.getClass();
                                    if (!((jx4) iuVar3.f1103o).c(u84Var)) {
                                        return f88Var;
                                    }
                                    j84 j84Var = l84.Companion;
                                    m84 m84Var6 = w84Var.a;
                                    j84Var.getClass();
                                    l84 l84VarA = j84.a(m84Var6);
                                    if (l84VarA == null) {
                                        yq4.k(w84Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(l84VarA.a());
                                    w84Var.a(lifecycleOwner2, l84VarA);
                                    qv0.f0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                u84 u84Var2 = (u84) entry.getKey();
                                w84 w84Var2 = (w84) entry.getValue();
                                while (true) {
                                    m84 m84Var7 = w84Var2.a;
                                    m84 m84Var8 = x84Var.i;
                                    ArrayList arrayList2 = x84Var.h;
                                    if (m84Var7.compareTo(m84Var8) >= 0 || x84Var.g) {
                                        return f88Var;
                                    }
                                    iu iuVar4 = x84Var.c;
                                    iuVar4.getClass();
                                    u84Var2.getClass();
                                    if (!((jx4) iuVar4.f1103o).c(u84Var2)) {
                                        return f88Var;
                                    }
                                    arrayList2.add(w84Var2.a);
                                    j84 j84Var2 = l84.Companion;
                                    m84 m84Var9 = w84Var2.a;
                                    j84Var2.getClass();
                                    m84Var9.getClass();
                                    int iOrdinal = m84Var9.ordinal();
                                    if (iOrdinal == 1) {
                                        l84Var = l84.ON_CREATE;
                                    } else if (iOrdinal != 2) {
                                        l84Var = iOrdinal != 3 ? null : l84.ON_RESUME;
                                    } else {
                                        l84Var = l84.ON_START;
                                    }
                                    if (l84Var == null) {
                                        yq4.k(w84Var2.a, "no event up from ");
                                        return null;
                                    }
                                    w84Var2.a(lifecycleOwner2, l84Var);
                                    qv0.f0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                iuVar2.getClass();
                for (sh2 sh2Var3 = (sh2) iuVar2.n; sh2Var3 != null; sh2Var3 = sh2Var3.p) {
                    if (!sh2Var3.q) {
                        function1.invoke(sh2Var3);
                    }
                }
            }
            sh2 sh2Var4 = (sh2) this.c.n;
            if (!this.g && sh2Var4 != null && this.i.compareTo(sh2Var4.n.a) > 0) {
                iu iuVar3 = this.c;
                final byte b2 = 1;
                Function1 function2 = new Function1(this) { // from class: o.v84
                    public final /* synthetic */ x84 n;

                    {
                        this.n = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        l84 l84Var;
                        byte b3 = b2;
                        f88 f88Var = f88.a;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        x84 x84Var = this.n;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (b3) {
                            case 0:
                                entry.getClass();
                                u84 u84Var = (u84) entry.getKey();
                                w84 w84Var = (w84) entry.getValue();
                                while (true) {
                                    m84 m84Var4 = w84Var.a;
                                    m84 m84Var5 = x84Var.i;
                                    ArrayList arrayList = x84Var.h;
                                    if (m84Var4.compareTo(m84Var5) <= 0 || x84Var.g) {
                                        return f88Var;
                                    }
                                    iu iuVar4 = x84Var.c;
                                    iuVar4.getClass();
                                    u84Var.getClass();
                                    if (!((jx4) iuVar4.f1103o).c(u84Var)) {
                                        return f88Var;
                                    }
                                    j84 j84Var = l84.Companion;
                                    m84 m84Var6 = w84Var.a;
                                    j84Var.getClass();
                                    l84 l84VarA = j84.a(m84Var6);
                                    if (l84VarA == null) {
                                        yq4.k(w84Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(l84VarA.a());
                                    w84Var.a(lifecycleOwner2, l84VarA);
                                    qv0.f0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                u84 u84Var2 = (u84) entry.getKey();
                                w84 w84Var2 = (w84) entry.getValue();
                                while (true) {
                                    m84 m84Var7 = w84Var2.a;
                                    m84 m84Var8 = x84Var.i;
                                    ArrayList arrayList2 = x84Var.h;
                                    if (m84Var7.compareTo(m84Var8) >= 0 || x84Var.g) {
                                        return f88Var;
                                    }
                                    iu iuVar5 = x84Var.c;
                                    iuVar5.getClass();
                                    u84Var2.getClass();
                                    if (!((jx4) iuVar5.f1103o).c(u84Var2)) {
                                        return f88Var;
                                    }
                                    arrayList2.add(w84Var2.a);
                                    j84 j84Var2 = l84.Companion;
                                    m84 m84Var9 = w84Var2.a;
                                    j84Var2.getClass();
                                    m84Var9.getClass();
                                    int iOrdinal = m84Var9.ordinal();
                                    if (iOrdinal == 1) {
                                        l84Var = l84.ON_CREATE;
                                    } else if (iOrdinal != 2) {
                                        l84Var = iOrdinal != 3 ? null : l84.ON_RESUME;
                                    } else {
                                        l84Var = l84.ON_START;
                                    }
                                    if (l84Var == null) {
                                        yq4.k(w84Var2.a, "no event up from ");
                                        return null;
                                    }
                                    w84Var2.a(lifecycleOwner2, l84Var);
                                    qv0.f0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                iuVar3.getClass();
                for (sh2 sh2Var5 = (sh2) iuVar3.p; sh2Var5 != null; sh2Var5 = sh2Var5.f2022o) {
                    if (!sh2Var5.q) {
                        function2.invoke(sh2Var5);
                    }
                }
            }
        }
        this.g = false;
        this.j.k(this.i);
    }
}
