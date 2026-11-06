package o;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import androidx.compose.ui.node.LayoutNode;
import androidx.work.impl.WorkDatabase;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class lq1 {
    public static nx3 a;
    public static we3 b;
    public static int c;

    public static final String A(sy4 sy4Var) {
        sy4Var.getClass();
        String strB = sy4Var.b();
        strB.getClass();
        if (!ty3.a.contains(strB)) {
            for (int i = 0; i < strB.length(); i++) {
                char cCharAt = strB.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                String strB2 = sy4Var.b();
                strB2.getClass();
                return strB2;
            }
        }
        String strB3 = sy4Var.b();
        strB3.getClass();
        return "`".concat(strB3).concat("`");
    }

    public static final String B(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sy4 sy4Var = (sy4) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(A(sy4Var));
        }
        return sb.toString();
    }

    public static final String C(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str3.getClass();
        if (!bc7.N(false, str, str2) || !bc7.N(false, str3, str4)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (Q(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    public static r82 D(String str, r82 r82Var) {
        db8.l0(str);
        td2 td2VarB0 = vy5.b0(str);
        r82 r82Var2 = new r82();
        HashSet hashSet = new HashSet();
        Iterator it = r82Var.iterator();
        while (it.hasNext()) {
            o82 o82Var = (o82) it.next();
            db8.o0(o82Var);
            xk0.I(td2VarB0, o82Var).filter(new l82(hashSet, (byte) 2)).forEach(new io.sentry.android.core.z1(r82Var2, (byte) 1));
        }
        return r82Var2;
    }

    public static final void E(va5 va5Var, int i, Object obj) {
        va5Var.s[(va5Var.t - va5Var.f2293o[va5Var.p - 1].c) + i] = obj;
    }

    public static final void F(va5 va5Var, int i, Object obj, int i2, Object obj2) {
        int i3 = va5Var.t - va5Var.f2293o[va5Var.p - 1].c;
        Object[] objArr = va5Var.s;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final int G(jw4 jw4Var) {
        int iC;
        int i = jw4Var.b;
        int iC2 = jw4Var.c(0);
        while (jw4Var.b != 0 && jw4Var.c(0) == iC2) {
            jw4Var.f(0, jw4Var.d());
            jw4Var.e(jw4Var.b - 1);
            int i2 = jw4Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iC3 = jw4Var.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iC4 = jw4Var.c(i6);
                if (i5 < i2 && (iC = jw4Var.c(i5)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    jw4Var.f(i4, iC);
                    jw4Var.f(i5, iC3);
                    i4 = i5;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    jw4Var.f(i4, iC4);
                    jw4Var.f(i6, iC3);
                    i4 = i6;
                }
            }
        }
        return iC2;
    }

    public static final void H(int i, int i2, fq6 fq6Var) {
        fq6Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(fq6Var.f(i4));
            }
            i3 >>>= 1;
        }
        String strA = fq6Var.a();
        strA.getClass();
        throw new mr4(arrayList.size() == 1 ? e41.m(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", strA, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + strA + "', but they were missing", null, arrayList, strA);
    }

    public static po3 I(n58 n58Var, boolean z, w24 w24Var, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            w24Var = null;
        }
        return new po3(n58Var, z3, z2, w24Var != null ? lv1.V(w24Var) : null, 34);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x003a A[SYNTHETIC] */
    public static final ns1 J(z31 z31Var) {
        ls1 ls1Var;
        ls1 ls1Var2;
        Iterator it;
        Integer numO;
        int iOrdinal;
        ks1 ks1Var;
        jz1 jz1Var;
        js1 js1Var;
        int iOrdinal2;
        js1 js1Var2;
        b41 b41Var = z31Var.j;
        Long lP = bc7.P(z31Var.d);
        if (lP == null) {
            return null;
        }
        long jLongValue = lP.longValue();
        boolean z = b41Var == b41.f389o;
        String str = z31Var.a;
        switch (z31Var.i.ordinal()) {
            case 0:
            case 3:
            case 4:
            case 6:
                ls1Var = null;
                Integer num = z31Var.l;
                if (z) {
                    numO = null;
                } else {
                    it = z31Var.c.iterator();
                    do {
                        if (it.hasNext()) {
                            numO = bc7.O((String) it.next());
                        } else {
                            numO = null;
                        }
                    } while (numO == null);
                }
                iOrdinal = b41Var.ordinal();
                if (iOrdinal != 1) {
                    ks1Var = ks1.m;
                } else if (iOrdinal != 2) {
                    ks1Var = ks1.f1298o;
                } else {
                    ks1Var = ks1.n;
                }
                ks1 ks1Var2 = ks1Var;
                jz1Var = z31Var.k;
                if (jz1Var != null) {
                    iOrdinal2 = jz1Var.ordinal();
                    if (iOrdinal2 != 0) {
                        js1Var2 = js1.m;
                    } else if (iOrdinal2 != 1) {
                        js1Var2 = js1.n;
                    } else if (iOrdinal2 != 2) {
                        js1Var2 = js1.f1197o;
                    } else {
                        if (iOrdinal2 == 3) {
                            gk0.s();
                            return null;
                        }
                        js1Var2 = js1.p;
                    }
                    js1Var = js1Var2;
                } else {
                    js1Var = null;
                }
                String str2 = z31Var.e;
                return new ns1(jLongValue, str, ls1Var, num, numO, null, null, null, null, null, z, null, ks1Var2, js1Var, str2 != null ? O(str2) : null, 522080);
            case 1:
                ls1Var2 = ls1.n;
                ls1Var = ls1Var2;
                Integer num2 = z31Var.l;
                if (z) {
                    numO = null;
                } else {
                    it = z31Var.c.iterator();
                    do {
                        if (it.hasNext()) {
                            numO = bc7.O((String) it.next());
                        } else {
                            numO = null;
                        }
                    } while (numO == null);
                }
                iOrdinal = b41Var.ordinal();
                if (iOrdinal != 1) {
                    ks1Var = ks1.m;
                } else if (iOrdinal != 2) {
                    ks1Var = ks1.f1298o;
                } else {
                    ks1Var = ks1.n;
                }
                ks1 ks1Var3 = ks1Var;
                jz1Var = z31Var.k;
                if (jz1Var != null) {
                    iOrdinal2 = jz1Var.ordinal();
                    if (iOrdinal2 != 0) {
                        js1Var2 = js1.m;
                    } else if (iOrdinal2 != 1) {
                        js1Var2 = js1.n;
                    } else if (iOrdinal2 != 2) {
                        js1Var2 = js1.f1197o;
                    } else {
                        if (iOrdinal2 == 3) {
                            gk0.s();
                            return null;
                        }
                        js1Var2 = js1.p;
                    }
                    js1Var = js1Var2;
                } else {
                    js1Var = null;
                }
                String str3 = z31Var.e;
                return new ns1(jLongValue, str, ls1Var, num2, numO, null, null, null, null, null, z, null, ks1Var3, js1Var, str3 != null ? O(str3) : null, 522080);
            case 2:
                ls1Var2 = ls1.m;
                ls1Var = ls1Var2;
                Integer num3 = z31Var.l;
                if (z) {
                    numO = null;
                } else {
                    it = z31Var.c.iterator();
                    do {
                        if (it.hasNext()) {
                            numO = bc7.O((String) it.next());
                        } else {
                            numO = null;
                        }
                    } while (numO == null);
                }
                iOrdinal = b41Var.ordinal();
                if (iOrdinal != 1) {
                    ks1Var = ks1.m;
                } else if (iOrdinal != 2) {
                    ks1Var = ks1.f1298o;
                } else {
                    ks1Var = ks1.n;
                }
                ks1 ks1Var4 = ks1Var;
                jz1Var = z31Var.k;
                if (jz1Var != null) {
                    iOrdinal2 = jz1Var.ordinal();
                    if (iOrdinal2 != 0) {
                        js1Var2 = js1.m;
                    } else if (iOrdinal2 != 1) {
                        js1Var2 = js1.n;
                    } else if (iOrdinal2 != 2) {
                        js1Var2 = js1.f1197o;
                    } else {
                        if (iOrdinal2 == 3) {
                            gk0.s();
                            return null;
                        }
                        js1Var2 = js1.p;
                    }
                    js1Var = js1Var2;
                } else {
                    js1Var = null;
                }
                String str4 = z31Var.e;
                return new ns1(jLongValue, str, ls1Var, num3, numO, null, null, null, null, null, z, null, ks1Var4, js1Var, str4 != null ? O(str4) : null, 522080);
            case 5:
                ls1Var2 = ls1.f1400o;
                ls1Var = ls1Var2;
                Integer num4 = z31Var.l;
                if (z) {
                    numO = null;
                } else {
                    it = z31Var.c.iterator();
                    do {
                        if (it.hasNext()) {
                            numO = bc7.O((String) it.next());
                        } else {
                            numO = null;
                        }
                    } while (numO == null);
                }
                iOrdinal = b41Var.ordinal();
                if (iOrdinal != 1) {
                    ks1Var = ks1.m;
                } else if (iOrdinal != 2) {
                    ks1Var = ks1.f1298o;
                } else {
                    ks1Var = ks1.n;
                }
                ks1 ks1Var5 = ks1Var;
                jz1Var = z31Var.k;
                if (jz1Var != null) {
                    iOrdinal2 = jz1Var.ordinal();
                    if (iOrdinal2 != 0) {
                        js1Var2 = js1.m;
                    } else if (iOrdinal2 != 1) {
                        js1Var2 = js1.n;
                    } else if (iOrdinal2 != 2) {
                        js1Var2 = js1.f1197o;
                    } else {
                        if (iOrdinal2 == 3) {
                            gk0.s();
                            return null;
                        }
                        js1Var2 = js1.p;
                    }
                    js1Var = js1Var2;
                } else {
                    js1Var = null;
                }
                String str5 = z31Var.e;
                return new ns1(jLongValue, str, ls1Var, num4, numO, null, null, null, null, null, z, null, ks1Var5, js1Var, str5 != null ? O(str5) : null, 522080);
            default:
                gk0.s();
                return null;
        }
    }

    public static final long K(int i, g72 g72Var) {
        if (g72Var.compareTo(g72.SECONDS) > 0) {
            return L(i, g72Var);
        }
        long jConvert = TimeUnit.NANOSECONDS.convert(i, g72Var.m);
        aw awVar = c72.n;
        long j = jConvert << 1;
        int i2 = e72.a;
        return j;
    }

    public static final long L(long j, g72 g72Var) {
        TimeUnit timeUnit = g72Var.m;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            aw awVar = c72.n;
            long j2 = jConvert2 << 1;
            int i = e72.a;
            return j2;
        }
        if (g72Var.compareTo(g72.MILLISECONDS) < 0) {
            return p(ct1.w(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return p(ds1.C(Math.abs(j), g72Var) * jSignum);
    }

    public static final ExtractedText M(zr7 zr7Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = zr7Var.a.n;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = zr7Var.b;
        extractedText.selectionStart = gt7.f(j);
        extractedText.selectionEnd = gt7.e(j);
        extractedText.flags = !ub7.R(zr7Var.a.n, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final String N(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final UUID O(String str) {
        Object sc6Var;
        try {
            sc6Var = UUID.fromString(str);
        } catch (Throwable th) {
            sc6Var = new sc6(th);
        }
        if (sc6Var instanceof sc6) {
            sc6Var = null;
        }
        return (UUID) sc6Var;
    }

    public static void P(p45 p45Var, x35 x35Var) {
        x35 x35VarW = x35Var.w();
        char c2 = 0;
        int i = 0;
        while (true) {
            if (c2 == 0) {
                o82 o82Var = x35Var.m;
                x35 x35VarW2 = x35Var.w();
                int iN = o82Var != null ? x35Var.N() : 0;
                p45Var.j(x35Var, i);
                if (o82Var != null && x35Var.m != o82Var) {
                    x35Var = iN < o82Var.q.size() ? o82Var.i(iN) : null;
                    x35 x35Var2 = i == 0 ? x35VarW : x35VarW2;
                    if (x35Var == null || x35Var == x35Var2) {
                        if (i == 0) {
                            return;
                        }
                        if (x35VarW2 == null || x35VarW2.m != o82Var) {
                            i--;
                            c2 = 2;
                            x35Var = o82Var;
                        } else {
                            x35Var = x35VarW2;
                        }
                    }
                }
                c2 = 1;
            } else {
                if (c2 != 1 || x35Var.k() <= 0) {
                    p45Var.e(x35Var, i);
                    x35 x35VarW3 = x35Var.w();
                    if (i == 0) {
                        if (x35VarW3 == null || x35VarW3 == x35VarW) {
                            return;
                        }
                    } else if (x35VarW3 == null) {
                        x35Var = x35Var.m;
                        i--;
                        c2 = 2;
                    }
                    x35Var = x35VarW3;
                } else {
                    x35Var = x35Var.i(0);
                    i++;
                }
                c2 = 0;
            }
        }
    }

    public static final boolean Q(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(bc7.L(str2, "?", ""))) {
            return true;
        }
        if (bc7.G(false, str2, "?") && str.concat("?").equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    public static final void R(fp6 fp6Var, int i, sj6 sj6Var) {
        xx4 xx4Var = new xx4(new fp6[16]);
        List listI = fp6Var.i(false, false);
        while (true) {
            xx4Var.c(xx4Var.f2559o, listI);
            while (true) {
                int i2 = xx4Var.f2559o;
                if (i2 == 0) {
                    return;
                }
                fp6 fp6Var2 = (fp6) xx4Var.k(i2 - 1);
                boolean zQ = db8.Q(fp6Var2);
                ap6 ap6Var = fp6Var2.d;
                jx4 jx4Var = ap6Var.m;
                if (!zQ && !jx4Var.c(kp6.j)) {
                    e45 e45VarD = fp6Var2.d();
                    if (e45VarD == null) {
                        throw ua5.r("Expected semantics node to have a coordinator.");
                    }
                    zk3 zk3VarT = vs1.T(vt1.m(e45VarD, true));
                    if (zk3VarT.a < zk3VarT.c && zk3VarT.b < zk3VarT.d) {
                        Object objG = ap6Var.m.g(zo6.e);
                        if (objG == null) {
                            objG = null;
                        }
                        hw2 hw2Var = (hw2) objG;
                        Object objG2 = jx4Var.g(kp6.w);
                        rj6 rj6Var = (rj6) (objG2 != null ? objG2 : null);
                        if (hw2Var == null || rj6Var == null || ((Number) rj6Var.b.a()).floatValue() <= 0.0f) {
                            listI = fp6Var2.i(false, false);
                        } else {
                            int i3 = 1 + i;
                            sj6Var.invoke(new uj6(fp6Var2, i3, zk3VarT, e45VarD));
                            R(fp6Var2, i3, sj6Var);
                        }
                    }
                }
            }
        }
    }

    public static lq1 S(StringBuilder sb) {
        return sb != null ? new dz5(sb, (byte) 1) : new dz5(sb, (byte) 0);
    }

    public static final void a(String str, int i, boolean z, ux2 ux2Var, int i2) {
        ux2Var.Y(265297176);
        int i3 = i2 | (ux2Var.f(str) ? 4 : 2) | (ux2Var.d(i) ? 32 : 16) | (ux2Var.g(z) ? 256 : 128);
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            String strA = m77.A(i, new Object[]{Integer.valueOf(str.length())}, ux2Var);
            if (z) {
                ux2Var.W(728588463);
            } else {
                ux2Var.W(728623989);
                strA = strA + " " + m77.z(R.string.character_limit_reached_text_error, ux2Var);
            }
            ux2Var.p(false);
            qs7.b(strA, androidx.compose.foundation.layout.b.c(cs4.b, 1.0f), 0L, 0L, null, 0L, new qo7(5), 0L, 0, false, 0, 0, null, null, ux2Var, 48, 0, 261116);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hq1(i, i2, str, z);
        }
    }

    public static final void b(final String str, final Function1 function1, final boolean z, boolean z2, final boolean z3, final sq2 sq2Var, final Function1 function2, final fs4 fs4Var, boolean z4, final boolean z5, Integer num, final String str2, hw2 hw2Var, final Function0 function0, hw2 hw2Var2, hw2 hw2Var3, tg8 tg8Var, yx3 yx3Var, ux2 ux2Var, final int i, final int i2, final int i3) {
        int i4;
        Integer num2;
        int i5;
        int i6;
        int i7;
        int i8;
        final boolean z6;
        final hw2 hw2Var4;
        final hw2 hw2Var5;
        final tg8 tg8Var2;
        final yx3 yx3Var2;
        final Integer num3;
        final hw2 hw2Var6;
        int i9;
        fs4 fs4VarB;
        hw2 hw2VarO;
        boolean z7;
        final boolean z8 = z2;
        str.getClass();
        function1.getClass();
        sq2Var.getClass();
        function2.getClass();
        ux2Var.Y(1899073567);
        if ((i & 6) == 0) {
            i4 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= ux2Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= ux2Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ux2Var.g(z8) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ux2Var.g(z3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= ux2Var.f(sq2Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= ux2Var.h(function2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= ux2Var.f(fs4Var) ? 8388608 : 4194304;
        }
        int i10 = i4 | 100663296;
        if ((i & 805306368) == 0) {
            i10 |= ux2Var.g(z5) ? 536870912 : 268435456;
        }
        int i11 = i3 & 1024;
        if (i11 != 0) {
            i5 = i2 | 6;
            num2 = num;
        } else {
            num2 = num;
            i5 = i2 | (ux2Var.f(num2) ? 4 : 2);
        }
        int i12 = i5 | (ux2Var.f(str2) ? 32 : 16);
        int i13 = i3 & 4096;
        if (i13 != 0) {
            i6 = i12 | 384;
        } else {
            i6 = i12 | (ux2Var.h(hw2Var) ? 256 : 128);
        }
        int i14 = i3 & 16384;
        if (i14 != 0) {
            i7 = i6 | 24576;
        } else {
            i7 = i6 | (ux2Var.h(hw2Var2) ? 16384 : 8192);
        }
        int i15 = i3 & 32768;
        if (i15 != 0) {
            i7 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i7 |= ux2Var.h(hw2Var3) ? 131072 : 65536;
        }
        int i16 = i3 & 65536;
        if (i16 != 0) {
            i8 = i7 | 1572864;
        } else {
            i8 = i7 | (ux2Var.f(tg8Var) ? 1048576 : 524288);
        }
        int i17 = i3 & 131072;
        if (i17 != 0) {
            i8 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i8 |= ux2Var.f(yx3Var) ? 8388608 : 4194304;
        }
        if (ux2Var.N(i10 & 1, ((i10 & 306783379) == 306783378 && (i8 & 4793491) == 4793490) ? false : true)) {
            Integer num4 = i11 != 0 ? null : num2;
            hw2 hw2Var7 = i13 != 0 ? null : hw2Var;
            hw2 hw2Var8 = i14 != 0 ? null : hw2Var2;
            hw2 hw2Var9 = i15 != 0 ? null : hw2Var3;
            tg8 tg8Var3 = i16 != 0 ? xz2.Z : tg8Var;
            yx3 yx3Var3 = i17 != 0 ? new yx3(0, 1, 119) : yx3Var;
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = h57.p(Boolean.FALSE);
                ux2Var.g0(objK);
            }
            px4 px4Var = (px4) objK;
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                int length = str.length();
                long jA = h57.a(length, length);
                i9 = 4;
                objK2 = h57.p(new zr7(4, jA, str));
                ux2Var.g0(objK2);
            } else {
                i9 = 4;
            }
            px4 px4Var2 = (px4) objK2;
            boolean z9 = (i10 & 14) == i9;
            Object objK3 = ux2Var.K();
            if (z9 || objK3 == awVar) {
                objK3 = new kq1(str, px4Var2, null, (byte) 0);
                ux2Var.g0(objK3);
            }
            ck3.i(str, (hw2) objK3, ux2Var);
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(fs4Var, 1.0f);
            cs4 cs4Var = cs4.b;
            if (function0 == null || (fs4VarB = androidx.compose.foundation.b.b(cs4Var, !z5, null, null, function0, 14)) == null) {
                fs4VarB = cs4Var;
            }
            fs4 fs4VarF = fs4VarC.f(fs4VarB);
            int i18 = i10 & 1879048192;
            boolean z10 = ((234881024 & i10) == 67108864) | (i18 == 536870912) | ((i10 & 57344) == 16384);
            Object objK4 = ux2Var.K();
            if (z10 || objK4 == awVar) {
                objK4 = new Function1() { // from class: o.gq1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        mq2 mq2Var = (mq2) obj;
                        mq2Var.getClass();
                        mq2Var.d(!z5 && z3);
                        return f88.a;
                    }
                };
                ux2Var.g0(objK4);
            }
            fs4 fs4VarN = uf0.n(qf0.y(fs4VarF, (Function1) objK4), sq2Var);
            boolean z11 = (3670016 & i10) == 1048576;
            Object objK5 = ux2Var.K();
            if (z11 || objK5 == awVar) {
                objK5 = new g70(function2, px4Var, (byte) 1);
                ux2Var.g0(objK5);
            }
            fs4 fs4VarZ = ka0.z(fs4VarN, (Function1) objK5);
            zr7 zr7Var = (zr7) px4Var2.getValue();
            qf6 qf6Var = ((rn4) ux2Var.j(un4.a)).c.b;
            boolean z12 = !z;
            byte b2 = 1;
            boolean z13 = !z2;
            if (hw2Var7 == null) {
                ux2Var.W(1993817249);
                if (num4 == null) {
                    ux2Var.W(1993817248);
                    z7 = false;
                    ux2Var.p(false);
                    hw2VarO = null;
                    z8 = z2;
                } else {
                    ux2Var.W(1993817249);
                    z8 = z2;
                    hw2VarO = au8.O(1133919555, new hq1(str, num4.intValue(), z8), ux2Var);
                    z7 = false;
                    ux2Var.p(false);
                }
                ux2Var.p(z7);
            } else {
                zr7Var = zr7Var;
                qf6Var = qf6Var;
                z8 = z2;
                ux2Var.W(-351326520);
                ux2Var.p(false);
                hw2VarO = hw2Var7;
            }
            int i19 = z ? 5 : 1;
            boolean z14 = (i18 == 536870912) | ((i10 & 112) == 32);
            Object objK6 = ux2Var.K();
            if (z14 || objK6 == awVar) {
                objK6 = new iq1((byte) 0, function1, px4Var2, z5);
                ux2Var.g0(objK6);
            }
            int i20 = i10 >> 15;
            int i21 = i8 >> 6;
            bt1.f(zr7Var, (Function1) objK6, fs4VarZ, true, z5, null, au8.O(765591097, new qa(str2, b2), ux2Var), hw2Var8, hw2Var9, hw2VarO, z13, tg8Var3, yx3Var3, null, z12, i19, 1, qf6Var, null, ux2Var, (i20 & 57344) | (i20 & 7168) | 1572864 | ((i8 << 9) & 29360128) | ((i8 << 12) & 1879048192), (i21 & 57344) | 805306368 | (i21 & 458752), 5311776);
            z6 = true;
            hw2Var6 = hw2Var8;
            hw2Var5 = hw2Var9;
            tg8Var2 = tg8Var3;
            yx3Var2 = yx3Var3;
            num3 = num4;
            hw2Var4 = hw2Var7;
        } else {
            ux2Var.Q();
            z6 = z4;
            hw2Var4 = hw2Var;
            hw2Var5 = hw2Var3;
            tg8Var2 = tg8Var;
            yx3Var2 = yx3Var;
            num3 = num2;
            hw2Var6 = hw2Var2;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.jq1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    lq1.b(str, function1, z, z8, z3, sq2Var, function2, fs4Var, z6, z5, num3, str2, hw2Var4, function0, hw2Var6, hw2Var5, tg8Var2, yx3Var2, (ux2) obj, iY, iY2, i3);
                    return f88.a;
                }
            };
        }
    }

    public static final void c(fs4 fs4Var, final dw dwVar, final gw gwVar, x50 x50Var, int i, int i2, final yy0 yy0Var, ux2 ux2Var, final int i3) {
        final fs4 fs4Var2;
        final int i4;
        final int i5;
        ux2Var.Y(-1303174015);
        int i6 = i3 | 6;
        if ((i3 & 48) == 0) {
            i6 |= ux2Var.f(dwVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= ux2Var.f(gwVar) ? 256 : 128;
        }
        int i7 = i6 | 224256;
        if (ux2Var.N(i7 & 1, (599187 & i7) != 599186)) {
            x50Var = xz2.x;
            xz2 xz2Var = xz2.L;
            int i8 = (i7 & 112) | 1572870 | (i7 & 896) | 12807168;
            cs4 cs4Var = cs4.b;
            d(cs4Var, dwVar, gwVar, xz2Var, yy0Var, ux2Var, i8);
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            i4 = i;
            i5 = i2;
        }
        final x50 x50Var2 = x50Var;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.mp2
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lq1.c(fs4Var2, dwVar, gwVar, x50Var2, i4, i5, yy0Var, (ux2) obj, yo1.Y(i3 | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void d(fs4 fs4Var, dw dwVar, gw gwVar, xz2 xz2Var, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        Object obj;
        Object obj2 = xz2.x;
        ux2Var.Y(-1956591841);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(fs4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(dwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(gwVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.d(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.d(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            obj = xz2Var;
            i2 |= ux2Var.f(obj) ? 1048576 : 524288;
        } else {
            obj = xz2Var;
        }
        if ((i & 12582912) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (ux2Var.N(i3 & 1, (i3 & 4793491) != 4793490)) {
            int i4 = i3 & 3670016;
            boolean z = i4 == 1048576;
            Object objK = ux2Var.K();
            Object obj3 = e01.a;
            if (z || objK == obj3) {
                obj.getClass();
                objK = new pp2();
                ux2Var.g0(objK);
            }
            pp2 pp2Var = (pp2) objK;
            int i5 = i3 >> 3;
            boolean zF = ((((i5 & 896) ^ 384) > 256 && ux2Var.f(obj2)) || (i5 & 384) == 256) | ((((i5 & 14) ^ 6) > 4 && ux2Var.f(dwVar)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && ux2Var.f(gwVar)) || (i5 & 48) == 32) | ((((i5 & 7168) ^ 3072) > 2048 && ux2Var.d(Integer.MAX_VALUE)) || (i5 & 3072) == 2048) | ((((57344 & i5) ^ 24576) > 16384 && ux2Var.d(Integer.MAX_VALUE)) || (i5 & 24576) == 16384) | ux2Var.f(pp2Var);
            Object objK2 = ux2Var.K();
            if (zF || objK2 == obj3) {
                Object rp2Var = new rp2(dwVar, gwVar, dwVar.a(), new df1(), gwVar.a(), pp2Var);
                ux2Var.g0(rp2Var);
                objK2 = rp2Var;
            }
            rp2 rp2Var2 = (rp2) objK2;
            boolean z2 = (i4 == 1048576) | ((i3 & 29360128) == 8388608) | ((i3 & 458752) == 131072);
            Object objK3 = ux2Var.K();
            Object obj4 = objK3;
            if (z2 || objK3 == obj3) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new yy0(-1192950673, true, new np2(yy0Var, (byte) 0)));
                xz2Var.getClass();
                ux2Var.g0(arrayList);
                obj4 = arrayList;
            }
            yy0 yy0VarQ = zu1.q((List) obj4);
            boolean zF2 = ux2Var.f(rp2Var2);
            Object objK4 = ux2Var.K();
            if (zF2 || objK4 == obj3) {
                objK4 = new ru4(rp2Var2);
                ux2Var.g0(objK4);
            }
            do4 do4Var = (do4) objK4;
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
            o67.n(do4Var, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            yy0VarQ.invoke(ux2Var, 0);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new a50(fs4Var, dwVar, gwVar, xz2Var, yy0Var, i);
        }
    }

    public static final void e(fs4 fs4Var, pk7 pk7Var, String str, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        pk7 pk7Var2;
        String str2;
        fs4 fs4Var3;
        final pk7 pk7Var3;
        String str3;
        ux2Var.Y(262569132);
        int i2 = i | 406;
        final byte b2 = 0;
        final byte b3 = 1;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                dl5 dl5Var = new dl5(new jv6((byte) 17), b3);
                we8 we8VarA = id4.a(ux2Var);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                pk7 pk7Var4 = (pk7) g57.t(w86.a.b(pk7.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var);
                fs4Var3 = cs4.b;
                pk7Var3 = pk7Var4;
                str3 = "TVTA-settings-interaction";
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var;
                pk7Var3 = pk7Var;
                str3 = str;
            }
            ux2Var.q();
            Context context = (Context) ux2Var.j(lh.b);
            sk7 sk7Var = new sk7(y57.g(R.string.settings_interaction), y57.g(((Number) pk7Var3.q.getValue()).intValue()), new yk7(R.drawable.interaction), null, 8);
            boolean zH = ux2Var.h(pk7Var3);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                objK = new Function0() { // from class: o.ej3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b4 = b2;
                        f88 f88Var = f88.a;
                        pk7 pk7Var5 = pk7Var3;
                        switch (b4) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(ew6.OnInteractionMethodClicked);
                                pk7Var5.p.setValue(Boolean.TRUE);
                                break;
                            default:
                                pk7Var5.p.setValue(Boolean.FALSE);
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var.g0(objK);
            }
            x37.e(sk7Var, fs4Var3, null, (Function0) objK, str3, ux2Var, 24624, 36);
            fs4 fs4Var4 = fs4Var3;
            String str4 = str3;
            if (((Boolean) pk7Var3.p.getValue()).booleanValue()) {
                ux2Var.W(1062517687);
                String strZ = m77.z(((Number) pk7Var3.q.getValue()).intValue(), ux2Var);
                String strZ2 = m77.z(((Number) pk7Var3.r.getValue()).intValue(), ux2Var);
                boolean zH2 = ux2Var.h(pk7Var3) | ux2Var.h(context);
                Object objK2 = ux2Var.K();
                if (zH2 || objK2 == awVar) {
                    objK2 = new c9((Object) pk7Var3, (Object) context, (byte) 25);
                    ux2Var.g0(objK2);
                }
                hw2 hw2Var = (hw2) objK2;
                boolean zH3 = ux2Var.h(pk7Var3);
                Object objK3 = ux2Var.K();
                if (zH3 || objK3 == awVar) {
                    objK3 = new Function0() { // from class: o.ej3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b4 = b3;
                            f88 f88Var = f88.a;
                            pk7 pk7Var5 = pk7Var3;
                            switch (b4) {
                                case 0:
                                    IStatisticsHandler iStatisticsHandler = ga7.a;
                                    ga7.a(ew6.OnInteractionMethodClicked);
                                    pk7Var5.p.setValue(Boolean.TRUE);
                                    break;
                                default:
                                    pk7Var5.p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(objK3);
                }
                ep1.d(strZ, strZ2, hw2Var, (Function0) objK3, null, ux2Var, 0);
                ux2Var.p(false);
            } else {
                ux2Var.W(1063193270);
                ux2Var.p(false);
            }
            fs4Var2 = fs4Var4;
            pk7Var2 = pk7Var3;
            str2 = str4;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            pk7Var2 = pk7Var;
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9(fs4Var2, (Object) pk7Var2, (Object) str2, i, (byte) 14);
        }
    }

    public static final void f(final w14 w14Var, final j74 j74Var, final boolean z, final Function0 function0, final f74 f74Var, fs4 fs4Var, final g74 g74Var, final c74 c74Var, final p74 p74Var, final long j, final iw2 iw2Var, ux2 ux2Var, final int i) {
        int i2;
        Function0 function1;
        f74 f74Var2;
        final fs4 fs4Var2;
        fs4 fs4Var3;
        Object obj;
        boolean z2;
        j74 j74Var2;
        ux2 ux2Var2 = ux2Var;
        f74Var.getClass();
        ux2Var2.Y(-1131171317);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.f(w14Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.f(j74Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function1 = function0;
            i2 |= ux2Var2.h(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if ((i & 24576) == 0) {
            f74Var2 = f74Var;
            i2 |= ux2Var2.f(f74Var2) ? 16384 : 8192;
        } else {
            f74Var2 = f74Var;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= ux2Var2.d(g74Var.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ux2Var2.d(c74Var == null ? -1 : c74Var.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= ux2Var2.f(p74Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= ux2Var2.e(j) ? 536870912 : 268435456;
        }
        if (ux2Var2.N(i3 & 1, ((306783379 & i3) == 306783378 && ((ux2Var2.h(iw2Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            ux2Var2.S();
            int i4 = i & 1;
            fs4 fs4VarS = cs4.b;
            if (i4 == 0 || ux2Var2.x()) {
                fs4Var3 = fs4VarS;
            } else {
                ux2Var2.Q();
                fs4Var3 = fs4Var;
            }
            ux2Var2.q();
            e87 e87VarA0 = db8.A0(0.0f, 400.0f, null, 5);
            Map map = sg8.a;
            fs4 fs4VarF = fs4Var3.f(new y24(e87VarA0, db8.A0(0.0f, 400.0f, new vk3(4294967297L), 1), db8.A0(0.0f, 400.0f, null, 5)));
            if (z && !z68.a(j, rv0.h)) {
                fs4VarS = au8.s(fs4VarS, j, kh.V);
            }
            fs4 fs4VarF2 = fs4VarF.f(fs4VarS);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int i5 = i3;
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarF2);
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
            o67.n(fs4VarS2, d82.t, ux2Var);
            int iOrdinal = g74Var.ordinal();
            if (iOrdinal == 0) {
                obj = null;
                z2 = false;
                ux2Var.W(1648299406);
                int i6 = i5 >> 12;
                j74Var2 = j74Var;
                l47.f(j74Var2, z, function0, c74Var, p74Var, f74Var, null, ux2Var, ((i5 >> 3) & 1022) | (i6 & 7168) | (i6 & 57344) | ((i5 << 3) & 458752));
                ux2Var.p(false);
            } else {
                if (iOrdinal != 1) {
                    throw fx3.m(1648297800, ux2Var, false);
                }
                ux2Var.W(1648308330);
                int i7 = i5 >> 12;
                j74Var2 = j74Var;
                obj = null;
                z2 = false;
                us1.k(j74Var2, z, function1, c74Var, p74Var, f74Var2, null, ux2Var, ((i5 >> 3) & 1022) | (i7 & 7168) | (i7 & 57344) | ((i5 << 3) & 458752));
                ux2Var.p(false);
            }
            vn4.H((!z || iw2Var == null) ? z2 : true, null, wb2.d(db8.A0(1.0f, 400.0f, obj, 4), 14), wb2.j(db8.A0(1.0f, 400.0f, obj, 4), 14), null, au8.O(438104793, new sd(iw2Var, j74Var2, (byte) 6), ux2Var), ux2Var, 1600518, 18);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = fs4Var3;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.y74
                @Override // o.hw2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = yo1.Y(i | 1);
                    lq1.f(w14Var, j74Var, z, function0, f74Var, fs4Var2, g74Var, c74Var, p74Var, j, iw2Var, (ux2) obj2, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void g(SupportSession supportSession, fs4 fs4Var, xy6 xy6Var, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final Function0 function4, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        xy6 xy6Var2;
        xy6 xy6VarR;
        int i2;
        fs4 fs4Var3;
        String joinSessionUrlForRecipient;
        ux2Var.Y(315503289);
        int i3 = i | (ux2Var.h(supportSession) ? 4 : 2) | 176 | (ux2Var.h(function0) ? 2048 : 1024) | (ux2Var.h(function1) ? 16384 : 8192) | (ux2Var.h(function2) ? 131072 : 65536);
        if (ux2Var.N(i3 & 1, (4793491 & i3) != 4793490)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i2 = i3 & (-897);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                xy6VarR = xy6Var;
                i2 = i3 & (-897);
                fs4Var3 = fs4Var;
            }
            ux2Var.q();
            if (supportSession == null || (joinSessionUrlForRecipient = supportSession.getJoinSessionUrlForRecipient()) == null) {
                joinSessionUrlForRecipient = "";
            }
            final String strValueOf = supportSession != null ? String.valueOf(supportSession.getSessioncode()) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            boolean zF = ux2Var.f(joinSessionUrlForRecipient);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (zF || objK == awVar) {
                objK = wf7.a.d(joinSessionUrlForRecipient, "");
                ux2Var.g0(objK);
            }
            final String str = (String) objK;
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new fk6((byte) 26);
                ux2Var.g0(objK2);
            }
            xy6 xy6Var3 = xy6VarR;
            yo1.k(function2, cp6.a(fs4Var3, false, (Function1) objK2), xy6Var3, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-1972883689, new iw2() { // from class: o.pr6
                @Override // o.iw2
                public final Object d(Object obj, Object obj2, Object obj3) {
                    ux2 ux2Var2 = (ux2) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((lw0) obj).getClass();
                    if (ux2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        w50 w50Var = xz2.B;
                        cs4 cs4Var = cs4.b;
                        fs4 fs4VarF = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 16.0f, 0.0f, 16.0f, 16.0f, 2);
                        hk6 hk6VarW = im3.W(ux2Var2);
                        Object objK3 = ux2Var2.K();
                        if (objK3 == e01.a) {
                            objK3 = ck3.w(ux2Var2);
                            ux2Var2.g0(objK3);
                        }
                        fs4 fs4VarA = androidx.compose.ui.platform.a.a(o77.t(fs4VarF, hk6VarW, (me1) objK3), "TVTA-serviceQueue-share-bottomSheet");
                        kw0 kw0VarA = iw0.a(iq8.c, w50Var, ux2Var2, 48);
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
                        o67.n(kw0VarA, d82.v, ux2Var2);
                        o67.n(yj5VarL, d82.u, ux2Var2);
                        o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                        o67.l(ux2Var2);
                        o67.n(fs4VarS, d82.t, ux2Var2);
                        String strZ = m77.z(R.string.service_queue_share_session_title, ux2Var2);
                        h72 h72Var = un4.a;
                        qs7.b(strZ, androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), "TVTA-serviceQueue-share-bottomSheetTitle"), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.g, ux2Var2, 48, 0, 131068);
                        lv1.k(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0.0f, 0L, ux2Var2, 6, 6);
                        qs7.b(m77.z(R.string.service_queue_share_session_description, ux2Var2), androidx.compose.ui.platform.a.a(ka0.F(cs4Var, 16.0f, 0.0f, 16.0f, 16.0f, 2), "TVTA-serviceQueue-share-bottomSheetDescription"), ((rn4) ux2Var2.j(h72Var)).a.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var2, 48, 0, 131064);
                        wf7.b(str, qs1.M(strValueOf), ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), function0, function1, function3, function4, function2, ux2Var2, 384, 0);
                        ux2Var2.p(true);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), ux2Var, (i2 >> 15) & 14, 3072, 8184);
            fs4Var2 = fs4Var3;
            xy6Var2 = xy6Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ue5(supportSession, fs4Var2, xy6Var2, function0, function1, function2, function3, function4, i, (byte) 2);
        }
    }

    public static final void h(jw4 jw4Var, int i) {
        if (jw4Var.b == 0 || !(jw4Var.c(0) == i || jw4Var.c(jw4Var.b - 1) == i)) {
            int i2 = jw4Var.b;
            jw4Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = jw4Var.c(i3);
                if (i <= iC) {
                    break;
                }
                jw4Var.f(i2, iC);
                i2 = i3;
            }
            jw4Var.f(i2, i);
        }
    }

    public static final long i(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : ct1.w(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final void m(WorkDatabase workDatabase, d11 d11Var, dm8 dm8Var) {
        int i;
        workDatabase.getClass();
        d11Var.getClass();
        ArrayList arrayListN = qf0.N(dm8Var);
        int i2 = 0;
        while (!arrayListN.isEmpty()) {
            List list = ((dm8) qv0.e0(arrayListN)).d;
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((e95) it.next()).b.j.i.isEmpty() && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        int iIntValue = ((Number) au8.M(workDatabase.w().a, true, false, new yb8((byte) 10))).intValue();
        if (iIntValue + i2 <= 8) {
            return;
        }
        hk0.g(fx3.d(iIntValue, i2, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                ye4.a.g("FileHelper", "IOException during close");
            }
        }
    }

    public static final long p(long j) {
        long j2 = (j << 1) + 1;
        c72.n.getClass();
        int i = e72.a;
        return j2;
    }

    public static int q(HandwritingGesture handwritingGesture, y46 y46Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        y46Var.invoke(new cx0(fallbackText, 1));
        return 5;
    }

    public static final l33 r(z31 z31Var, List list) {
        l33 l33Var;
        String str = z31Var.d;
        list.getClass();
        Iterator it = z31Var.c.iterator();
        do {
            l33Var = null;
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            l33Var = null;
            if (it.hasNext()) {
                String str2 = (String) it.next();
                switch (z31Var.j.ordinal()) {
                    case 0:
                    case 1:
                        Integer numO = bc7.O(str2);
                        for (Object obj5 : list) {
                            k33 k33Var = ((l33) obj5).a;
                            i33 i33Var = k33Var instanceof i33 ? (i33) k33Var : null;
                            if (im3.n(i33Var != null ? Integer.valueOf(i33Var.m) : null, numO)) {
                                obj4 = obj5;
                                l33Var = (l33) obj4;
                                break;
                            }
                        }
                        l33Var = (l33) obj4;
                        break;
                    case 2:
                        UUID uuidO = O(str2);
                        for (Object obj6 : list) {
                            k33 k33Var2 = ((l33) obj6).a;
                            j33 j33Var = k33Var2 instanceof j33 ? (j33) k33Var2 : null;
                            if (im3.n(j33Var != null ? j33Var.m : null, uuidO)) {
                                obj3 = obj6;
                                l33Var = (l33) obj3;
                                break;
                            }
                        }
                        l33Var = (l33) obj3;
                        break;
                    case 3:
                    case 6:
                        break;
                    case 4:
                        UUID uuidO2 = O(str);
                        for (Object obj7 : list) {
                            k33 k33Var3 = ((l33) obj7).a;
                            j33 j33Var2 = k33Var3 instanceof j33 ? (j33) k33Var3 : null;
                            if (im3.n(j33Var2 != null ? j33Var2.m : null, uuidO2)) {
                                obj2 = obj7;
                                l33Var = (l33) obj2;
                                break;
                            }
                        }
                        l33Var = (l33) obj2;
                        break;
                    case 5:
                        Integer numO2 = bc7.O(str);
                        for (Object obj8 : list) {
                            k33 k33Var4 = ((l33) obj8).a;
                            i33 i33Var2 = k33Var4 instanceof i33 ? (i33) k33Var4 : null;
                            if (im3.n(i33Var2 != null ? Integer.valueOf(i33Var2.m) : null, numO2)) {
                                obj = obj8;
                                l33Var = (l33) obj;
                                break;
                            }
                        }
                        l33Var = (l33) obj;
                        break;
                    default:
                        gk0.s();
                        return null;
                }
            }
            return l33Var;
        } while (l33Var == null);
        return l33Var;
    }

    public static final int t(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final boolean u(float f, float f2, rj rjVar) {
        v56 v56Var = new v56(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        rj rjVarA = tj.a();
        rj.b(rjVarA, v56Var);
        rj rjVarA2 = tj.a();
        rjVarA2.f(rjVar, rjVarA, 1);
        boolean zIsEmpty = rjVarA2.a.isEmpty();
        rjVarA2.g();
        rjVarA.g();
        return !zIsEmpty;
    }

    public static final boolean v(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float w(il5 il5Var, boolean z, e63[] e63VarArr, float f) {
        float f2 = Float.NaN;
        for (e63 e63Var : e63VarArr) {
            float fA = il5Var.a(e63Var);
            if (Float.isNaN(f2)) {
                f2 = fA;
            } else if (z == (fA > f2)) {
                f2 = fA;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[LOOP:7: B:106:0x0197->B:107:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x0221  */
    /* JADX WARN: Code duplicated, block: B:139:0x0225  */
    /* JADX WARN: Code duplicated, block: B:141:0x0229  */
    /* JADX WARN: Code duplicated, block: B:143:0x022d  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0235  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:149:0x023a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0213 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0192 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    public static long x(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        g72 g72Var;
        char cCharAt2;
        g72 g72Var2;
        long jI;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        double d;
        long jT0;
        char cCharAt3;
        int i16;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i17;
        int i18;
        char cCharAt7;
        if (str.length() == 0) {
            hk0.g("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i19 = 1;
        char c2 = '-';
        char c3 = '+';
        if (cCharAt8 != '+') {
            i2 = cCharAt8 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            hk0.g("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            hk0.g("");
            return 0L;
        }
        int i20 = i2 + 1;
        if (i20 == str.length()) {
            hk0.g("");
            return 0L;
        }
        int i21 = 0;
        g72 g72Var3 = null;
        long jC = 0;
        long j3 = 0;
        while (i20 < str.length()) {
            char cCharAt9 = str.charAt(i20);
            if (cCharAt9 != 'T') {
                zf4 zf4Var = zf4.c;
                int i22 = i19;
                char cCharAt10 = str.charAt(i20);
                if (cCharAt10 != c3) {
                    if (cCharAt10 != c2) {
                        i3 = i20;
                    } else {
                        i3 = i20 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt6 = str.charAt(i3);
                            i5 = i20;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i17 = cCharAt6 - '0';
                                i18 = i;
                                long j4 = zf4Var.a;
                                if (j > j4 || (j == j4 && i17 > zf4Var.b)) {
                                    i6 = i18;
                                    while (i3 < str.length() && '0' <= (cCharAt7 = str.charAt(i3)) && cCharAt7 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i22 : 0)) {
                                            j = 4611686018427387903L;
                                        }
                                    }
                                    hk0.g("");
                                    return 0L;
                                }
                                j = (j << 3) + (j << i22) + ((long) i17);
                                i3++;
                                i20 = i5;
                                zf4Var = zf4Var;
                                i = i18;
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            g72Var = g72.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                for (i9 = i8; i9 < iMin; i9++) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        iMin2 = Math.min(i9 + 9, str.length());
                                        i12 = i9;
                                        i13 = 0;
                                        while (true) {
                                            if (i12 < iMin2) {
                                                i16 = iMin2;
                                                cCharAt4 = str.charAt(i12);
                                                i14 = i12;
                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                    i12 = i14 + 1;
                                                    iMin2 = i16;
                                                }
                                            } else {
                                                i14 = i12;
                                            }
                                        }
                                        for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        i3 = i14;
                                        while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                                            i3++;
                                        }
                                        if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                            hk0.g("");
                                            return 0L;
                                        }
                                        long j5 = (((long) i10) * 1000000000) + ((long) i13);
                                        long j6 = i4;
                                        double d2 = j5;
                                        switch (g72Var.ordinal()) {
                                            case 0:
                                                d = 1.0E-15d;
                                                jT0 = vn4.t0(d2 * d);
                                                break;
                                            case 1:
                                                d = 1.0E-12d;
                                                jT0 = vn4.t0(d2 * d);
                                                break;
                                            case 2:
                                                d = 1.0E-9d;
                                                jT0 = vn4.t0(d2 * d);
                                                break;
                                            case 3:
                                                d = 1.0E-6d;
                                                jT0 = vn4.t0(d2 * d);
                                                break;
                                            case 4:
                                                d = 6.0E-5d;
                                                jT0 = vn4.t0(d2 * d);
                                                break;
                                            case 5:
                                                d = 0.0036d;
                                                jT0 = vn4.t0(d2 * d);
                                                break;
                                            case 6:
                                                d = 0.0864d;
                                                jT0 = vn4.t0(d2 * d);
                                                break;
                                            default:
                                                hk0.f(g72Var, "Unknown unit: ");
                                                jT0 = 0;
                                                break;
                                        }
                                        j3 = jT0 * j6;
                                    } else {
                                        i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                    }
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                hk0.g("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            g72Var2 = g72.DAYS;
                            if (cCharAt2 == 'D') {
                                g72Var = g72Var2;
                            } else if (cCharAt2 == 'H') {
                                g72Var = g72.HOURS;
                            } else if (cCharAt2 == 'M') {
                                g72Var = g72.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                g72Var = null;
                            }
                            if (g72Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (g72Var3 == null && g72Var3.compareTo(g72Var) <= 0) {
                                hk0.g("Unexpected order of duration components");
                                return 0L;
                            }
                            if (g72Var == g72Var2) {
                                if (i21 != 0) {
                                    hk0.g("");
                                    return 0L;
                                }
                                jC = ds1.C(j2, g72Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    hk0.g("");
                                    return 0L;
                                }
                                jI = i(jC, ds1.C(j2, g72Var) * ((long) i4));
                                if (jI == 9223372036854759646L) {
                                    hk0.g("");
                                    return 0L;
                                }
                                jC = jI;
                            }
                            i20 = i3 + 1;
                            g72Var3 = g72Var;
                            i19 = i22;
                            i = i6;
                            c2 = '-';
                            c3 = '+';
                        } else {
                            i5 = i20;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i7 = i22;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            g72Var = g72.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i16 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i16;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i3 = i14;
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    hk0.g("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                hk0.g("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            g72Var2 = g72.DAYS;
                            if (cCharAt2 == 'D') {
                                g72Var = g72Var2;
                            } else if (cCharAt2 == 'H') {
                                g72Var = g72.HOURS;
                            } else if (cCharAt2 == 'M') {
                                g72Var = g72.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                g72Var = null;
                            }
                            if (g72Var == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (g72Var3 == null) {
                            }
                            if (g72Var == g72Var2) {
                                if (i21 != 0) {
                                    hk0.g("");
                                    return 0L;
                                }
                                jC = ds1.C(j2, g72Var) * ((long) i4);
                            } else {
                                if (i21 == 0) {
                                    hk0.g("");
                                    return 0L;
                                }
                                jI = i(jC, ds1.C(j2, g72Var) * ((long) i4));
                                if (jI == 9223372036854759646L) {
                                    hk0.g("");
                                    return 0L;
                                }
                                jC = jI;
                            }
                            i20 = i3 + 1;
                            g72Var3 = g72Var;
                            i19 = i22;
                            i = i6;
                            c2 = '-';
                            c3 = '+';
                        }
                        hk0.g("");
                        return 0L;
                    }
                }
                i3 = i20 + 1;
                i4 = i22;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        i5 = i20;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        i5 = i20;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt9 != '+') {
                            i7 = i22;
                        } else {
                            i7 = i22;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        cCharAt = str.charAt(i3);
                        g72Var = g72.SECONDS;
                        if (cCharAt == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt5 = str.charAt(i9);
                                if ('0' <= cCharAt5) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i16 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i16;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i3 = i14;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                hk0.g("");
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                if (i12 < iMin2) {
                                    i16 = iMin2;
                                    cCharAt4 = str.charAt(i12);
                                    i14 = i12;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i14 = i12;
                                }
                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                i12 = i14 + 1;
                                iMin2 = i16;
                            }
                            while (i15 < 9 - (i14 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i3 = i14;
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            hk0.g("");
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i3);
                        g72Var2 = g72.DAYS;
                        if (cCharAt2 == 'D') {
                            g72Var = g72Var2;
                        } else if (cCharAt2 == 'H') {
                            g72Var = g72.HOURS;
                        } else if (cCharAt2 == 'M') {
                            g72Var = g72.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            g72Var = null;
                        }
                        if (g72Var == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (g72Var3 == null) {
                        }
                        if (g72Var == g72Var2) {
                            if (i21 != 0) {
                                hk0.g("");
                                return 0L;
                            }
                            jC = ds1.C(j2, g72Var) * ((long) i4);
                        } else {
                            if (i21 == 0) {
                                hk0.g("");
                                return 0L;
                            }
                            jI = i(jC, ds1.C(j2, g72Var) * ((long) i4));
                            if (jI == 9223372036854759646L) {
                                hk0.g("");
                                return 0L;
                            }
                            jC = jI;
                        }
                        i20 = i3 + 1;
                        g72Var3 = g72Var;
                        i19 = i22;
                        i = i6;
                        c2 = '-';
                        c3 = '+';
                    }
                    hk0.g("");
                    return 0L;
                    j = (j << 3) + (j << i22) + ((long) i17);
                    i3++;
                    i20 = i5;
                    zf4Var = zf4Var;
                    i = i18;
                }
            } else {
                if (i21 != 0 || (i20 = i20 + 1) == str.length()) {
                    hk0.g("");
                    return 0L;
                }
                i21 = i19;
            }
        }
        int i23 = i;
        long jF = c72.f(L(jC, g72.MILLISECONDS), L(j3, g72.NANOSECONDS));
        return (i23 == 0 || jF == c72.q) ? jF : c72.h(jF);
    }

    public static void y(long j, xo xoVar, boolean z, y46 y46Var) {
        if (z) {
            int i = gt7.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(xoVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < xoVar.n.length() ? Character.codePointAt(xoVar, iCharCount2) : 10;
            if (ds1.W(iCodePointBefore) && (ds1.V(iCodePointAt) || ds1.U(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(xoVar, iCharCount);
                    }
                } while (ds1.W(iCodePointBefore));
                j = h57.a(iCharCount, iCharCount2);
            } else if (ds1.W(iCodePointAt) && (ds1.V(iCodePointBefore) || ds1.U(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == xoVar.n.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(xoVar, iCharCount2);
                    }
                } while (ds1.W(iCodePointAt));
                j = h57.a(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        y46Var.invoke(new u43(new e82[]{new dv6(i2, i2), new dn1(gt7.d(j), 0)}));
    }

    public static final int z(int i, String str) {
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }

    public abstract lq1 j(char c2);

    public abstract lq1 k(CharSequence charSequence);

    public abstract lq1 l(char[] cArr, int i);

    public boolean o(ax5 ax5Var) {
        return false;
    }

    public Object s() {
        throw new IllegalStateException("");
    }
}
