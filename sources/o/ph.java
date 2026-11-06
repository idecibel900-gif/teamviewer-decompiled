package o;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ph implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public final AndroidComposeView m;
    public final m9 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public wk0 f1733o;
    public final ArrayList p = new ArrayList();
    public mh q = mh.m;
    public boolean r = true;
    public final kf0 s = ka0.d(1, 6, null);
    public kw4 t;
    public long u;
    public final kw4 v;
    public gp6 w;
    public boolean x;
    public final io.sentry.b5 y;

    public ph(AndroidComposeView androidComposeView, m9 m9Var) {
        this.m = androidComposeView;
        this.n = m9Var;
        new Handler(Looper.getMainLooper());
        kw4 kw4Var = uk3.a;
        kw4Var.getClass();
        this.t = kw4Var;
        this.v = new kw4();
        this.w = new gp6(androidComposeView.getSemanticsOwner().a(), kw4Var);
        this.y = new io.sentry.b5((Object) this, (byte) 24);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (o.im3.A(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(o.jc1 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof o.oh
            if (r0 == 0) goto L13
            r0 = r9
            o.oh r0 = (o.oh) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            o.oh r0 = new o.oh
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.n
            int r1 = r0.p
            r2 = 2
            r3 = 1
            o.ne1 r4 = o.ne1.m
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            o.ff0 r1 = r0.m
            o.ct1.a0(r9)
        L2b:
            r9 = r1
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r8)
            r8 = 0
            return r8
        L34:
            o.ff0 r1 = r0.m
            o.ct1.a0(r9)
            goto L52
        L3a:
            o.ct1.a0(r9)
            o.ff0 r9 = new o.ff0
            o.kf0 r1 = r8.s
            r9.<init>(r1)
        L44:
            r0.m = r9
            r0.p = r3
            java.lang.Object r1 = r9.b(r0)
            if (r1 != r4) goto L4f
            goto L85
        L4f:
            r7 = r1
            r1 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r1.c()
            boolean r9 = r8.d()
            if (r9 == 0) goto L66
            r8.f()
        L66:
            androidx.compose.ui.platform.AndroidComposeView r9 = r8.m
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.x
            if (r5 != 0) goto L79
            if (r9 == 0) goto L79
            r8.x = r3
            io.sentry.b5 r5 = r8.y
            r9.post(r5)
        L79:
            r0.m = r1
            r0.p = r2
            r5 = 100
            java.lang.Object r9 = o.im3.A(r5, r0)
            if (r9 != r4) goto L2b
        L85:
            return r4
        L86:
            o.f88 r8 = o.f88.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ph.a(o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[EDGE_INSN: B:105:0x0173->B:80:0x0173 BREAK  A[LOOP:4: B:48:0x00e9->B:79:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:2: B:21:0x006f->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[LOOP:4: B:48:0x00e9->B:79:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d4 A[EDGE_INSN: B:99:0x00d4->B:44:0x00d4 BREAK  A[LOOP:2: B:21:0x006f->B:42:0x00cb], SYNTHETIC] */
    public final void b(tk3 tk3Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        tk3 tk3Var2 = tk3Var;
        int[] iArr3 = tk3Var2.b;
        long[] jArr = tk3Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        gp6 gp6Var = (gp6) this.v.b(i7);
                        hp6 hp6Var = (hp6) tk3Var2.b(i7);
                        fp6 fp6Var = hp6Var != null ? hp6Var.a : null;
                        if (fp6Var == null) {
                            throw ua5.r("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = fp6Var.f;
                        jx4 jx4Var = fp6Var.d.m;
                        if (gp6Var == null) {
                            Object[] objArr = jx4Var.b;
                            long[] jArr2 = jx4Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                np6 np6Var = (np6) objArr[(i10 << 3) + i12];
                                                np6 np6Var2 = kp6.C;
                                                if (im3.n(np6Var, np6Var2)) {
                                                    Object objG = jx4Var.g(np6Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    h(i8, String.valueOf(list != null ? (xo) lv0.o0(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = jx4Var.b;
                            long[] jArr3 = jx4Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                np6 np6Var3 = (np6) objArr2[(i13 << 3) + i15];
                                                np6 np6Var4 = kp6.C;
                                                if (im3.n(np6Var3, np6Var4)) {
                                                    Object objG2 = gp6Var.a.m.g(np6Var4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    xo xoVar = list2 != null ? (xo) lv0.o0(list2) : null;
                                                    Object objG3 = jx4Var.g(np6Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    xo xoVar2 = list3 != null ? (xo) lv0.o0(list3) : null;
                                                    if (!im3.n(xoVar, xoVar2)) {
                                                        h(i8, String.valueOf(xoVar2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    tk3Var2 = tk3Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            tk3Var2 = tk3Var;
            iArr3 = iArr;
        }
    }

    public final tk3 c() {
        if (this.r) {
            this.r = false;
            this.t = db8.u(this.m.getSemanticsOwner(), new t2((byte) 16));
            this.u = System.currentTimeMillis();
        }
        return this.t;
    }

    public final boolean d() {
        return this.f1733o != null;
    }

    public final void f() {
        wk0 wk0Var = this.f1733o;
        if (wk0Var == null) {
            return;
        }
        Object obj = wk0Var.n;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ta1 ta1Var = (ta1) arrayList.get(i);
            int iOrdinal = ta1Var.c.ordinal();
            if (iOrdinal == 0) {
                l07 l07Var = ta1Var.d;
                if (l07Var != null) {
                    ViewStructure viewStructure = (ViewStructure) l07Var.n;
                    if (Build.VERSION.SDK_INT >= 29) {
                        eq.m(va1.h(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    gk0.s();
                    return;
                }
                AutofillId autofillIdZ = wk0Var.z(ta1Var.a);
                if (autofillIdZ != null && Build.VERSION.SDK_INT >= 29) {
                    eq.n(va1.h(obj), autofillIdZ);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            eq.p(va1.h(obj), ((View) wk0Var.f2420o).getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void g(fp6 fp6Var, gp6 gp6Var) {
        c9 c9Var = new c9((Object) gp6Var, (Object) this, (byte) 2);
        fp6Var.getClass();
        List listI = fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listI.get(i2);
            if (c().a(((fp6) obj).f)) {
                c9Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List listI2 = fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            fp6 fp6Var2 = (fp6) listI2.get(i3);
            tk3 tk3VarC = c();
            int i4 = fp6Var2.f;
            if (tk3VarC.a(i4)) {
                kw4 kw4Var = this.v;
                if (kw4Var.a(i4)) {
                    Object objB = kw4Var.b(i4);
                    if (objB == null) {
                        throw ua5.r("node not present in pruned tree before this change");
                    }
                    g(fp6Var2, (gp6) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void h(int i, String str) {
        wk0 wk0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (wk0Var = this.f1733o) != null) {
            AutofillId autofillIdZ = wk0Var.z(i);
            if (autofillIdZ == null) {
                throw ua5.r("Invalid content capture ID");
            }
            if (i2 >= 29) {
                eq.o(va1.h(wk0Var.n), autofillIdZ, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x018d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public final void i(int i, fp6 fp6Var) {
        Function1 function1;
        int i2;
        v56 v56VarA;
        l07 l07Var;
        String strU;
        Function1 function2;
        if (d()) {
            jx4 jx4Var = fp6Var.d.m;
            Object objG = jx4Var.g(kp6.E);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.q == mh.m && im3.n(bool, Boolean.TRUE)) {
                Object objG2 = jx4Var.g(zo6.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                m3 m3Var = (m3) objG2;
                if (m3Var != null && (function2 = (Function1) m3Var.b) != null) {
                }
            } else if (this.q == mh.n && im3.n(bool, Boolean.FALSE)) {
                Object objG3 = jx4Var.g(zo6.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                m3 m3Var2 = (m3) objG3;
                if (m3Var2 != null && (function1 = (Function1) m3Var2.b) != null) {
                }
            }
            int i3 = fp6Var.f;
            wk0 wk0Var = this.f1733o;
            if (wk0Var != null && (i2 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.m.getAutofillId();
                fp6 fp6VarL = fp6Var.l();
                int i4 = fp6Var.f;
                if (fp6VarL == null || (autofillId = wk0Var.z(fp6VarL.f)) != null) {
                    l07 l07Var2 = i2 >= 29 ? new l07((Object) eq.l(va1.h(wk0Var.n), autofillId, i4), (byte) 24) : null;
                    if (l07Var2 == null) {
                        l07Var = null;
                    } else {
                        ViewStructure viewStructure = (ViewStructure) l07Var2.n;
                        ap6 ap6Var = fp6Var.d;
                        np6 np6Var = kp6.N;
                        jx4 jx4Var2 = ap6Var.m;
                        if (jx4Var2.c(np6Var)) {
                            l07Var = null;
                        } else {
                            Bundle extras = viewStructure.getExtras();
                            if (extras != null) {
                                extras.putLong("android.view.contentcapture.EventTimestamp", this.u);
                                extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                            }
                            Object objG4 = jx4Var2.g(kp6.A);
                            if (objG4 == null) {
                                objG4 = null;
                            }
                            String str = (String) objG4;
                            if (str != null) {
                                viewStructure.setId(i4, null, null, str);
                            }
                            Object objG5 = jx4Var2.g(kp6.n);
                            if (objG5 == null) {
                                objG5 = null;
                            }
                            if (((Boolean) objG5) != null) {
                                viewStructure.setClassName("android.widget.ViewGroup");
                            }
                            Object objG6 = jx4Var2.g(kp6.C);
                            if (objG6 == null) {
                                objG6 = null;
                            }
                            List list = (List) objG6;
                            if (list != null) {
                                viewStructure.setClassName("android.widget.TextView");
                                viewStructure.setText(gc4.a(list, "\n", null, 62));
                            }
                            Object objG7 = jx4Var2.g(kp6.G);
                            if (objG7 == null) {
                                objG7 = null;
                            }
                            xo xoVar = (xo) objG7;
                            if (xoVar != null) {
                                viewStructure.setClassName("android.widget.EditText");
                                viewStructure.setText(xoVar);
                            }
                            Object objG8 = jx4Var2.g(kp6.a);
                            if (objG8 == null) {
                                objG8 = null;
                            }
                            List list2 = (List) objG8;
                            if (list2 != null) {
                                viewStructure.setContentDescription(gc4.a(list2, "\n", null, 62));
                            }
                            Object objG9 = jx4Var2.g(kp6.z);
                            if (objG9 == null) {
                                objG9 = null;
                            }
                            pe6 pe6Var = (pe6) objG9;
                            if (pe6Var != null && (strU = bt1.U(pe6Var.a)) != null) {
                                viewStructure.setClassName(strU);
                            }
                            vs7 vs7VarF = bt1.F(ap6Var);
                            if (vs7VarF != null) {
                                us7 us7Var = vs7VarF.a;
                                ot7 ot7Var = us7Var.b;
                                in1 in1Var = us7Var.g;
                                viewStructure.setTextStyle(in1Var.Z() * in1Var.getDensity() * qt7.c(ot7Var.a.b), 0, 0, 0);
                            }
                            e45 e45VarD = fp6Var.d();
                            if (e45VarD == null) {
                                v56VarA = v56.e;
                            } else {
                                e45 e45Var = e45VarD.a1().z ? e45VarD : null;
                                if (e45Var != null) {
                                    v56VarA = fp6Var.a(e45Var);
                                } else {
                                    v56VarA = v56.e;
                                }
                            }
                            float f = v56VarA.a;
                            float f2 = v56VarA.b;
                            viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (v56VarA.c - f), (int) (v56VarA.d - f2));
                            l07Var = l07Var2;
                        }
                    }
                } else {
                    l07Var = null;
                }
            } else {
                l07Var = null;
            }
            if (l07Var != null) {
                this.p.add(new ta1(i3, this.u, ua1.m, l07Var));
            }
            List listI = fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = listI.get(i6);
                if (c().a(((fp6) obj).f)) {
                    i(i5, (fp6) obj);
                    i5++;
                }
            }
        }
    }

    public final void j(fp6 fp6Var) {
        if (d()) {
            this.p.add(new ta1(fp6Var.f, this.u, ua1.n, null));
            List listI = fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                j((fp6) listI.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void k() {
        kw4 kw4Var = this.v;
        kw4Var.c();
        tk3 tk3VarC = c();
        int[] iArr = tk3VarC.b;
        Object[] objArr = tk3VarC.c;
        long[] jArr = tk3VarC.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            kw4Var.i(iArr[i4], new gp6(((hp6) objArr[i4]).a, c()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.w = new gp6(this.m.getSemanticsOwner().a(), c());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f1733o = (wk0) this.n.a();
        i(-1, this.m.getSemanticsOwner().a());
        f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        j(this.m.getSemanticsOwner().a());
        f();
        this.f1733o = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.m.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.y);
        this.f1733o = null;
    }
}
