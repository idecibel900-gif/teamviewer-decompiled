package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class zu1 {
    public static int a;
    public static int b;
    public static c36 c;

    public static final boolean A(long j) {
        return (j & 1) != 0;
    }

    public static kj0 B(de1 de1Var, hw2 hw2Var) {
        de1Var.getClass();
        return j51.H(new io.sentry.i5(de1Var, pe1.m, hw2Var, (byte) 7));
    }

    public static List C(k17 k17Var, int i, k17 k17Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int iT = k17Var.t(i);
        int i2 = i + iT;
        int iF = k17Var.f(k17Var.b, k17Var.q(i));
        int iF2 = k17Var.f(k17Var.b, k17Var.q(i2));
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (k17Var.b[(k17Var.q(i) * 5) + 1] & 201326592) != 0;
        k17Var2.v(iT);
        k17Var2.w(i3, k17Var2.t);
        if (k17Var.g < i2) {
            k17Var.A(i2);
        }
        if (k17Var.k < iF2) {
            k17Var.B(iF2, i2);
        }
        int[] iArr = k17Var2.b;
        int i4 = k17Var2.t;
        int i5 = i4 * 5;
        cx.F0(i5, i * 5, i2 * 5, k17Var.b, iArr);
        Object[] objArr = k17Var2.c;
        int i6 = k17Var2.i;
        System.arraycopy(k17Var.c, iF, objArr, i6, i3);
        int i7 = k17Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iT;
        int iF3 = i6 - k17Var2.f(iArr, i4);
        int i10 = k17Var2.m;
        int i11 = k17Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = k17.h(k17Var2.f(iArr, i13) + iF3, i12 < i13 ? 0 : k17Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        k17Var2.m = i12;
        int iB = j17.b(k17Var.d, i, k17Var.o());
        int iB2 = j17.b(k17Var.d, i2, k17Var.o());
        if (iB < iB2) {
            ArrayList arrayList = k17Var.d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i15 = iB; i15 < iB2; i15++) {
                px2 px2Var = (px2) arrayList.get(i15);
                px2Var.a += i8;
                arrayList2.add(px2Var);
            }
            k17Var2.d.addAll(j17.b(k17Var2.d, k17Var2.t, k17Var2.o()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = ea2.m;
        }
        if (!list.isEmpty()) {
            HashMap map = k17Var.e;
            HashMap map2 = k17Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = k17Var2.v;
        k17Var2.N(i7);
        int iD = k17Var.D(k17Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iD >= 0;
            if (z7) {
                k17Var.O();
                k17Var.a(iD - k17Var.t);
                k17Var.O();
            }
            k17Var.a(i - k17Var.t);
            boolean zG = k17Var.G();
            if (z7) {
                k17Var.L();
                k17Var.i();
                k17Var.L();
                k17Var.i();
            }
            z4 = zG;
        } else {
            boolean zH = k17Var.H(i, iT);
            k17Var.I(iF, i3, i - 1);
            z4 = zH;
        }
        if (z4) {
            i01.a("Unexpectedly removed anchors");
        }
        int i18 = k17Var2.f1222o;
        int i19 = iArr3[i5 + 1];
        k17Var2.f1222o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            k17Var2.t = i9;
            k17Var2.i = i6 + i3;
        }
        if (z6) {
            k17Var2.S(i7);
        }
        return list;
    }

    public static final void D(Context context) {
        String string = context.getString(R.string.legal_agreement_DPA_url);
        string.getClass();
        Uri uri = Uri.parse(string);
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static final void E(Context context) {
        String string = context.getString(R.string.legal_agreement_EULA_url);
        string.getClass();
        Uri uri = Uri.parse(string);
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02ac A[PHI: r14 r15
      0x02ac: PHI (r14v4 java.util.List) = (r14v3 java.util.List), (r14v5 java.util.List) binds: [B:102:0x0260, B:115:0x02aa] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r15v6 int) = (r15v5 int), (r15v7 int) binds: [B:102:0x0260, B:115:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x02b0 A[LOOP:3: B:101:0x0252->B:118:0x02b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:185:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:194:0x03e3 A[LOOP:5: B:193:0x03e1->B:194:0x03e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x0423  */
    /* JADX WARN: Code duplicated, block: B:208:0x0439  */
    /* JADX WARN: Code duplicated, block: B:232:0x02b8 A[EDGE_INSN: B:232:0x02b8->B:120:0x02b8 BREAK  A[LOOP:3: B:101:0x0252->B:118:0x02b0], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x03e3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r41v0, types: [android.view.ViewStructure] */
    public static final void H(ViewStructure viewStructure, LayoutNode layoutNode, AutofillId autofillId, String str, x56 x56Var) {
        ?? r38;
        long j;
        long j2;
        char c2;
        long j3;
        boolean zBooleanValue;
        qh qhVar;
        xo xoVar;
        pi piVar;
        xv7 xv7Var;
        pe6 pe6Var;
        boolean z;
        vb1 vb1Var;
        Boolean bool;
        boolean z2;
        Integer num;
        Object obj;
        List list;
        Integer numValueOf;
        int i;
        int i2;
        int i3;
        int i4;
        ?? r15;
        String strU;
        int size;
        String str2;
        int i5;
        String[] strArrP;
        String[] strArrP2;
        int i6;
        int i7;
        int i8;
        boolean z3;
        qh qhVar2;
        xv7 xv7Var2;
        xo xoVar2;
        pi piVar2;
        pe6 pe6Var2;
        boolean z4;
        np6 np6Var = kp6.a;
        np6 np6Var2 = zo6.a;
        ap6 ap6VarH = layoutNode.H();
        boolean z5 = true;
        if (ap6VarH != null) {
            jx4 jx4Var = ap6VarH.m;
            j = 128;
            Object[] objArr = jx4Var.b;
            Object[] objArr2 = jx4Var.c;
            long[] jArr = jx4Var.a;
            j2 = 255;
            int length = jArr.length - 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i9 = 0;
                qhVar2 = null;
                z = false;
                xv7Var2 = null;
                xoVar2 = null;
                piVar2 = null;
                vb1Var = null;
                bool = null;
                pe6Var2 = null;
                z2 = false;
                num = null;
                obj = null;
                c2 = 7;
                while (true) {
                    long j4 = jArr[i9];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j4 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj2 = objArr[i12];
                                Object obj3 = objArr2[i12];
                                np6 np6Var3 = (np6) obj2;
                                if (im3.n(np6Var3, kp6.s)) {
                                    obj3.getClass();
                                    qhVar2 = (qh) obj3;
                                } else if (im3.n(np6Var3, kp6.a)) {
                                    obj3.getClass();
                                    String str3 = (String) lv0.o0((List) obj3);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                    }
                                } else if (im3.n(np6Var3, kp6.r)) {
                                    obj3.getClass();
                                    vb1Var = (vb1) obj3;
                                } else if (im3.n(np6Var3, kp6.t)) {
                                    obj3.getClass();
                                    piVar2 = (pi) obj3;
                                } else if (im3.n(np6Var3, kp6.G)) {
                                    obj3.getClass();
                                    xoVar2 = (xo) obj3;
                                } else if (im3.n(np6Var3, kp6.l)) {
                                    obj3.getClass();
                                    viewStructure.setFocused(((Boolean) obj3).booleanValue());
                                } else if (im3.n(np6Var3, kp6.R)) {
                                    obj3.getClass();
                                    num = (Integer) obj3;
                                } else if (im3.n(np6Var3, kp6.N)) {
                                    z2 = z5;
                                } else if (im3.n(np6Var3, kp6.f1291o)) {
                                    obj3.getClass();
                                    zBooleanValue = ((Boolean) obj3).booleanValue();
                                } else if (im3.n(np6Var3, kp6.z)) {
                                    obj3.getClass();
                                    pe6Var2 = (pe6) obj3;
                                } else if (im3.n(np6Var3, kp6.K)) {
                                    obj3.getClass();
                                    bool = (Boolean) obj3;
                                } else if (im3.n(np6Var3, kp6.L)) {
                                    obj3.getClass();
                                    xv7Var2 = (xv7) obj3;
                                } else if (im3.n(np6Var3, zo6.b)) {
                                    viewStructure.setClickable(z5);
                                } else if (im3.n(np6Var3, zo6.c)) {
                                    viewStructure.setLongClickable(z5);
                                } else if (im3.n(np6Var3, zo6.w)) {
                                    viewStructure.setFocusable(z5);
                                } else if (im3.n(np6Var3, zo6.k)) {
                                    z = z5;
                                }
                                z4 = z5;
                                if (Build.VERSION.SDK_INT >= 34 && im3.n(np6Var3, pm8.u)) {
                                    obj = obj3;
                                }
                            } else {
                                z4 = z5;
                            }
                            j4 >>= 8;
                            i11++;
                            z5 = z4;
                        }
                        z3 = z5;
                        z3 = z3;
                        if (i10 != 8) {
                            break;
                        }
                    } else {
                        z3 = z5 ? 1 : 0;
                    }
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                    z5 = z3 ? 1 : 0;
                }
            } else {
                z3 = true;
                c2 = 7;
                j3 = -9187201950435737472L;
                zBooleanValue = true;
                qhVar2 = null;
                z = false;
                xv7Var2 = null;
                xoVar2 = null;
                piVar2 = null;
                vb1Var = null;
                bool = null;
                pe6Var2 = null;
                z2 = false;
                num = null;
                obj = null;
            }
            qhVar = qhVar2;
            xv7Var = xv7Var2;
            xoVar = xoVar2;
            piVar = piVar2;
            pe6Var = pe6Var2;
            r38 = z3;
        } else {
            r38 = 1;
            j = 128;
            j2 = 255;
            c2 = 7;
            j3 = -9187201950435737472L;
            zBooleanValue = true;
            qhVar = null;
            xoVar = null;
            piVar = null;
            xv7Var = null;
            pe6Var = null;
            z = false;
            vb1Var = null;
            bool = null;
            z2 = false;
            num = null;
            obj = null;
        }
        ap6 ap6VarH2 = layoutNode.H();
        if (ap6VarH2 != null && ap6VarH2.f346o && !ap6VarH2.p) {
            ap6VarH2 = ap6VarH2.a();
            zw4 zw4Var = new zw4(layoutNode.getChildrenInfo().size());
            zw4Var.b(layoutNode.getChildrenInfo());
            while (zw4Var.i()) {
                LayoutNode layoutNode2 = (LayoutNode) zw4Var.k(zw4Var.b - 1);
                ap6 ap6VarH3 = layoutNode2.H();
                if (ap6VarH3 != null && !ap6VarH3.f346o) {
                    ap6VarH2.c(ap6VarH3);
                    if (!ap6VarH3.p) {
                        zw4Var.b(layoutNode2.getChildrenInfo());
                    }
                }
            }
        }
        if (ap6VarH2 != null) {
            jx4 jx4Var2 = ap6VarH2.m;
            Object[] objArr3 = jx4Var2.b;
            Object[] objArr4 = jx4Var2.c;
            long[] jArr2 = jx4Var2.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i13 = 8;
                list = null;
                int i14 = 0;
                while (true) {
                    long j5 = jArr2[i14];
                    long[] jArr3 = jArr2;
                    Object[] objArr5 = objArr3;
                    if ((((~j5) << c2) & j5 & j3) == j3) {
                        i6 = i14;
                        if (i6 != length2) {
                            break;
                            break;
                        } else {
                            i14 = i6 + 1;
                            objArr3 = objArr5;
                            jArr2 = jArr3;
                        }
                    } else {
                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j5 & j2) < j) {
                                int i17 = (i14 << 3) + i16;
                                Object obj4 = objArr5[i17];
                                Object obj5 = objArr4[i17];
                                i8 = i13;
                                np6 np6Var4 = (np6) obj4;
                                i7 = i16;
                                if (im3.n(np6Var4, kp6.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (im3.n(np6Var4, kp6.C)) {
                                    obj5.getClass();
                                    list = (List) obj5;
                                }
                            } else {
                                i7 = i16;
                                i8 = i13;
                            }
                            j5 >>= i8;
                            i16 = i7 + 1;
                            i13 = i8;
                        }
                        if (i15 != i13) {
                            break;
                        }
                        i6 = i14;
                        if (i6 != length2) {
                            break;
                        }
                        i14 = i6 + 1;
                        objArr3 = objArr5;
                        jArr2 = jArr3;
                    }
                }
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        Integer numValueOf2 = Integer.valueOf(layoutNode.n);
        if (layoutNode.F() == null) {
            numValueOf2 = null;
        }
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (qhVar != null) {
            numValueOf = Integer.valueOf(qhVar.a);
        } else if (z) {
            numValueOf = Integer.valueOf((int) r38);
        } else {
            numValueOf = xv7Var != null ? 2 : null;
        }
        if (numValueOf != null) {
            viewStructure.setAutofillType(numValueOf.intValue());
        }
        if (xoVar != null) {
            viewStructure.setAutofillValue(AutofillValue.forText(au8.U(xoVar.n)));
        }
        if (piVar != null) {
            viewStructure.setAutofillValue(piVar.a);
        }
        if (vb1Var != null && (strArrP2 = g68.p(vb1Var)) != null) {
            viewStructure.setAutofillHints(strArrP2);
        }
        LayoutNode layoutNode3 = (LayoutNode) x56Var.a.b(layoutNode.n);
        if (layoutNode3 == null || layoutNode3.s == -4) {
            i = 0;
        } else {
            ae aeVar = x56Var.c;
            int iD = x56Var.d(layoutNode3);
            long[] jArr4 = (long[]) aeVar.c;
            long j6 = jArr4[iD];
            long j7 = jArr4[iD + 1];
            int i18 = (int) (j6 >> 32);
            int i19 = (int) j6;
            i = 0;
            viewStructure.setDimens(i18, i19, 0, 0, ((int) (j7 >> 32)) - i18, ((int) j7) - i19);
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (xv7Var != null) {
            viewStructure.setCheckable(r38);
            viewStructure.setChecked(xv7Var == xv7.m ? 1 : i);
        } else if (bool != null && (pe6Var == null || pe6Var.a != 4)) {
            viewStructure.setCheckable(true);
            viewStructure.setChecked(bool.booleanValue());
        }
        vb1.a.getClass();
        String str4 = (String) cx.R0(g68.p(ub1.b));
        if (vb1Var != null && (strArrP = g68.p(vb1Var)) != null) {
            boolean zB0 = cx.B0(str4, strArrP);
            i2 = 1;
            if (zB0) {
                i3 = 1;
            }
            if (z2 && i3 == 0) {
                i4 = i;
            } else {
                i4 = i2;
            }
            if (i4 == 0 || zBooleanValue) {
                r15 = i2;
            } else {
                r15 = i;
            }
            viewStructure.setDataIsSensitive(r15);
            viewStructure.setVisibility(layoutNode.getOuterCoordinator$ui().j1() ? 4 : i);
            if (list != null) {
                size = list.size();
                str2 = "";
                for (i5 = i; i5 < size; i5++) {
                    str2 = ((Object) str2) + ((xo) list.get(i5)).n + "\n";
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (layoutNode.getChildrenInfo().isEmpty() && pe6Var != null && (strU = bt1.U(pe6Var.a)) != null) {
                viewStructure.setClassName(strU);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (i4 != 0) {
                    viewStructure.setInputType(129);
                }
            }
            if (Build.VERSION.SDK_INT >= 35 || obj == null) {
            }
            io.sentry.h2.f();
            return;
        }
        i2 = 1;
        i3 = i;
        if (z2) {
            i4 = i2;
        } else {
            i4 = i2;
        }
        if (i4 == 0) {
            r15 = i2;
        } else {
            r15 = i2;
        }
        viewStructure.setDataIsSensitive(r15);
        viewStructure.setVisibility(layoutNode.getOuterCoordinator$ui().j1() ? 4 : i);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i5 < size) {
                str2 = ((Object) str2) + ((xo) list.get(i5)).n + "\n";
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (layoutNode.getChildrenInfo().isEmpty()) {
            viewStructure.setClassName(strU);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (Build.VERSION.SDK_INT >= 28) {
                viewStructure.setMaxTextLength(num.intValue());
            }
            if (i4 != 0) {
                viewStructure.setInputType(129);
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static final long I(eh3 eh3Var, gb5 gb5Var, dh3 dh3Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = eh3Var.g;
        if (gb5Var != null) {
            int i = dh3Var.a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (gb5Var == gb5.n) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jD = t65.d(J(eh3Var, gb5Var, dh3Var), j2);
        if (z || !eh3Var.i) {
            return jD;
        }
        return 0L;
    }

    public static final long J(eh3 eh3Var, gb5 gb5Var, dh3 dh3Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (gb5Var == null) {
            return eh3Var.c;
        }
        int i = dh3Var.a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (eh3Var.c >> 32));
        } else {
            if (i != 2) {
                return eh3Var.c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (eh3Var.c & 4294967295L));
        }
        if (gb5Var == gb5.n) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final dv7 K(es4 es4Var, long j, long j2, Function1 function1) {
        LayoutNode layoutNodeP0 = vn4.p0(es4Var);
        int i = layoutNodeP0.n;
        x56 rectManager = e14.a(layoutNodeP0).getRectManager();
        ev7 ev7Var = rectManager.d;
        ev7Var.getClass();
        long j3 = j2 == 0 ? j : j2;
        kw4 kw4Var = ev7Var.a;
        dv7 dv7Var = new dv7(ev7Var, i, j, j3, es4Var, function1);
        Object objB = kw4Var.b(i);
        if (objB == null) {
            kw4Var.i(i, dv7Var);
            objB = dv7Var;
        }
        dv7 dv7Var2 = (dv7) objB;
        if (dv7Var2 != dv7Var) {
            while (true) {
                dv7 dv7Var3 = dv7Var2.f;
                if (dv7Var3 == null) {
                    break;
                }
                dv7Var2 = dv7Var3;
            }
            dv7Var2.f = dv7Var;
        }
        LayoutNode layoutNodeP1 = vn4.p0(es4Var.m);
        if (layoutNodeP1.s != -4) {
            ae aeVar = rectManager.c;
            int iD = rectManager.d(layoutNodeP1);
            long[] jArr = (long[]) aeVar.c;
            int i2 = iD + 2;
            jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
        }
        rectManager.f = true;
        rectManager.j();
        return dv7Var;
    }

    public static final Object L(Object[] objArr, Function0 function0, ux2 ux2Var, int i) {
        return M(Arrays.copyOf(objArr, objArr.length), di1.u, function0, ux2Var, ((i << 6) & 7168) | 384);
    }

    public static final Object M(Object[] objArr, di6 di6Var, Function0 function0, ux2 ux2Var, int i) {
        Object[] objArr2;
        di6 di6Var2;
        Object obj;
        Object objF;
        long j = ux2Var.T;
        qf0.s(36);
        String string = Long.toString(j, 36);
        string.getClass();
        di6Var.getClass();
        nh6 nh6Var = (nh6) ux2Var.j(ph6.a);
        Object objK = ux2Var.K();
        Object obj2 = e01.a;
        if (objK == obj2) {
            Object objB = (nh6Var == null || (objF = nh6Var.f(string)) == null) ? null : di6Var.b(objF);
            if (objB == null) {
                objB = function0.a();
            }
            objArr2 = objArr;
            di6Var2 = di6Var;
            Object jh6Var = new jh6(di6Var2, nh6Var, string, objB, objArr2);
            ux2Var.g0(jh6Var);
            objK = jh6Var;
        } else {
            objArr2 = objArr;
            di6Var2 = di6Var;
        }
        jh6 jh6Var2 = (jh6) objK;
        Object objA = Arrays.equals(objArr2, jh6Var2.q) ? jh6Var2.p : null;
        if (objA == null) {
            objA = function0.a();
        }
        boolean zH = ux2Var.h(jh6Var2) | ((((i & 112) ^ 48) > 32 && ux2Var.h(di6Var2)) || (i & 48) == 32) | ux2Var.h(nh6Var) | ux2Var.f(string) | ux2Var.h(objA) | ux2Var.h(objArr2);
        Object objK2 = ux2Var.K();
        if (zH || objK2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objA;
            Object zw1Var = new zw1(jh6Var2, di6Var2, nh6Var, string, obj, objArr3, (byte) 2);
            ux2Var.g0(zw1Var);
            objK2 = zw1Var;
        } else {
            obj = objA;
        }
        ck3.k((Function0) objK2, ux2Var);
        return obj;
    }

    public static final px4 N(Object[] objArr, di6 di6Var, Function0 function0, ux2 ux2Var) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        di6Var.getClass();
        return (px4) M(objArrCopyOf, new a65((byte) 20, (Object) new gg4(di6Var, (byte) 10), (Object) new y46((Object) di6Var, (byte) 4), false), function0, ux2Var, 384);
    }

    public static final Object O(Object[] objArr, di6 di6Var, Function0 function0, ux2 ux2Var, int i) {
        return M(Arrays.copyOf(objArr, objArr.length), di6Var, function0, ux2Var, ((i << 3) & 7168) | 384);
    }

    public static final lh6 P(ux2 ux2Var) {
        ux2Var.W(1967007413);
        Object[] objArr = new Object[0];
        Object objK = ux2Var.K();
        if (objK == e01.a) {
            objK = new w26((byte) 12);
            ux2Var.g0(objK);
        }
        lh6 lh6Var = (lh6) O(objArr, lh6.q, (Function0) objK, ux2Var, 384);
        lh6Var.f1363o = (nh6) ux2Var.j(ph6.a);
        ux2Var.p(false);
        return lh6Var;
    }

    public static void Q(String str, String str2, String str3, DyngateID dyngateID) {
        str.getClass();
        if (dyngateID == null) {
            dyngateID = DyngateID.InvalidDyngateID();
        }
        dyngateID.getClass();
        st6 st6Var = new st6(str, str2, dyngateID);
        if (!st6Var.c()) {
            ye4.c("Connector", "Invalid login data!");
            return;
        }
        if (str3 != null) {
            bu7.MAIN.a(new jq(R.string.tv_connectingInstantSupport, new Object[]{str3}));
        } else {
            bu7.MAIN.a(new jq(R.string.tv_connectingWaitForAccept, new Object[0]));
        }
        au6 au6Var = bt1.b;
        if (au6Var != null) {
            au6Var.h(st6Var);
        } else {
            im3.e0("instance");
            throw null;
        }
    }

    public static final aw5 R(iv5 iv5Var, d22 d22Var) {
        d22Var.getClass();
        int i = iv5Var.f1108o;
        if ((i & 8) == 8) {
            aw5 aw5Var = iv5Var.s;
            aw5Var.getClass();
            return aw5Var;
        }
        if ((i & 16) == 16) {
            return d22Var.a(iv5Var.t);
        }
        hk0.l("No returnType in ProtoBuf.Function");
        return null;
    }

    public static final aw5 S(qv5 qv5Var, d22 d22Var) {
        int i = qv5Var.f1871o;
        if ((i & 8) == 8) {
            aw5 aw5Var = qv5Var.s;
            aw5Var.getClass();
            return aw5Var;
        }
        if ((i & 16) == 16) {
            return d22Var.a(qv5Var.t);
        }
        hk0.l("No returnType in ProtoBuf.Property");
        return null;
    }

    public static int T(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final aw5 U(iw5 iw5Var, d22 d22Var) {
        d22Var.getClass();
        int i = iw5Var.f1111o;
        if ((i & 4) == 4) {
            aw5 aw5Var = iw5Var.r;
            aw5Var.getClass();
            return aw5Var;
        }
        if ((i & 8) == 8) {
            return d22Var.a(iw5Var.s);
        }
        hk0.l("No type in ProtoBuf.ValueParameter");
        return null;
    }

    public static boolean V(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static final void a(boolean z, v64 v64Var, hw2 hw2Var, fs4 fs4Var, ux2 ux2Var, int i) {
        boolean z2;
        int i2;
        fs4 fs4Var2;
        int i3;
        int i4;
        String str;
        String str2;
        ux2Var.Y(-697497201);
        int i5 = 2;
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (ux2Var.g(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(v64Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(hw2Var) ? 256 : 128;
        }
        int i6 = i2 | 3072;
        int i7 = 1;
        if (ux2Var.N(i6 & 1, (i6 & 1171) != 1170)) {
            boolean z3 = v64Var.e.size() > 1;
            cs4 cs4Var = cs4.b;
            float f = 1.0f;
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(androidx.compose.ui.platform.a.a(cs4Var, "conceptItemsContainer"), 1.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 48);
            int i8 = i6;
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            ux2Var.W(-935676813);
            Iterator it = v64Var.e.iterator();
            while (it.hasNext()) {
                int iOrdinal = ((x64) it.next()).ordinal();
                byte b2 = 8;
                aw awVar = e01.a;
                if (iOrdinal != 0) {
                    if (iOrdinal != i7) {
                        if (iOrdinal != i5) {
                            byte b3 = 3;
                            if (iOrdinal != 3) {
                                throw fx3.m(647309427, ux2Var, false);
                            }
                            ux2Var.W(-1405438555);
                            String strZ = m77.z(R.string.legal_agreement_korea_text_consent_to_marketing_new, ux2Var);
                            boolean z4 = v64Var.d;
                            i3 = i8;
                            boolean z5 = (i3 & 896) == 256;
                            Object objK = ux2Var.K();
                            if (z5 || objK == awVar) {
                                objK = new q64(hw2Var, b3);
                                ux2Var.g0(objK);
                            }
                            f(new t64(strZ, new jb((Function1) objK, (byte) 7), z4), androidx.compose.foundation.layout.b.c(ka0.A(cs4Var, y64.b), f), ux2Var, 0);
                            ux2Var.p(false);
                        } else {
                            i3 = i8;
                            ux2Var.W(-1406834175);
                            String strZ2 = m77.z(R.string.legal_agreement_korea_text_consent_to_collection_new, ux2Var);
                            boolean z6 = v64Var.b;
                            boolean z7 = (i3 & 896) == 256;
                            Object objK2 = ux2Var.K();
                            if (z7 || objK2 == awVar) {
                                objK2 = new q64(hw2Var, (byte) 1);
                                ux2Var.g0(objK2);
                            }
                            f(new s64(strZ2, new jb((Function1) objK2, b2), z6), androidx.compose.foundation.layout.b.c(ka0.A(cs4Var, y64.b), f), ux2Var, 0);
                            ux2Var.p(false);
                        }
                        i4 = 2;
                    } else {
                        i3 = i8;
                        ux2Var.W(-1406133079);
                        String strZ3 = m77.z(R.string.legal_agreement_korea_text_consent_to_transfer_new, ux2Var);
                        boolean z8 = v64Var.c;
                        boolean z9 = (i3 & 896) == 256;
                        Object objK3 = ux2Var.K();
                        if (z9 || objK3 == awVar) {
                            objK3 = new q64(hw2Var, (byte) 2);
                            ux2Var.g0(objK3);
                        }
                        f(new u64(strZ3, new jb((Function1) objK3, (byte) 6), z8), androidx.compose.foundation.layout.b.c(ka0.A(cs4Var, y64.b), f), ux2Var, 0);
                        ux2Var.p(false);
                    }
                    i4 = 2;
                } else {
                    i3 = i8;
                    ux2Var.W(-1408238940);
                    String strZ4 = m77.z(R.string.legal_agreement_text_concept_placeholder_new, ux2Var);
                    e96 e96Var = nb7.a;
                    strZ4.getClass();
                    e96 e96Var2 = nb7.a;
                    List listL0 = bq6.l0(new h18(e96.a(e96Var2, strZ4), new vs6(b2)));
                    i4 = 2;
                    if (listL0.size() == 2) {
                        String str3 = (String) listL0.get(0);
                        str2 = (String) listL0.get(1);
                        str = str3;
                    } else {
                        str = "";
                        str2 = str;
                    }
                    String strE = e96Var2.e(strZ4, new vs6((byte) 11));
                    boolean z10 = v64Var.a;
                    boolean z11 = (i3 & 896) == 256;
                    Object objK4 = ux2Var.K();
                    if (z11 || objK4 == awVar) {
                        objK4 = new q64(hw2Var, (byte) 0);
                        ux2Var.g0(objK4);
                    }
                    r64 r64Var = new r64(strE, new jb((Function1) objK4, (byte) 9), z10, str, str2);
                    boolean z12 = z2;
                    f = f;
                    d(z12, z3, r64Var, z3 ? androidx.compose.foundation.layout.b.c(ka0.A(cs4Var, y64.b), f) : androidx.compose.foundation.layout.b.c(cs4Var, f), ux2Var, i3 & 14);
                    ux2Var.p(false);
                }
                f = f;
                i5 = i4;
                i8 = i3;
                i7 = 1;
                z2 = z;
            }
            ux2Var.p(false);
            ux2Var.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new uu(z, (Object) v64Var, (Object) hw2Var, fs4Var2, i, (byte) 3);
        }
    }

    public static final void b(fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        yy0 yy0Var = mo8.e;
        ux2Var.Y(-174729046);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            w50 w50Var = xz2.B;
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(fs4Var, "LegalAgreementDescription");
            kw0 kw0VarA = iw0.a(iq8.c, w50Var, ux2Var, 48);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            yy0Var.invoke(ux2Var, Integer.valueOf((i2 >> 3) & 14));
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ta0(fs4Var, i, b2);
        }
    }

    public static final void c(final sb0 sb0Var, final fs4 fs4Var, String str, ux2 ux2Var, final int i, final int i2) {
        sb0Var.getClass();
        ux2Var.Y(740800366);
        int i3 = (ux2Var.f(sb0Var) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ux2Var.f(str) ? 256 : 128;
        }
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                str = "TVTA-devicesOfflineScreen-deviceItemShimmer";
            }
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            ux2Var.W(-2086561273);
            for (int i5 = 0; i5 < 3; i5++) {
                kw1.f(sb0Var, str, ux2Var, ((i3 >> 3) & 112) | (i3 & 14));
            }
            ux2Var.p(false);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        final String str2 = str;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.yu1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zu1.c(sb0Var, fs4Var, str2, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void d(final boolean z, final boolean z2, final r64 r64Var, final fs4 fs4Var, ux2 ux2Var, final int i) {
        int i2;
        Context context;
        ux2Var.Y(535855790);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ux2Var.f(r64Var) : ux2Var.h(r64Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        int i3 = i2;
        final byte b2 = 0;
        final byte b3 = 1;
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            Context context2 = (Context) ux2Var.j(lh.b);
            fs4 fs4VarA = z2 ? androidx.compose.ui.platform.a.a(fs4Var, "EulaDpaItem") : androidx.compose.ui.platform.a.a(ka0.D(fs4Var, 24.0f, 0.0f, 2), "EulaDpaItem");
            dg6 dg6VarA = cg6.a(!z2 ? iq8.e : iq8.a, xz2.y, ux2Var, 48);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            if (z2) {
                ux2Var.W(-977529709);
                fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(cs4.b, "TVTA-eula-acceptCheckbox");
                int i4 = i3 & 896;
                boolean z3 = i4 == 256 || ((i3 & 512) != 0 && ux2Var.h(r64Var));
                Object objK = ux2Var.K();
                aw awVar = e01.a;
                if (z3 || objK == awVar) {
                    objK = new Function1() { // from class: o.n64
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            byte b4 = b2;
                            f88 f88Var = f88.a;
                            r64 r64Var2 = r64Var;
                            switch (b4) {
                                case 0:
                                    op6 op6Var = (op6) obj;
                                    op6Var.getClass();
                                    lp6.d(op6Var, r64Var2.n);
                                    break;
                                default:
                                    Boolean bool = (Boolean) obj;
                                    bool.getClass();
                                    r64Var2.f1895o.invoke(bool);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(objK);
                }
                fs4 fs4VarA3 = cp6.a(fs4VarA2, false, (Function1) objK);
                boolean z4 = r64Var.p;
                boolean z5 = i4 == 256 || ((i3 & 512) != 0 && ux2Var.h(r64Var));
                Object objK2 = ux2Var.K();
                if (z5 || objK2 == awVar) {
                    objK2 = new Function1() { // from class: o.n64
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            byte b4 = b3;
                            f88 f88Var = f88.a;
                            r64 r64Var2 = r64Var;
                            switch (b4) {
                                case 0:
                                    op6 op6Var = (op6) obj;
                                    op6Var.getClass();
                                    lp6.d(op6Var, r64Var2.n);
                                    break;
                                default:
                                    Boolean bool = (Boolean) obj;
                                    bool.getClass();
                                    r64Var2.f1895o.invoke(bool);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(objK2);
                }
                context = context2;
                di1.e(z4, (Function1) objK2, fs4VarA3, false, null, ux2Var, 0, 56);
                ux2Var.p(false);
            } else {
                context = context2;
                ux2Var.W(-977207464);
                ux2Var.p(false);
            }
            h(z, r64Var, context, ux2Var, (i3 & 14) | ((i3 >> 3) & 112));
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.o64
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zu1.d(z, z2, r64Var, fs4Var, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void e(final boolean z, final boolean z2, final boolean z3, final Function0 function0, fs4 fs4Var, ux2 ux2Var, final int i) {
        int i2;
        final fs4 fs4Var2;
        ux2Var.Y(-410669968);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.g(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(function0) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (ux2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) ux2Var.j(lh.b);
            pd5 pd5Var = y64.a;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarQ = androidx.compose.foundation.layout.b.q(ka0.A(cs4Var, pd5Var), 316.0f, 1);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var, 48);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarQ);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            m77.g(function0, ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, z2 ? 18.0f : 0.0f, 0.0f, 0.0f, 13), null, z3 || !z2, "ContinueButton", null, au8.O(737822933, new v9(b2, z2), ux2Var), ux2Var, 1597440 | ((i3 >> 9) & 14), 36);
            i(z, context, null, ux2Var, i3 & 14);
            ux2Var.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.m64
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zu1.e(z, z2, z3, function0, fs4Var2, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void f(final g2 g2Var, fs4 fs4Var, ux2 ux2Var, int i) {
        byte b2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(480953110);
        int i2 = i | (ux2Var2.f(g2Var) ? 4 : 2) | (ux2Var2.f(fs4Var) ? 32 : 16);
        final byte b3 = 0;
        final byte b4 = 1;
        if (ux2Var2.N(i2 & 1, (i2 & 19) != 18)) {
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(fs4Var, "KoreanItem " + g2Var.getClass());
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(cs4.b, "TVTA-koreanEula-acceptCheckbox");
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (z || objK == awVar) {
                objK = new Function1() { // from class: o.p64
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b5 = b3;
                        f88 f88Var = f88.a;
                        g2 g2Var2 = g2Var;
                        switch (b5) {
                            case 0:
                                op6 op6Var = (op6) obj;
                                op6Var.getClass();
                                lp6.d(op6Var, g2Var2.s0());
                                break;
                            default:
                                Boolean bool = (Boolean) obj;
                                bool.getClass();
                                g2Var2.q0().invoke(bool);
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK);
            }
            fs4 fs4VarA3 = cp6.a(fs4VarA2, false, (Function1) objK);
            boolean zU0 = g2Var.u0();
            b3 = i3 == 4 ? (byte) 1 : (byte) 0;
            Object objK2 = ux2Var2.K();
            if (b3 != 0 || objK2 == awVar) {
                objK2 = new Function1() { // from class: o.p64
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b5 = b4;
                        f88 f88Var = f88.a;
                        g2 g2Var2 = g2Var;
                        switch (b5) {
                            case 0:
                                op6 op6Var = (op6) obj;
                                op6Var.getClass();
                                lp6.d(op6Var, g2Var2.s0());
                                break;
                            default:
                                Boolean bool = (Boolean) obj;
                                bool.getClass();
                                g2Var2.q0().invoke(bool);
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK2);
            }
            di1.e(zU0, (Function1) objK2, fs4VarA3, false, null, ux2Var2, 0, 56);
            h72 h72Var = un4.a;
            b2 = 1;
            qs7.b(g2Var.s0(), null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var, 0, 0, 131066);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            b2 = 1;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new l64(b2, i, g2Var, fs4Var);
        }
    }

    public static final void g(Function0 function0, Function0 function1, boolean z, v64 v64Var, hw2 hw2Var, boolean z2, fs4 fs4Var, ux2 ux2Var, int i) {
        v64 v64Var2;
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        yy0 yy0Var = mo8.e;
        function0.getClass();
        function1.getClass();
        v64Var.getClass();
        hw2Var.getClass();
        ux2Var2.Y(379354606);
        int i2 = i | (ux2Var2.h(function0) ? 4 : 2) | (ux2Var2.h(function1) ? 32 : 16) | (ux2Var2.g(z) ? 256 : 128) | (ux2Var2.f(v64Var) ? 2048 : 1024) | (ux2Var2.h(hw2Var) ? 16384 : 8192) | (ux2Var2.g(z2) ? 131072 : 65536) | 1572864 | (ux2Var2.h(yy0Var) ? 8388608 : 4194304);
        if (ux2Var2.N(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean zW = new j93((Context) ux2Var2.j(lh.b)).W();
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            pd5 pd5Var = y64.a;
            fs4 fs4VarA = ka0.A(fillElement, z2 ? ka0.j(56.0f, 0.0f, 56.0f, 0.0f, 10) : new pd5(0.0f, 0.0f, 0.0f, 0.0f));
            w50 w50Var = xz2.B;
            kw0 kw0VarA = iw0.a(z2 ? iq8.h : iq8.g, w50Var, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z3 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            fs4Var2 = cs4.b;
            b(ka0.D(fs4Var2, 24.0f, 0.0f, 2), ux2Var2, ((i2 >> 18) & 112) | 6);
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var2, 1.0f);
            kw0 kw0VarA2 = iw0.a(iq8.c, w50Var, ux2Var2, 48);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarC);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA2, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(fs4Var2, 16.0f));
            a(zW, v64Var, hw2Var, null, ux2Var2, (i2 >> 6) & 1008);
            v64Var2 = v64Var;
            boolean z4 = v64Var2.e.size() > 1;
            boolean z5 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objK = ux2Var2.K();
            if (z5 || objK == e01.a) {
                objK = new sv1(function1, function0, (byte) 4);
                ux2Var2.g0(objK);
            }
            e(zW, z4, z, (Function0) objK, null, ux2Var, i2 & 896);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            ux2Var2.p(true);
        } else {
            v64Var2 = v64Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new r23(function0, function1, z, v64Var2, hw2Var, z2, fs4Var2, i);
        }
    }

    public static final void h(boolean z, r64 r64Var, Context context, ux2 ux2Var, int i) {
        int i2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-205070496);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (ux2Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ux2Var2.f(r64Var) : ux2Var2.h(r64Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.h(context) ? 256 : 128;
        }
        byte b3 = 1;
        if (ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            String str = r64Var.q;
            boolean zH = ux2Var2.h(context);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                objK = new d80(context, b3);
                ux2Var2.g0(objK);
            }
            vd5 vd5Var = new vd5(str, new i77((Function0) objK));
            String str2 = r64Var.r;
            boolean zH2 = ux2Var2.h(context);
            Object objK2 = ux2Var2.K();
            if (zH2 || objK2 == awVar) {
                objK2 = new d80(context, b2);
                ux2Var2.g0(objK2);
            }
            Map mapR = xm4.R(vd5Var, new vd5(str2, new i77((Function0) objK2)));
            if (z) {
                ux2Var2.W(-1811261783);
                String strZ = m77.z(R.string.legal_agreement_text_concept_placeholder_new, ux2Var2);
                e96 e96Var = nb7.a;
                strZ.getClass();
                qs7.b(nb7.a.e(strZ, new vs6((byte) 11)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 0, 0, 262142);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-1811118873);
                qs7.c(g77.s(r64Var.n, mapR, null, 0L, ux2Var2, 28), androidx.compose.ui.platform.a.a(cs4.b, "TVTA-LegalAgreement-descriptionText-TVSpannableText"), 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, ((rn4) ux2Var2.j(un4.a)).b.k, ux2Var, 48, 0, 262140);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            }
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new cn1(z, (Object) r64Var, (Object) context, i, (byte) 4);
        }
    }

    public static final void i(boolean z, Context context, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        String str;
        ux2Var.Y(-877713103);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = i | (ux2Var.g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(context) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var, 48);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            aw awVar = e01.a;
            if (z) {
                ux2Var.W(1735877010);
                fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var, "PrivacyPolicyButton");
                boolean zH = ux2Var.h(context);
                Object objK = ux2Var.K();
                if (zH || objK == awVar) {
                    objK = new d80(context, (byte) 3);
                    ux2Var.g0(objK);
                }
                str = "PrivacyPolicyButton";
                v67.d((Function0) objK, fs4VarA, null, false, "PrivacyPolicyButton", iq8.n, ux2Var, 221232, 12);
                fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(cs4Var, str);
                boolean zH2 = ux2Var.h(context);
                Object objK2 = ux2Var.K();
                if (zH2 || objK2 == awVar) {
                    objK2 = new d80(context, b2);
                    ux2Var.g0(objK2);
                }
                v67.d((Function0) objK2, fs4VarA2, null, false, "PrivacyPolicyButton", iq8.f1091o, ux2Var, 221232, 12);
                ux2Var.p(false);
            } else {
                str = "PrivacyPolicyButton";
                ux2Var.W(1736531451);
                ux2Var.p(false);
            }
            fs4 fs4VarA3 = androidx.compose.ui.platform.a.a(cs4Var, str);
            boolean zH3 = ux2Var.h(context);
            Object objK3 = ux2Var.K();
            if (zH3 || objK3 == awVar) {
                objK3 = new d80(context, (byte) 5);
                ux2Var.g0(objK3);
            }
            v67.d((Function0) objK3, fs4VarA3, null, false, "PrivacyPolicyButton", iq8.p, ux2Var, 221232, 12);
            ux2Var.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new cn1(z, (Object) context, (Object) fs4Var2, i, (byte) 3);
        }
    }

    public static final void j(fs4 fs4Var, hj5 hj5Var, vj5 vj5Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        vj5 vj5Var2;
        int i2;
        fs4 fs4Var3;
        vj5 vj5Var3;
        ux2Var.Y(901424835);
        int i3 = i | 54 | (ux2Var.f(hj5Var) ? 256 : 128) | 93184;
        if (ux2Var.N(i3 & 1, (74899 & i3) != 74898)) {
            ux2Var.S();
            hc1 hc1Var = null;
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
                i2 = i3 & (-458753);
                fs4Var3 = fs4Var;
                vj5Var3 = vj5Var;
            } else {
                if (nv1.c == null) {
                    im3.e0("permissionsFactory");
                    throw null;
                }
                og1 og1Var = new og1((byte) 1);
                le5 le5Var = new le5((byte) 4);
                x86 x86Var = w86.a;
                og1Var.a(x86Var.b(vj5.class), le5Var);
                fi3 fi3VarC = og1Var.c();
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                vj5 vj5Var4 = (vj5) g57.t(x86Var.b(vj5.class), we8VarA, null, fi3VarC, h57.k(we8VarA), ux2Var);
                i2 = i3 & (-458753);
                fs4Var3 = cs4.b;
                vj5Var3 = vj5Var4;
            }
            ux2Var.q();
            Object obj = (Context) ux2Var.j(lh.b);
            boolean zH = ux2Var.h(vj5Var3) | ux2Var.h(obj);
            Object objK = ux2Var.K();
            Object obj2 = e01.a;
            if (zH || objK == obj2) {
                objK = new i9(vj5Var3, obj, hc1Var, (byte) 20);
                ux2Var.g0(objK);
            }
            ck3.i(f88.a, (hw2) objK, ux2Var);
            px4 px4VarG = g57.g(vj5Var3.f2319o, ux2Var);
            t36 t36VarU = yo1.u(((LifecycleOwner) ux2Var.j(dd4.a)).getR().j);
            px4 px4VarF = g57.f(t36VarU, t36VarU.getValue(), ux2Var, 0, 0);
            m84 m84Var = (m84) px4VarF.getValue();
            boolean zF = ux2Var.f(px4VarF) | ux2Var.h(vj5Var3) | ux2Var.h(obj);
            Object objK2 = ux2Var.K();
            if (zF || objK2 == obj2) {
                Object k9Var = new k9(vj5Var3, obj, px4VarF, hc1Var, (byte) 6);
                ux2Var.g0(k9Var);
                objK2 = k9Var;
            }
            ck3.i(m84Var, (hw2) objK2, ux2Var);
            ct1.g((mx0) px4VarG.getValue(), hj5Var, fs4Var3, ux2Var, (i2 & 1008) | 27648);
            fs4Var2 = fs4Var3;
            vj5Var2 = vj5Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            vj5Var2 = vj5Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9(fs4Var2, (Object) hj5Var, (Object) vj5Var2, i, (byte) 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0145  */
    /* JADX WARN: Code duplicated, block: B:117:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0180  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:124:0x018e  */
    /* JADX WARN: Code duplicated, block: B:127:0x019d  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01de  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:148:0x0221  */
    /* JADX WARN: Code duplicated, block: B:149:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0257  */
    /* JADX WARN: Code duplicated, block: B:160:0x029e  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:171:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:180:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:184:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:185:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:188:0x0303  */
    /* JADX WARN: Code duplicated, block: B:189:0x0305  */
    /* JADX WARN: Code duplicated, block: B:192:0x0311  */
    /* JADX WARN: Code duplicated, block: B:193:0x0313  */
    /* JADX WARN: Code duplicated, block: B:196:0x031b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x0321  */
    /* JADX WARN: Code duplicated, block: B:209:0x01b8 A[SYNTHETIC] */
    public static final void k(final List list, final Object obj, final Function1 function1, final Function1 function2, final hw2 hw2Var, final fs4 fs4Var, final iw2 iw2Var, iw2 iw2Var2, final String str, ux2 ux2Var, final int i, final int i2) {
        ux2 ux2Var2;
        final iw2 iw2Var3;
        iw2 iw2Var4;
        Object objK;
        aw awVar;
        px4 px4Var;
        boolean z;
        boolean zF;
        Object objK2;
        ArrayList arrayList;
        final List list2;
        int i3;
        boolean z2;
        boolean zF2;
        Object objK3;
        final boolean zBooleanValue;
        iw2 iw2Var5;
        boolean zF3;
        Object objK4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objK5;
        final iw2 iw2Var6;
        function1.getClass();
        function2.getClass();
        hw2Var.getClass();
        ux2Var.Y(956101086);
        int i4 = (i & 6) == 0 ? ((i & 8) == 0 ? ux2Var.f(list) : ux2Var.h(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? ux2Var.f(obj) : ux2Var.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= ux2Var.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ux2Var.h(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ux2Var.h(hw2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= ux2Var.f(fs4Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= ux2Var.h(iw2Var) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= (i & 16777216) == 0 ? ux2Var.f(null) : ux2Var.h(null) ? 8388608 : 4194304;
        }
        int i5 = i2 & 256;
        if (i5 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= ux2Var.h(iw2Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= ux2Var.f(str) ? 536870912 : 268435456;
        }
        if (ux2Var.N(i4 & 1, (i4 & 306783379) != 306783378)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                if (i5 != 0) {
                    iw2Var4 = null;
                }
                ux2Var.q();
                Object[] objArr = new Object[0];
                objK = ux2Var.K();
                awVar = e01.a;
                if (objK == awVar) {
                    objK = new w26((byte) 24);
                    ux2Var.g0(objK);
                }
                px4Var = (px4) L(objArr, (Function0) objK, ux2Var, 48);
                String str2 = (String) px4Var.getValue();
                if ((i4 & 14) != 4 || ((i4 & 8) != 0 && ux2Var.f(list))) {
                    z = true;
                } else {
                    z = false;
                }
                zF = z | ux2Var.f(str2);
                objK2 = ux2Var.K();
                if (zF || objK2 == awVar) {
                    if (ub7.b0((String) px4Var.getValue())) {
                        objK2 = list;
                    } else {
                        arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (((Boolean) hw2Var.invoke(obj2, (String) px4Var.getValue())).booleanValue()) {
                                arrayList.add(obj2);
                            }
                        }
                        objK2 = arrayList;
                    }
                    ux2Var.g0(objK2);
                }
                list2 = (List) objK2;
                String str3 = (String) px4Var.getValue();
                i3 = 29360128 & i4;
                if (i3 != 8388608 || ((i4 & 16777216) != 0 && ux2Var.f(null))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zF2 = ux2Var.f(str3) | z2;
                objK3 = ux2Var.K();
                if (zF2 || objK3 == awVar) {
                    objK3 = false;
                    ux2Var.g0(objK3);
                }
                zBooleanValue = ((Boolean) objK3).booleanValue();
                iw2Var5 = iw2Var4;
                kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
                int iHashCode = Long.hashCode(ux2Var.T);
                yj5 yj5VarL = ux2Var.l();
                fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(kw0VarA, d82.v, ux2Var);
                o67.n(yj5VarL, d82.u, ux2Var);
                o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS, d82.t, ux2Var);
                String str4 = (String) px4Var.getValue();
                zF3 = ux2Var.f(px4Var);
                objK4 = ux2Var.K();
                if (zF3 || objK4 == awVar) {
                    objK4 = new va(px4Var, (byte) 26);
                    ux2Var.g0(objK4);
                }
                it1.h(str4, (Function1) objK4, str, null, ux2Var, (i4 >> 21) & 896);
                ux2Var2 = ux2Var;
                if (list2.isEmpty() || zBooleanValue) {
                    ux2Var2.W(-840927290);
                    w44 w44VarA = z44.a(0, 0, ux2Var2, 3);
                    fs4 fs4VarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.c(cs4.b, 1.0f));
                    pd5 pd5VarJ = ka0.j(0.0f, 16.0f, 0.0f, 0.0f, 13);
                    boolean zG = ux2Var2.g(zBooleanValue);
                    if (i3 != 8388608 || ((i4 & 16777216) != 0 && ux2Var2.h(null))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z10 = zG | z3;
                    if ((i4 & 112) != 32 || ((i4 & 64) != 0 && ux2Var2.h(obj))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z11 = z10 | z4;
                    if ((i4 & 896) == 256) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z12 = z11 | z5;
                    if ((234881024 & i4) == 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z13 = z12 | z6;
                    if ((i4 & 7168) == 2048) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean zH = z13 | z7 | ux2Var2.h(list2);
                    if ((3670016 & i4) == 1048576) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zH | z8;
                    objK5 = ux2Var2.K();
                    if (!z9 || objK5 == awVar) {
                        iw2Var6 = iw2Var5;
                        final int i6 = i4;
                        Function1 function3 = new Function1(zBooleanValue, list2, obj, function1, iw2Var6, function2, i6, iw2Var) { // from class: o.en6
                            public final /* synthetic */ List m;
                            public final /* synthetic */ Object n;

                            /* JADX INFO: renamed from: o, reason: collision with root package name */
                            public final /* synthetic */ Function1 f727o;
                            public final /* synthetic */ Function1 p;
                            public final /* synthetic */ int q;
                            public final /* synthetic */ iw2 r;

                            {
                                this.m = list2;
                                this.n = obj;
                                this.f727o = function1;
                                this.p = function2;
                                this.q = i6;
                                this.r = iw2Var;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                h44 h44Var = (h44) obj3;
                                h44Var.getClass();
                                List list3 = this.m;
                                h44Var.b(list3.size(), null, new ha1(list3, (byte) 8), new yy0(802480018, true, new gn6(list3, this.n, this.f727o, this.r, this.p, this.q)));
                                return f88.a;
                            }
                        };
                        ux2Var2.g0(function3);
                        objK5 = function3;
                    } else {
                        iw2Var6 = iw2Var5;
                    }
                    yo1.i(390, 504, (Function1) objK5, null, null, null, null, ux2Var, w44VarA, fs4VarR, pd5VarJ, false);
                    ux2Var2 = ux2Var;
                    ux2Var2.p(false);
                } else {
                    ux2Var2.W(-837734352);
                    it1.g(0, (String) px4Var.getValue(), ux2Var2, null);
                    ux2Var2.p(false);
                    iw2Var6 = iw2Var5;
                }
                ux2Var2.p(true);
                iw2Var3 = iw2Var6;
            } else {
                ux2Var.Q();
            }
            iw2Var4 = iw2Var2;
            ux2Var.q();
            Object[] objArr2 = new Object[0];
            objK = ux2Var.K();
            awVar = e01.a;
            if (objK == awVar) {
                objK = new w26((byte) 24);
                ux2Var.g0(objK);
            }
            px4Var = (px4) L(objArr2, (Function0) objK, ux2Var, 48);
            String str5 = (String) px4Var.getValue();
            if ((i4 & 14) != 4) {
                z = true;
            } else {
                z = true;
            }
            zF = z | ux2Var.f(str5);
            objK2 = ux2Var.K();
            if (zF) {
                if (ub7.b0((String) px4Var.getValue())) {
                    objK2 = list;
                } else {
                    arrayList = new ArrayList();
                    while (r9.hasNext()) {
                        if (((Boolean) hw2Var.invoke(obj2, (String) px4Var.getValue())).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                    objK2 = arrayList;
                }
                ux2Var.g0(objK2);
            } else {
                if (ub7.b0((String) px4Var.getValue())) {
                    objK2 = list;
                } else {
                    arrayList = new ArrayList();
                    while (r9.hasNext()) {
                        if (((Boolean) hw2Var.invoke(obj2, (String) px4Var.getValue())).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                    objK2 = arrayList;
                }
                ux2Var.g0(objK2);
            }
            list2 = (List) objK2;
            String str6 = (String) px4Var.getValue();
            i3 = 29360128 & i4;
            if (i3 != 8388608) {
                z2 = true;
            } else {
                z2 = true;
            }
            zF2 = ux2Var.f(str6) | z2;
            objK3 = ux2Var.K();
            if (zF2) {
                objK3 = false;
                ux2Var.g0(objK3);
            } else {
                objK3 = false;
                ux2Var.g0(objK3);
            }
            zBooleanValue = ((Boolean) objK3).booleanValue();
            iw2Var5 = iw2Var4;
            kw0 kw0VarA2 = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA2, d82.v, ux2Var);
            o67.n(yj5VarL2, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS2, d82.t, ux2Var);
            String str7 = (String) px4Var.getValue();
            zF3 = ux2Var.f(px4Var);
            objK4 = ux2Var.K();
            if (zF3) {
                objK4 = new va(px4Var, (byte) 26);
                ux2Var.g0(objK4);
            } else {
                objK4 = new va(px4Var, (byte) 26);
                ux2Var.g0(objK4);
            }
            it1.h(str7, (Function1) objK4, str, null, ux2Var, (i4 >> 21) & 896);
            ux2Var2 = ux2Var;
            if (list2.isEmpty()) {
                ux2Var2.W(-840927290);
                w44 w44VarA2 = z44.a(0, 0, ux2Var2, 3);
                fs4 fs4VarR2 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.c(cs4.b, 1.0f));
                pd5 pd5VarJ2 = ka0.j(0.0f, 16.0f, 0.0f, 0.0f, 13);
                boolean zG2 = ux2Var2.g(zBooleanValue);
                if (i3 != 8388608) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                boolean z14 = zG2 | z3;
                if ((i4 & 112) != 32) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                boolean z15 = z14 | z4;
                if ((i4 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z16 = z15 | z5;
                if ((234881024 & i4) == 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z17 = z16 | z6;
                if ((i4 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zH2 = z17 | z7 | ux2Var2.h(list2);
                if ((3670016 & i4) == 1048576) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zH2 | z8;
                objK5 = ux2Var2.K();
                if (z9) {
                    iw2Var6 = iw2Var5;
                    final int i7 = i4;
                    Function1 function4 = new Function1(zBooleanValue, list2, obj, function1, iw2Var6, function2, i7, iw2Var) { // from class: o.en6
                        public final /* synthetic */ List m;
                        public final /* synthetic */ Object n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ Function1 f727o;
                        public final /* synthetic */ Function1 p;
                        public final /* synthetic */ int q;
                        public final /* synthetic */ iw2 r;

                        {
                            this.m = list2;
                            this.n = obj;
                            this.f727o = function1;
                            this.p = function2;
                            this.q = i7;
                            this.r = iw2Var;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            h44 h44Var = (h44) obj3;
                            h44Var.getClass();
                            List list3 = this.m;
                            h44Var.b(list3.size(), null, new ha1(list3, (byte) 8), new yy0(802480018, true, new gn6(list3, this.n, this.f727o, this.r, this.p, this.q)));
                            return f88.a;
                        }
                    };
                    ux2Var2.g0(function4);
                    objK5 = function4;
                } else {
                    iw2Var6 = iw2Var5;
                    final int i8 = i4;
                    Function1 function5 = new Function1(zBooleanValue, list2, obj, function1, iw2Var6, function2, i8, iw2Var) { // from class: o.en6
                        public final /* synthetic */ List m;
                        public final /* synthetic */ Object n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ Function1 f727o;
                        public final /* synthetic */ Function1 p;
                        public final /* synthetic */ int q;
                        public final /* synthetic */ iw2 r;

                        {
                            this.m = list2;
                            this.n = obj;
                            this.f727o = function1;
                            this.p = function2;
                            this.q = i8;
                            this.r = iw2Var;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            h44 h44Var = (h44) obj3;
                            h44Var.getClass();
                            List list3 = this.m;
                            h44Var.b(list3.size(), null, new ha1(list3, (byte) 8), new yy0(802480018, true, new gn6(list3, this.n, this.f727o, this.r, this.p, this.q)));
                            return f88.a;
                        }
                    };
                    ux2Var2.g0(function5);
                    objK5 = function5;
                }
                yo1.i(390, 504, (Function1) objK5, null, null, null, null, ux2Var, w44VarA2, fs4VarR2, pd5VarJ2, false);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-840927290);
                w44 w44VarA3 = z44.a(0, 0, ux2Var2, 3);
                fs4 fs4VarR3 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.c(cs4.b, 1.0f));
                pd5 pd5VarJ3 = ka0.j(0.0f, 16.0f, 0.0f, 0.0f, 13);
                boolean zG3 = ux2Var2.g(zBooleanValue);
                if (i3 != 8388608) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                boolean z18 = zG3 | z3;
                if ((i4 & 112) != 32) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                boolean z19 = z18 | z4;
                if ((i4 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z110 = z19 | z5;
                if ((234881024 & i4) == 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z111 = z110 | z6;
                if ((i4 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zH3 = z111 | z7 | ux2Var2.h(list2);
                if ((3670016 & i4) == 1048576) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zH3 | z8;
                objK5 = ux2Var2.K();
                if (z9) {
                    iw2Var6 = iw2Var5;
                    final int i9 = i4;
                    Function1 function6 = new Function1(zBooleanValue, list2, obj, function1, iw2Var6, function2, i9, iw2Var) { // from class: o.en6
                        public final /* synthetic */ List m;
                        public final /* synthetic */ Object n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ Function1 f727o;
                        public final /* synthetic */ Function1 p;
                        public final /* synthetic */ int q;
                        public final /* synthetic */ iw2 r;

                        {
                            this.m = list2;
                            this.n = obj;
                            this.f727o = function1;
                            this.p = function2;
                            this.q = i9;
                            this.r = iw2Var;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            h44 h44Var = (h44) obj3;
                            h44Var.getClass();
                            List list3 = this.m;
                            h44Var.b(list3.size(), null, new ha1(list3, (byte) 8), new yy0(802480018, true, new gn6(list3, this.n, this.f727o, this.r, this.p, this.q)));
                            return f88.a;
                        }
                    };
                    ux2Var2.g0(function6);
                    objK5 = function6;
                } else {
                    iw2Var6 = iw2Var5;
                    final int i10 = i4;
                    Function1 function7 = new Function1(zBooleanValue, list2, obj, function1, iw2Var6, function2, i10, iw2Var) { // from class: o.en6
                        public final /* synthetic */ List m;
                        public final /* synthetic */ Object n;

                        /* JADX INFO: renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ Function1 f727o;
                        public final /* synthetic */ Function1 p;
                        public final /* synthetic */ int q;
                        public final /* synthetic */ iw2 r;

                        {
                            this.m = list2;
                            this.n = obj;
                            this.f727o = function1;
                            this.p = function2;
                            this.q = i10;
                            this.r = iw2Var;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            h44 h44Var = (h44) obj3;
                            h44Var.getClass();
                            List list3 = this.m;
                            h44Var.b(list3.size(), null, new ha1(list3, (byte) 8), new yy0(802480018, true, new gn6(list3, this.n, this.f727o, this.r, this.p, this.q)));
                            return f88.a;
                        }
                    };
                    ux2Var2.g0(function7);
                    objK5 = function7;
                }
                yo1.i(390, 504, (Function1) objK5, null, null, null, null, ux2Var, w44VarA3, fs4VarR3, pd5VarJ3, false);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            iw2Var3 = iw2Var6;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            iw2Var3 = iw2Var2;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.fn6
                @Override // o.hw2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    zu1.k(list, obj, function1, function2, hw2Var, fs4Var, iw2Var, iw2Var3, str, (ux2) obj3, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void l(int i, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        function0.getClass();
        ux2Var.Y(1235336577);
        int i2 = 2;
        int i3 = (ux2Var.h(function0) ? 4 : 2) | i | 48;
        byte b2 = 1;
        byte b3 = 3;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new l5(i2, null, (byte) 19);
                ux2Var.g0(objK);
            }
            ck3.i(f88.a, (hw2) objK, ux2Var);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new vs6(b3);
                ux2Var.g0(objK2);
            }
            cs4 cs4Var = cs4.b;
            uf0.b(function0, au8.O(1791525833, new cu6(function0, b2), ux2Var), cp6.a(cs4Var, false, (Function1) objK2), null, di1.n, di1.f624o, null, 0L, 0L, 0L, 0L, null, ux2Var, (i3 & 14) | 1769520, 0, 16280);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new x71(function0, fs4Var2, i, (byte) 3);
        }
    }

    public static final boolean n(eh3 eh3Var) {
        return !eh3Var.h && eh3Var.d;
    }

    public static final boolean o(eh3 eh3Var) {
        return eh3Var.h && !eh3Var.d;
    }

    public static final Object p(go2 go2Var, hw2 hw2Var, og7 og7Var) {
        int i = dp2.a;
        Object objB = lv1.D(new fn0(new cp2((pw2) hw2Var, (hc1) null, (byte) 0), go2Var, ba2.m, -2, df0.m), 0).b(y45.m, og7Var);
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        if (objB != ne1Var) {
            objB = f88Var;
        }
        return objB == ne1Var ? objB : f88Var;
    }

    public static final yy0 q(List list) {
        return new yy0(1271844412, true, new zs1(list, (byte) 1));
    }

    public static final int r(long j, long j2) {
        boolean zA = A(j);
        if (zA != A(j2)) {
            return zA ? -1 : 1;
        }
        int iSignum = (int) Math.signum(w(j) - w(j2));
        if (Math.min(w(j), w(j2)) >= 0.0f && z(j) != z(j2)) {
            return z(j) ? -1 : 1;
        }
        return iSignum;
    }

    public static yi8 s(n61 n61Var, int i, ArrayList arrayList, yi8 yi8Var) {
        int i2;
        int i3 = i == 0 ? n61Var.m0 : n61Var.n0;
        if (i3 != -1 && (yi8Var == null || i3 != yi8Var.b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                yi8 yi8Var2 = (yi8) arrayList.get(i4);
                if (yi8Var2.b == i3) {
                    if (yi8Var != null) {
                        yi8Var.c(i, yi8Var2);
                        arrayList.remove(yi8Var);
                    }
                    yi8Var = yi8Var2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return yi8Var;
        }
        if (yi8Var == null) {
            if (n61Var instanceof a30) {
                a30 a30Var = (a30) n61Var;
                int i5 = 0;
                while (true) {
                    if (i5 >= a30Var.q0) {
                        i2 = -1;
                        break;
                    }
                    n61 n61Var2 = a30Var.p0[i5];
                    if ((i == 0 && (i2 = n61Var2.m0) != -1) || (i == 1 && (i2 = n61Var2.n0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        yi8 yi8Var3 = (yi8) arrayList.get(i6);
                        if (yi8Var3.b == i2) {
                            yi8Var = yi8Var3;
                            break;
                        }
                    }
                }
            }
            if (yi8Var == null) {
                yi8Var = new yi8();
                yi8Var.a = new ArrayList();
                yi8Var.d = null;
                yi8Var.e = -1;
                int i7 = yi8.f;
                yi8.f = i7 + 1;
                yi8Var.b = i7;
                yi8Var.c = i;
            }
            arrayList.add(yi8Var);
        }
        ArrayList arrayList2 = yi8Var.a;
        if (arrayList2.contains(n61Var)) {
            return yi8Var;
        }
        arrayList2.add(n61Var);
        if (n61Var instanceof g43) {
            g43 g43Var = (g43) n61Var;
            g43Var.s0.b(g43Var.t0 == 0 ? 1 : 0, arrayList, yi8Var);
        }
        int i8 = yi8Var.b;
        if (i == 0) {
            n61Var.m0 = i8;
            n61Var.H.b(i, arrayList, yi8Var);
            n61Var.J.b(i, arrayList, yi8Var);
        } else {
            n61Var.n0 = i8;
            n61Var.I.b(i, arrayList, yi8Var);
            n61Var.L.b(i, arrayList, yi8Var);
            n61Var.K.b(i, arrayList, yi8Var);
        }
        n61Var.O.b(i, arrayList, yi8Var);
        return yi8Var;
    }

    public static final HashSet t(Iterable iterable) {
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set setC = ((zo4) it.next()).c();
            if (setC == null) {
                return null;
            }
            qv0.c0(hashSet, setC);
        }
        return hashSet;
    }

    public static final String u(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Rect v(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final float w(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean x(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static final void y(ux2 ux2Var, hw2 hw2Var) {
        hw2Var.getClass();
        e8.i(2, hw2Var);
        hw2Var.invoke(ux2Var, 1);
    }

    public static final boolean z(long j) {
        return (j & 2) != 0;
    }

    public abstract void F(Throwable th);

    public abstract void G(j93 j93Var);

    public abstract String m();
}
