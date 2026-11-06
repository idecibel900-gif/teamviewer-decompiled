package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import io.sentry.android.replay.e0;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.l6;
import io.sentry.m7;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function1;
import o.ap6;
import o.ds1;
import o.fs4;
import o.gk0;
import o.gs4;
import o.i04;
import o.im3;
import o.j51;
import o.jx4;
import o.kp6;
import o.l54;
import o.lv0;
import o.m3;
import o.nf;
import o.ot7;
import o.qt7;
import o.rv0;
import o.ti3;
import o.u14;
import o.ub7;
import o.ud5;
import o.us7;
import o.v56;
import o.vs7;
import o.vt1;
import o.xv0;
import o.zo6;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final u14 a = ds1.X(l54.n, a.n);
    public static boolean b;
    public static WeakReference c;

    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    public static boolean a(ap6 ap6Var, boolean z, l6 l6Var) {
        String str;
        Object obj = null;
        if (ap6Var != null) {
            Object objG = ap6Var.m.g(e0.a);
            obj = (String) (objG != null ? objG : null);
        }
        if (im3.n(obj, "unmask")) {
            l6Var.C();
            return false;
        }
        if (im3.n(obj, "mask")) {
            l6Var.C();
            return true;
        }
        if (z) {
            str = "android.widget.ImageView";
        } else if (ap6Var != null) {
            jx4 jx4Var = ap6Var.m;
            if (jx4Var.c(kp6.C) || jx4Var.c(zo6.k) || jx4Var.c(kp6.G)) {
                str = "android.widget.TextView";
            } else {
                str = "android.view.View";
            }
        } else {
            str = "android.view.View";
        }
        if (((CopyOnWriteArraySet) l6Var.b).contains(str)) {
            return false;
        }
        return ((CopyOnWriteArraySet) l6Var.a).contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0272  */
    /* JADX WARN: Code duplicated, block: B:106:0x027c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0281  */
    /* JADX WARN: Code duplicated, block: B:114:0x0295  */
    /* JADX WARN: Code duplicated, block: B:119:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:137:0x031b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0320  */
    /* JADX WARN: Code duplicated, block: B:144:0x0332  */
    /* JADX WARN: Code duplicated, block: B:147:0x0337  */
    /* JADX WARN: Code duplicated, block: B:148:0x033b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0347 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x0352  */
    /* JADX WARN: Code duplicated, block: B:156:0x0355  */
    /* JADX WARN: Code duplicated, block: B:157:0x0363  */
    /* JADX WARN: Code duplicated, block: B:159:0x0394  */
    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:161:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:165:0x03db A[Catch: all -> 0x03df, EDGE_INSN: B:165:0x03db->B:169:0x03e5 BREAK  A[LOOP:2: B:160:0x03ab->B:168:0x03e2], TRY_LEAVE, TryCatch #6 {all -> 0x03df, blocks: (B:163:0x03c5, B:165:0x03db), top: B:238:0x03c5 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x03e2 A[LOOP:2: B:160:0x03ab->B:168:0x03e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:174:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:177:0x0400  */
    /* JADX WARN: Code duplicated, block: B:179:0x0410  */
    /* JADX WARN: Code duplicated, block: B:184:0x0422  */
    /* JADX WARN: Code duplicated, block: B:186:0x042e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0430  */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:190:0x0438  */
    /* JADX WARN: Code duplicated, block: B:201:0x0481  */
    /* JADX WARN: Code duplicated, block: B:204:0x049a  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:215:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:218:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:238:0x03c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x021b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0231  */
    /* JADX WARN: Code duplicated, block: B:90:0x024d A[PHI: r9
      0x024d: PHI (r9v6 boolean) = (r9v15 boolean), (r9v17 boolean) binds: [B:89:0x024b, B:84:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0252  */
    /* JADX WARN: Code duplicated, block: B:96:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0261  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [o.i04] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [o.i04] */
    public static void b(LayoutNode layoutNode, g gVar, boolean z, l6 l6Var, g1 g1Var) throws Throwable {
        List<LayoutNode> children$ui;
        List<LayoutNode> children$ui2;
        ArrayList arrayList;
        int size;
        int i;
        LayoutNode layoutNode2;
        boolean zX;
        ArrayList arrayList2;
        int i2;
        g gVar2;
        ?? r15;
        g fVar;
        ArrayList arrayList3;
        ?? S;
        v56 v56Var;
        int i3;
        g cVar;
        ?? r6;
        ap6 ap6VarH;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        List listD;
        int size2;
        int i5;
        ud5 ud5Var;
        boolean z6;
        boolean z7;
        ud5 ud5Var2;
        boolean z8;
        String name;
        fs4 fs4Var;
        Object obj;
        boolean z9;
        ArrayList arrayList4;
        vs7 vs7Var;
        rv0 rv0Var;
        boolean z10;
        qt7 qt7Var;
        long j;
        boolean zA;
        m7 m7Var;
        Integer numValueOf;
        us7 us7Var;
        ot7 ot7Var;
        us7 us7Var2;
        ot7 ot7Var2;
        Object objG;
        m3 m3Var;
        Function1 function1;
        i04 i04Var;
        g gVar3 = gVar;
        u14 u14Var = a;
        Boolean bool = io.sentry.config.a.a;
        Boolean bool2 = Boolean.FALSE;
        g gVar4 = null;
        if (im3.n(bool, bool2)) {
            children$ui = layoutNode.getChildren$ui();
        } else {
            if (!im3.n(bool, Boolean.TRUE)) {
                if (bool != null) {
                    gk0.s();
                    return;
                }
                try {
                    children$ui2 = layoutNode.getChildren$ui();
                    io.sentry.config.a.a = bool2;
                } catch (NoSuchMethodError unused) {
                    io.sentry.config.a.a = Boolean.TRUE;
                    Method method = (Method) io.sentry.config.a.r().n;
                    method.getClass();
                    Object objInvoke = method.invoke(layoutNode, null);
                    objInvoke.getClass();
                    children$ui = (List) objInvoke;
                    children$ui2 = children$ui;
                }
                if (children$ui2.isEmpty()) {
                    return;
                }
                arrayList = new ArrayList(children$ui2.size());
                size = children$ui2.size();
                for (i = 0; i < size; i = i2 + 1) {
                    layoutNode2 = children$ui2.get(i);
                    zX = layoutNode2.X();
                    nf nfVar = layoutNode2.S;
                    if (zX || !layoutNode2.W()) {
                        children$ui2 = children$ui2;
                        arrayList2 = arrayList;
                        size = size;
                        i2 = i;
                        layoutNode2 = layoutNode2;
                        gVar2 = gVar4;
                        r15 = 0;
                        fVar = gVar2;
                    } else {
                        if (z) {
                            c = new WeakReference(vt1.s((ti3) nfVar.d));
                        }
                        ti3 ti3Var = (ti3) nfVar.d;
                        WeakReference weakReference = c;
                        if (weakReference != null) {
                            i04Var = (i04) weakReference.get();
                        } else {
                            S = gVar4;
                        }
                        if (S == 0) {
                            S = i04Var;
                            S = vt1.s(ti3Var);
                        }
                        S = i04Var;
                        float fJ = (int) (S.j() >> 32);
                        int i6 = i;
                        float fJ2 = (int) (S.j() & 4294967295L);
                        v56 v56VarB = S.b(ti3Var, true);
                        float f = v56VarB.a;
                        if (f < 0.0f) {
                            f = 0.0f;
                        }
                        if (f > fJ) {
                            f = fJ;
                        }
                        float f2 = v56VarB.b;
                        if (f2 < 0.0f) {
                            f2 = 0.0f;
                        }
                        if (f2 > fJ2) {
                            f2 = fJ2;
                        }
                        float f3 = v56VarB.c;
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        }
                        if (f3 <= fJ) {
                            fJ = f3;
                        }
                        float f4 = v56VarB.d;
                        if (f4 < 0.0f) {
                            f4 = 0.0f;
                        }
                        if (f4 <= fJ2) {
                            fJ2 = f4;
                        }
                        if (f == fJ || f2 == fJ2) {
                            v56Var = new v56(0.0f, 0.0f, 0.0f, 0.0f);
                            arrayList2 = arrayList;
                            i2 = i6;
                        } else {
                            List<LayoutNode> list = children$ui2;
                            long jE = S.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
                            long jE2 = S.e((((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
                            long jE3 = S.e((((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fJ2)) & 4294967295L));
                            long jE4 = S.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fJ2)) & 4294967295L));
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE2 >> 32));
                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE4 >> 32));
                            ArrayList arrayList5 = arrayList;
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE3 >> 32));
                            float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
                            float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
                            children$ui2 = list;
                            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jE & 4294967295L));
                            arrayList2 = arrayList5;
                            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jE2 & 4294967295L));
                            float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jE4 & 4294967295L));
                            i2 = i6;
                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jE3 & 4294967295L));
                            v56Var = new v56(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
                        }
                        try {
                            ap6VarH = layoutNode2.H();
                        } catch (Throwable th) {
                            try {
                                if (((Method) u14Var.getValue()) != null) {
                                    Method method2 = (Method) u14Var.getValue();
                                    method2.getClass();
                                    try {
                                        ap6VarH = (ap6) method2.invoke(layoutNode2, null);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        gVar2 = null;
                                        i3 = 0;
                                        if (!b) {
                                            b = true;
                                            g1Var.b(f6.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i3]);
                                        }
                                        if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                                            throw th;
                                        }
                                        int I = layoutNode2.I();
                                        int iR = layoutNode2.r();
                                        float f5 = gVar3.c;
                                        if (io.sentry.config.a.z(layoutNode2)) {
                                            r6 = i3;
                                        } else {
                                            r6 = i3;
                                        }
                                        cVar = new c(I, iR, f5, gVar3, true, r6, io.sentry.config.a.E(v56Var));
                                        i4 = i3;
                                    }
                                } else {
                                    i3 = 0;
                                    gVar2 = null;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (!b) {
                                            b = true;
                                            g1Var.b(f6.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i3]);
                                        }
                                        if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                                            throw th;
                                        }
                                        int I2 = layoutNode2.I();
                                        int iR2 = layoutNode2.r();
                                        float f6 = gVar3.c;
                                        if (io.sentry.config.a.z(layoutNode2)) {
                                            r6 = i3;
                                        } else {
                                            r6 = i3;
                                        }
                                        cVar = new c(I2, iR2, f6, gVar3, true, r6, io.sentry.config.a.E(v56Var));
                                        i4 = i3;
                                        fVar = cVar;
                                        r15 = i4;
                                        arrayList3 = arrayList2;
                                        if (fVar != null) {
                                            arrayList3.add(fVar);
                                            b(layoutNode2, fVar, r15, l6Var, g1Var);
                                        }
                                        arrayList = arrayList3;
                                        children$ui2 = children$ui2;
                                        size = size;
                                        gVar4 = gVar2;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                i3 = 0;
                                gVar2 = null;
                            }
                            if (!b) {
                                b = true;
                                g1Var.b(f6.ERROR, th, "Error retrieving semantics information from Compose tree. Most likely you're using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.10.2.\nIf you're using a newer version, please open a github issue with the version\nyou're using, so we can add support for it.", new Object[i3]);
                            }
                            if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                                throw th;
                            }
                            int I3 = layoutNode2.I();
                            int iR3 = layoutNode2.r();
                            float f7 = gVar3.c;
                            if (io.sentry.config.a.z(layoutNode2) || v56Var.d - v56Var.b <= 0.0f || v56Var.c - v56Var.a <= 0.0f) {
                                r6 = i3;
                            } else {
                                r6 = 1;
                            }
                            cVar = new c(I3, iR3, f7, gVar3, true, r6, io.sentry.config.a.E(v56Var));
                            i4 = i3;
                            fVar = cVar;
                            r15 = i4;
                            arrayList3 = arrayList2;
                            if (fVar != null) {
                                arrayList3.add(fVar);
                                b(layoutNode2, fVar, r15, l6Var, g1Var);
                            }
                            arrayList = arrayList3;
                            children$ui2 = children$ui2;
                            size = size;
                            gVar4 = gVar2;
                        }
                        if (io.sentry.config.a.z(layoutNode2)) {
                            z2 = false;
                        } else if (ap6VarH != null) {
                            if (ap6VarH.m.c(kp6.p)) {
                                z2 = false;
                            } else if (v56Var.d - v56Var.b > 0.0f || v56Var.c - v56Var.a <= 0.0f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (v56Var.d - v56Var.b > 0.0f) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (ap6VarH != null) {
                            z3 = true;
                            z4 = ap6VarH.m.c(zo6.k) ? z3 : false;
                            if (ap6VarH != null) {
                                if (ap6VarH.m.c(kp6.C) != z3) {
                                    if (z4) {
                                        children$ui2 = children$ui2;
                                        size = size;
                                        arrayList2 = arrayList2;
                                        layoutNode2 = layoutNode2;
                                        z5 = z2;
                                        i2 = i2;
                                        i4 = 0;
                                        i4 = 0;
                                        gVar2 = null;
                                        listD = layoutNode2.D();
                                        size2 = listD.size();
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < size2) {
                                                fs4Var = ((gs4) listD.get(i5)).a;
                                                if (ub7.Q(fs4Var.getClass().getName(), "Painter", false)) {
                                                    try {
                                                        Field declaredField = fs4Var.getClass().getDeclaredField("painter");
                                                        declaredField.setAccessible(true);
                                                        obj = declaredField.get(fs4Var);
                                                        if (obj instanceof ud5) {
                                                            ud5Var = (ud5) obj;
                                                            break;
                                                        }
                                                    } catch (Throwable unused2) {
                                                    }
                                                } else {
                                                    i5++;
                                                }
                                            }
                                            ud5Var = null;
                                            break;
                                        }
                                        if (ud5Var != null) {
                                            if (z5 || !a(ap6VarH, true, l6Var)) {
                                                z7 = false;
                                            } else {
                                                z7 = true;
                                            }
                                            int I4 = layoutNode2.I();
                                            ud5Var2 = ud5Var;
                                            int iR4 = layoutNode2.r();
                                            float f8 = gVar3.c;
                                            if (z7) {
                                                name = ud5Var2.getClass().getName();
                                                if (!ub7.Q(name, "Vector", false) || ub7.Q(name, "Color", false) || ub7.Q(name, "Brush", false)) {
                                                    z8 = false;
                                                } else {
                                                    z8 = true;
                                                }
                                            } else {
                                                z8 = false;
                                            }
                                            cVar = new d(I4, iR4, f8, gVar3, z8, z5, io.sentry.config.a.E(v56Var));
                                        } else {
                                            if (z5 || !a(ap6VarH, false, l6Var)) {
                                                z6 = false;
                                            } else {
                                                z6 = true;
                                            }
                                            cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.E(v56Var));
                                        }
                                        fVar = cVar;
                                        r15 = i4;
                                    }
                                }
                                if (z2 || !a(ap6VarH, false, l6Var)) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                arrayList4 = new ArrayList();
                                if (ap6VarH != null) {
                                    objG = ap6VarH.m.g(zo6.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    m3Var = (m3) objG;
                                    if (m3Var != null && (function1 = (Function1) m3Var.b) != null) {
                                    }
                                }
                                vs7Var = (vs7) lv0.o0(arrayList4);
                                if (vs7Var != null || (us7Var2 = vs7Var.a) == null || (ot7Var2 = us7Var2.b) == null) {
                                    rv0Var = null;
                                } else {
                                    rv0Var = new rv0(ot7Var2.c());
                                }
                                if (rv0Var == null && rv0Var.a == 16) {
                                    List listD2 = layoutNode2.D();
                                    int size3 = listD2.size();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < size3) {
                                            List list2 = listD2;
                                            fs4 fs4Var2 = ((gs4) listD2.get(i7)).a;
                                            int i8 = size3;
                                            int i9 = i7;
                                            z10 = z4;
                                            if (ub7.Q(fs4Var2.getClass().getName(), "Text", false)) {
                                                try {
                                                    Field declaredField2 = fs4Var2.getClass().getDeclaredField("color");
                                                    declaredField2.setAccessible(true);
                                                    Object obj2 = declaredField2.get(fs4Var2);
                                                    xv0 xv0Var = obj2 instanceof xv0 ? (xv0) obj2 : null;
                                                    if (xv0Var != null) {
                                                        rv0Var = new rv0(xv0Var.a());
                                                        break;
                                                    }
                                                } catch (Throwable unused3) {
                                                }
                                            } else {
                                                i7 = i9 + 1;
                                                listD2 = list2;
                                                size3 = i8;
                                                z4 = z10;
                                            }
                                        } else {
                                            z10 = z4;
                                        }
                                        rv0Var = null;
                                        break;
                                    }
                                } else {
                                    z10 = z4;
                                }
                                if (vs7Var != null || (us7Var = vs7Var.a) == null || (ot7Var = us7Var.b) == null) {
                                    qt7Var = null;
                                } else {
                                    qt7Var = new qt7(ot7Var.a.b);
                                }
                                j = qt7.c;
                                if (qt7Var == null) {
                                    zA = false;
                                } else {
                                    zA = qt7.a(qt7Var.a, j);
                                }
                                if (vs7Var != null || z10 || zA) {
                                    m7Var = null;
                                } else {
                                    m7Var = new m7(vs7Var, (byte) 3);
                                }
                                if (rv0Var != null) {
                                    numValueOf = Integer.valueOf(j51.U(rv0Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(m7Var, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.E(v56Var));
                                gVar3 = gVar;
                            } else if (z4) {
                                children$ui2 = children$ui2;
                                size = size;
                                arrayList2 = arrayList2;
                                layoutNode2 = layoutNode2;
                                z5 = z2;
                                i2 = i2;
                                i4 = 0;
                                i4 = 0;
                                gVar2 = null;
                                listD = layoutNode2.D();
                                size2 = listD.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size2) {
                                        fs4Var = ((gs4) listD.get(i5)).a;
                                        if (ub7.Q(fs4Var.getClass().getName(), "Painter", false)) {
                                            Field declaredField3 = fs4Var.getClass().getDeclaredField("painter");
                                            declaredField3.setAccessible(true);
                                            obj = declaredField3.get(fs4Var);
                                            if (obj instanceof ud5) {
                                                ud5Var = (ud5) obj;
                                                break;
                                            }
                                        } else {
                                            i5++;
                                        }
                                    }
                                    ud5Var = null;
                                    break;
                                }
                                if (ud5Var != null) {
                                    if (z5) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    int I5 = layoutNode2.I();
                                    ud5Var2 = ud5Var;
                                    int iR5 = layoutNode2.r();
                                    float f9 = gVar3.c;
                                    if (z7) {
                                        name = ud5Var2.getClass().getName();
                                        if (ub7.Q(name, "Vector", false)) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                    } else {
                                        z8 = false;
                                    }
                                    cVar = new d(I5, iR5, f9, gVar3, z8, z5, io.sentry.config.a.E(v56Var));
                                } else {
                                    if (z5) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.E(v56Var));
                                }
                                fVar = cVar;
                                r15 = i4;
                            } else {
                                if (z2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                arrayList4 = new ArrayList();
                                if (ap6VarH != null) {
                                    objG = ap6VarH.m.g(zo6.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    m3Var = (m3) objG;
                                    if (m3Var != null) {
                                    }
                                }
                                vs7Var = (vs7) lv0.o0(arrayList4);
                                if (vs7Var != null) {
                                    rv0Var = null;
                                } else {
                                    rv0Var = null;
                                }
                                if (rv0Var == null) {
                                    z10 = z4;
                                } else {
                                    z10 = z4;
                                }
                                if (vs7Var != null) {
                                    qt7Var = null;
                                } else {
                                    qt7Var = null;
                                }
                                j = qt7.c;
                                if (qt7Var == null) {
                                    zA = false;
                                } else {
                                    zA = qt7.a(qt7Var.a, j);
                                }
                                if (vs7Var != null) {
                                    m7Var = null;
                                } else {
                                    m7Var = null;
                                }
                                if (rv0Var != null) {
                                    numValueOf = Integer.valueOf(j51.U(rv0Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(m7Var, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.E(v56Var));
                                gVar3 = gVar;
                            }
                        } else {
                            z3 = true;
                        }
                        if (ap6VarH != null) {
                            if (ap6VarH.m.c(kp6.G) == z3) {
                            }
                            if (ap6VarH != null) {
                                if (ap6VarH.m.c(kp6.C) != z3) {
                                    if (z4) {
                                        children$ui2 = children$ui2;
                                        size = size;
                                        arrayList2 = arrayList2;
                                        layoutNode2 = layoutNode2;
                                        z5 = z2;
                                        i2 = i2;
                                        i4 = 0;
                                        i4 = 0;
                                        gVar2 = null;
                                        listD = layoutNode2.D();
                                        size2 = listD.size();
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < size2) {
                                                fs4Var = ((gs4) listD.get(i5)).a;
                                                if (ub7.Q(fs4Var.getClass().getName(), "Painter", false)) {
                                                    Field declaredField4 = fs4Var.getClass().getDeclaredField("painter");
                                                    declaredField4.setAccessible(true);
                                                    obj = declaredField4.get(fs4Var);
                                                    if (obj instanceof ud5) {
                                                        ud5Var = (ud5) obj;
                                                        break;
                                                    }
                                                } else {
                                                    i5++;
                                                }
                                            }
                                            ud5Var = null;
                                            break;
                                        }
                                        if (ud5Var != null) {
                                            if (z5) {
                                                z7 = false;
                                            } else {
                                                z7 = false;
                                            }
                                            int I6 = layoutNode2.I();
                                            ud5Var2 = ud5Var;
                                            int iR6 = layoutNode2.r();
                                            float f10 = gVar3.c;
                                            if (z7) {
                                                name = ud5Var2.getClass().getName();
                                                if (ub7.Q(name, "Vector", false)) {
                                                    z8 = false;
                                                } else {
                                                    z8 = false;
                                                }
                                            } else {
                                                z8 = false;
                                            }
                                            cVar = new d(I6, iR6, f10, gVar3, z8, z5, io.sentry.config.a.E(v56Var));
                                        } else {
                                            if (z5) {
                                                z6 = false;
                                            } else {
                                                z6 = false;
                                            }
                                            cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.E(v56Var));
                                        }
                                        fVar = cVar;
                                        r15 = i4;
                                    }
                                }
                                if (z2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                arrayList4 = new ArrayList();
                                if (ap6VarH != null) {
                                    objG = ap6VarH.m.g(zo6.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    m3Var = (m3) objG;
                                    if (m3Var != null) {
                                    }
                                }
                                vs7Var = (vs7) lv0.o0(arrayList4);
                                if (vs7Var != null) {
                                    rv0Var = null;
                                } else {
                                    rv0Var = null;
                                }
                                if (rv0Var == null) {
                                    z10 = z4;
                                } else {
                                    z10 = z4;
                                }
                                if (vs7Var != null) {
                                    qt7Var = null;
                                } else {
                                    qt7Var = null;
                                }
                                j = qt7.c;
                                if (qt7Var == null) {
                                    zA = false;
                                } else {
                                    zA = qt7.a(qt7Var.a, j);
                                }
                                if (vs7Var != null) {
                                    m7Var = null;
                                } else {
                                    m7Var = null;
                                }
                                if (rv0Var != null) {
                                    numValueOf = Integer.valueOf(j51.U(rv0Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(m7Var, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.E(v56Var));
                                gVar3 = gVar;
                            } else if (z4) {
                                if (z2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                arrayList4 = new ArrayList();
                                if (ap6VarH != null) {
                                    objG = ap6VarH.m.g(zo6.a);
                                    if (objG == null) {
                                        objG = null;
                                    }
                                    m3Var = (m3) objG;
                                    if (m3Var != null) {
                                    }
                                }
                                vs7Var = (vs7) lv0.o0(arrayList4);
                                if (vs7Var != null) {
                                    rv0Var = null;
                                } else {
                                    rv0Var = null;
                                }
                                if (rv0Var == null) {
                                    z10 = z4;
                                } else {
                                    z10 = z4;
                                }
                                if (vs7Var != null) {
                                    qt7Var = null;
                                } else {
                                    qt7Var = null;
                                }
                                j = qt7.c;
                                if (qt7Var == null) {
                                    zA = false;
                                } else {
                                    zA = qt7.a(qt7Var.a, j);
                                }
                                if (vs7Var != null) {
                                    m7Var = null;
                                } else {
                                    m7Var = null;
                                }
                                if (rv0Var != null) {
                                    numValueOf = Integer.valueOf(j51.U(rv0Var.a) | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                                layoutNode2 = layoutNode2;
                                i2 = i2;
                                arrayList2 = arrayList2;
                                r15 = 0;
                                gVar2 = null;
                                size = size;
                                children$ui2 = children$ui2;
                                fVar = new f(m7Var, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.E(v56Var));
                                gVar3 = gVar;
                            } else {
                                children$ui2 = children$ui2;
                                size = size;
                                arrayList2 = arrayList2;
                                layoutNode2 = layoutNode2;
                                z5 = z2;
                                i2 = i2;
                                i4 = 0;
                                i4 = 0;
                                gVar2 = null;
                                listD = layoutNode2.D();
                                size2 = listD.size();
                                i5 = 0;
                                while (true) {
                                    if (i5 < size2) {
                                        fs4Var = ((gs4) listD.get(i5)).a;
                                        if (ub7.Q(fs4Var.getClass().getName(), "Painter", false)) {
                                            Field declaredField5 = fs4Var.getClass().getDeclaredField("painter");
                                            declaredField5.setAccessible(true);
                                            obj = declaredField5.get(fs4Var);
                                            if (obj instanceof ud5) {
                                                ud5Var = (ud5) obj;
                                                break;
                                            }
                                        } else {
                                            i5++;
                                        }
                                    }
                                    ud5Var = null;
                                    break;
                                }
                                if (ud5Var != null) {
                                    if (z5) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    int I7 = layoutNode2.I();
                                    ud5Var2 = ud5Var;
                                    int iR7 = layoutNode2.r();
                                    float f11 = gVar3.c;
                                    if (z7) {
                                        name = ud5Var2.getClass().getName();
                                        if (ub7.Q(name, "Vector", false)) {
                                            z8 = false;
                                        } else {
                                            z8 = false;
                                        }
                                    } else {
                                        z8 = false;
                                    }
                                    cVar = new d(I7, iR7, f11, gVar3, z8, z5, io.sentry.config.a.E(v56Var));
                                } else {
                                    if (z5) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.E(v56Var));
                                }
                                fVar = cVar;
                                r15 = i4;
                            }
                        }
                        if (ap6VarH != null) {
                            if (ap6VarH.m.c(kp6.C) != z3) {
                                if (z4) {
                                    children$ui2 = children$ui2;
                                    size = size;
                                    arrayList2 = arrayList2;
                                    layoutNode2 = layoutNode2;
                                    z5 = z2;
                                    i2 = i2;
                                    i4 = 0;
                                    i4 = 0;
                                    gVar2 = null;
                                    listD = layoutNode2.D();
                                    size2 = listD.size();
                                    i5 = 0;
                                    while (true) {
                                        if (i5 < size2) {
                                            fs4Var = ((gs4) listD.get(i5)).a;
                                            if (ub7.Q(fs4Var.getClass().getName(), "Painter", false)) {
                                                Field declaredField6 = fs4Var.getClass().getDeclaredField("painter");
                                                declaredField6.setAccessible(true);
                                                obj = declaredField6.get(fs4Var);
                                                if (obj instanceof ud5) {
                                                    ud5Var = (ud5) obj;
                                                    break;
                                                }
                                            } else {
                                                i5++;
                                            }
                                        }
                                        ud5Var = null;
                                        break;
                                    }
                                    if (ud5Var != null) {
                                        if (z5) {
                                            z7 = false;
                                        } else {
                                            z7 = false;
                                        }
                                        int I8 = layoutNode2.I();
                                        ud5Var2 = ud5Var;
                                        int iR8 = layoutNode2.r();
                                        float f12 = gVar3.c;
                                        if (z7) {
                                            name = ud5Var2.getClass().getName();
                                            if (ub7.Q(name, "Vector", false)) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                        } else {
                                            z8 = false;
                                        }
                                        cVar = new d(I8, iR8, f12, gVar3, z8, z5, io.sentry.config.a.E(v56Var));
                                    } else {
                                        if (z5) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.E(v56Var));
                                    }
                                    fVar = cVar;
                                    r15 = i4;
                                }
                            }
                            if (z2) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            arrayList4 = new ArrayList();
                            if (ap6VarH != null) {
                                objG = ap6VarH.m.g(zo6.a);
                                if (objG == null) {
                                    objG = null;
                                }
                                m3Var = (m3) objG;
                                if (m3Var != null) {
                                }
                            }
                            vs7Var = (vs7) lv0.o0(arrayList4);
                            if (vs7Var != null) {
                                rv0Var = null;
                            } else {
                                rv0Var = null;
                            }
                            if (rv0Var == null) {
                                z10 = z4;
                            } else {
                                z10 = z4;
                            }
                            if (vs7Var != null) {
                                qt7Var = null;
                            } else {
                                qt7Var = null;
                            }
                            j = qt7.c;
                            if (qt7Var == null) {
                                zA = false;
                            } else {
                                zA = qt7.a(qt7Var.a, j);
                            }
                            if (vs7Var != null) {
                                m7Var = null;
                            } else {
                                m7Var = null;
                            }
                            if (rv0Var != null) {
                                numValueOf = Integer.valueOf(j51.U(rv0Var.a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            layoutNode2 = layoutNode2;
                            i2 = i2;
                            arrayList2 = arrayList2;
                            r15 = 0;
                            gVar2 = null;
                            size = size;
                            children$ui2 = children$ui2;
                            fVar = new f(m7Var, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.E(v56Var));
                            gVar3 = gVar;
                        } else if (z4) {
                            if (z2) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            arrayList4 = new ArrayList();
                            if (ap6VarH != null) {
                                objG = ap6VarH.m.g(zo6.a);
                                if (objG == null) {
                                    objG = null;
                                }
                                m3Var = (m3) objG;
                                if (m3Var != null) {
                                }
                            }
                            vs7Var = (vs7) lv0.o0(arrayList4);
                            if (vs7Var != null) {
                                rv0Var = null;
                            } else {
                                rv0Var = null;
                            }
                            if (rv0Var == null) {
                                z10 = z4;
                            } else {
                                z10 = z4;
                            }
                            if (vs7Var != null) {
                                qt7Var = null;
                            } else {
                                qt7Var = null;
                            }
                            j = qt7.c;
                            if (qt7Var == null) {
                                zA = false;
                            } else {
                                zA = qt7.a(qt7Var.a, j);
                            }
                            if (vs7Var != null) {
                                m7Var = null;
                            } else {
                                m7Var = null;
                            }
                            if (rv0Var != null) {
                                numValueOf = Integer.valueOf(j51.U(rv0Var.a) | (-16777216));
                            } else {
                                numValueOf = null;
                            }
                            layoutNode2 = layoutNode2;
                            i2 = i2;
                            arrayList2 = arrayList2;
                            r15 = 0;
                            gVar2 = null;
                            size = size;
                            children$ui2 = children$ui2;
                            fVar = new f(m7Var, numValueOf, 0, 0, layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar, z9, z2, io.sentry.config.a.E(v56Var));
                            gVar3 = gVar;
                        } else {
                            children$ui2 = children$ui2;
                            size = size;
                            arrayList2 = arrayList2;
                            layoutNode2 = layoutNode2;
                            z5 = z2;
                            i2 = i2;
                            i4 = 0;
                            i4 = 0;
                            gVar2 = null;
                            listD = layoutNode2.D();
                            size2 = listD.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size2) {
                                    fs4Var = ((gs4) listD.get(i5)).a;
                                    if (ub7.Q(fs4Var.getClass().getName(), "Painter", false)) {
                                        Field declaredField7 = fs4Var.getClass().getDeclaredField("painter");
                                        declaredField7.setAccessible(true);
                                        obj = declaredField7.get(fs4Var);
                                        if (obj instanceof ud5) {
                                            ud5Var = (ud5) obj;
                                            break;
                                        }
                                    } else {
                                        i5++;
                                    }
                                }
                                ud5Var = null;
                                break;
                            }
                            if (ud5Var != null) {
                                if (z5) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                }
                                int I9 = layoutNode2.I();
                                ud5Var2 = ud5Var;
                                int iR9 = layoutNode2.r();
                                float f13 = gVar3.c;
                                if (z7) {
                                    name = ud5Var2.getClass().getName();
                                    if (ub7.Q(name, "Vector", false)) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                } else {
                                    z8 = false;
                                }
                                cVar = new d(I9, iR9, f13, gVar3, z8, z5, io.sentry.config.a.E(v56Var));
                            } else {
                                if (z5) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                cVar = new c(layoutNode2.I(), layoutNode2.r(), gVar3.c, gVar3, z6, z5, io.sentry.config.a.E(v56Var));
                            }
                            fVar = cVar;
                            r15 = i4;
                        }
                    }
                    arrayList3 = arrayList2;
                    if (fVar != null) {
                        arrayList3.add(fVar);
                        b(layoutNode2, fVar, r15, l6Var, g1Var);
                    }
                    arrayList = arrayList3;
                    children$ui2 = children$ui2;
                    size = size;
                    gVar4 = gVar2;
                }
                gVar3.g = arrayList;
            }
            Method method3 = (Method) io.sentry.config.a.r().n;
            method3.getClass();
            Object objInvoke2 = method3.invoke(layoutNode, null);
            objInvoke2.getClass();
            children$ui = (List) objInvoke2;
        }
        children$ui2 = children$ui;
        if (children$ui2.isEmpty()) {
            return;
        }
        arrayList = new ArrayList(children$ui2.size());
        size = children$ui2.size();
        while (i < size) {
            layoutNode2 = children$ui2.get(i);
            zX = layoutNode2.X();
            nf nfVar2 = layoutNode2.S;
            if (zX) {
                children$ui2 = children$ui2;
                arrayList2 = arrayList;
                size = size;
                i2 = i;
                layoutNode2 = layoutNode2;
                gVar2 = gVar4;
                r15 = 0;
                fVar = gVar2;
            } else {
                children$ui2 = children$ui2;
                arrayList2 = arrayList;
                size = size;
                i2 = i;
                layoutNode2 = layoutNode2;
                gVar2 = gVar4;
                r15 = 0;
                fVar = gVar2;
            }
            arrayList3 = arrayList2;
            if (fVar != null) {
                arrayList3.add(fVar);
                b(layoutNode2, fVar, r15, l6Var, g1Var);
            }
            arrayList = arrayList3;
            children$ui2 = children$ui2;
            size = size;
            gVar4 = gVar2;
        }
        gVar3.g = arrayList;
    }
}
