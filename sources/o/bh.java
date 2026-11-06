package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class bh extends p3 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final jw4 Z;
    public boolean A;
    public final kw4 B;
    public final kw4 C;
    public final n77 D;
    public final n77 E;
    public int F;
    public Integer G;
    public final ax H;
    public final kf0 I;
    public boolean J;
    public yg K;
    public kw4 L;
    public final lw4 M;
    public final iw4 N;
    public final iw4 O;
    public final String P;
    public final String Q;
    public final y58 R;
    public final kw4 S;
    public gp6 T;
    public boolean U;
    public final iw4 V;
    public final io.sentry.b5 W;
    public final ArrayList X;
    public final vg Y;
    public final AndroidComposeView p;
    public int q = Integer.MIN_VALUE;
    public final vg r;
    public final AccessibilityManager s;
    public long t;
    public List u;
    public final xg v;
    public int w;
    public int x;
    public g4 y;
    public g4 z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        jw4 jw4Var = sk3.a;
        jw4 jw4Var2 = new jw4(32);
        int i = jw4Var2.b;
        if (i < 0) {
            hk0.r("");
            return;
        }
        int i2 = i + 32;
        jw4Var2.b(i2);
        int[] iArr2 = jw4Var2.a;
        int i3 = jw4Var2.b;
        if (i != i3) {
            cx.F0(i2, i, i3, iArr2, iArr2);
        }
        cx.I0(i, 0, 12, iArr, iArr2);
        jw4Var2.b += 32;
        Z = jw4Var2;
    }

    public bh(AndroidComposeView androidComposeView) {
        this.p = androidComposeView;
        byte b = 0;
        this.r = new vg(this, b);
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.s = (AccessibilityManager) systemService;
        this.t = 100L;
        new Handler(Looper.getMainLooper());
        this.v = new xg(this, b);
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.B = new kw4();
        this.C = new kw4();
        this.D = new n77(0);
        this.E = new n77(0);
        this.F = -1;
        this.H = new ax(0);
        this.I = ka0.d(1, 6, null);
        this.J = true;
        kw4 kw4Var = uk3.a;
        kw4Var.getClass();
        this.L = kw4Var;
        this.M = new lw4();
        this.N = new iw4();
        this.O = new iw4();
        this.P = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.Q = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.R = new y58();
        this.S = new kw4();
        this.T = new gp6(androidComposeView.getSemanticsOwner().a(), kw4Var);
        int i = qk3.a;
        this.V = new iw4();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.W = new io.sentry.b5((Object) this, (byte) 23);
        this.X = new ArrayList();
        this.Y = new vg(this, (byte) 1);
    }

    public static /* synthetic */ void E(bh bhVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        bhVar.D(i, i2, num, null);
    }

    public static Rect L(vs1 vs1Var, float f, float f2) {
        if (!(vs1Var instanceof ob5) && !(vs1Var instanceof pb5)) {
            return null;
        }
        v56 v56VarV = vs1Var.v();
        return new Rect((int) (v56VarV.a + f), (int) (v56VarV.b + f2), (int) (v56VarV.c + f), (int) (v56VarV.d + f2));
    }

    public static float[] N(vs1 vs1Var) {
        if (!(vs1Var instanceof pb5)) {
            return null;
        }
        lf6 lf6Var = ((pb5) vs1Var).e;
        long j = lf6Var.h;
        long j2 = lf6Var.g;
        long j3 = lf6Var.f;
        long j4 = lf6Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(vs1 vs1Var, float f, float f2) {
        if (vs1Var instanceof nb5) {
            nb5 nb5Var = (nb5) vs1Var;
            v56 v56VarH = nb5Var.v().h(f, f2);
            Region region = new Region(new Rect((int) (v56VarH.a + 0.0f), (int) (v56VarH.b + 0.0f), (int) (v56VarH.c + 0.0f), (int) (v56VarH.d + 0.0f)));
            Region region2 = new Region();
            rj rjVar = nb5Var.e;
            if (rjVar instanceof rj) {
                Path path = rjVar.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            yq4.r("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(fp6 fp6Var) {
        xo xoVar;
        if (fp6Var != null) {
            ap6 ap6Var = fp6Var.d;
            jx4 jx4Var = ap6Var.m;
            np6 np6Var = kp6.a;
            if (jx4Var.c(np6Var)) {
                return gc4.a((List) ap6Var.b(np6Var), ",", null, 62);
            }
            np6 np6Var2 = kp6.G;
            if (jx4Var.c(np6Var2)) {
                Object objG = jx4Var.g(np6Var2);
                if (objG == null) {
                    objG = null;
                }
                xo xoVar2 = (xo) objG;
                if (xoVar2 != null) {
                    return xoVar2.n;
                }
            } else {
                Object objG2 = jx4Var.g(kp6.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (xoVar = (xo) lv0.o0(list)) != null) {
                    return xoVar.n;
                }
            }
        }
        return null;
    }

    public static final boolean x(rj6 rj6Var, float f) {
        Function0 function0 = rj6Var.a;
        if (f >= 0.0f || ((Number) function0.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) function0.a()).floatValue() < ((Number) rj6Var.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean y(rj6 rj6Var) {
        Function0 function0 = rj6Var.a;
        if (((Number) function0.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) function0.a()).floatValue();
        ((Number) rj6Var.b.a()).floatValue();
        return false;
    }

    public static final boolean z(rj6 rj6Var) {
        Function0 function0 = rj6Var.a;
        if (((Number) function0.a()).floatValue() < ((Number) rj6Var.b.a()).floatValue()) {
            return true;
        }
        ((Number) function0.a()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.p.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void B(fp6 fp6Var, gp6 gp6Var) {
        int[] iArr = cl3.a;
        lw4 lw4Var = new lw4();
        List listI = fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0);
        LayoutNode layoutNode = fp6Var.c;
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            fp6 fp6Var2 = (fp6) listI.get(i);
            tk3 tk3VarS = s();
            int i2 = fp6Var2.f;
            if (tk3VarS.a(i2)) {
                if (!gp6Var.b.b(i2)) {
                    w(layoutNode);
                    return;
                }
                lw4Var.a(i2);
            }
        }
        lw4 lw4Var2 = gp6Var.b;
        int[] iArr2 = lw4Var2.b;
        long[] jArr = lw4Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !lw4Var.b(iArr2[(i3 << 3) + i5])) {
                            w(layoutNode);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listI2 = fp6Var.i((4 & 1) != 0 ? !fp6Var.b : false, (4 & 2) == 0);
        int size2 = listI2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            fp6 fp6Var3 = (fp6) listI2.get(i6);
            gp6 gp6Var2 = (gp6) this.S.b(fp6Var3.f);
            if (gp6Var2 != null && s().a(fp6Var3.f)) {
                B(fp6Var3, gp6Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.A = true;
        }
        try {
            return ((Boolean) this.r.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.A = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(gc4.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        yg ygVar = this.K;
        if (ygVar != null) {
            fp6 fp6Var = ygVar.a;
            if (i != fp6Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - ygVar.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(fp6Var.f), 131072);
                accessibilityEventO.setFromIndex(ygVar.d);
                accessibilityEventO.setToIndex(ygVar.e);
                accessibilityEventO.setAction(ygVar.b);
                accessibilityEventO.setMovementGranularity(ygVar.c);
                accessibilityEventO.getText().add(t(fp6Var));
                C(accessibilityEventO);
            }
        }
        this.K = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0256  */
    /* JADX WARN: Code duplicated, block: B:102:0x0263  */
    /* JADX WARN: Code duplicated, block: B:105:0x0295  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02da  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:129:0x030c  */
    /* JADX WARN: Code duplicated, block: B:130:0x030e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0316  */
    /* JADX WARN: Code duplicated, block: B:137:0x0323 A[LOOP:4: B:132:0x0312->B:137:0x0323, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0331  */
    /* JADX WARN: Code duplicated, block: B:145:0x0345 A[LOOP:5: B:140:0x032d->B:145:0x0345, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x036b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0376  */
    /* JADX WARN: Code duplicated, block: B:162:0x039e  */
    /* JADX WARN: Code duplicated, block: B:165:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:169:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:172:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:174:0x0405  */
    /* JADX WARN: Code duplicated, block: B:176:0x040b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0455  */
    /* JADX WARN: Code duplicated, block: B:253:0x0543  */
    /* JADX WARN: Code duplicated, block: B:256:0x0556 A[LOOP:6: B:252:0x0541->B:256:0x0556, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:0x0567  */
    /* JADX WARN: Code duplicated, block: B:263:0x0574  */
    /* JADX WARN: Code duplicated, block: B:266:0x0581  */
    /* JADX WARN: Code duplicated, block: B:267:0x0584  */
    /* JADX WARN: Code duplicated, block: B:293:0x066e  */
    /* JADX WARN: Code duplicated, block: B:315:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x032c A[EDGE_INSN: B:316:0x032c->B:139:0x032c BREAK  A[LOOP:4: B:132:0x0312->B:137:0x0323], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x034a A[EDGE_INSN: B:318:0x034a->B:147:0x034a BREAK  A[LOOP:5: B:140:0x032d->B:145:0x0345], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x054f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0142  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0178  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x021d  */
    /* JADX WARN: Code duplicated, block: B:89:0x022b  */
    /* JADX WARN: Code duplicated, block: B:92:0x023e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0245  */
    /* JADX WARN: Code duplicated, block: B:96:0x024d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0251  */
    public final void H(tk3 tk3Var) {
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        Integer num4;
        int i5;
        byte b;
        ap6 ap6Var;
        fp6 fp6Var;
        boolean z;
        int i6;
        boolean z2;
        boolean z3;
        jx4 jx4Var;
        LayoutNode layoutNode;
        int i7;
        ap6 ap6Var2;
        long j;
        int i8;
        int i9;
        Integer num5;
        ck6 ck6Var;
        boolean z4;
        np6 np6Var;
        int i10;
        np6 np6Var2;
        ArrayList arrayList5;
        np6 np6Var3;
        String str;
        np6 np6Var4;
        int size;
        int i11;
        ck6 ck6Var2;
        Object objG;
        Object objG2;
        pw2 pw2Var;
        boolean z5;
        int i12;
        Object objG3;
        xo xoVar;
        String str2;
        Object objG4;
        xo xoVar2;
        Object objG5;
        CharSequence charSequence;
        CharSequence charSequenceP;
        int length;
        int length2;
        int i13;
        Integer num6;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean zC;
        boolean z6;
        boolean z7;
        AccessibilityEvent accessibilityEventP;
        Object objG6;
        pe6 pe6Var;
        Object objG7;
        AccessibilityEvent accessibilityEventO;
        Object objG8;
        String strA;
        Object objG9;
        List list;
        String strA2;
        String str3;
        boolean zC2;
        int i18;
        bh bhVar = this;
        tk3 tk3Var2 = tk3Var;
        Integer num7 = 64;
        ArrayList arrayList6 = bhVar.X;
        ArrayList arrayList7 = new ArrayList(arrayList6);
        arrayList6.clear();
        int[] iArr3 = tk3Var2.b;
        long[] jArr3 = tk3Var2.a;
        byte b2 = 2;
        int length3 = jArr3.length - 2;
        int i19 = 0;
        Integer num8 = 0;
        if (length3 < 0) {
            return;
        }
        int i20 = 0;
        while (true) {
            long j2 = jArr3[i20];
            byte b3 = b2;
            int i21 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i22 = 8;
                int i23 = 8 - ((~(i20 - i21)) >>> 31);
                long j3 = j2;
                int i24 = i19;
                while (i24 < i23) {
                    if ((j3 & 255) < 128) {
                        int i25 = iArr3[(i20 << 3) + i24];
                        gp6 gp6Var = (gp6) bhVar.S.b(i25);
                        if (gp6Var == null) {
                            i2 = i24;
                            num3 = num7;
                            arrayList3 = arrayList7;
                            arrayList4 = arrayList6;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i3 = i23;
                            i4 = i20;
                            num4 = num8;
                            i5 = i22;
                            b = b3;
                        } else {
                            ap6 ap6Var3 = gp6Var.a;
                            jx4 jx4Var2 = ap6Var3.m;
                            hp6 hp6Var = (hp6) tk3Var2.b(i25);
                            int i26 = i22;
                            fp6 fp6Var2 = hp6Var != null ? hp6Var.a : null;
                            if (fp6Var2 == null) {
                                throw ua5.r("no value for specified key");
                            }
                            LayoutNode layoutNode2 = fp6Var2.c;
                            ap6 ap6Var4 = fp6Var2.d;
                            iArr2 = iArr3;
                            int i27 = fp6Var2.f;
                            jArr2 = jArr3;
                            jx4 jx4Var3 = ap6Var4.m;
                            i4 = i20;
                            Object[] objArr = jx4Var3.b;
                            Object[] objArr2 = jx4Var3.c;
                            long[] jArr4 = jx4Var3.a;
                            i2 = i24;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                LayoutNode layoutNode3 = layoutNode2;
                                i3 = i23;
                                int i28 = 0;
                                z2 = false;
                                while (true) {
                                    long j4 = jArr4[i28];
                                    fp6 fp6Var3 = fp6Var2;
                                    int i29 = i28;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i30 = 8 - ((~(i29 - length4)) >>> 31);
                                        int i31 = 0;
                                        while (i31 < i30) {
                                            if ((j4 & 255) < 128) {
                                                int i32 = (i29 << 3) + i31;
                                                Object obj = objArr[i32];
                                                int i33 = length4;
                                                Object obj2 = objArr2[i32];
                                                ap6Var2 = ap6Var3;
                                                np6 np6Var5 = (np6) obj;
                                                j = j4;
                                                np6 np6Var6 = kp6.v;
                                                if (im3.n(np6Var5, np6Var6) || im3.n(np6Var5, kp6.w)) {
                                                    int size2 = arrayList7.size();
                                                    int i34 = 0;
                                                    while (true) {
                                                        if (i34 >= size2) {
                                                            ck6Var = null;
                                                            break;
                                                        }
                                                        int i35 = size2;
                                                        if (((ck6) arrayList7.get(i34)).m == i25) {
                                                            ck6Var = (ck6) arrayList7.get(i34);
                                                            break;
                                                        } else {
                                                            i34++;
                                                            size2 = i35;
                                                        }
                                                    }
                                                    if (ck6Var != null) {
                                                        z4 = false;
                                                    } else {
                                                        ck6Var = new ck6(i25, arrayList6);
                                                        z4 = true;
                                                    }
                                                    arrayList6.add(ck6Var);
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    np6Var = kp6.d;
                                                    if (im3.n(np6Var5, np6Var)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        zC2 = jx4Var2.c(np6Var);
                                                        i18 = i26;
                                                        if (zC2) {
                                                            bhVar.F(i25, i18, str3);
                                                        }
                                                    } else {
                                                        i10 = i26;
                                                        if (im3.n(np6Var5, kp6.b)) {
                                                            E(bhVar, bhVar.A(i25), 2048, num7, i10);
                                                            E(bhVar, bhVar.A(i25), 2048, num8, i10);
                                                        } else if (im3.n(np6Var5, kp6.L)) {
                                                            E(bhVar, bhVar.A(i25), 2048, 8192, 8);
                                                            E(bhVar, bhVar.A(i25), 2048, num8, 8);
                                                        } else if (im3.n(np6Var5, kp6.O)) {
                                                            E(bhVar, bhVar.A(i25), 2048, 3072, 8);
                                                        } else if (im3.n(np6Var5, kp6.c)) {
                                                            E(bhVar, bhVar.A(i25), 2048, num7, 8);
                                                            E(bhVar, bhVar.A(i25), 2048, num8, 8);
                                                        } else {
                                                            np6Var2 = kp6.K;
                                                            arrayList7 = arrayList7;
                                                            if (im3.n(np6Var5, np6Var2)) {
                                                                objG6 = jx4Var3.g(kp6.z);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                pe6Var = (pe6) objG6;
                                                                if (pe6Var == null && pe6Var.a == 4) {
                                                                    objG7 = jx4Var3.g(np6Var2);
                                                                    if (objG7 == null) {
                                                                        objG7 = null;
                                                                    }
                                                                    if (im3.n(objG7, Boolean.TRUE)) {
                                                                        accessibilityEventO = bhVar.o(bhVar.A(i25), 4);
                                                                        fp6Var3 = fp6Var3;
                                                                        layoutNode3 = layoutNode3;
                                                                        fp6 fp6Var4 = new fp6(fp6Var3.a, true, layoutNode3, ap6Var4);
                                                                        objG8 = fp6Var4.k().m.g(kp6.a);
                                                                        if (objG8 == null) {
                                                                            objG8 = null;
                                                                        }
                                                                        List list2 = (List) objG8;
                                                                        strA = list2 != null ? gc4.a(list2, ",", null, 62) : null;
                                                                        objG9 = fp6Var4.k().m.g(kp6.C);
                                                                        if (objG9 == null) {
                                                                            objG9 = null;
                                                                        }
                                                                        list = (List) objG9;
                                                                        if (list != null) {
                                                                            strA2 = gc4.a(list, ",", null, 62);
                                                                        } else {
                                                                            strA2 = null;
                                                                        }
                                                                        if (strA != null) {
                                                                            accessibilityEventO.setContentDescription(strA);
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventO.getText().add(strA2);
                                                                        }
                                                                        bhVar.C(accessibilityEventO);
                                                                    } else {
                                                                        layoutNode3 = layoutNode3;
                                                                        fp6Var3 = fp6Var3;
                                                                        E(bhVar, bhVar.A(i25), 2048, num8, 8);
                                                                    }
                                                                } else {
                                                                    layoutNode3 = layoutNode3;
                                                                    fp6Var3 = fp6Var3;
                                                                    E(bhVar, bhVar.A(i25), 2048, num7, 8);
                                                                    E(bhVar, bhVar.A(i25), 2048, num8, 8);
                                                                }
                                                                num5 = num8;
                                                                i9 = i25;
                                                                jx4Var2 = jx4Var2;
                                                                num7 = num7;
                                                                b3 = b3;
                                                                arrayList6 = arrayList6;
                                                                i8 = i33;
                                                            } else {
                                                                arrayList5 = arrayList6;
                                                                layoutNode3 = layoutNode3;
                                                                fp6Var3 = fp6Var3;
                                                                i30 = i30;
                                                                if (im3.n(np6Var5, kp6.a)) {
                                                                    int iA = bhVar.A(i25);
                                                                    obj2.getClass();
                                                                    bhVar.D(iA, 2048, 4, (List) obj2);
                                                                    num5 = num8;
                                                                    i9 = i25;
                                                                    jx4Var2 = jx4Var2;
                                                                    num7 = num7;
                                                                } else {
                                                                    np6Var3 = kp6.G;
                                                                    str = "";
                                                                    if (im3.n(np6Var5, np6Var3)) {
                                                                        if (jx4Var3.c(zo6.k)) {
                                                                            objG4 = jx4Var2.g(np6Var3);
                                                                            if (objG4 == null) {
                                                                                objG4 = null;
                                                                            }
                                                                            xoVar2 = (xo) objG4;
                                                                            if (xoVar2 == null) {
                                                                                xoVar2 = "";
                                                                            }
                                                                            objG5 = jx4Var3.g(np6Var3);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            charSequence = (xo) objG5;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceP = P(charSequence);
                                                                            length = xoVar2.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i13 = length2;
                                                                            } else {
                                                                                i13 = length;
                                                                            }
                                                                            num6 = num8;
                                                                            i14 = 0;
                                                                            while (true) {
                                                                                num7 = num7;
                                                                                if (i14 < i13) {
                                                                                    i15 = length;
                                                                                    break;
                                                                                }
                                                                                i15 = length;
                                                                                if (xoVar2.charAt(i14) != charSequence.charAt(i14)) {
                                                                                    break;
                                                                                }
                                                                                i14++;
                                                                                length = i15;
                                                                                num7 = num7;
                                                                            }
                                                                            i16 = 0;
                                                                            while (true) {
                                                                                if (i16 < i13 - i14) {
                                                                                    i17 = i16;
                                                                                    break;
                                                                                }
                                                                                i17 = i16;
                                                                                if (xoVar2.charAt((i15 - 1) - i16) != charSequence.charAt((length2 - 1) - i17)) {
                                                                                    break;
                                                                                } else {
                                                                                    i16 = i17 + 1;
                                                                                }
                                                                            }
                                                                            int i36 = (i15 - i17) - i14;
                                                                            int i37 = (length2 - i17) - i14;
                                                                            np6 np6Var7 = kp6.N;
                                                                            boolean zC3 = jx4Var2.c(np6Var7);
                                                                            boolean zC4 = jx4Var3.c(np6Var7);
                                                                            zC = jx4Var2.c(kp6.G);
                                                                            if (zC || zC3 || !zC4) {
                                                                                z6 = false;
                                                                            } else {
                                                                                z6 = true;
                                                                            }
                                                                            if (zC || !zC3 || zC4) {
                                                                                z7 = false;
                                                                            } else {
                                                                                z7 = true;
                                                                            }
                                                                            if (!z6 || z7) {
                                                                                i9 = i25;
                                                                                num8 = num6;
                                                                                accessibilityEventP = bhVar.p(bhVar.A(i25), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                            } else {
                                                                                accessibilityEventP = bhVar.o(bhVar.A(i25), 16);
                                                                                accessibilityEventP.setFromIndex(i14);
                                                                                accessibilityEventP.setRemovedCount(i36);
                                                                                accessibilityEventP.setAddedCount(i37);
                                                                                accessibilityEventP.setBeforeText(xoVar2);
                                                                                accessibilityEventP.getText().add(charSequenceP);
                                                                                i9 = i25;
                                                                                num8 = num6;
                                                                            }
                                                                            accessibilityEventP.setClassName("android.widget.EditText");
                                                                            if (Build.VERSION.SDK_INT >= 37) {
                                                                                wg.b(fp6Var3, accessibilityEventP);
                                                                            }
                                                                            bhVar.C(accessibilityEventP);
                                                                            if (z6 || z7) {
                                                                                long j5 = ((gt7) ap6Var4.b(kp6.H)).a;
                                                                                accessibilityEventP.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventP.setToIndex((int) (j5 & 4294967295L));
                                                                                bhVar.C(accessibilityEventP);
                                                                            }
                                                                        } else {
                                                                            i9 = i25;
                                                                            jx4Var2 = jx4Var2;
                                                                            num7 = num7;
                                                                            E(bhVar, bhVar.A(i9), 2048, Integer.valueOf(b3), 8);
                                                                        }
                                                                        num5 = num8;
                                                                    } else {
                                                                        i9 = i25;
                                                                        jx4Var2 = jx4Var2;
                                                                        num7 = num7;
                                                                        i8 = i33;
                                                                        np6Var4 = kp6.H;
                                                                        if (im3.n(np6Var5, np6Var4)) {
                                                                            objG3 = jx4Var3.g(np6Var3);
                                                                            if (objG3 == null) {
                                                                                objG3 = null;
                                                                            }
                                                                            xoVar = (xo) objG3;
                                                                            if (xoVar != null && (str2 = xoVar.n) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((gt7) ap6Var4.b(np6Var4)).a;
                                                                            num5 = num8;
                                                                            bhVar = this;
                                                                            bhVar.C(bhVar.p(bhVar.A(i9), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                            bhVar.G(i27);
                                                                        } else {
                                                                            num5 = num8;
                                                                            if (!im3.n(np6Var5, np6Var6) || im3.n(np6Var5, kp6.w)) {
                                                                                bhVar.w(layoutNode3);
                                                                                size = arrayList5.size();
                                                                                i11 = 0;
                                                                                while (true) {
                                                                                    if (i11 < size) {
                                                                                        arrayList6 = arrayList5;
                                                                                        ck6Var2 = null;
                                                                                        break;
                                                                                    }
                                                                                    arrayList6 = arrayList5;
                                                                                    if (((ck6) arrayList6.get(i11)).m == i9) {
                                                                                        ck6Var2 = (ck6) arrayList6.get(i11);
                                                                                        break;
                                                                                    } else {
                                                                                        i11++;
                                                                                        arrayList5 = arrayList6;
                                                                                    }
                                                                                }
                                                                                ck6Var2.getClass();
                                                                                objG = jx4Var3.g(np6Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                ck6Var2.q = (rj6) objG;
                                                                                objG2 = jx4Var3.g(kp6.w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                ck6Var2.r = (rj6) objG2;
                                                                                if (ck6Var2.n.contains(ck6Var2)) {
                                                                                    b3 = b3;
                                                                                    bhVar.p.getSnapshotObserver().a.f(ck6Var2, bhVar.Y, new x8(ck6Var2, bhVar, b3));
                                                                                } else {
                                                                                    b3 = b3;
                                                                                }
                                                                            } else if (im3.n(np6Var5, kp6.l)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i12 = 8;
                                                                                    bhVar.C(bhVar.o(bhVar.A(i27), 8));
                                                                                } else {
                                                                                    i12 = 8;
                                                                                }
                                                                                E(bhVar, bhVar.A(i27), 2048, num5, i12);
                                                                            } else {
                                                                                np6 np6Var8 = zo6.x;
                                                                                if (im3.n(np6Var5, np6Var8)) {
                                                                                    List list3 = (List) ap6Var4.b(np6Var8);
                                                                                    Object objG10 = jx4Var2.g(np6Var8);
                                                                                    if (objG10 == null) {
                                                                                        objG10 = null;
                                                                                    }
                                                                                    List list4 = (List) objG10;
                                                                                    if (list4 != null) {
                                                                                        kx4 kx4Var = ui6.a;
                                                                                        kx4 kx4Var2 = new kx4();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            io.sentry.h2.f();
                                                                                            return;
                                                                                        }
                                                                                        kx4 kx4Var3 = new kx4();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            io.sentry.h2.f();
                                                                                            return;
                                                                                        }
                                                                                        z5 = z2 || !kx4Var2.equals(kx4Var3);
                                                                                    } else {
                                                                                        z5 = z2 || !list3.isEmpty();
                                                                                    }
                                                                                    z2 = z5;
                                                                                } else if (z2 || !(obj2 instanceof m3)) {
                                                                                    z2 = true;
                                                                                } else {
                                                                                    m3 m3Var = (m3) obj2;
                                                                                    Object objG11 = jx4Var2.g(np6Var5);
                                                                                    if (objG11 == null) {
                                                                                        objG11 = null;
                                                                                    }
                                                                                    if (m3Var != objG11) {
                                                                                        if (objG11 instanceof m3) {
                                                                                            String str4 = m3Var.a;
                                                                                            m3 m3Var2 = (m3) objG11;
                                                                                            pw2 pw2Var2 = m3Var2.b;
                                                                                            if (im3.n(str4, m3Var2.a) && (((pw2Var = m3Var.b) != null || pw2Var2 == null) && (pw2Var == null || pw2Var2 != null))) {
                                                                                            }
                                                                                        }
                                                                                        z2 = true;
                                                                                    }
                                                                                    z2 = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        b3 = b3;
                                                                        arrayList6 = arrayList5;
                                                                    }
                                                                }
                                                                b3 = b3;
                                                                arrayList6 = arrayList5;
                                                                i8 = i33;
                                                            }
                                                        }
                                                    }
                                                    i8 = i33;
                                                } else {
                                                    Object objG12 = jx4Var2.g(np6Var5);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (!im3.n(obj2, objG12)) {
                                                        np6Var = kp6.d;
                                                        if (im3.n(np6Var5, np6Var)) {
                                                            obj2.getClass();
                                                            str3 = (String) obj2;
                                                            zC2 = jx4Var2.c(np6Var);
                                                            i18 = i26;
                                                            if (zC2) {
                                                                bhVar.F(i25, i18, str3);
                                                            }
                                                        } else {
                                                            i10 = i26;
                                                            if (im3.n(np6Var5, kp6.b)) {
                                                                E(bhVar, bhVar.A(i25), 2048, num7, i10);
                                                                E(bhVar, bhVar.A(i25), 2048, num8, i10);
                                                            } else if (im3.n(np6Var5, kp6.L)) {
                                                                E(bhVar, bhVar.A(i25), 2048, 8192, 8);
                                                                E(bhVar, bhVar.A(i25), 2048, num8, 8);
                                                            } else if (im3.n(np6Var5, kp6.O)) {
                                                                E(bhVar, bhVar.A(i25), 2048, 3072, 8);
                                                            } else if (im3.n(np6Var5, kp6.c)) {
                                                                E(bhVar, bhVar.A(i25), 2048, num7, 8);
                                                                E(bhVar, bhVar.A(i25), 2048, num8, 8);
                                                            } else {
                                                                np6Var2 = kp6.K;
                                                                arrayList7 = arrayList7;
                                                                if (im3.n(np6Var5, np6Var2)) {
                                                                    objG6 = jx4Var3.g(kp6.z);
                                                                    if (objG6 == null) {
                                                                        objG6 = null;
                                                                    }
                                                                    pe6Var = (pe6) objG6;
                                                                    if (pe6Var == null) {
                                                                        layoutNode3 = layoutNode3;
                                                                        fp6Var3 = fp6Var3;
                                                                        E(bhVar, bhVar.A(i25), 2048, num7, 8);
                                                                        E(bhVar, bhVar.A(i25), 2048, num8, 8);
                                                                    } else {
                                                                        objG7 = jx4Var3.g(np6Var2);
                                                                        if (objG7 == null) {
                                                                            objG7 = null;
                                                                        }
                                                                        if (im3.n(objG7, Boolean.TRUE)) {
                                                                            accessibilityEventO = bhVar.o(bhVar.A(i25), 4);
                                                                            fp6Var3 = fp6Var3;
                                                                            layoutNode3 = layoutNode3;
                                                                            fp6 fp6Var5 = new fp6(fp6Var3.a, true, layoutNode3, ap6Var4);
                                                                            objG8 = fp6Var5.k().m.g(kp6.a);
                                                                            if (objG8 == null) {
                                                                                objG8 = null;
                                                                            }
                                                                            List list5 = (List) objG8;
                                                                            if (list5 != null) {
                                                                            }
                                                                            objG9 = fp6Var5.k().m.g(kp6.C);
                                                                            if (objG9 == null) {
                                                                                objG9 = null;
                                                                            }
                                                                            list = (List) objG9;
                                                                            if (list != null) {
                                                                                strA2 = gc4.a(list, ",", null, 62);
                                                                            } else {
                                                                                strA2 = null;
                                                                            }
                                                                            if (strA != null) {
                                                                                accessibilityEventO.setContentDescription(strA);
                                                                            }
                                                                            if (strA2 != null) {
                                                                                accessibilityEventO.getText().add(strA2);
                                                                            }
                                                                            bhVar.C(accessibilityEventO);
                                                                        } else {
                                                                            layoutNode3 = layoutNode3;
                                                                            fp6Var3 = fp6Var3;
                                                                            E(bhVar, bhVar.A(i25), 2048, num8, 8);
                                                                        }
                                                                    }
                                                                    num5 = num8;
                                                                    i9 = i25;
                                                                    jx4Var2 = jx4Var2;
                                                                    num7 = num7;
                                                                    b3 = b3;
                                                                    arrayList6 = arrayList6;
                                                                    i8 = i33;
                                                                } else {
                                                                    arrayList5 = arrayList6;
                                                                    layoutNode3 = layoutNode3;
                                                                    fp6Var3 = fp6Var3;
                                                                    i30 = i30;
                                                                    if (im3.n(np6Var5, kp6.a)) {
                                                                        int iA2 = bhVar.A(i25);
                                                                        obj2.getClass();
                                                                        bhVar.D(iA2, 2048, 4, (List) obj2);
                                                                        num5 = num8;
                                                                        i9 = i25;
                                                                        jx4Var2 = jx4Var2;
                                                                        num7 = num7;
                                                                    } else {
                                                                        np6Var3 = kp6.G;
                                                                        str = "";
                                                                        if (im3.n(np6Var5, np6Var3)) {
                                                                            if (jx4Var3.c(zo6.k)) {
                                                                                objG4 = jx4Var2.g(np6Var3);
                                                                                if (objG4 == null) {
                                                                                    objG4 = null;
                                                                                }
                                                                                xoVar2 = (xo) objG4;
                                                                                if (xoVar2 == null) {
                                                                                    xoVar2 = "";
                                                                                }
                                                                                objG5 = jx4Var3.g(np6Var3);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                charSequence = (xo) objG5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceP = P(charSequence);
                                                                                length = xoVar2.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i13 = length2;
                                                                                } else {
                                                                                    i13 = length;
                                                                                }
                                                                                num6 = num8;
                                                                                i14 = 0;
                                                                                while (true) {
                                                                                    num7 = num7;
                                                                                    if (i14 < i13) {
                                                                                        i15 = length;
                                                                                        break;
                                                                                    }
                                                                                    i15 = length;
                                                                                    if (xoVar2.charAt(i14) != charSequence.charAt(i14)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i14++;
                                                                                        length = i15;
                                                                                        num7 = num7;
                                                                                    }
                                                                                }
                                                                                i16 = 0;
                                                                                while (true) {
                                                                                    if (i16 < i13 - i14) {
                                                                                        i17 = i16;
                                                                                        break;
                                                                                    }
                                                                                    i17 = i16;
                                                                                    if (xoVar2.charAt((i15 - 1) - i16) != charSequence.charAt((length2 - 1) - i17)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i16 = i17 + 1;
                                                                                }
                                                                                int i38 = (i15 - i17) - i14;
                                                                                int i39 = (length2 - i17) - i14;
                                                                                np6 np6Var9 = kp6.N;
                                                                                boolean zC5 = jx4Var2.c(np6Var9);
                                                                                boolean zC6 = jx4Var3.c(np6Var9);
                                                                                zC = jx4Var2.c(kp6.G);
                                                                                if (zC) {
                                                                                    z6 = false;
                                                                                } else {
                                                                                    z6 = false;
                                                                                }
                                                                                if (zC) {
                                                                                    z7 = false;
                                                                                } else {
                                                                                    z7 = false;
                                                                                }
                                                                                if (z6) {
                                                                                    i9 = i25;
                                                                                    num8 = num6;
                                                                                    accessibilityEventP = bhVar.p(bhVar.A(i25), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                                } else {
                                                                                    i9 = i25;
                                                                                    num8 = num6;
                                                                                    accessibilityEventP = bhVar.p(bhVar.A(i25), num8, num6, Integer.valueOf(length2), charSequenceP);
                                                                                }
                                                                                accessibilityEventP.setClassName("android.widget.EditText");
                                                                                if (Build.VERSION.SDK_INT >= 37) {
                                                                                    wg.b(fp6Var3, accessibilityEventP);
                                                                                }
                                                                                bhVar.C(accessibilityEventP);
                                                                                if (z6) {
                                                                                    long j7 = ((gt7) ap6Var4.b(kp6.H)).a;
                                                                                    accessibilityEventP.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventP.setToIndex((int) (j7 & 4294967295L));
                                                                                    bhVar.C(accessibilityEventP);
                                                                                } else {
                                                                                    long j8 = ((gt7) ap6Var4.b(kp6.H)).a;
                                                                                    accessibilityEventP.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventP.setToIndex((int) (j8 & 4294967295L));
                                                                                    bhVar.C(accessibilityEventP);
                                                                                }
                                                                            } else {
                                                                                i9 = i25;
                                                                                jx4Var2 = jx4Var2;
                                                                                num7 = num7;
                                                                                E(bhVar, bhVar.A(i9), 2048, Integer.valueOf(b3), 8);
                                                                            }
                                                                            num5 = num8;
                                                                        } else {
                                                                            i9 = i25;
                                                                            jx4Var2 = jx4Var2;
                                                                            num7 = num7;
                                                                            i8 = i33;
                                                                            np6Var4 = kp6.H;
                                                                            if (im3.n(np6Var5, np6Var4)) {
                                                                                objG3 = jx4Var3.g(np6Var3);
                                                                                if (objG3 == null) {
                                                                                    objG3 = null;
                                                                                }
                                                                                xoVar = (xo) objG3;
                                                                                if (xoVar != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((gt7) ap6Var4.b(np6Var4)).a;
                                                                                num5 = num8;
                                                                                bhVar = this;
                                                                                bhVar.C(bhVar.p(bhVar.A(i9), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), P(str)));
                                                                                bhVar.G(i27);
                                                                            } else {
                                                                                num5 = num8;
                                                                                if (im3.n(np6Var5, np6Var6)) {
                                                                                }
                                                                                bhVar.w(layoutNode3);
                                                                                size = arrayList5.size();
                                                                                i11 = 0;
                                                                                while (true) {
                                                                                    if (i11 < size) {
                                                                                        arrayList6 = arrayList5;
                                                                                        ck6Var2 = null;
                                                                                        break;
                                                                                    }
                                                                                    arrayList6 = arrayList5;
                                                                                    if (((ck6) arrayList6.get(i11)).m == i9) {
                                                                                        ck6Var2 = (ck6) arrayList6.get(i11);
                                                                                        break;
                                                                                    } else {
                                                                                        i11++;
                                                                                        arrayList5 = arrayList6;
                                                                                    }
                                                                                }
                                                                                ck6Var2.getClass();
                                                                                objG = jx4Var3.g(np6Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                ck6Var2.q = (rj6) objG;
                                                                                objG2 = jx4Var3.g(kp6.w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                ck6Var2.r = (rj6) objG2;
                                                                                if (ck6Var2.n.contains(ck6Var2)) {
                                                                                    b3 = b3;
                                                                                } else {
                                                                                    b3 = b3;
                                                                                    bhVar.p.getSnapshotObserver().a.f(ck6Var2, bhVar.Y, new x8(ck6Var2, bhVar, b3));
                                                                                }
                                                                            }
                                                                            b3 = b3;
                                                                            arrayList6 = arrayList5;
                                                                        }
                                                                    }
                                                                    b3 = b3;
                                                                    arrayList6 = arrayList5;
                                                                    i8 = i33;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i8 = i33;
                                                }
                                                i26 = 8;
                                                b3 = b3;
                                                jx4Var2 = jx4Var2;
                                                layoutNode3 = layoutNode3;
                                                i30 = i30;
                                                i31++;
                                                i25 = i9;
                                                fp6Var3 = fp6Var3;
                                                j4 = j >> 8;
                                                arrayList6 = arrayList6;
                                                length4 = i8;
                                                num8 = num5;
                                                ap6Var3 = ap6Var2;
                                                arrayList7 = arrayList7;
                                                num7 = num7;
                                            } else {
                                                ap6Var2 = ap6Var3;
                                                j = j4;
                                                i31 = i31;
                                                i8 = length4;
                                            }
                                            num5 = num8;
                                            i9 = i25;
                                            i30 = i30;
                                            jx4Var2 = jx4Var2;
                                            i26 = 8;
                                            b3 = b3;
                                            jx4Var2 = jx4Var2;
                                            layoutNode3 = layoutNode3;
                                            i30 = i30;
                                            i31++;
                                            i25 = i9;
                                            fp6Var3 = fp6Var3;
                                            j4 = j >> 8;
                                            arrayList6 = arrayList6;
                                            length4 = i8;
                                            num8 = num5;
                                            ap6Var3 = ap6Var2;
                                            arrayList7 = arrayList7;
                                            num7 = num7;
                                        }
                                        ap6Var = ap6Var3;
                                        num3 = num7;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList6;
                                        b = b3;
                                        layoutNode = layoutNode3;
                                        fp6Var = fp6Var3;
                                        z = true;
                                        i7 = length4;
                                        num4 = num8;
                                        i6 = i25;
                                        int i40 = i30;
                                        jx4Var = jx4Var2;
                                        if (i40 != i26) {
                                            break;
                                        }
                                    } else {
                                        ap6Var = ap6Var3;
                                        jx4Var = jx4Var2;
                                        num3 = num7;
                                        arrayList3 = arrayList7;
                                        arrayList4 = arrayList6;
                                        b = b3;
                                        layoutNode = layoutNode3;
                                        fp6Var = fp6Var3;
                                        z = true;
                                        i7 = length4;
                                        num4 = num8;
                                        i6 = i25;
                                    }
                                    if (i29 == i7) {
                                        break;
                                    }
                                    num8 = num4;
                                    i25 = i6;
                                    b3 = b;
                                    jx4Var2 = jx4Var;
                                    layoutNode3 = layoutNode;
                                    arrayList7 = arrayList3;
                                    i26 = 8;
                                    i28 = i29 + 1;
                                    arrayList6 = arrayList4;
                                    length4 = i7;
                                    fp6Var2 = fp6Var;
                                    ap6Var3 = ap6Var;
                                    num7 = num3;
                                }
                            } else {
                                ap6Var = ap6Var3;
                                num3 = num7;
                                arrayList3 = arrayList7;
                                arrayList4 = arrayList6;
                                i3 = i23;
                                fp6Var = fp6Var2;
                                b = b3;
                                z = true;
                                num4 = num8;
                                i6 = i25;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = ap6Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z3 = false;
                                        break;
                                    } else {
                                        if (!fp6Var.k().m.c((np6) ((Map.Entry) it.next()).getKey())) {
                                            z3 = z;
                                            break;
                                        }
                                    }
                                }
                                z2 = z3;
                            }
                            if (z2) {
                                i5 = 8;
                                E(bhVar, bhVar.A(i6), 2048, num4, 8);
                            } else {
                                i5 = 8;
                            }
                        }
                    } else {
                        i2 = i24;
                        num3 = num7;
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList6;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i3 = i23;
                        i4 = i20;
                        num4 = num8;
                        i5 = i22;
                        b = b3;
                    }
                    j3 >>= i5;
                    i24 = i2 + 1;
                    tk3Var2 = tk3Var;
                    arrayList6 = arrayList4;
                    num8 = num4;
                    b3 = b;
                    i22 = i5;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i20 = i4;
                    i23 = i3;
                    arrayList7 = arrayList3;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList7;
                arrayList2 = arrayList6;
                iArr = iArr3;
                jArr = jArr3;
                int i41 = i23;
                int i42 = i20;
                num2 = num8;
                int i43 = i22;
                b2 = b3;
                if (i41 != i43) {
                    return;
                } else {
                    i = i42;
                }
            } else {
                num = num7;
                arrayList = arrayList7;
                arrayList2 = arrayList6;
                iArr = iArr3;
                jArr = jArr3;
                b2 = b3;
                num2 = num8;
                i = i20;
            }
            if (i == i21) {
                return;
            }
            i20 = i + 1;
            tk3Var2 = tk3Var;
            length3 = i21;
            arrayList6 = arrayList2;
            num8 = num2;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList7 = arrayList;
            num7 = num;
            i19 = 0;
        }
    }

    public final void I(LayoutNode layoutNode, lw4 lw4Var) {
        ap6 ap6VarH;
        if (layoutNode.W() && !this.p.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            LayoutNode layoutNode2 = null;
            if (!layoutNode.S.f(8)) {
                layoutNode = layoutNode.F();
                while (true) {
                    if (layoutNode == null) {
                        layoutNode = null;
                        break;
                    } else if (layoutNode.S.f(8)) {
                        break;
                    } else {
                        layoutNode = layoutNode.F();
                    }
                }
            }
            if (layoutNode == null || (ap6VarH = layoutNode.H()) == null) {
                return;
            }
            if (!ap6VarH.f346o) {
                for (LayoutNode layoutNodeF = layoutNode.F(); layoutNodeF != null; layoutNodeF = layoutNodeF.F()) {
                    ap6 ap6VarH2 = layoutNodeF.H();
                    if (ap6VarH2 != null && ap6VarH2.f346o) {
                        layoutNode2 = layoutNodeF;
                        break;
                    }
                }
                if (layoutNode2 != null) {
                    layoutNode = layoutNode2;
                }
            }
            int i = layoutNode.n;
            if (lw4Var.a(i)) {
                E(this, A(i), 2048, 1, 8);
            }
        }
    }

    public final void J(LayoutNode layoutNode) {
        if (layoutNode.W() && !this.p.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int i = layoutNode.n;
            rj6 rj6Var = (rj6) this.B.b(i);
            rj6 rj6Var2 = (rj6) this.C.b(i);
            if (rj6Var == null && rj6Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i, 4096);
            if (rj6Var != null) {
                accessibilityEventO.setScrollX((int) ((Number) rj6Var.a.a()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) rj6Var.b.a()).floatValue());
            }
            if (rj6Var2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) rj6Var2.a.a()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) rj6Var2.b.a()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(fp6 fp6Var, int i, int i2, boolean z) {
        String strT;
        ap6 ap6Var = fp6Var.d;
        int i3 = fp6Var.f;
        np6 np6Var = zo6.j;
        if (ap6Var.m.c(np6Var) && vn4.c0(fp6Var)) {
            iw2 iw2Var = (iw2) ((m3) fp6Var.d.b(np6Var)).b;
            if (iw2Var != null) {
                return ((Boolean) iw2Var.d(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.F) && (strT = t(fp6Var)) != null) {
            if (i < 0 || i != i2 || i2 > strT.length()) {
                i = -1;
            }
            this.F = i;
            boolean z2 = strT.length() > 0;
            C(p(A(i3), z2 ? Integer.valueOf(this.F) : null, z2 ? Integer.valueOf(this.F) : null, z2 ? Integer.valueOf(strT.length()) : null, strT));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        AndroidComposeView androidComposeView = this.p;
        long jQ = androidComposeView.q(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jQ2 = androidComposeView.q((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jQ >> 32);
        int i2 = (int) (jQ2 >> 32);
        int i3 = (int) (jQ & 4294967295L);
        int i4 = (int) (jQ2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        gp6 gp6Var;
        lw4 lw4Var = new lw4();
        lw4 lw4Var2 = this.M;
        int[] iArr = lw4Var2.b;
        long[] jArr3 = lw4Var2.a;
        int length = jArr3.length - 2;
        kw4 kw4Var = this.S;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            hp6 hp6Var = (hp6) s().b(i6);
                            Object obj = null;
                            fp6 fp6Var = hp6Var != null ? hp6Var.a : null;
                            if (fp6Var != null) {
                                if (!fp6Var.d.m.c(kp6.d)) {
                                    lw4Var.a(i6);
                                    gp6Var = (gp6) kw4Var.b(i6);
                                    if (gp6Var != null) {
                                        Object objG = gp6Var.a.m.g(kp6.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    F(i6, 32, obj);
                                }
                            } else {
                                lw4Var.a(i6);
                                gp6Var = (gp6) kw4Var.b(i6);
                                if (gp6Var != null) {
                                    Object objG2 = gp6Var.a.m.g(kp6.d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                F(i6, 32, obj);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = lw4Var.b;
        long[] jArr4 = lw4Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = lw4Var2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = lw4Var2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (lw4Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                lw4Var2.f(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        kw4Var.c();
        tk3 tk3VarS = s();
        int[] iArr3 = tk3VarS.b;
        Object[] objArr = tk3VarS.c;
        long[] jArr6 = tk3VarS.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            fp6 fp6Var2 = ((hp6) objArr[i25]).a;
                            ap6 ap6Var = fp6Var2.d;
                            np6 np6Var = kp6.d;
                            if (ap6Var.m.c(np6Var) && lw4Var2.a(i26)) {
                                F(i26, 16, (String) fp6Var2.d.b(np6Var));
                            }
                            kw4Var.i(i26, new gp6(fp6Var2, s()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.T = new gp6(this.p.getSemanticsOwner().a(), s());
    }

    @Override // o.p3
    public final df6 b(View view) {
        return this.v;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    public final void j(int i, g4 g4Var, String str, Bundle bundle) {
        fp6 fp6Var;
        RectF[] rectFArr;
        int i2;
        AccessibilityNodeInfo accessibilityNodeInfo = g4Var.a;
        hp6 hp6Var = (hp6) s().b(i);
        if (hp6Var == null || (fp6Var = hp6Var.a) == null) {
            return;
        }
        LayoutNode layoutNode = fp6Var.c;
        ap6 ap6Var = fp6Var.d;
        jx4 jx4Var = ap6Var.m;
        String strT = t(fp6Var);
        if (im3.n(str, this.P)) {
            int iD = this.N.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (im3.n(str, this.Q)) {
            int iD2 = this.O.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = jx4Var.c(zo6.a);
        AndroidComposeView androidComposeView = this.p;
        int i3 = 0;
        if (zC && bundle != null && im3.n(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (strT != null ? strT.length() : Integer.MAX_VALUE)) {
                    vs7 vs7VarF = bt1.F(ap6Var);
                    if (vs7VarF == null) {
                        rectFArr = null;
                    } else {
                        ti3 ti3Var = (ti3) layoutNode.S.d;
                        if (!ti3Var.q0.z) {
                            ti3Var = null;
                        }
                        if (ti3Var != null) {
                            long jP = ti3Var.P(0L);
                            v56 v56VarG = fp6Var.g();
                            RectF[] rectFArr2 = new RectF[i5];
                            while (i3 < i5) {
                                int i6 = i4 + i3;
                                if (i6 >= vs7VarF.a.a.n.length()) {
                                    i2 = i3;
                                } else {
                                    v56 v56VarI = vs7VarF.b(i6).i(jP);
                                    v56 v56VarE = v56VarI.g(v56VarG) ? v56VarI.e(v56VarG) : null;
                                    if (v56VarE != null) {
                                        i2 = i3;
                                        long jQ = androidComposeView.q((((long) Float.floatToRawIntBits(v56VarE.a)) << 32) | (((long) Float.floatToRawIntBits(v56VarE.b)) & 4294967295L));
                                        long jQ2 = androidComposeView.q((((long) Float.floatToRawIntBits(v56VarE.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(v56VarE.c)) << 32));
                                        int i7 = (int) (jQ >> 32);
                                        int i8 = (int) (jQ2 >> 32);
                                        int i9 = (int) (jQ & 4294967295L);
                                        int i10 = (int) (jQ2 & 4294967295L);
                                        rectFArr2[i2] = new RectF(Math.min(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)), Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8)), Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10)));
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                i3 = i2 + 1;
                                vs7VarF = vs7VarF;
                                i5 = i5;
                                v56VarG = v56VarG;
                                i4 = i4;
                            }
                            rectFArr = rectFArr2;
                        } else {
                            rectFArr = null;
                        }
                    }
                    if (rectFArr == null) {
                        return;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, rectFArr);
                    return;
                }
            }
            io.sentry.android.core.v0.c("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        np6 np6Var = kp6.A;
        if (jx4Var.c(np6Var) && bundle != null && im3.n(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = jx4Var.g(np6Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (im3.n(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, fp6Var.f);
            return;
        }
        if (im3.n(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = jx4Var.g(kp6.S);
            pw6 pw6Var = (pw6) (objG2 == null ? null : objG2);
            if (pw6Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                v56 v56VarU = u(fp6Var, rect, pw6Var);
                float f = v56VarU.b;
                float f2 = v56VarU.a;
                vs1 vs1VarA = pw6Var.a(v56VarU.c(), layoutNode.M, androidComposeView.getDensity());
                if (vs1VarA instanceof ob5) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(vs1VarA, f2, f));
                    return;
                } else if (vs1VarA instanceof pb5) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(vs1VarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(vs1VarA));
                    return;
                } else if (!(vs1VarA instanceof nb5)) {
                    gk0.s();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(vs1VarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (im3.n(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = jx4Var.g(kp6.S);
            pw6 pw6Var2 = (pw6) (objG3 == null ? null : objG3);
            if (pw6Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                v56 v56VarU2 = u(fp6Var, rect2, pw6Var2);
                Rect rectL = L(pw6Var2.a(v56VarU2.c(), layoutNode.M, androidComposeView.getDensity()), v56VarU2.a, v56VarU2.b);
                if (rectL != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                    return;
                }
                return;
            }
            return;
        }
        if (im3.n(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = jx4Var.g(kp6.S);
            pw6 pw6Var3 = (pw6) (objG4 == null ? null : objG4);
            if (pw6Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrN = N(pw6Var3.a(u(fp6Var, rect3, pw6Var3).c(), layoutNode.M, androidComposeView.getDensity()));
                if (fArrN != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                    return;
                }
                return;
            }
            return;
        }
        if (im3.n(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = jx4Var.g(kp6.S);
            pw6 pw6Var4 = (pw6) (objG5 == null ? null : objG5);
            if (pw6Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                v56 v56VarU3 = u(fp6Var, rect4, pw6Var4);
                Region regionO = O(pw6Var4.a(v56VarU3.c(), layoutNode.M, androidComposeView.getDensity()), v56VarU3.a, v56VarU3.b);
                if (regionO != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                }
            }
        }
    }

    public final Rect k(hp6 hp6Var) {
        zk3 zk3Var = hp6Var.b;
        return M(zk3Var.a, zk3Var.b, zk3Var.c, zk3Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:20:0x0046, B:23:0x004d), top: B:67:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007f A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:20:0x0046, B:23:0x004d), top: B:67:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: all -> 0x0099, LOOP:0: B:34:0x0088->B:35:0x008a, LOOP_END, TryCatch #3 {all -> 0x0099, blocks: (B:33:0x0084, B:35:0x008a, B:38:0x009c, B:40:0x00a4), top: B:69:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #3 {all -> 0x0099, blocks: (B:33:0x0084, B:35:0x008a, B:38:0x009c, B:40:0x00a4), top: B:69:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0107, code lost:
    
        if (o.im3.A(r4, r2) == r7) goto L57;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0107 -> B:58:0x010a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(o.jc1 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bh.l(o.jc1):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean m(int i, long j, boolean z) {
        np6 np6Var;
        int i2;
        if (im3.n(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            tk3 tk3VarS = s();
            if (!t65.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    np6Var = kp6.w;
                } else {
                    if (z) {
                        gk0.s();
                        return false;
                    }
                    np6Var = kp6.v;
                }
                Object[] objArr = tk3VarS.c;
                long[] jArr = tk3VarS.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    hp6 hp6Var = (hp6) objArr[(i3 << 3) + i6];
                                    zk3 zk3Var = hp6Var.b;
                                    float f = zk3Var.a;
                                    i2 = i4;
                                    float f2 = zk3Var.b;
                                    float f3 = zk3Var.c;
                                    float f4 = zk3Var.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objG = hp6Var.a.d.m.g(np6Var);
                                        if (objG == null) {
                                            objG = null;
                                        }
                                        rj6 rj6Var = (rj6) objG;
                                        if (rj6Var != null) {
                                            Function0 function0 = rj6Var.a;
                                            if (i < 0) {
                                                if (((Number) function0.a()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) function0.a()).floatValue() < ((Number) rj6Var.b.a()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.p.getSemanticsOwner().a(), this.T);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        hp6 hp6Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.p;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (v() && (hp6Var = (hp6) s().b(i)) != null) {
            fp6 fp6Var = hp6Var.a;
            accessibilityEventObtain.setPassword(fp6Var.d.m.c(kp6.N));
            Object objG = fp6Var.d.m.g(kp6.f1291o);
            if (objG == null) {
                objG = null;
            }
            boolean zN = im3.n(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                q3.j(accessibilityEventObtain, zN);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.u = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.u = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.s;
        if (accessibilityManager.isEnabled()) {
            this.u = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.p.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.W);
        AccessibilityManager accessibilityManager = this.s;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(fp6 fp6Var) {
        ap6 ap6Var = fp6Var.d;
        if (!ap6Var.m.c(kp6.a)) {
            np6 np6Var = kp6.H;
            if (ap6Var.m.c(np6Var)) {
                return (int) (((gt7) ap6Var.b(np6Var)).a & 4294967295L);
            }
        }
        return this.F;
    }

    public final int r(fp6 fp6Var) {
        ap6 ap6Var = fp6Var.d;
        if (!ap6Var.m.c(kp6.a)) {
            np6 np6Var = kp6.H;
            if (ap6Var.m.c(np6Var)) {
                return (int) (((gt7) ap6Var.b(np6Var)).a >> 32);
            }
        }
        return this.F;
    }

    public final tk3 s() {
        if (this.J) {
            this.J = false;
            AndroidComposeView androidComposeView = this.p;
            this.L = db8.u(androidComposeView.getSemanticsOwner(), new t2((byte) 13));
            if (v()) {
                kw4 kw4Var = this.L;
                Resources resources = androidComposeView.getContext().getResources();
                iw4 iw4Var = this.N;
                iw4Var.a();
                iw4 iw4Var2 = this.O;
                iw4Var2.a();
                hp6 hp6Var = (hp6) kw4Var.b(-1);
                fp6 fp6Var = hp6Var != null ? hp6Var.a : null;
                fp6Var.getClass();
                ArrayList arrayListB = pp6.b(fp6Var, new q0(kw4Var, (byte) 9), new q0(resources, (byte) 10), qf0.K(fp6Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((fp6) arrayListB.get(i - 1)).f;
                        int i3 = ((fp6) arrayListB.get(i)).f;
                        iw4Var.f(i2, i3);
                        iw4Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.L;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    public final v56 u(fp6 fp6Var, Rect rect, pw6 pw6Var) {
        ah ahVar = new ah(pw6Var);
        LayoutNode layoutNode = fp6Var.c;
        es4 es4Var = (es4) layoutNode.S.g;
        um1 um1Var = null;
        if ((es4Var.p & 8) != 0) {
            loop0: while (es4Var != null) {
                if ((es4Var.f737o & 8) == 0) {
                    if ((es4Var.p & 8) != 0) {
                        break;
                        break;
                    }
                    es4Var = es4Var.r;
                } else {
                    es4 es4VarL0 = es4Var;
                    xx4 xx4Var = null;
                    while (es4VarL0 != null) {
                        if (es4VarL0 instanceof dp6) {
                            ((dp6) es4VarL0).z(ahVar);
                            if (ahVar.m) {
                                um1Var = es4VarL0;
                                break loop0;
                            }
                        } else if ((es4VarL0.f737o & 8) != 0 && (es4VarL0 instanceof vm1)) {
                            int i = 0;
                            for (es4 es4Var2 = ((vm1) es4VarL0).B; es4Var2 != null; es4Var2 = es4Var2.r) {
                                if ((es4Var2.f737o & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        es4VarL0 = es4Var2;
                                    } else {
                                        if (xx4Var == null) {
                                            xx4Var = new xx4(new es4[16]);
                                        }
                                        if (es4VarL0 != null) {
                                            xx4Var.b(es4VarL0);
                                            es4VarL0 = null;
                                        }
                                        xx4Var.b(es4Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        es4VarL0 = vn4.l0(xx4Var);
                    }
                    if ((es4Var.p & 8) != 0) {
                        break;
                    }
                    es4Var = es4Var.r;
                }
            }
        }
        um1 um1Var2 = (dp6) um1Var;
        if (um1Var2 == null || !((es4) um1Var2).m.z) {
            return vt1.m(layoutNode.getOuterCoordinator$ui(), false);
        }
        e45 e45VarO0 = vn4.o0(um1Var2);
        v56 v56VarB = vt1.s(e45VarO0).b(e45VarO0, false);
        Rect rectM = M(v56VarB.a, v56VarB.b, v56VarB.c, v56VarB.d);
        float f = rectM.left - rect.left;
        float f2 = rectM.top - rect.top;
        return new v56(f, f2, rectM.width() + f, rectM.height() + f2);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.s;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.u;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.u = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(LayoutNode layoutNode) {
        if (this.H.add(layoutNode)) {
            this.I.b(f88.a);
        }
    }
}
