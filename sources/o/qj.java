package o;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class qj implements ef5 {
    public final String m;
    public final ot7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f1835o;
    public final List p;
    public final mr2 q;
    public final in1 r;
    public final hl s;
    public final CharSequence t;
    public final o04 u;
    public y58 v;
    public final boolean w;
    public final int x;
    public final int y;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:241:0x0485  */
    /* JADX WARN: Code duplicated, block: B:247:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:253:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:254:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:256:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:257:0x04de  */
    /* JADX WARN: Code duplicated, block: B:260:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:263:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:264:0x0505  */
    /* JADX WARN: Code duplicated, block: B:268:0x0532  */
    /* JADX WARN: Code duplicated, block: B:270:0x053e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0554  */
    /* JADX WARN: Code duplicated, block: B:292:0x056f  */
    /* JADX WARN: Code duplicated, block: B:295:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:297:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:300:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:302:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:304:0x05f0 A[LOOP:8: B:303:0x05ee->B:304:0x05f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x0608  */
    /* JADX WARN: Code duplicated, block: B:309:0x060d  */
    /* JADX WARN: Code duplicated, block: B:311:0x0614  */
    /* JADX WARN: Code duplicated, block: B:313:0x0618  */
    /* JADX WARN: Code duplicated, block: B:314:0x0621  */
    /* JADX WARN: Code duplicated, block: B:316:0x062a  */
    /* JADX WARN: Code duplicated, block: B:327:0x0662  */
    /* JADX WARN: Code duplicated, block: B:332:0x067f  */
    /* JADX WARN: Code duplicated, block: B:334:0x068b  */
    /* JADX WARN: Code duplicated, block: B:341:0x069f  */
    /* JADX WARN: Code duplicated, block: B:394:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:396:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:398:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:405:0x0802  */
    /* JADX WARN: Code duplicated, block: B:418:0x084f  */
    /* JADX WARN: Code duplicated, block: B:420:0x0860  */
    /* JADX WARN: Code duplicated, block: B:421:0x0865  */
    /* JADX WARN: Code duplicated, block: B:423:0x0870  */
    /* JADX WARN: Code duplicated, block: B:424:0x0877  */
    /* JADX WARN: Code duplicated, block: B:426:0x087b  */
    /* JADX WARN: Code duplicated, block: B:429:0x0884  */
    /* JADX WARN: Code duplicated, block: B:431:0x0890  */
    /* JADX WARN: Code duplicated, block: B:432:0x0893  */
    /* JADX WARN: Code duplicated, block: B:434:0x0897  */
    /* JADX WARN: Code duplicated, block: B:441:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:445:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:447:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:449:0x08f1 A[LOOP:7: B:448:0x08ef->B:449:0x08f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:452:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:454:0x0902  */
    /* JADX WARN: Code duplicated, block: B:457:0x0913  */
    /* JADX WARN: Code duplicated, block: B:469:0x0557 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:447:0x08e3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.qj] */
    public qj(String str, ot7 ot7Var, List list, List list2, mr2 mr2Var, in1 in1Var, boolean z) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        pj pjVar;
        Typeface typeface;
        CharSequence charSequenceG;
        int i2;
        es7 es7Var;
        ArrayList arrayList;
        int size;
        int i3;
        nr2 nr2Var;
        c77 c77Var;
        sd sdVar;
        int size2;
        int i4;
        int[] iArr;
        int size3;
        int i5;
        int i6;
        int i7;
        int i8;
        int size4;
        int i9;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        int i13;
        int size5;
        int i14;
        boolean z2;
        Spannable spannable;
        in1 in1Var2;
        es7 es7Var2;
        float f;
        int size6;
        int i15;
        qj qjVar;
        wo woVar;
        int i16;
        Object obj2;
        kg0 kg0Var;
        float fM;
        long j;
        long jB;
        float fC;
        int size7;
        int i17;
        wo woVar2;
        to toVar;
        int i18;
        int i19;
        int i20;
        wo woVar3;
        Object obj3;
        int i21;
        int i22;
        Spannable spannable2;
        int i23;
        int i24;
        wo woVar4;
        Object obj4;
        c77 c77Var2;
        long j2;
        long j3;
        int i25;
        long jB2;
        float fC2;
        long jB3;
        float fC3;
        gm5 gm5Var;
        gm5 gm5Var2;
        ?? obj5 = new Object();
        obj5.m = str;
        obj5.n = ot7Var;
        obj5.f1835o = list;
        obj5.p = list2;
        obj5.q = mr2Var;
        obj5.r = in1Var;
        float density = in1Var.getDensity();
        hl hlVar = new hl(1);
        ((TextPaint) hlVar).density = density;
        hlVar.b = vp7.b;
        hlVar.c = (byte) 3;
        hlVar.d = lw6.d;
        obj5.s = hlVar;
        boolean zI = wo1.I(ot7Var);
        c77 c77Var3 = ot7Var.a;
        gf5 gf5Var = ot7Var.b;
        byte b = 0;
        if (zI) {
            xc0 xc0Var = e92.a;
            xc0 xc0Var2 = e92.a;
            i97 i97VarL = (i97) xc0Var2.n;
            if (i97VarL == null) {
                if (a92.d()) {
                    i97VarL = xc0Var2.L();
                    xc0Var2.n = i97VarL;
                } else {
                    i97VarL = hm3.u;
                }
            }
            zBooleanValue = ((Boolean) i97VarL.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        obj5.w = zBooleanValue;
        int i26 = gf5Var.b;
        kd4 kd4Var = c77Var3.k;
        if (i26 == 4) {
            i = 2;
        } else if (i26 == 5) {
            i = 3;
        } else if (i26 == 1) {
            i = 0;
        } else if (i26 == 2) {
            i = 1;
        } else {
            if (i26 != 3 && i26 != 0) {
                hk0.l("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((kd4Var == null || (locale = ((jd4) kd4Var.m.get(0)).a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        obj5.x = i;
        obj5.y = -1;
        pj pjVar2 = new pj(obj5, b);
        dt7 dt7Var = gf5Var.i;
        dt7Var = dt7Var == null ? dt7.c : dt7Var;
        hlVar.setFlags(dt7Var.b ? hlVar.getFlags() | 128 : hlVar.getFlags() & (-129));
        int i27 = dt7Var.a;
        if (i27 == 1) {
            hlVar.setFlags(hlVar.getFlags() | 64);
            hlVar.setHinting(0);
        } else if (i27 == 2) {
            hlVar.getFlags();
            hlVar.setHinting(1);
        } else if (i27 == 3) {
            hlVar.getFlags();
            hlVar.setHinting(0);
        } else {
            hlVar.getFlags();
        }
        int size8 = list.size();
        int i28 = 0;
        while (true) {
            if (i28 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i28);
            if (((wo) obj).a instanceof c77) {
                break;
            } else {
                i28++;
            }
        }
        boolean z3 = obj != null;
        long j4 = c77Var3.b;
        ms2 ms2Var = c77Var3.c;
        ks2 ks2Var = c77Var3.d;
        String str2 = c77Var3.g;
        kd4 kd4Var2 = c77Var3.k;
        bs7 bs7Var = c77Var3.a;
        cs7 cs7Var = c77Var3.j;
        long j5 = c77Var3.h;
        long jB4 = qt7.b(j4);
        boolean z4 = z3;
        if (rt7.a(jB4, 4294967296L)) {
            hlVar.setTextSize(in1Var.A0(j4));
        } else if (rt7.a(jB4, 8589934592L)) {
            hlVar.setTextSize(qt7.c(j4) * hlVar.getTextSize());
        }
        nr2 nr2Var2 = c77Var3.f;
        if (nr2Var2 == null && ks2Var == null && ms2Var == null) {
            pjVar = pjVar2;
        } else {
            ms2 ms2Var2 = ms2Var == null ? ms2.f1503o : ms2Var;
            int i29 = ks2Var != null ? ks2Var.a : 0;
            ls2 ls2Var = c77Var3.e;
            int i30 = ls2Var != null ? ls2Var.a : 65535;
            pjVar = pjVar2;
            qj qjVar2 = (qj) pjVar.n;
            c68 c68VarB = ((or2) qjVar2.q).b(nr2Var2, ms2Var2, i29, i30);
            if (c68VarB instanceof c68) {
                Object obj6 = c68VarB.m;
                obj6.getClass();
                typeface = (Typeface) obj6;
            } else {
                y58 y58Var = new y58(c68VarB, qjVar2.v);
                qjVar2.v = y58Var;
                Object obj7 = y58Var.p;
                obj7.getClass();
                typeface = (Typeface) obj7;
            }
            hlVar.setTypeface(typeface);
        }
        if (kd4Var2 != null) {
            kd4 kd4Var3 = kd4.f1251o;
            if (!kd4Var2.equals(vl5.a.y())) {
                ArrayList arrayList3 = new ArrayList(mv0.Z(kd4Var2, 10));
                Iterator it = kd4Var2.m.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((jd4) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                hlVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            hlVar.setFontFeatureSettings(str2);
        }
        if (cs7Var != null && !cs7Var.equals(cs7.c)) {
            hlVar.setTextScaleX(hlVar.getTextScaleX() * cs7Var.a);
            hlVar.setTextSkewX(hlVar.getTextSkewX() + cs7Var.b);
        }
        hlVar.d(bs7Var.b());
        hlVar.c(bs7Var.c(), 9205357640488583168L, bs7Var.a());
        hlVar.f(c77Var3.n);
        hlVar.g(c77Var3.m);
        hlVar.e(c77Var3.p);
        if (rt7.a(qt7.b(j5), 4294967296L) && qt7.c(j5) != 0.0f) {
            float textScaleX = hlVar.getTextScaleX() * hlVar.getTextSize();
            float fA0 = in1Var.A0(j5);
            if (textScaleX != 0.0f) {
                hlVar.setLetterSpacing(fA0 / textScaleX);
            }
        } else if (rt7.a(qt7.b(j5), 8589934592L)) {
            hlVar.setLetterSpacing(qt7.c(j5));
        }
        long j6 = c77Var3.l;
        h40 h40Var = c77Var3.i;
        boolean z5 = z4 && rt7.a(qt7.b(j5), 4294967296L) && qt7.c(j5) != 0.0f;
        long j7 = rv0.h;
        boolean z6 = (z68.a(j6, j7) || z68.a(j6, rv0.g)) ? false : true;
        boolean z7 = (h40Var == null || Float.compare(h40Var.a, 0.0f) == 0) ? false : true;
        c77 c77Var4 = (z5 || z6 || z7) ? new c77(0L, 0L, null, null, null, null, null, z5 ? j5 : qt7.c, z7 ? h40Var : null, null, null, z6 ? j6 : j7, null, null, 63103) : null;
        List list3 = obj5.f1835o;
        if (c77Var4 != null) {
            int size9 = list3.size() + 1;
            ArrayList arrayList4 = new ArrayList(size9);
            int i31 = 0;
            while (i31 < size9) {
                arrayList4.add(i31 == 0 ? new wo(0, obj5.m.length(), c77Var4) : (wo) obj5.f1835o.get(i31 - 1));
                i31++;
            }
            list3 = arrayList4;
        }
        String str3 = obj5.m;
        float textSize = obj5.s.getTextSize();
        ot7 ot7Var2 = obj5.n;
        List list4 = obj5.p;
        in1 in1Var3 = obj5.r;
        boolean z8 = obj5.w;
        String str4 = obj5.m;
        if (obj5.y == -1) {
            obj5.y = (str4.length() > 512 || ub7.R(str4, '\n')) ? 1 : 0;
        }
        nj njVar = oj.a;
        if (z8 && a92.d()) {
            wm5 wm5Var = ot7Var2.c;
            o92 o92Var = (wm5Var == null || (gm5Var2 = wm5Var.b) == null) ? null : new o92(gm5Var2.b);
            charSequenceG = a92.a().g(0, str3.length(), (o92Var != null && o92Var.a == 2) ? 1 : 0, str3);
            charSequenceG.getClass();
        } else {
            charSequenceG = str3;
        }
        if (!list3.isEmpty() || !list4.isEmpty() || !im3.n(ot7Var2.b.d, es7.c) || (ot7Var2.b.c & 1095216660480L) != 0) {
            qjVar = obj5;
            Spannable spannableString = charSequenceG instanceof Spannable ? (Spannable) charSequenceG : new SpannableString(charSequenceG);
            c77 c77Var5 = ot7Var2.a;
            gf5 gf5Var2 = ot7Var2.b;
            if (im3.n(c77Var5.m, vp7.c)) {
                spannableString.setSpan(oj.a, 0, str3.length(), 33);
            }
            wm5 wm5Var2 = ot7Var2.c;
            if (((wm5Var2 == null || (gm5Var = wm5Var2.b) == null) ? false : gm5Var.a) && gf5Var2.f == null) {
                float fN = g77.n(gf5Var2.c, textSize, in1Var3);
                if (!Float.isNaN(fN)) {
                    spannableString.setSpan(new l94(fN), 0, spannableString.length(), 33);
                }
            } else {
                p94 p94Var = gf5Var2.f;
                p94Var = p94Var == null ? p94.d : p94Var;
                float fN2 = g77.n(gf5Var2.c, textSize, in1Var3);
                if (!Float.isNaN(fN2)) {
                    int length = (spannableString.length() == 0 || ub7.c0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i32 = p94Var.b;
                    i2 = 0;
                    spannableString.setSpan(new q94(fN2, length, (i32 & 1) > 0, (i32 & 16) > 0, p94Var.a, p94Var.c), 0, spannableString.length(), 33);
                }
                es7Var = gf5Var2.d;
                if (es7Var != null) {
                    j2 = es7Var.a;
                    j3 = es7Var.b;
                    i25 = i2;
                    if ((qt7.a(j2, h67.k(i25)) || !qt7.a(j3, h67.k(i25))) && (j2 & 1095216660480L) != 0 && (j3 & 1095216660480L) != 0) {
                        jB2 = qt7.b(j2);
                        if (rt7.a(jB2, 4294967296L)) {
                            fC2 = in1Var3.A0(j2);
                        } else if (rt7.a(jB2, 8589934592L)) {
                            fC2 = qt7.c(j2) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        jB3 = qt7.b(j3);
                        if (rt7.a(jB3, 4294967296L)) {
                            fC3 = in1Var3.A0(j3);
                        } else if (rt7.a(jB3, 8589934592L)) {
                            fC3 = qt7.c(j3) * textSize;
                        } else {
                            fC3 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                    }
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                for (i3 = 0; i3 < size; i3++) {
                    woVar4 = (wo) list3.get(i3);
                    obj4 = woVar4.a;
                    if (obj4 instanceof c77) {
                        c77Var2 = (c77) obj4;
                        if (c77Var2.f == null || c77Var2.d != null || c77Var2.c != null || ((c77) obj4).e != null) {
                            arrayList.add(woVar4);
                        }
                    }
                }
                nr2Var = c77Var5.f;
                if (nr2Var != null && c77Var5.d == null && c77Var5.c == null && c77Var5.e == null) {
                    c77Var = null;
                } else {
                    c77Var = new c77(0L, 0L, c77Var5.c, c77Var5.d, c77Var5.e, nr2Var, null, 0L, null, null, null, 0L, null, null, 65475);
                }
                sdVar = new sd(spannableString, pjVar, (byte) 15);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i4 = size2 * 2;
                    iArr = new int[i4];
                    size3 = arrayList.size();
                    for (i5 = 0; i5 < size3; i5++) {
                        wo woVar5 = (wo) arrayList.get(i5);
                        iArr[i5] = woVar5.b;
                        iArr[i5 + size2] = woVar5.c;
                    }
                    if (i4 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i4 != 0) {
                        an4.j("Array is empty.");
                        throw null;
                    }
                    i6 = iArr[0];
                    i7 = 0;
                    while (i7 < i4) {
                        i8 = iArr[i7];
                        if (i8 == i6) {
                            arrayList2 = arrayList;
                            i10 = i7;
                            i11 = i4;
                        } else {
                            size4 = arrayList.size();
                            i9 = 0;
                            while (i9 < size4) {
                                ArrayList arrayList5 = arrayList;
                                wo woVar6 = (wo) arrayList.get(i9);
                                int i33 = i7;
                                i12 = woVar6.b;
                                int i34 = i4;
                                i13 = woVar6.c;
                                if (i12 == i13 && yo.b(i6, i8, i12, i13)) {
                                    c77 c77Var6 = (c77) woVar6.a;
                                    c77Var = c77Var != null ? c77Var.c(c77Var6) : c77Var6;
                                }
                                i9++;
                                arrayList = arrayList5;
                                i7 = i33;
                                i4 = i34;
                            }
                            arrayList2 = arrayList;
                            i10 = i7;
                            i11 = i4;
                            if (c77Var != null) {
                                sdVar.d(c77Var, Integer.valueOf(i6), Integer.valueOf(i8));
                            }
                            i6 = i8;
                        }
                        i7 = i10 + 1;
                        c77Var = c77Var;
                        arrayList = arrayList2;
                        i4 = i11;
                    }
                } else if (!arrayList.isEmpty()) {
                    c77 c77Var7 = (c77) ((wo) arrayList.get(0)).a;
                    sdVar.d(c77Var != null ? c77Var.c(c77Var7) : c77Var7, Integer.valueOf(((wo) arrayList.get(0)).b), Integer.valueOf(((wo) arrayList.get(0)).c));
                }
                size5 = list3.size();
                i14 = 0;
                z2 = false;
                while (i14 < size5) {
                    woVar3 = (wo) list3.get(i14);
                    obj3 = woVar3.a;
                    if (obj3 instanceof c77) {
                        i23 = woVar3.b;
                        int i35 = woVar3.c;
                        if (i23 >= 0 || i23 >= spannableString.length() || i35 <= i23 || i35 > spannableString.length()) {
                            i21 = size5;
                            i22 = i14;
                            z2 = z2;
                            spannable2 = spannableString;
                            in1Var3 = in1Var3;
                        } else {
                            c77 c77Var8 = (c77) obj3;
                            i21 = size5;
                            i22 = i14;
                            long j8 = c77Var8.h;
                            h40 h40Var2 = c77Var8.i;
                            bs7 bs7Var2 = c77Var8.a;
                            if (h40Var2 != null) {
                                spannableString.setSpan(new i40(h40Var2.a, (byte) 0), i23, i35, 33);
                            }
                            g77.o(spannableString, bs7Var2.b(), i23, i35);
                            sb0 sb0VarC = bs7Var2.c();
                            float fA = bs7Var2.a();
                            if (sb0VarC != null) {
                                if (sb0VarC instanceof t57) {
                                    g77.o(spannableString, ((t57) sb0VarC).a, i23, i35);
                                } else {
                                    spannableString.setSpan(new jw6((iw6) sb0VarC, fA), i23, i35, 33);
                                }
                            }
                            vp7 vp7Var = c77Var8.m;
                            if (vp7Var != null) {
                                int i36 = vp7Var.a;
                                wp7 wp7Var = new wp7((i36 | 1) == i36, (i36 | 2) == i36);
                                i24 = 33;
                                spannableString.setSpan(wp7Var, i23, i35, 33);
                            } else {
                                i24 = 33;
                            }
                            g77.p(spannableString, c77Var8.b, in1Var3, i23, i35);
                            spannable2 = spannableString;
                            String str5 = c77Var8.g;
                            if (str5 != null) {
                                spannable2.setSpan(new qr2(str5, (byte) 0), i23, i35, i24);
                            }
                            cs7 cs7Var2 = c77Var8.j;
                            if (cs7Var2 != null) {
                                spannable2.setSpan(new ScaleXSpan(cs7Var2.a), i23, i35, i24);
                                spannable2.setSpan(new i40(cs7Var2.b, (byte) 1), i23, i35, i24);
                            }
                            g77.q(spannable2, c77Var8.k, i23, i35);
                            long j9 = c77Var8.l;
                            if (j9 != 16) {
                                spannable2.setSpan(new BackgroundColorSpan(j51.U(j9)), i23, i35, i24);
                            }
                            lw6 lw6Var = c77Var8.n;
                            if (lw6Var != null) {
                                long j10 = lw6Var.b;
                                int iU = j51.U(lw6Var.a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f2 = lw6Var.c;
                                ow6 ow6Var = new ow6(fIntBitsToFloat, fIntBitsToFloat2, f2 == 0.0f ? Float.MIN_VALUE : f2, iU);
                                i24 = 33;
                                spannable2.setSpan(ow6Var, i23, i35, 33);
                            }
                            v52 v52Var = c77Var8.p;
                            if (v52Var != null) {
                                spannable2.setSpan(new w52(v52Var), i23, i35, i24);
                            }
                            z2 = (rt7.a(qt7.b(j8), 4294967296L) || rt7.a(qt7.b(j8), 8589934592L)) ? true : z2;
                        }
                        z2 = z2;
                    } else {
                        i21 = size5;
                        i22 = i14;
                        z2 = z2;
                        spannable2 = spannableString;
                        in1Var3 = in1Var3;
                        z2 = z2;
                    }
                    i14 = i22 + 1;
                    size5 = i21;
                    spannableString = spannable2;
                    in1Var3 = in1Var3;
                    gf5Var2 = gf5Var2;
                }
                spannable = spannableString;
                gf5 gf5Var3 = gf5Var2;
                in1Var2 = in1Var3;
                if (z2) {
                    size7 = list3.size();
                    i17 = 0;
                    while (i17 < size7) {
                        woVar2 = (wo) list3.get(i17);
                        toVar = (to) woVar2.a;
                        if (toVar instanceof c77) {
                            i20 = woVar2.b;
                            int i37 = woVar2.c;
                            if (i20 >= 0 || i20 >= spannable.length() || i37 <= i20 || i37 > spannable.length()) {
                                i18 = size7;
                                i19 = i17;
                            } else {
                                long j11 = ((c77) toVar).h;
                                long jB5 = qt7.b(j11);
                                i18 = size7;
                                i19 = i17;
                                Object b74Var = rt7.a(jB5, 4294967296L) ? new b74(in1Var2.A0(j11)) : rt7.a(jB5, 8589934592L) ? new a74(qt7.c(j11)) : null;
                                if (b74Var != null) {
                                    spannable.setSpan(b74Var, i20, i37, 33);
                                }
                            }
                        } else {
                            i18 = size7;
                            i19 = i17;
                        }
                        i17 = i19 + 1;
                        size7 = i18;
                    }
                }
                es7Var2 = gf5Var3.d;
                if (es7Var2 != null) {
                    j = es7Var2.a;
                    jB = qt7.b(j);
                    if (rt7.a(jB, 4294967296L)) {
                        fC = in1Var2.A0(j);
                    } else if (rt7.a(jB, 8589934592L)) {
                        fC = qt7.c(j) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    f = fC;
                } else {
                    f = 0.0f;
                }
                size6 = list3.size();
                for (i15 = 0; i15 < size6; i15++) {
                    wo woVar7 = (wo) list3.get(i15);
                    obj2 = woVar7.a;
                    if (obj2 instanceof kg0) {
                        kg0Var = (kg0) obj2;
                    } else {
                        kg0Var = null;
                    }
                    if (kg0Var != null) {
                        fM = g77.m(kg0Var.a, textSize, in1Var2);
                        float fM2 = g77.m(kg0Var.b, textSize, in1Var2);
                        float fM3 = g77.m(kg0Var.c, textSize, in1Var2);
                        if (Float.isNaN(fM) && !Float.isNaN(fM2) && !Float.isNaN(fM3)) {
                            in1 in1Var4 = in1Var2;
                            in1Var2 = in1Var4;
                            spannable.setSpan(new vf1(fM, fM2, fM3, in1Var4, f), woVar7.b, woVar7.c, 33);
                        }
                    }
                }
                if (list4.size() > 0) {
                    woVar = (wo) list4.get(0);
                    if (woVar.a == null) {
                        io.sentry.h2.f();
                        throw null;
                    }
                    for (Object obj8 : spannable.getSpans(woVar.b, woVar.c, a68.class)) {
                        spannable.removeSpan((a68) obj8);
                    }
                    throw null;
                }
                qjVar = this;
                charSequenceG = spannable;
            }
            i2 = 0;
            es7Var = gf5Var2.d;
            if (es7Var != null) {
                j2 = es7Var.a;
                j3 = es7Var.b;
                i25 = i2;
                if (qt7.a(j2, h67.k(i25))) {
                    jB2 = qt7.b(j2);
                    if (rt7.a(jB2, 4294967296L)) {
                        fC2 = in1Var3.A0(j2);
                    } else if (rt7.a(jB2, 8589934592L)) {
                        fC2 = qt7.c(j2) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    jB3 = qt7.b(j3);
                    if (rt7.a(jB3, 4294967296L)) {
                        fC3 = in1Var3.A0(j3);
                    } else if (rt7.a(jB3, 8589934592L)) {
                        fC3 = qt7.c(j3) * textSize;
                    } else {
                        fC3 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                } else {
                    jB2 = qt7.b(j2);
                    if (rt7.a(jB2, 4294967296L)) {
                        fC2 = in1Var3.A0(j2);
                    } else if (rt7.a(jB2, 8589934592L)) {
                        fC2 = qt7.c(j2) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    jB3 = qt7.b(j3);
                    if (rt7.a(jB3, 4294967296L)) {
                        fC3 = in1Var3.A0(j3);
                    } else if (rt7.a(jB3, 8589934592L)) {
                        fC3 = qt7.c(j3) * textSize;
                    } else {
                        fC3 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                }
            }
            arrayList = new ArrayList(list3.size());
            size = list3.size();
            while (i3 < size) {
                woVar4 = (wo) list3.get(i3);
                obj4 = woVar4.a;
                if (obj4 instanceof c77) {
                    c77Var2 = (c77) obj4;
                    if (c77Var2.f == null) {
                        arrayList.add(woVar4);
                    } else {
                        arrayList.add(woVar4);
                    }
                }
            }
            nr2Var = c77Var5.f;
            if (nr2Var != null) {
                c77Var = new c77(0L, 0L, c77Var5.c, c77Var5.d, c77Var5.e, nr2Var, null, 0L, null, null, null, 0L, null, null, 65475);
            } else {
                c77Var = new c77(0L, 0L, c77Var5.c, c77Var5.d, c77Var5.e, nr2Var, null, 0L, null, null, null, 0L, null, null, 65475);
            }
            sdVar = new sd(spannableString, pjVar, (byte) 15);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i4 = size2 * 2;
                iArr = new int[i4];
                size3 = arrayList.size();
                while (i5 < size3) {
                    wo woVar8 = (wo) arrayList.get(i5);
                    iArr[i5] = woVar8.b;
                    iArr[i5 + size2] = woVar8.c;
                }
                if (i4 > 1) {
                    Arrays.sort(iArr);
                }
                if (i4 != 0) {
                    an4.j("Array is empty.");
                    throw null;
                }
                i6 = iArr[0];
                i7 = 0;
                while (i7 < i4) {
                    i8 = iArr[i7];
                    if (i8 == i6) {
                        arrayList2 = arrayList;
                        i10 = i7;
                        i11 = i4;
                    } else {
                        size4 = arrayList.size();
                        i9 = 0;
                        while (i9 < size4) {
                            ArrayList arrayList6 = arrayList;
                            wo woVar9 = (wo) arrayList.get(i9);
                            int i38 = i7;
                            i12 = woVar9.b;
                            int i39 = i4;
                            i13 = woVar9.c;
                            if (i12 == i13) {
                            }
                            i9++;
                            arrayList = arrayList6;
                            i7 = i38;
                            i4 = i39;
                        }
                        arrayList2 = arrayList;
                        i10 = i7;
                        i11 = i4;
                        if (c77Var != null) {
                            sdVar.d(c77Var, Integer.valueOf(i6), Integer.valueOf(i8));
                        }
                        i6 = i8;
                    }
                    i7 = i10 + 1;
                    c77Var = c77Var;
                    arrayList = arrayList2;
                    i4 = i11;
                }
            } else if (!arrayList.isEmpty()) {
                c77 c77Var9 = (c77) ((wo) arrayList.get(0)).a;
                sdVar.d(c77Var != null ? c77Var.c(c77Var9) : c77Var9, Integer.valueOf(((wo) arrayList.get(0)).b), Integer.valueOf(((wo) arrayList.get(0)).c));
            }
            size5 = list3.size();
            i14 = 0;
            z2 = false;
            while (i14 < size5) {
                woVar3 = (wo) list3.get(i14);
                obj3 = woVar3.a;
                if (obj3 instanceof c77) {
                    i23 = woVar3.b;
                    int i310 = woVar3.c;
                    if (i23 >= 0) {
                        i21 = size5;
                        i22 = i14;
                        z2 = z2;
                        spannable2 = spannableString;
                        in1Var3 = in1Var3;
                        z2 = z2;
                    } else {
                        i21 = size5;
                        i22 = i14;
                        z2 = z2;
                        spannable2 = spannableString;
                        in1Var3 = in1Var3;
                        z2 = z2;
                    }
                } else {
                    i21 = size5;
                    i22 = i14;
                    z2 = z2;
                    spannable2 = spannableString;
                    in1Var3 = in1Var3;
                    z2 = z2;
                }
                i14 = i22 + 1;
                size5 = i21;
                spannableString = spannable2;
                in1Var3 = in1Var3;
                gf5Var2 = gf5Var2;
            }
            spannable = spannableString;
            gf5 gf5Var4 = gf5Var2;
            in1Var2 = in1Var3;
            if (z2) {
                size7 = list3.size();
                i17 = 0;
                while (i17 < size7) {
                    woVar2 = (wo) list3.get(i17);
                    toVar = (to) woVar2.a;
                    if (toVar instanceof c77) {
                        i20 = woVar2.b;
                        int i311 = woVar2.c;
                        if (i20 >= 0) {
                            i18 = size7;
                            i19 = i17;
                        } else {
                            i18 = size7;
                            i19 = i17;
                        }
                    } else {
                        i18 = size7;
                        i19 = i17;
                    }
                    i17 = i19 + 1;
                    size7 = i18;
                }
            }
            es7Var2 = gf5Var4.d;
            if (es7Var2 != null) {
                j = es7Var2.a;
                jB = qt7.b(j);
                if (rt7.a(jB, 4294967296L)) {
                    fC = in1Var2.A0(j);
                } else if (rt7.a(jB, 8589934592L)) {
                    fC = qt7.c(j) * textSize;
                } else {
                    fC = 0.0f;
                }
                f = fC;
            } else {
                f = 0.0f;
            }
            size6 = list3.size();
            while (i15 < size6) {
                wo woVar10 = (wo) list3.get(i15);
                obj2 = woVar10.a;
                if (obj2 instanceof kg0) {
                    kg0Var = (kg0) obj2;
                } else {
                    kg0Var = null;
                }
                if (kg0Var != null) {
                    fM = g77.m(kg0Var.a, textSize, in1Var2);
                    float fM4 = g77.m(kg0Var.b, textSize, in1Var2);
                    float fM5 = g77.m(kg0Var.c, textSize, in1Var2);
                    if (Float.isNaN(fM)) {
                    }
                }
            }
            if (list4.size() > 0) {
                woVar = (wo) list4.get(0);
                if (woVar.a == null) {
                    io.sentry.h2.f();
                    throw null;
                }
                while (i16 < r1) {
                    spannable.removeSpan((a68) obj8);
                }
                throw null;
            }
            qjVar = this;
            charSequenceG = spannable;
        }
        qjVar = obj5;
        qjVar.t = charSequenceG;
        qjVar.u = new o04(charSequenceG, qjVar.s, qjVar.x);
    }

    @Override // o.ef5
    public final boolean b() {
        y58 y58Var = this.v;
        if (y58Var != null ? y58Var.a() : false) {
            return true;
        }
        if (!this.w && wo1.I(this.n)) {
            xc0 xc0Var = e92.a;
            xc0 xc0Var2 = e92.a;
            i97 i97VarL = (i97) xc0Var2.n;
            if (i97VarL == null) {
                if (a92.d()) {
                    i97VarL = xc0Var2.L();
                    xc0Var2.n = i97VarL;
                } else {
                    i97VarL = hm3.u;
                }
            }
            if (((Boolean) i97VarL.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.ef5
    public final float c() {
        o04 o04Var = this.u;
        float f = o04Var.e;
        TextPaint textPaint = o04Var.b;
        if (!Float.isNaN(f)) {
            return o04Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = o04Var.a;
        lineInstance.setText(new pn0(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, im3.y);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new yk3(i, next, 1));
            } else {
                yk3 yk3Var = (yk3) priorityQueue.peek();
                if (yk3Var != null && yk3Var.n - yk3Var.m < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new yk3(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                yq4.p();
                return 0.0f;
            }
            yk3 yk3Var2 = (yk3) it.next();
            desiredWidth = Layout.getDesiredWidth(o04Var.b(), yk3Var2.m, yk3Var2.n, textPaint);
            while (it.hasNext()) {
                yk3 yk3Var3 = (yk3) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(o04Var.b(), yk3Var3.m, yk3Var3.n, textPaint));
            }
        }
        o04Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // o.ef5
    public final float i() {
        return this.u.c();
    }
}
