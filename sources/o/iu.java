package o;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class iu implements n57, ma3 {
    public static volatile iu q;
    public static final Object r = new Object();
    public static final Object s = new Object();
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1103o;
    public Object p;

    public iu(k70 k70Var) throws at2 {
        int i;
        short s2;
        this.m = (byte) 10;
        int i2 = k70Var.n;
        if (i2 < 8 || i2 > 144 || (i = i2 & 1) != 0) {
            throw at2.a();
        }
        int i3 = k70Var.m;
        wc8[] wc8VarArr = wc8.h;
        if (i != 0 || (i3 & 1) != 0) {
            throw at2.a();
        }
        wc8[] wc8VarArr2 = wc8.h;
        for (int i4 = 0; i4 < 48; i4++) {
            wc8 wc8Var = wc8VarArr2[i4];
            short s3 = wc8Var.b;
            if (s3 == i2 && (s2 = wc8Var.c) == i3) {
                this.n = wc8Var;
                if (k70Var.n != s3) {
                    hk0.g("Dimension of bitMatrix must match the version size");
                    throw null;
                }
                byte b = wc8Var.d;
                byte b2 = wc8Var.e;
                int i5 = s3 / b;
                int i6 = s2 / b2;
                k70 k70Var2 = new k70(i6 * b2, i5 * b);
                for (int i7 = 0; i7 < i5; i7++) {
                    int i8 = i7 * b;
                    for (int i9 = 0; i9 < i6; i9++) {
                        int i10 = i9 * b2;
                        for (int i11 = 0; i11 < b; i11++) {
                            int i12 = ((b + 2) * i7) + 1 + i11;
                            int i13 = i8 + i11;
                            for (int i14 = 0; i14 < b2; i14++) {
                                if (k70Var.b(((b2 + 2) * i9) + 1 + i14, i12)) {
                                    k70Var2.i(i10 + i14, i13);
                                }
                            }
                        }
                    }
                }
                this.f1103o = k70Var2;
                this.p = new k70(k70Var2.m, k70Var2.n);
                return;
            }
        }
        throw at2.a();
    }

    public static iu A(Context context) {
        if (q == null) {
            synchronized (r) {
                try {
                    if (q == null) {
                        q = new iu(context, (byte) 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return q;
    }

    public static boolean E(h92 h92Var, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                a68[] a68VarArr = (a68[]) editable.getSpans(selectionStart, iMin, a68.class);
                if (a68VarArr != null && a68VarArr.length > 0) {
                    for (a68 a68Var : a68VarArr) {
                        int spanStart = editable.getSpanStart(a68Var);
                        int spanEnd = editable.getSpanEnd(a68Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    h92Var.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    h92Var.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(Editable editable, KeyEvent keyEvent, boolean z) {
        a68[] a68VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (a68VarArr = (a68[]) editable.getSpans(selectionStart, selectionEnd, a68.class)) != null && a68VarArr.length > 0) {
                for (a68 a68Var : a68VarArr) {
                    int spanStart = editable.getSpanStart(a68Var);
                    int spanEnd = editable.getSpanEnd(a68Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int q(int i, int i2, i70 i70Var) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i70Var.a(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    public static i3 w(BCommandNativeImpl bCommandNativeImpl, i10 i10Var) {
        ci7 ci7VarQ = bCommandNativeImpl.q(i10Var);
        Object obj = null;
        if (!ci7VarQ.a()) {
            ci7VarQ = null;
        }
        i3 i3Var = i3.Denied;
        if (ci7VarQ == null) {
            return i3Var;
        }
        int i = ci7VarQ.b;
        i3.n.getClass();
        for (Object obj2 : i3.s) {
            if (((i3) obj2).m == i) {
                obj = obj2;
                break;
            }
        }
        i3 i3Var2 = (i3) obj;
        return i3Var2 == null ? i3Var : i3Var2;
    }

    public j04 B() {
        return ((nl0) this.n).m.b;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011c, code lost:
    
        if (r3.e(r4) == r11) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(java.lang.String r17, kotlin.jvm.functions.Function1 r18, o.jc1 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.iu.C(java.lang.String, kotlin.jvm.functions.Function1, o.jc1):java.lang.Object");
    }

    public long D() {
        return ((nl0) this.n).m.d;
    }

    public boolean F(CharSequence charSequence, int i, int i2, z58 z58Var) {
        if ((z58Var.c & 3) == 0) {
            bk1 bk1Var = (bk1) this.n;
            ar4 ar4VarB = z58Var.b();
            int iA = ar4VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) ar4VarB.p).getShort(iA + ar4VarB.m);
            }
            bk1Var.getClass();
            ThreadLocal threadLocal = bk1.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = bk1Var.a.hasGlyph(sb.toString());
            int i3 = z58Var.c & 4;
            z58Var.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (z58Var.c & 3) == 2;
    }

    public void G(l3 l3Var) {
        EnumMap enumMap = (EnumMap) this.p;
        this.f1103o = l3Var;
        int iOrdinal = l3Var.ordinal();
        vi8 vi8Var = vi8.AllowPartnerViewDesktop;
        vi8 vi8Var2 = vi8.ChangeSides;
        vi8 vi8Var3 = vi8.FileTransferAccess;
        vi8 vi8Var4 = vi8.AllowVPN;
        i3 i3Var = i3.Allowed;
        i3 i3Var2 = i3.AfterConfirmation;
        i3 i3Var3 = i3.Denied;
        switch (iOrdinal) {
            case 0:
                t(i3Var);
                break;
            case 1:
                t(i3Var2);
                enumMap.put(vi8Var2, i3Var);
                enumMap.put(vi8.ShareMyFiles, i3Var);
                enumMap.put(vi8.ShareFilesWithMe, i3Var);
                break;
            case 2:
                t(i3Var3);
                enumMap.put(vi8Var, i3Var2);
                break;
            case 3:
                t(i3Var3);
                break;
            case 4:
                t(i3Var3);
                enumMap.put(vi8.RemoteControlAccess, i3Var2);
                enumMap.put(vi8.DisableRemoteInput, i3Var);
                enumMap.put(vi8Var2, i3Var2);
                enumMap.put(vi8Var, i3Var);
                break;
            case 5:
                t(i3Var3);
                enumMap.put(vi8Var3, i3Var);
                break;
            case 6:
                t(i3Var3);
                enumMap.put(vi8Var3, i3Var2);
                break;
            case 7:
                t(i3Var3);
                enumMap.put(vi8Var4, i3Var);
                break;
            case 8:
                t(i3Var3);
                enumMap.put(vi8Var4, i3Var2);
                break;
            case ep1.b /* 9 */:
            default:
                t(i3Var3);
                break;
            case ep1.c /* 10 */:
                t(i3Var3);
                break;
        }
    }

    public boolean H(int i) {
        int i2;
        int i3 = i + 1;
        i70 i70Var = (i70) this.f1103o;
        int i4 = i70Var.n;
        if (i3 <= i4) {
            for (int i5 = 0; i5 < 5 && (i2 = i5 + i) < i4; i5++) {
                if (i5 == 2) {
                    if (i70Var.a(i + 2)) {
                    }
                } else if (!i70Var.a(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean I() {
        return !(((m67) ((xk1) this.f1103o).n).isEmpty() && ((m67) ((xk1) this.n).n).isEmpty() && ((m67) ((xk1) this.p).n).isEmpty());
    }

    public boolean J(int i, c61 c61Var, n61 n61Var) {
        k40 k40Var = (k40) this.p;
        int[] iArr = n61Var.o0;
        int[] iArr2 = n61Var.t;
        k40Var.a = iArr[0];
        k40Var.b = iArr[1];
        k40Var.c = n61Var.o();
        k40Var.d = n61Var.i();
        k40Var.i = false;
        k40Var.j = i;
        boolean z = k40Var.a == 3;
        boolean z2 = k40Var.b == 3;
        boolean z3 = z && n61Var.V > 0.0f;
        boolean z4 = z2 && n61Var.V > 0.0f;
        if (z3 && iArr2[0] == 4) {
            k40Var.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            k40Var.b = 1;
        }
        c61Var.b(n61Var, k40Var);
        n61Var.K(k40Var.e);
        n61Var.H(k40Var.f);
        n61Var.E = k40Var.h;
        int i2 = k40Var.g;
        n61Var.Z = i2;
        n61Var.E = i2 > 0;
        k40Var.j = 0;
        return k40Var.i;
    }

    public Object K(CharSequence charSequence, int i, int i2, int i3, boolean z, l92 l92Var) {
        int i4;
        char c;
        n92 n92Var = new n92((cr4) ((j93) this.p).p);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zG = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zG) {
                    cr4 cr4Var = (cr4) n92Var.c.a.get(iCodePointAt);
                    if (n92Var.a == 2) {
                        if (cr4Var != null) {
                            n92Var.c = cr4Var;
                            n92Var.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                n92Var.a();
                            } else if (iCodePointAt != 65039) {
                                cr4 cr4Var2 = n92Var.c;
                                if (cr4Var2.b != null) {
                                    if (n92Var.f != 1) {
                                        n92Var.d = cr4Var2;
                                        n92Var.a();
                                    } else if (n92Var.b()) {
                                        n92Var.d = n92Var.c;
                                        n92Var.a();
                                    } else {
                                        n92Var.a();
                                    }
                                    c = 3;
                                } else {
                                    n92Var.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (cr4Var == null) {
                        n92Var.a();
                        c = 1;
                    } else {
                        n92Var.a = (byte) 2;
                        n92Var.c = cr4Var;
                        n92Var.f = 1;
                        c = 2;
                    }
                    n92Var.e = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && F(charSequence, i4, iCharCount, n92Var.d.b)) {
                            break;
                        }
                        zG = l92Var.g(charSequence, i4, iCharCount, n92Var.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (n92Var.a == 2 && n92Var.c.b != null && ((n92Var.f > 1 || n92Var.b()) && i5 < i3 && zG && (z || !F(charSequence, i4, iCharCount, n92Var.c.b)))) {
            l92Var.g(charSequence, i4, iCharCount, n92Var.c.b);
        }
        return l92Var.k();
    }

    public boolean L(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        if (i >= i3) {
            i -= i3;
        }
        ((k70) this.p).i(i2, i);
        return ((k70) this.f1103o).b(i2, i);
    }

    public int M(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (L(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (L(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (L(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (L(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (L(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (L(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (L(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return L(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    public void N(vi8 vi8Var) {
        i3 i3VarV = v(vi8Var);
        i3 i3Var = i3.Allowed;
        if (i3VarV != i3Var) {
            this.f1103o = l3.CONTROL_TYPE_CUSTOM;
            ((EnumMap) this.p).put(vi8Var, i3Var);
            List list = (List) ((EnumMap) this.n).get(vi8Var);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((j3) it.next()).a.postValue(i3Var);
                }
            }
        }
    }

    public void O(String str) {
        if (str != null) {
            this.f1103o = str;
        } else {
            yq4.l("Null backendName");
        }
    }

    public void P(ll0 ll0Var) {
        ((nl0) this.n).m.c = ll0Var;
    }

    public void Q(in1 in1Var) {
        ((nl0) this.n).m.a = in1Var;
    }

    public void R(j04 j04Var) {
        ((nl0) this.n).m.b = j04Var;
    }

    public void S(long j) {
        ((nl0) this.n).m.d = j;
    }

    public void T(o61 o61Var, int i, int i2, int i3) {
        o61Var.getClass();
        int i4 = o61Var.a0;
        int i5 = o61Var.b0;
        o61Var.a0 = 0;
        o61Var.b0 = 0;
        o61Var.K(i2);
        o61Var.H(i3);
        if (i4 < 0) {
            o61Var.a0 = 0;
        } else {
            o61Var.a0 = i4;
        }
        if (i5 < 0) {
            o61Var.b0 = 0;
        } else {
            o61Var.b0 = i5;
        }
        o61 o61Var2 = (o61) this.n;
        o61Var2.s0 = i;
        o61Var2.Q();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public m98 U(u76 u76Var, po3 po3Var, boolean z) {
        ps5 ps5VarC;
        yc4 yc4Var = (yc4) this.f1103o;
        io3 io3Var = (io3) yc4Var.m;
        boolean z2 = po3Var.d;
        n86 n86Var = u76Var.b;
        l86 l86Var = n86Var instanceof l86 ? (l86) n86Var : null;
        if (l86Var != null) {
            Class cls = l86Var.a;
            if (cls.equals(Void.TYPE)) {
                ps5VarC = null;
            } else {
                ps5VarC = ts3.b(cls.getName()).c();
            }
        } else {
            ps5VarC = null;
        }
        z14 z14Var = new z14(yc4Var, u76Var, true);
        if (ps5VarC != null) {
            g07 g07VarQ = io3Var.h.p.q(ps5VarC);
            oz3 oz3VarS = n37.s(g07VarQ, new wp(new up[]{g07VarQ.getAnnotations(), z14Var}));
            oz3VarS.getClass();
            g07 g07Var = (g07) oz3VarS;
            return z2 ? g07Var : bt1.v(g07Var, g07Var.s0(true));
        }
        oz3 oz3VarV = V(n86Var, lq1.I(n58.n, z2, null, 6));
        ub8 ub8Var = ub8.f2197o;
        ub8 ub8Var2 = ub8.q;
        if (!z2) {
            return bt1.v(io3Var.h.p.h(ub8Var, oz3VarV, z14Var), io3Var.h.p.h(ub8Var2, oz3VarV, z14Var).s0(true));
        }
        if (z) {
            ub8Var = ub8Var2;
        }
        return io3Var.h.p.h(ub8Var, oz3VarV, z14Var);
    }

    public oz3 V(n86 n86Var, po3 po3Var) {
        g07 g07VarI;
        io3 io3Var = (io3) ((yc4) this.f1103o).m;
        if (n86Var instanceof l86) {
            Class cls = ((l86) n86Var).a;
            ps5 ps5VarC = cls.equals(Void.TYPE) ? null : ts3.b(cls.getName()).c();
            return ps5VarC != null ? io3Var.h.p.s(ps5VarC) : io3Var.h.p.w();
        }
        boolean z = false;
        if (!(n86Var instanceof c86)) {
            if (n86Var instanceof u76) {
                return U((u76) n86Var, po3Var, false);
            }
            if (n86Var instanceof q86) {
                n86 n86VarC = ((q86) n86Var).c();
                return n86VarC != null ? V(n86VarC, po3Var) : io3Var.h.p.m();
            }
            if (n86Var == null) {
                return io3Var.h.p.m();
            }
            an4.u(n86Var, "Unsupported type: ");
            return null;
        }
        c86 c86Var = (c86) n86Var;
        Type type = c86Var.a;
        if (!po3Var.d && po3Var.a != n58.m) {
            z = true;
        }
        boolean zD = c86Var.d();
        gd2 gd2Var = gd2.f884o;
        if (!zD && !z) {
            g07 g07VarI2 = i(c86Var, po3Var, null);
            return g07VarI2 != null ? g07VarI2 : hd2.c(gd2Var, type.toString());
        }
        g07 g07VarI3 = i(c86Var, po3.a(po3Var, so3.f2039o, false, null, null, 61), null);
        if (g07VarI3 != null && (g07VarI = i(c86Var, po3.a(po3Var, so3.n, false, null, null, 61), g07VarI3)) != null) {
            if (!zD) {
                return bt1.v(g07VarI3, g07VarI);
            }
            y06 y06Var = new y06(g07VarI3, g07VarI);
            qz3.a.b(g07VarI3, g07VarI);
            return y06Var;
        }
        return hd2.c(gd2Var, type.toString());
    }

    public void W(o61 o61Var) {
        ArrayList arrayList = (ArrayList) this.f1103o;
        arrayList.clear();
        int size = o61Var.p0.size();
        for (int i = 0; i < size; i++) {
            n61 n61Var = (n61) o61Var.p0.get(i);
            int[] iArr = n61Var.o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(n61Var);
            }
        }
        o61Var.r0.b = true;
    }

    @Override // o.ma3
    public l97 a() {
        return (l97) this.p;
    }

    public void b(LayoutNode layoutNode, sm3 sm3Var) {
        xk1 xk1Var = (xk1) this.f1103o;
        xk1 xk1Var2 = (xk1) this.p;
        xk1 xk1Var3 = (xk1) this.n;
        int iOrdinal = sm3Var.ordinal();
        if (iOrdinal == 0) {
            xk1Var.K(layoutNode);
            xk1Var3.K(layoutNode);
            return;
        }
        if (iOrdinal == 1) {
            xk1Var2.K(layoutNode);
            xk1Var3.K(layoutNode);
            return;
        }
        if (iOrdinal == 2) {
            if (layoutNode.u != null) {
                xk1Var3.K(layoutNode);
                return;
            } else {
                xk1Var.K(layoutNode);
                return;
            }
        }
        if (iOrdinal != 3) {
            gk0.s();
        } else if (layoutNode.u != null) {
            xk1Var3.K(layoutNode);
        } else {
            xk1Var2.K(layoutNode);
        }
    }

    @Override // o.n57
    public q67 c() {
        return (w36) this.p;
    }

    public void d(char c) {
        ((StringBuilder) this.f1103o).append((char) (c & 255));
    }

    @Override // o.ma3
    public void destroy() {
        ((EventHub) this.f1103o).f((mu) this.n);
    }

    public void e(int i) throws at2 {
        p();
        un0 un0VarA = un0.a(i);
        if (un0VarA == null) {
            throw at2.a();
        }
        this.n = Charset.forName(un0VarA.name());
    }

    public u00 f() {
        String strConcat = ((String) this.f1103o) == null ? " backendName" : "";
        if (((ss5) this.n) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new u00((String) this.f1103o, (byte[]) this.p, (ss5) this.n);
        }
        hk0.l("Missing required properties:".concat(strConcat));
        return null;
    }

    public int g() {
        t60 t60Var = (t60) this.f1103o;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            BiometricManager biometricManager = (BiometricManager) this.p;
            if (biometricManager != null) {
                return s60.a(biometricManager, 255);
            }
            io.sentry.android.core.v0.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!mo8.q(255)) {
            return -2;
        }
        Context context = t60Var.a;
        if (ky3.a(context) == null) {
            return 12;
        }
        if (mo8.o(255)) {
            KeyguardManager keyguardManagerA = ky3.a(context);
            return keyguardManagerA == null ? false : ky3.b(keyguardManagerA) ? 0 : 11;
        }
        if (i == 29) {
            BiometricManager biometricManager2 = (BiometricManager) this.p;
            if (biometricManager2 != null) {
                return r60.a(biometricManager2);
            }
            io.sentry.android.core.v0.c("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (i != 28) {
            return h();
        }
        if (context == null || context.getPackageManager() == null || !id5.a(context.getPackageManager())) {
            return 12;
        }
        KeyguardManager keyguardManagerA2 = ky3.a(t60Var.a);
        if (keyguardManagerA2 == null ? false : ky3.b(keyguardManagerA2)) {
            return h() == 0 ? 0 : -1;
        }
        return h();
    }

    public int h() {
        ir irVar = (ir) this.n;
        if (irVar == null) {
            io.sentry.android.core.v0.c("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        irVar.getClass();
        return 12;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [o.k48] */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    public g07 i(c86 c86Var, po3 po3Var, g07 g07Var) {
        g48 g48VarC;
        yc4 yc4Var;
        g48 g48Var;
        g07 g07Var2;
        k48 k48VarQ;
        k48 k48Var;
        Iterator it;
        List list;
        byte b;
        Object w87Var;
        yc4 yc4Var2;
        Object next;
        List listP0;
        iu iuVar;
        k48 k48Var2;
        h58 h58VarD;
        ns4 ns4VarI;
        ub8 ub8VarB;
        iu iuVar2 = this;
        c86 c86Var2 = c86Var;
        po3 po3Var2 = po3Var;
        n58 n58Var = po3Var2.a;
        so3 so3Var = po3Var2.b;
        boolean z = po3Var2.d;
        yc4 yc4Var3 = (yc4) iuVar2.f1103o;
        io3 io3Var = (io3) yc4Var3.m;
        if (g07Var == null || (g48VarC = g07Var.n0()) == null) {
            g48VarC = i67.C(new z14(yc4Var3, c86Var2, false));
        }
        vn3 vn3Var = c86Var2.b;
        boolean z2 = vn3Var instanceof a86;
        ub8 ub8Var = ub8.q;
        n58 n58Var2 = n58.m;
        byte b2 = 0;
        so3 so3Var2 = so3.f2039o;
        if (z2) {
            a86 a86Var = (a86) vn3Var;
            g07Var2 = null;
            ht2 ht2VarC = a86Var.c();
            if (ht2VarC == null) {
                throw new AssertionError("Class type should have a FQ name: " + vn3Var);
            }
            if (z && ht2VarC.equals(xo3.a)) {
                a96 a96Var = io3Var.i;
                fw3 fw3Var = a96.d[0];
                fw3Var.getClass();
                sy4 sy4VarE = sy4.e(g68.i(fw3Var.getName()));
                g48Var = g48VarC;
                yc4Var = yc4Var3;
                ys0 ys0VarG = ((zo4) a96Var.b.getValue()).g(sy4VarE, t35.n);
                ns4 ns4Var = ys0VarG instanceof ns4 ? (ns4) ys0VarG : null;
                ns4VarI = ns4Var == null ? a96Var.a.P(new js0(t87.i, sy4VarE), qf0.K(1)) : ns4Var;
            } else {
                yc4Var = yc4Var3;
                g48Var = g48VarC;
                wy3 wy3Var = io3Var.h.p;
                wy3Var.getClass();
                js0 js0VarF = mo3.f(ht2VarC);
                ns4VarI = js0VarF != null ? wy3Var.i(js0VarF.a()) : null;
                if (ns4VarI == null) {
                    ns4VarI = null;
                } else {
                    it2 it2VarG = zo1.g(ns4VarI);
                    HashMap map = mo3.k;
                    if (map.containsKey(it2VarG)) {
                        if (so3Var == so3Var2 || n58Var == n58Var2) {
                            ns4VarI = xz2.y0(ns4VarI);
                        } else {
                            n86 n86Var = (n86) lv0.w0(c86Var2.c());
                            q86 q86Var = n86Var instanceof q86 ? (q86) n86Var : null;
                            if (q86Var != null && q86Var.c() != null) {
                                Type[] upperBounds = q86Var.a.getUpperBounds();
                                upperBounds.getClass();
                                if (im3.n(cx.S0(upperBounds), Object.class)) {
                                    it2 it2VarG2 = zo1.g(ns4VarI);
                                    String str = mo3.a;
                                    ht2 ht2Var = (ht2) map.get(it2VarG2);
                                    if (ht2Var == null) {
                                        io.sentry.h2.g(ns4VarI, " is not a read-only collection", "Given class ");
                                        return null;
                                    }
                                    List parameters = bp1.e(ns4VarI).i(ht2Var).q().getParameters();
                                    parameters.getClass();
                                    d58 d58Var = (d58) lv0.w0(parameters);
                                    if (d58Var != null && (ub8VarB = d58Var.B()) != null && ub8VarB != ub8Var) {
                                        ns4VarI = xz2.y0(ns4VarI);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (ns4VarI == null) {
                xk1 xk1Var = (xk1) io3Var.f.n;
                if (xk1Var == null) {
                    im3.e0("resolver");
                    throw null;
                }
                ns4VarI = xk1Var.T(a86Var);
            }
            if (ns4VarI == null || (k48VarQ = ns4VarI.q()) == null) {
                throw new UnsupportedOperationException("Type not found: " + c86Var2.a);
            }
        } else {
            yc4Var = yc4Var3;
            g48Var = g48VarC;
            g07Var2 = null;
            if (!(vn3Var instanceof o86)) {
                yq4.t(vn3Var, "Unknown classifier kind: ");
                return null;
            }
            d58 d58VarB = ((f58) iuVar2.p).b((o86) vn3Var);
            k48VarQ = d58VarB != null ? d58VarB.q() : null;
        }
        if (k48VarQ == null) {
            return g07Var2;
        }
        boolean z3 = (so3Var == so3Var2 || z || n58Var == n58Var2) ? false : true;
        if (im3.n(g07Var != null ? g07Var.o0() : g07Var2, k48VarQ) && !c86Var2.d() && z3) {
            return g07Var.s0(true);
        }
        boolean z4 = true;
        if (!c86Var2.d()) {
            if (c86Var2.c().isEmpty()) {
                List parameters2 = k48VarQ.getParameters();
                parameters2.getClass();
                if (parameters2.isEmpty()) {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
        }
        List<d58> parameters3 = k48VarQ.getParameters();
        parameters3.getClass();
        if (z4) {
            ArrayList arrayList = new ArrayList(mv0.Z(parameters3, 10));
            for (d58 d58Var2 : parameters3) {
                if (n37.p(d58Var2, g07Var2, po3Var2.e)) {
                    h58VarD = p58.l(d58Var2, po3Var2);
                    k48Var2 = k48VarQ;
                    iuVar = iuVar2;
                } else {
                    k48 k48Var3 = k48VarQ;
                    iuVar = iuVar2;
                    k48Var2 = k48Var3;
                    h58VarD = rk5.d(d58Var2, po3.a(po3Var, null, c86Var.d(), null, null, 59), (lh7) iuVar.n, new o54(io3Var.a, new wo3(iuVar2, d58Var2, po3Var, k48Var3, c86Var2)));
                }
                arrayList.add(h58VarD);
                c86Var2 = c86Var;
                po3Var2 = po3Var;
                iuVar2 = iuVar;
                k48VarQ = k48Var2;
                g07Var2 = null;
            }
            k48Var = k48VarQ;
            listP0 = arrayList;
        } else {
            k48Var = k48VarQ;
            if (parameters3.size() != c86Var.c().size()) {
                ArrayList arrayList2 = new ArrayList(mv0.Z(parameters3, 10));
                Iterator it2 = parameters3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new w87(hd2.c(gd2.E, ((d58) it2.next()).getName().b())));
                }
                listP0 = lv0.P0(arrayList2);
            } else {
                ex exVarU0 = lv0.U0(c86Var.c());
                ArrayList arrayList3 = new ArrayList(mv0.Z(exVarU0, 10));
                Iterator it3 = exVarU0.iterator();
                while (true) {
                    p62 p62Var = (p62) it3;
                    if (p62Var.n.hasNext()) {
                        sg3 sg3Var = (sg3) p62Var.next();
                        int i = sg3Var.a;
                        n86 n86Var2 = (n86) sg3Var.b;
                        parameters3.size();
                        d58 d58Var3 = (d58) parameters3.get(i);
                        n58 n58Var3 = n58.n;
                        po3 po3VarI = lq1.I(n58Var3, b2, null, 7);
                        d58Var3.getClass();
                        boolean z5 = n86Var2 instanceof q86;
                        ub8 ub8Var2 = ub8.f2197o;
                        if (z5) {
                            q86 q86Var2 = (q86) n86Var2;
                            n86 n86VarC = q86Var2.c();
                            Type[] upperBounds2 = q86Var2.a.getUpperBounds();
                            upperBounds2.getClass();
                            ub8 ub8Var3 = !im3.n(cx.S0(upperBounds2), Object.class) ? ub8Var : ub8.p;
                            if (n86VarC == null || !(d58Var3.B() == ub8Var2 || ub8Var3 == d58Var3.B())) {
                                it = it3;
                                list = parameters3;
                                yc4Var2 = yc4Var;
                                b = 0;
                                w87Var = p58.l(d58Var3, po3VarI);
                            } else {
                                if (q86Var2.c() == null) {
                                    hk0.g("Nullability annotations on unbounded wildcards aren't supported");
                                    return null;
                                }
                                yc4Var2 = yc4Var;
                                Iterator it4 = new z14(yc4Var2, q86Var2, false).iterator();
                                while (true) {
                                    el2 el2Var = (el2) it4;
                                    if (!el2Var.hasNext()) {
                                        it = it3;
                                        list = parameters3;
                                        next = null;
                                        break;
                                    }
                                    next = el2Var.next();
                                    hp hpVar = (hp) next;
                                    it = it3;
                                    ht2[] ht2VarArr = fo3.b;
                                    list = parameters3;
                                    int length = ht2VarArr.length;
                                    int i2 = 0;
                                    while (i2 < length) {
                                        int i3 = i2;
                                        int i4 = length;
                                        if (im3.n(hpVar.d(), ht2VarArr[i3])) {
                                            break;
                                        }
                                        i2 = i3 + 1;
                                        length = i4;
                                    }
                                    it3 = it;
                                    parameters3 = list;
                                }
                                hp hpVar2 = (hp) next;
                                b = 0;
                                oz3 oz3VarV = iuVar2.V(n86VarC, lq1.I(n58Var3, false, null, 7));
                                if (hpVar2 != null) {
                                    ArrayList arrayListZ0 = lv0.z0(oz3VarV.getAnnotations(), hpVar2);
                                    oz3VarV = n37.s(oz3VarV, arrayListZ0.isEmpty() ? yl7.p : new wp(arrayListZ0, b));
                                }
                                w87Var = n37.i(oz3VarV, ub8Var3, d58Var3);
                            }
                            yc4Var = yc4Var2;
                        } else {
                            it = it3;
                            list = parameters3;
                            b = 0;
                            w87Var = new w87(iuVar2.V(n86Var2, po3VarI), ub8Var2);
                        }
                        arrayList3.add(w87Var);
                        it3 = it;
                        b2 = b;
                        parameters3 = list;
                    } else {
                        listP0 = lv0.P0(arrayList3);
                    }
                }
            }
        }
        return bt1.P(listP0, g48Var, k48Var, z3);
    }

    public boolean j(LayoutNode layoutNode) {
        return !(layoutNode.u == null) && (((m67) ((xk1) this.f1103o).n).contains(layoutNode) || ((m67) ((xk1) this.p).n).contains(layoutNode));
    }

    public String k(int i, StringBuilder sb) throws at2 {
        String str = null;
        while (true) {
            ti1 ti1VarL = l(i, str);
            String strA = bj2.a(ti1VarL.b);
            if (strA != null) {
                sb.append(strA);
            }
            String strValueOf = ti1VarL.d ? String.valueOf(ti1VarL.c) : null;
            int i2 = ti1VarL.a;
            if (i == i2) {
                return sb.toString();
            }
            i = i2;
            str = strValueOf;
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0217  */
    /* JADX WARN: Code duplicated, block: B:139:0x021d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0223  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    public ti1 l(int i, String str) throws at2 {
        boolean zA;
        io.sentry.android.core.u0 u0Var;
        boolean z;
        ui1 ui1Var;
        int i2;
        int iQ;
        int iQ2;
        int iQ3;
        char c;
        si1 si1Var;
        int i3;
        int iQ4;
        int iQ5;
        char c2;
        si1 si1Var2;
        si1 si1Var3;
        i70 i70Var = (i70) this.f1103o;
        lf1 lf1Var = (lf1) this.p;
        StringBuilder sb = (StringBuilder) this.n;
        sb.setLength(0);
        if (str != null) {
            sb.append(str);
        }
        lf1Var.b = i;
        int i4 = i70Var.n;
        do {
            int i5 = lf1Var.b;
            int i6 = lf1Var.c;
            int i7 = 15;
            if (i6 == 2) {
                while (true) {
                    int i8 = lf1Var.b;
                    if (i8 + 5 <= i4 && (((iQ4 = q(i8, 5, i70Var)) >= 5 && iQ4 < 16) || (i8 + 6 <= i4 && (iQ5 = q(i8, 6, i70Var)) >= 16 && iQ5 < 63))) {
                        int i9 = lf1Var.b;
                        int iQ6 = q(i9, 5, i70Var);
                        if (iQ6 == 15) {
                            si1Var3 = new si1('$', i9 + 5);
                        } else {
                            if (iQ6 < 5 || iQ6 >= 15) {
                                int iQ7 = q(i9, 6, i70Var);
                                if (iQ7 < 32 || iQ7 >= 58) {
                                    switch (iQ7) {
                                        case 58:
                                            c2 = '*';
                                            break;
                                        case 59:
                                            c2 = ',';
                                            break;
                                        case 60:
                                            c2 = '-';
                                            break;
                                        case 61:
                                            c2 = '.';
                                            break;
                                        case 62:
                                            c2 = '/';
                                            break;
                                        default:
                                            hk0.l(fx3.e(iQ7, "Decoding invalid alphanumeric value: "));
                                            return null;
                                    }
                                    si1Var2 = new si1(c2, i9 + 6);
                                } else {
                                    si1Var2 = new si1((char) (iQ7 + 33), i9 + 6);
                                }
                            } else {
                                si1Var2 = new si1((char) (iQ6 + 43), i9 + 5);
                            }
                            si1Var3 = si1Var2;
                        }
                        int i10 = si1Var3.a;
                        lf1Var.b = i10;
                        char c3 = si1Var3.b;
                        if (c3 == '$') {
                            u0Var = new io.sentry.android.core.u0((byte) 1, new ti1(i10, sb.toString()), 1 == true ? 1 : 0);
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        int i11 = lf1Var.b;
                        int i12 = i11 + 3;
                        if (i12 <= i70Var.n) {
                            while (true) {
                                if (i11 >= i12) {
                                    lf1Var.b += 3;
                                    lf1Var.c = 1;
                                } else if (!i70Var.a(i11)) {
                                    i11++;
                                } else if (H(lf1Var.b)) {
                                    i3 = lf1Var.b;
                                    if (i3 + 5 < i4) {
                                        lf1Var.b = i3 + 5;
                                    } else {
                                        lf1Var.b = i4;
                                    }
                                    lf1Var.c = 3;
                                }
                            }
                        } else if (H(lf1Var.b)) {
                            i3 = lf1Var.b;
                            if (i3 + 5 < i4) {
                                lf1Var.b = i3 + 5;
                            } else {
                                lf1Var.b = i4;
                            }
                            lf1Var.c = 3;
                        }
                        u0Var = new io.sentry.android.core.u0();
                    }
                }
                z = u0Var.n;
            } else if (i6 == 3) {
                while (true) {
                    int i13 = lf1Var.b;
                    if (i13 + 5 <= i4 && (((iQ = q(i13, 5, i70Var)) >= 5 && iQ < 16) || (i13 + 7 <= i4 && (((iQ2 = q(i13, 7, i70Var)) >= 64 && iQ2 < 116) || (i13 + 8 <= i4 && (iQ3 = q(i13, 8, i70Var)) >= 232 && iQ3 < 253))))) {
                        int i14 = lf1Var.b;
                        int iQ8 = q(i14, 5, i70Var);
                        if (iQ8 == i7) {
                            si1Var = new si1('$', i14 + 5);
                        } else if (iQ8 < 5 || iQ8 >= i7) {
                            int iQ9 = q(i14, 7, i70Var);
                            if (iQ9 >= 64 && iQ9 < 90) {
                                si1Var = new si1((char) (iQ9 + 1), i14 + 7);
                            } else if (iQ9 < 90 || iQ9 >= 116) {
                                switch (q(i14, 8, i70Var)) {
                                    case 232:
                                        c = '!';
                                        break;
                                    case 233:
                                        c = '\"';
                                        break;
                                    case 234:
                                        c = '%';
                                        break;
                                    case 235:
                                        c = '&';
                                        break;
                                    case 236:
                                        c = '\'';
                                        break;
                                    case 237:
                                        c = '(';
                                        break;
                                    case 238:
                                        c = ')';
                                        break;
                                    case 239:
                                        c = '*';
                                        break;
                                    case 240:
                                        c = '+';
                                        break;
                                    case 241:
                                        c = ',';
                                        break;
                                    case 242:
                                        c = '-';
                                        break;
                                    case 243:
                                        c = '.';
                                        break;
                                    case 244:
                                        c = '/';
                                        break;
                                    case 245:
                                        c = ':';
                                        break;
                                    case 246:
                                        c = ';';
                                        break;
                                    case 247:
                                        c = '<';
                                        break;
                                    case 248:
                                        c = '=';
                                        break;
                                    case 249:
                                        c = '>';
                                        break;
                                    case 250:
                                        c = '?';
                                        break;
                                    case 251:
                                        c = '_';
                                        break;
                                    case 252:
                                        c = ' ';
                                        break;
                                    default:
                                        throw at2.a();
                                }
                                si1Var = new si1(c, i14 + 8);
                            } else {
                                si1Var = new si1((char) (iQ9 + 7), i14 + 7);
                            }
                        } else {
                            si1Var = new si1((char) (iQ8 + 43), i14 + 5);
                        }
                        int i15 = si1Var.a;
                        lf1Var.b = i15;
                        char c4 = si1Var.b;
                        if (c4 == '$') {
                            u0Var = new io.sentry.android.core.u0((byte) 1, new ti1(i15, sb.toString()), 1 == true ? 1 : 0);
                        } else {
                            sb.append(c4);
                            i7 = 15;
                        }
                    } else {
                        int i16 = lf1Var.b;
                        int i17 = i16 + 3;
                        if (i17 <= i70Var.n) {
                            while (true) {
                                if (i16 >= i17) {
                                    lf1Var.b += 3;
                                    lf1Var.c = 1;
                                } else if (!i70Var.a(i16)) {
                                    i16++;
                                } else if (H(lf1Var.b)) {
                                    i2 = lf1Var.b;
                                    if (i2 + 5 < i4) {
                                        lf1Var.b = i2 + 5;
                                    } else {
                                        lf1Var.b = i4;
                                    }
                                    lf1Var.c = 2;
                                }
                            }
                        } else if (H(lf1Var.b)) {
                            i2 = lf1Var.b;
                            if (i2 + 5 < i4) {
                                lf1Var.b = i2 + 5;
                            } else {
                                lf1Var.b = i4;
                            }
                            lf1Var.c = 2;
                        }
                        u0Var = new io.sentry.android.core.u0();
                    }
                }
                z = u0Var.n;
            } else {
                while (true) {
                    int i18 = lf1Var.b;
                    if (i18 + 7 > i4) {
                        zA = i18 + 4 <= i4;
                    } else {
                        int i19 = i18;
                        while (true) {
                            int i20 = i18 + 3;
                            if (i19 >= i20) {
                                zA = i70Var.a(i20);
                            } else if (!i70Var.a(i19)) {
                                i19++;
                            }
                        }
                    }
                    int i21 = lf1Var.b;
                    if (zA) {
                        int i22 = i21 + 7;
                        if (i22 > i4) {
                            int iQ10 = q(i21, 4, i70Var);
                            ui1Var = iQ10 == 0 ? new ui1(i4, 10, 10) : new ui1(i4, iQ10 - 1, 10);
                        } else {
                            int iQ11 = q(i21, 7, i70Var) - 8;
                            ui1Var = new ui1(i22, iQ11 / 11, iQ11 % 11);
                        }
                        int i23 = ui1Var.a;
                        lf1Var.b = i23;
                        int i24 = ui1Var.c;
                        int i25 = ui1Var.b;
                        if (i25 == 10) {
                            u0Var = new io.sentry.android.core.u0((byte) 1, i24 == 10 ? new ti1(i23, sb.toString()) : new ti1(i23, i24, sb.toString()), 1 == true ? 1 : 0);
                        } else {
                            byte b = 1;
                            char c5 = 1;
                            sb.append(i25);
                            if (i24 == 10) {
                                u0Var = new io.sentry.android.core.u0(b, new ti1(lf1Var.b, sb.toString()), c5 == true ? 1 : 0);
                            } else {
                                sb.append(i24);
                            }
                        }
                    } else {
                        if (i21 + 1 <= i4) {
                            int i26 = 0;
                            while (true) {
                                if (i26 < 4) {
                                    int i27 = i26 + i21;
                                    if (i27 < i4) {
                                        if (!i70Var.a(i27)) {
                                            i26++;
                                        }
                                    }
                                }
                                lf1Var.c = 2;
                                lf1Var.b += 4;
                            }
                        }
                        u0Var = new io.sentry.android.core.u0();
                    }
                }
                z = u0Var.n;
            }
            int i28 = lf1Var.b;
            if (i5 == i28 && !z) {
            }
            ti1 ti1Var = (ti1) u0Var.f127o;
            return (ti1Var == null && ti1Var.d) ? new ti1(i28, ti1Var.c, sb.toString()) : new ti1(i28, sb.toString());
        } while (!z);
        ti1 ti1Var2 = (ti1) u0Var.f127o;
        if (ti1Var2 == null) {
        }
    }

    public void n(Bundle bundle) {
        HashSet hashSet = (HashSet) this.p;
        String string = ((Context) this.n).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (ei3.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    o((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new f97(e);
            }
        }
    }

    public Object o(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.f1103o;
        if (x37.n()) {
            try {
                String simpleName = cls.getSimpleName();
                if (simpleName.length() > 127) {
                    simpleName = simpleName.substring(0, 127);
                }
                Trace.beginSection(simpleName);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                ei3 ei3Var = (ei3) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = ei3Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            o(cls2, hashSet);
                        }
                    }
                }
                objB = ei3Var.b((Context) this.n);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new f97(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public void p() {
        Charset charset = (Charset) this.n;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        boolean zEquals = charset.equals(charset2);
        StringBuilder sb = (StringBuilder) this.f1103o;
        if (zEquals) {
            if (sb.length() > 0) {
                StringBuilder sb2 = (StringBuilder) this.p;
                StringBuilder sb3 = (StringBuilder) this.f1103o;
                if (sb2 == null) {
                    this.p = sb3;
                    this.f1103o = new StringBuilder();
                    return;
                } else {
                    sb2.append((CharSequence) sb3);
                    this.f1103o = new StringBuilder();
                    return;
                }
            }
            return;
        }
        if (sb.length() > 0) {
            byte[] bytes = ((StringBuilder) this.f1103o).toString().getBytes(charset2);
            this.f1103o = new StringBuilder();
            StringBuilder sb4 = (StringBuilder) this.p;
            Charset charset3 = (Charset) this.n;
            if (sb4 == null) {
                this.p = new StringBuilder(new String(bytes, charset3));
            } else {
                sb4.append(new String(bytes, charset3));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(jc1 jc1Var) {
        f91 f91Var;
        iw7 iw7Var;
        if (jc1Var instanceof f91) {
            f91Var = (f91) jc1Var;
            int i = f91Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                f91Var.p = i - Integer.MIN_VALUE;
            } else {
                f91Var = new f91(this, jc1Var);
            }
        } else {
            f91Var = new f91(this, jc1Var);
        }
        Object obj = f91Var.n;
        int i2 = f91Var.p;
        byte b = 1;
        hc1 hc1Var = null;
        if (i2 == 0) {
            ct1.a0(obj);
            byte b2 = 0;
            iw7 iw7Var2 = new iw7((fe1) this.n, (gu0) this.p, 1000, new e91(this, hc1Var, b2), new h31((byte) 7));
            iw7Var2.a(new yr7((byte) 11));
            yo2 yo2Var = new yo2(new jp2(iw7Var2.i, iw7Var2.k, new g91(3, hc1Var, b2), b2), new h91(iw7Var2, hc1Var, b2), b);
            i91 i91Var = new i91(2, hc1Var, b2);
            f91Var.m = iw7Var2;
            f91Var.p = 1;
            Object objL = xo1.L(yo2Var, i91Var, f91Var);
            ne1 ne1Var = ne1.m;
            if (objL == ne1Var) {
                return ne1Var;
            }
            iw7Var = iw7Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iw7Var = f91Var.m;
            ct1.a0(obj);
        }
        return iw7Var.g.m.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(jc1 jc1Var) {
        j91 j91Var;
        iw7 iw7Var;
        if (jc1Var instanceof j91) {
            j91Var = (j91) jc1Var;
            int i = j91Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                j91Var.p = i - Integer.MIN_VALUE;
            } else {
                j91Var = new j91(this, jc1Var);
            }
        } else {
            j91Var = new j91(this, jc1Var);
        }
        Object obj = j91Var.n;
        int i2 = j91Var.p;
        byte b = 1;
        hc1 hc1Var = null;
        if (i2 == 0) {
            ct1.a0(obj);
            iw7 iw7Var2 = new iw7((fe1) this.n, (gu0) this.p, 1000, new e91(this, hc1Var, b), new h31((byte) 8));
            iw7Var2.a(new yr7((byte) 11));
            yo2 yo2Var = new yo2(new jp2(iw7Var2.i, iw7Var2.k, new g91(3, hc1Var, b), (byte) 0), new h91(iw7Var2, hc1Var, b), b);
            i91 i91Var = new i91(2, hc1Var, b);
            j91Var.m = iw7Var2;
            j91Var.p = 1;
            Object objL = xo1.L(yo2Var, i91Var, j91Var);
            ne1 ne1Var = ne1.m;
            if (objL == ne1Var) {
                return ne1Var;
            }
            iw7Var = iw7Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iw7Var = j91Var.m;
            ct1.a0(obj);
        }
        return iw7Var.g.m.getValue();
    }

    public void t(i3 i3Var) {
        jc2 jc2Var = vi8.z;
        jc2Var.getClass();
        j1 j1Var = new j1(jc2Var, (byte) 0);
        while (j1Var.hasNext()) {
            vi8 vi8Var = (vi8) j1Var.next();
            if (vi8Var != vi8.Undefined) {
                ((EnumMap) this.p).put(vi8Var, i3Var);
            }
        }
    }

    public String toString() {
        switch (this.m) {
            case 2:
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : ((EnumMap) this.p).entrySet()) {
                    sb.append(((vi8) entry.getKey()) + "=" + ((i3) entry.getValue()) + " ");
                }
                return sb.toString();
            case 22:
                p();
                StringBuilder sb2 = (StringBuilder) this.p;
                return sb2 == null ? "" : sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // o.n57
    public v07 u() {
        return (u36) this.n;
    }

    public i3 v(vi8 vi8Var) {
        vi8Var.getClass();
        return (i3) ((EnumMap) this.p).get(vi8Var);
    }

    public ll0 x() {
        return ((nl0) this.n).m.c;
    }

    public kd4 y() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((ol5) this.n)) {
            try {
                kd4 kd4Var = (kd4) this.p;
                if (kd4Var != null && localeList == ((LocaleList) this.f1103o)) {
                    return kd4Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new jd4(localeList.get(i)));
                }
                kd4 kd4Var2 = new kd4(arrayList);
                this.f1103o = localeList;
                this.p = kd4Var2;
                return kd4Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public in1 z() {
        return ((nl0) this.n).m.a;
    }

    public /* synthetic */ iu(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.f1103o = obj;
        this.p = obj2;
        this.n = obj3;
    }

    public iu(EventHub eventHub) {
        this.m = (byte) 5;
        eventHub.getClass();
        this.f1103o = eventHub;
        this.n = new mu(this, (byte) 0);
    }

    public iu(ha6 ha6Var, EventHub eventHub) {
        this.m = (byte) 17;
        ha6Var.getClass();
        eventHub.getClass();
        this.f1103o = eventHub;
        pq6 pq6Var = ha6Var.c;
        this.p = im3.k(new vd5(Float.valueOf(pq6Var.a), Float.valueOf(pq6Var.a)));
        mu muVar = new mu(this, (byte) 1);
        this.n = muVar;
        eventHub.c(EventType.EVENT_SCALING_FACTOR_CHANGED, muVar);
    }

    public iu(io.sentry.android.core.d dVar, ue0 ue0Var) {
        this.m = (byte) 24;
        ue0Var.getClass();
        this.f1103o = dVar;
        this.p = ue0Var;
        this.n = new yp0(this);
    }

    public iu(byte b) {
        this.m = b;
        switch (b) {
            case 4:
                this.n = new ol5((byte) 11);
                break;
            case 6:
                this.f1103o = hm3.c(g57.a());
                this.p = new my4();
                this.n = new LinkedHashMap();
                sb6.a.add(this);
                break;
            case 20:
                this.f1103o = new xk1((byte) 1);
                this.p = new xk1((byte) 1);
                this.n = new xk1((byte) 1);
                break;
            case 22:
                this.n = StandardCharsets.ISO_8859_1;
                this.f1103o = new StringBuilder();
                break;
            case 25:
                this.f1103o = new jx4();
                break;
            default:
                this.f1103o = l3.CONTROL_TYPE_UNDEFINED;
                this.p = new EnumMap(vi8.class);
                this.n = new EnumMap(vi8.class);
                G(l3.CONTROL_TYPE_FULL_ACCESS);
                break;
        }
    }

    public iu(Context context, du0 du0Var, du0 du0Var2) {
        this.m = (byte) 18;
        this.n = context;
        this.f1103o = du0Var;
        this.p = du0Var2;
    }

    public iu(Drawable.Callback callback, Map map) {
        this.m = (byte) 1;
        if (TextUtils.isEmpty(null)) {
            this.f1103o = null;
            this.p = map;
            if (!(callback instanceof View)) {
                this.n = null;
                return;
            } else {
                this.n = ((View) callback).getContext().getApplicationContext();
                return;
            }
        }
        throw null;
    }

    public iu(j93 j93Var) {
        this.m = (byte) 11;
        this.f1103o = j93Var;
        dl1 dl1Var = (dl1) j93Var.p;
        dl1Var.getClass();
        this.p = new w36(dl1Var);
        cl1 cl1Var = (cl1) j93Var.q;
        cl1Var.getClass();
        this.n = new u36(cl1Var);
    }

    public /* synthetic */ iu(byte b, boolean z) {
        this.m = b;
    }

    public iu(int i) {
        this.m = (byte) 22;
        this.n = StandardCharsets.ISO_8859_1;
        this.f1103o = new StringBuilder(i);
    }

    public iu(i70 i70Var) {
        this.m = (byte) 26;
        lf1 lf1Var = new lf1((byte) 0);
        lf1Var.b = 0;
        lf1Var.c = 1;
        this.p = lf1Var;
        this.n = new StringBuilder();
        this.f1103o = i70Var;
    }

    public iu(yc4 yc4Var, f58 f58Var) {
        this.m = (byte) 29;
        f58Var.getClass();
        this.f1103o = yc4Var;
        this.p = f58Var;
        this.n = new lh7(new rk5((byte) 3));
    }

    public iu(View view) {
        this.m = (byte) 28;
        this.f1103o = view;
        this.p = ds1.X(l54.n, new zz0(this, (byte) 27));
        this.n = new l07(view);
    }

    public iu(nl0 nl0Var) {
        this.m = (byte) 13;
        this.n = nl0Var;
        this.f1103o = new xc0((Object) this, (byte) 9);
    }

    public iu(Context context, byte b) {
        this.m = b;
        switch (b) {
            case 27:
                this.n = context.getApplicationContext();
                this.f1103o = he3.f965o;
                this.p = new sg2();
                break;
            default:
                this.n = context.getApplicationContext();
                this.p = new HashSet();
                this.f1103o = new HashMap();
                break;
        }
    }

    public iu(o61 o61Var) {
        this.m = (byte) 8;
        this.f1103o = new ArrayList();
        this.p = new k40();
        this.n = o61Var;
    }

    public iu(j93 j93Var, vv vvVar, bk1 bk1Var, Set set) {
        this.m = (byte) 23;
        this.f1103o = vvVar;
        this.p = j93Var;
        this.n = bk1Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            K(str, 0, str.length(), 1, true, new hr2(str, (byte) 5));
        }
    }

    public iu(t60 t60Var) {
        this.m = (byte) 9;
        this.f1103o = t60Var;
        int i = Build.VERSION.SDK_INT;
        this.p = i >= 29 ? r60.b(t60Var.a) : null;
        this.n = i <= 29 ? new ir((byte) 18) : null;
    }
}
