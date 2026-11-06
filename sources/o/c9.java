package o;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c9 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f502o;

    public /* synthetic */ c9(fs4 fs4Var, ce5 ce5Var, d11 d11Var, bo boVar) {
        this.m = (byte) 12;
        this.f502o = fs4Var;
        this.n = d11Var;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0481  */
    /* JADX WARN: Code duplicated, block: B:171:0x0498  */
    /* JADX WARN: Code duplicated, block: B:174:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:180:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:182:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:184:0x04de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x050f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0513  */
    /* JADX WARN: Code duplicated, block: B:198:0x0523 A[LOOP:4: B:194:0x0511->B:198:0x0523, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x0528  */
    /* JADX WARN: Code duplicated, block: B:203:0x0537  */
    /* JADX WARN: Code duplicated, block: B:205:0x053b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x053d  */
    /* JADX WARN: Code duplicated, block: B:210:0x054e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0559 A[LOOP:6: B:212:0x0557->B:213:0x0559, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x0588  */
    /* JADX WARN: Code duplicated, block: B:218:0x058c  */
    /* JADX WARN: Code duplicated, block: B:221:0x05a0 A[LOOP:7: B:217:0x058a->B:221:0x05a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:229:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:231:0x05d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:236:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:239:0x05f1 A[LOOP:9: B:238:0x05ef->B:239:0x05f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x0606  */
    /* JADX WARN: Code duplicated, block: B:249:0x0621  */
    /* JADX WARN: Code duplicated, block: B:252:0x0630  */
    /* JADX WARN: Code duplicated, block: B:253:0x0633  */
    /* JADX WARN: Code duplicated, block: B:260:0x0659  */
    /* JADX WARN: Code duplicated, block: B:265:0x0666  */
    /* JADX WARN: Code duplicated, block: B:268:0x0674 A[LOOP:10: B:267:0x0672->B:268:0x0674, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x0685  */
    /* JADX WARN: Code duplicated, block: B:279:0x06be A[LOOP:11: B:277:0x06aa->B:279:0x06be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:283:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:285:0x06d9 A[LOOP:21: B:284:0x06d7->B:285:0x06d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:288:0x0705 A[LOOP:22: B:287:0x0703->B:288:0x0705, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:291:0x0720 A[LOOP:23: B:290:0x071e->B:291:0x0720, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x0736  */
    /* JADX WARN: Code duplicated, block: B:295:0x0750  */
    /* JADX WARN: Code duplicated, block: B:297:0x0758  */
    /* JADX WARN: Code duplicated, block: B:299:0x0767  */
    /* JADX WARN: Code duplicated, block: B:301:0x077f  */
    /* JADX WARN: Code duplicated, block: B:303:0x0786 A[LOOP:12: B:302:0x0784->B:303:0x0786, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x0798  */
    /* JADX WARN: Code duplicated, block: B:308:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:309:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:312:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:313:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:316:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:318:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:390:0x0900  */
    /* JADX WARN: Code duplicated, block: B:392:0x0909  */
    /* JADX WARN: Code duplicated, block: B:394:0x0911  */
    /* JADX WARN: Code duplicated, block: B:395:0x0918  */
    /* JADX WARN: Code duplicated, block: B:396:0x091b  */
    /* JADX WARN: Code duplicated, block: B:398:0x0921  */
    /* JADX WARN: Code duplicated, block: B:399:0x0924  */
    /* JADX WARN: Code duplicated, block: B:402:0x092e  */
    /* JADX WARN: Code duplicated, block: B:404:0x0936  */
    /* JADX WARN: Code duplicated, block: B:406:0x093e  */
    /* JADX WARN: Code duplicated, block: B:408:0x0949  */
    /* JADX WARN: Code duplicated, block: B:410:0x0951  */
    /* JADX WARN: Code duplicated, block: B:415:0x095f  */
    /* JADX WARN: Code duplicated, block: B:418:0x0981  */
    /* JADX WARN: Code duplicated, block: B:419:0x0986  */
    /* JADX WARN: Code duplicated, block: B:421:0x0989  */
    /* JADX WARN: Code duplicated, block: B:422:0x098e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0995  */
    /* JADX WARN: Code duplicated, block: B:426:0x0998  */
    /* JADX WARN: Code duplicated, block: B:428:0x09a4  */
    /* JADX WARN: Code duplicated, block: B:436:0x09c6 A[LOOP:19: B:435:0x09c4->B:436:0x09c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:440:0x0a01  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a05  */
    /* JADX WARN: Code duplicated, block: B:465:0x052c A[EDGE_INSN: B:465:0x052c->B:200:0x052c BREAK  A[LOOP:4: B:194:0x0511->B:198:0x0523], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0549 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x05af A[EDGE_INSN: B:470:0x05af->B:223:0x05af BREAK  A[LOOP:7: B:217:0x058a->B:221:0x05a0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x05df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x06c3 A[EDGE_INSN: B:476:0x06c3->B:280:0x06c3 BREAK  A[LOOP:11: B:277:0x06aa->B:279:0x06be], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x04fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x04f9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final Object c(Object obj, Object obj2) {
        ae aeVar;
        int i;
        int iMin;
        jw4 jw4Var;
        long j;
        int iMax;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        int i6;
        int i7;
        p44 p44Var;
        int iA;
        int i8;
        float f5;
        p44 p44Var2;
        int i9;
        int i10;
        int i11;
        boolean z;
        int i12;
        int iA2;
        int iMax2;
        int i13;
        boolean z2;
        List arrayList;
        int[] iArr;
        int i14;
        int size;
        int iMax3;
        int i15;
        int iMin2;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList2;
        int[] iArr2;
        int i19;
        List arrayList3;
        int i20;
        int size2;
        int iMax4;
        int i21;
        boolean z3;
        int iG;
        int iF;
        boolean z4;
        boolean z5;
        ArrayList arrayList4;
        int i22;
        r34 r34Var;
        int size3;
        int i23;
        int i24;
        r34 r34Var2;
        int iA3;
        int iA4;
        int i25;
        int size4;
        int i26;
        ArrayList arrayList5;
        m34 m34Var;
        int i27;
        boolean z6;
        float f6;
        Object obj3;
        p44 p44Var3;
        int i28;
        p44 p44Var4;
        int i29;
        float f7;
        int i30;
        boolean z7;
        List list;
        Object obj4;
        p44 p44Var5;
        Integer numValueOf;
        p44 p44Var6;
        boolean z8;
        int iIntValue;
        int iIntValue2;
        int size5;
        int i31;
        List list2;
        int i32;
        int size6;
        int i33;
        int i34;
        o44 o44Var;
        md7 md7Var;
        p44 p44Var7;
        p44 p44Var8;
        int i35;
        jw4 jw4Var2;
        int i36;
        int i37;
        Object obj5;
        int i38;
        int iMax5;
        int i39;
        int iC;
        long jA;
        int iF2;
        int size7;
        int i40;
        int iA5;
        int[] iArr3;
        int i41;
        int[] iArr4;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        ArrayList arrayList6;
        int i47;
        int i48;
        o34 o34Var = (o34) this.n;
        n44 n44Var = (n44) this.f502o;
        md7 md7Var2 = (md7) obj;
        r34 r34Var3 = new r34(o34Var, md7Var2);
        long j2 = ((r61) obj2).a;
        n44Var.getClass();
        gw gwVar = n44Var.d;
        nd5 nd5Var = n44Var.b;
        w44 w44Var = n44Var.a;
        w44Var.t.getValue();
        boolean z9 = w44Var.b || md7Var2.b0();
        gb5 gb5Var = gb5.m;
        xk0.m(j2, gb5Var);
        int iQ0 = md7Var2.q0(nd5Var.a(md7Var2.getLayoutDirection()));
        int iQ1 = md7Var2.q0(nd5Var.b(md7Var2.getLayoutDirection()));
        int iQ2 = md7Var2.q0(nd5Var.d());
        int iQ3 = md7Var2.q0(nd5Var.c()) + iQ2;
        int i49 = iQ1 + iQ0;
        int i50 = iQ3 - iQ2;
        long jI = t61.i(-i49, -iQ3, j2);
        i44 i44Var = (i44) n44Var.c.a();
        w14 w14Var = i44Var.c;
        int i51 = r61.i(jI);
        int iH = r61.h(jI);
        w14Var.a.A(i51);
        w14Var.b.A(iH);
        if (gwVar == null) {
            throw fx3.l("null verticalArrangement when isVertical == true");
        }
        int iQ4 = md7Var2.q0(gwVar.a());
        int iC2 = i44Var.c();
        int iH2 = r61.h(j2) - iQ3;
        m44 m44Var = new m44(jI, i44Var, r34Var3, iC2, iQ4, n44Var.h, iQ2, i50, (((long) iQ0) << 32) | (((long) iQ2) & 4294967295L), n44Var.a);
        i44 i44Var2 = m44Var.b;
        ae aeVar2 = i44Var2.d;
        n47 n47VarC = el5.c();
        Integer numValueOf2 = null;
        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
        n47 n47VarF = el5.f(n47VarC);
        try {
            int iH3 = w44Var.h();
            ll2 ll2Var = w44Var.e;
            int iA6 = us1.A(iH3, ll2Var.p, i44Var);
            if (iH3 != iA6) {
                aeVar = aeVar2;
                ((yf5) ll2Var.n).A(iA6);
                s34 s34Var = (s34) ll2Var.q;
                if (iH3 != s34Var.n) {
                    s34Var.n = iH3;
                    int i52 = (iH3 / 30) * 30;
                    s34Var.m.setValue(ct1.b0(Math.max(i52 - 100, 0), i52 + 130));
                }
            } else {
                aeVar = aeVar2;
            }
            int i53 = w44Var.i();
            el5.h(n47VarC, n47VarF, function1E);
            u34 u34Var = w44Var.s;
            eb0 eb0Var = w44Var.p;
            c2 c2Var = xk0.x(u34Var.m).c;
            xx4 xx4Var = eb0Var.a;
            if ((xx4Var.f2559o != 0) || !c2Var.isEmpty()) {
                jw4 jw4Var3 = new jw4();
                if (eb0Var.a.f2559o != 0) {
                    int i54 = xx4Var.f2559o;
                    if (i54 == 0) {
                        an4.j("MutableVector is empty.");
                        return null;
                    }
                    Object[] objArr = xx4Var.m;
                    int i55 = ((a34) objArr[0]).a;
                    int i56 = 0;
                    while (i56 < i54) {
                        int i57 = i54;
                        int i58 = ((a34) objArr[i56]).a;
                        if (i58 < i55) {
                            i55 = i58;
                        }
                        i56++;
                        i54 = i57;
                    }
                    if (i55 < 0) {
                        ni3.a("negative minIndex");
                    }
                    int i59 = xx4Var.f2559o;
                    if (i59 == 0) {
                        an4.j("MutableVector is empty.");
                        return null;
                    }
                    Object[] objArr2 = xx4Var.m;
                    int i60 = i55;
                    int i61 = ((a34) objArr2[0]).b;
                    int i62 = 0;
                    while (i62 < i59) {
                        int i63 = i59;
                        int i64 = ((a34) objArr2[i62]).b;
                        if (i64 > i61) {
                            i61 = i64;
                        }
                        i62++;
                        i59 = i63;
                    }
                    iMin = Math.min(i61, i44Var.c() - 1);
                    i = i60;
                } else {
                    i = 1;
                    iMin = 0;
                }
                int iA7 = c2Var.a();
                int i65 = 0;
                while (i65 < iA7) {
                    c2 c2Var2 = c2Var;
                    t34 t34Var = (t34) c2Var.get(i65);
                    int i66 = iA7;
                    int iA8 = us1.A(t34Var.c, t34Var.a, i44Var);
                    if ((i > iA8 || iA8 > iMin) && iA8 >= 0 && iA8 < i44Var.c()) {
                        jw4Var3.a(iA8);
                    }
                    i65++;
                    iA7 = i66;
                    c2Var = c2Var2;
                }
                if (i <= iMin) {
                    while (true) {
                        jw4Var3.a(i);
                        if (i == iMin) {
                            break;
                        }
                        i++;
                    }
                }
                int i67 = jw4Var3.b;
                if (i67 != 0) {
                    int[] iArr5 = jw4Var3.a;
                    iArr5.getClass();
                    Arrays.sort(iArr5, 0, i67);
                }
                jw4Var = jw4Var3;
            } else {
                jw4Var = sk3.a;
                i53 = i53;
            }
            float fFloatValue = (md7Var2.b0() || !z9) ? w44Var.h : ((Number) ((ko) w44Var.x.f2642o).n.getValue()).floatValue();
            m34 m34Var2 = w44Var.f2378o;
            boolean zB0 = md7Var2.b0();
            me1 me1Var = n44Var.e;
            px4 px4Var = w44Var.w;
            k03 k03Var = n44Var.f;
            yi5 yi5Var = n44Var.g;
            boolean z10 = w44Var.i;
            if (iQ2 < 0) {
                ni3.a("invalid beforeContentPadding");
            }
            if (i50 < 0) {
                ni3.a("invalid afterContentPadding");
            }
            fa2 fa2Var = fa2.m;
            ea2 ea2Var = ea2.m;
            if (iC2 <= 0) {
                ae aeVar3 = aeVar;
                int iK = r61.k(jI);
                int iJ = r61.j(jI);
                m34Var2.c(0, iK, iJ, new ArrayList(), aeVar3, m44Var, zB0, z9, 0, 0, me1Var, k03Var);
                if (!zB0) {
                    long jA2 = m34Var2.a();
                    if (!dl3.b(jA2, 0L)) {
                        iK = t61.g((int) (jA2 >> 32), jI);
                        iJ = t61.f((int) (jA2 & 4294967295L), jI);
                    }
                }
                md7Var = md7Var2;
                o44Var = new o44(null, 0, false, 0.0f, md7Var.u(t61.g(iK + i49, j2), t61.f(iJ + iQ3, j2), fa2Var, new ek3((byte) 6)), 0.0f, false, me1Var, r34Var3, m44Var.d, 0, ea2Var, -iQ2, iH2 + i50, 0, gb5Var, i50, iQ4);
            } else {
                ae aeVar4 = aeVar;
                m44 m44Var2 = m44Var;
                if (iA6 >= iC2) {
                    iA6 = iC2 - 1;
                    i53 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i68 = i53 - iRound;
                if (iA6 == 0 && i68 < 0) {
                    iRound += i68;
                    i68 = 0;
                }
                float f8 = fFloatValue;
                kw kwVar = new kw();
                int i69 = -iQ2;
                int i70 = iA6;
                int i71 = i69 + (iQ4 < 0 ? iQ4 : 0);
                int iA9 = i68 + i71;
                int iMax6 = 0;
                while (true) {
                    j = m44Var2.d;
                    if (iA9 >= 0 || i70 <= 0) {
                        break;
                    }
                    px4 px4Var2 = px4Var;
                    int i72 = i70 - 1;
                    p44 p44VarA = m44Var2.a(i72, j);
                    kwVar.add(0, p44VarA);
                    iMax6 = Math.max(iMax6, p44VarA.q);
                    iA9 += p44VarA.a();
                    i70 = i72;
                    px4Var = px4Var2;
                }
                px4 px4Var3 = px4Var;
                if (iA9 < i71) {
                    iRound -= i71 - iA9;
                    iA9 = i71;
                }
                int i73 = iRound;
                int i74 = iA9 - i71;
                int i75 = iH2 + i50;
                int i76 = iMax6;
                int i77 = i75 < 0 ? 0 : i75;
                int i78 = i69;
                int i79 = i70;
                boolean z11 = false;
                int i80 = -i74;
                int i81 = 0;
                while (i81 < kwVar.f1309o) {
                    if (i80 >= i77) {
                        kwVar.b(i81);
                        z11 = true;
                    } else {
                        i79++;
                        int iA10 = ((p44) kwVar.get(i81)).a() + i80;
                        i81++;
                        i80 = iA10;
                    }
                }
                int i82 = i80;
                int i83 = i76;
                int iA11 = i74;
                int i84 = i79;
                boolean z12 = z11;
                while (i84 < iC2 && (i82 < i77 || i82 <= 0 || kwVar.isEmpty())) {
                    int i85 = i77;
                    p44 p44VarA2 = m44Var2.a(i84, j);
                    int iA12 = p44VarA2.a() + i82;
                    if (iA12 <= i71) {
                        i48 = iA12;
                        if (i84 != iC2 - 1) {
                            z12 = true;
                            i70 = i84 + 1;
                            iA11 -= p44VarA2.a();
                        }
                        i84++;
                        i77 = i85;
                        i82 = i48;
                    } else {
                        i48 = iA12;
                    }
                    int iMax7 = Math.max(i83, p44VarA2.q);
                    kwVar.addLast(p44VarA2);
                    i83 = iMax7;
                    i84++;
                    i77 = i85;
                    i82 = i48;
                }
                if (i82 < iH2) {
                    int i86 = iH2 - i82;
                    int i87 = i82 + i86;
                    iMax = i83;
                    int iA13 = iA11 - i86;
                    while (iA13 < iQ2 && i70 > 0) {
                        int i88 = i87;
                        int i89 = i70 - 1;
                        int i90 = iA13;
                        p44 p44VarA3 = m44Var2.a(i89, j);
                        i70 = i89;
                        kwVar.add(0, p44VarA3);
                        iMax = Math.max(iMax, p44VarA3.q);
                        iA13 = p44VarA3.a() + i90;
                        i87 = i88;
                    }
                    int i91 = i87;
                    int i92 = iA13;
                    i2 = i86 + i73;
                    if (i92 < 0) {
                        i2 += i92;
                        i82 = i91 + i92;
                        i4 = i70;
                        i3 = 0;
                    } else {
                        i82 = i91;
                        i3 = i92;
                    }
                    i5 = iMax;
                    if (Integer.signum(Math.round(f8)) == Integer.signum(i2) || Math.abs(Math.round(f8)) < Math.abs(i2)) {
                        f = f8;
                    } else {
                        f = i2;
                    }
                    f2 = f8 - f;
                    f3 = 0.0f;
                    if (zB0 && i2 > i73 && f2 <= 0.0f) {
                        f3 = (i2 - i73) + f2;
                    }
                    f4 = f3;
                    if (i3 < 0) {
                        ni3.a("negative currentFirstItemScrollOffset");
                    }
                    i6 = -i3;
                    if (!kwVar.isEmpty()) {
                        an4.j("ArrayDeque is empty.");
                        return null;
                    }
                    i7 = i3;
                    p44Var = (p44) kwVar.n[kwVar.m];
                    if (iQ2 <= 0 || iQ4 < 0) {
                        iA = kwVar.a();
                        i8 = i7;
                        f5 = f4;
                        p44Var2 = p44Var;
                        i9 = 0;
                        while (true) {
                            if (i9 >= iA) {
                                i10 = i8;
                                i11 = i6;
                                break;
                            }
                            i11 = i6;
                            iA2 = ((p44) kwVar.get(i9)).a();
                            if (i8 != 0 || iA2 > i8) {
                                i10 = i8;
                                break;
                            }
                            i10 = i8;
                            if (i9 == kwVar.a() - 1) {
                                break;
                            }
                            i8 = i10 - iA2;
                            i9++;
                            p44Var2 = (p44) kwVar.get(i9);
                            i6 = i11;
                        }
                        p44Var = p44Var2;
                        z = z10;
                        i12 = i10;
                    } else {
                        i12 = i7;
                        f5 = f4;
                        z = z10;
                        i11 = i6;
                    }
                    iMax2 = Math.max(0, i4);
                    i13 = i4 - 1;
                    if (iMax2 <= i13) {
                        arrayList = null;
                        while (true) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            z2 = z;
                            arrayList.add(m44Var2.a(i13, j));
                            if (i13 != iMax2) {
                                break;
                            }
                            i13--;
                            z = z2;
                        }
                    } else {
                        z2 = z;
                        arrayList = null;
                    }
                    iArr = jw4Var.a;
                    for (i14 = jw4Var.b - 1; -1 < i14; i14--) {
                        i47 = iArr[i14];
                        if (i47 >= iMax2) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(m44Var2.a(i47, j));
                        }
                    }
                    if (arrayList == null) {
                        arrayList = ea2Var;
                    }
                    iMax3 = i5;
                    i15 = 0;
                    for (size = arrayList.size(); i15 < size; size = size) {
                        iMax3 = Math.max(iMax3, ((p44) arrayList.get(i15)).q);
                        i15++;
                    }
                    iMin2 = Math.min(((p44) lv0.v0(kwVar)).a, iC2 - 1);
                    i16 = ((p44) lv0.v0(kwVar)).a + 1;
                    if (i16 <= iMin2) {
                        arrayList6 = null;
                        while (true) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            i17 = iMax3;
                            arrayList2 = arrayList6;
                            i18 = i84;
                            arrayList2.add(m44Var2.a(i16, j));
                            if (i16 != iMin2) {
                                break;
                            }
                            i16++;
                            i84 = i18;
                            arrayList6 = arrayList2;
                            iMax3 = i17;
                        }
                    } else {
                        i17 = iMax3;
                        i18 = i84;
                        arrayList2 = null;
                    }
                    if (arrayList2 != null && ((p44) lv0.v0(arrayList2)).a > iMin2) {
                        iMin2 = ((p44) lv0.v0(arrayList2)).a;
                    }
                    iArr2 = jw4Var.a;
                    i19 = jw4Var.b;
                    arrayList3 = arrayList2;
                    i20 = 0;
                    while (i20 < i19) {
                        int i93 = i19;
                        i46 = iArr2[i20];
                        if (i46 <= iMin2) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(m44Var2.a(i46, j));
                        }
                        i20++;
                        i19 = i93;
                    }
                    if (arrayList3 == null) {
                        arrayList3 = ea2Var;
                    }
                    size2 = arrayList3.size();
                    iMax4 = i17;
                    for (i21 = 0; i21 < size2; i21++) {
                        iMax4 = Math.max(iMax4, ((p44) arrayList3.get(i21)).q);
                    }
                    if (!kwVar.isEmpty()) {
                        an4.j("ArrayDeque is empty.");
                        return null;
                    }
                    if (!im3.n(p44Var, kwVar.n[kwVar.m]) && arrayList.isEmpty() && arrayList3.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    iG = t61.g(iMax4, jI);
                    iF = t61.f(i82, jI);
                    if (i82 < Math.min(iF, iH2)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && i11 != 0) {
                        ni3.c("non-zero itemsScrollOffset");
                    }
                    z5 = z3;
                    i22 = i82;
                    arrayList4 = new ArrayList(arrayList3.size() + arrayList.size() + kwVar.a());
                    if (z4) {
                        if (arrayList.isEmpty() || !arrayList3.isEmpty()) {
                            ni3.a("no extra items");
                        }
                        iA5 = kwVar.a();
                        iArr3 = new int[iA5];
                        for (i41 = 0; i41 < iA5; i41++) {
                            iArr3[i41] = ((p44) kwVar.get(i41)).n;
                        }
                        iArr4 = new int[iA5];
                        if (gwVar != null) {
                            throw fx3.l("null verticalArrangement when isVertical == true");
                        }
                        gwVar.b(r34Var3, iF, iArr3, iArr4);
                        yk3 yk3Var = new yk3(0, iA5 - 1, 1);
                        i42 = yk3Var.n;
                        i43 = yk3Var.f2422o;
                        if ((i43 > 0 && i42 >= 0) || (i43 < 0 && i42 <= 0)) {
                            i44 = 0;
                            while (true) {
                                int i94 = iArr4[i44];
                                i45 = i43;
                                p44 p44Var9 = (p44) kwVar.get(i44);
                                p44Var9.d(i94, iG, iF);
                                arrayList4.add(p44Var9);
                                if (i44 == i42) {
                                    break;
                                }
                                i44 += i45;
                                i43 = i45;
                            }
                        }
                        r34Var2 = r34Var3;
                    } else {
                        r34Var = r34Var3;
                        size3 = arrayList.size();
                        i23 = i11;
                        i24 = 0;
                        while (i24 < size3) {
                            r34 r34Var4 = r34Var;
                            p44 p44Var10 = (p44) arrayList.get(i24);
                            int i95 = size3;
                            int iA14 = i23 - p44Var10.a();
                            p44Var10.d(iA14, iG, iF);
                            arrayList4.add(p44Var10);
                            i24++;
                            i23 = iA14;
                            size3 = i95;
                            r34Var = r34Var4;
                        }
                        r34Var2 = r34Var;
                        iA3 = kwVar.a();
                        iA4 = i11;
                        for (i25 = 0; i25 < iA3; i25++) {
                            p44 p44Var11 = (p44) kwVar.get(i25);
                            p44Var11.d(iA4, iG, iF);
                            arrayList4.add(p44Var11);
                            iA4 += p44Var11.a();
                        }
                        size4 = arrayList3.size();
                        for (i26 = 0; i26 < size4; i26++) {
                            p44 p44Var12 = (p44) arrayList3.get(i26);
                            p44Var12.d(iA4, iG, iF);
                            arrayList4.add(p44Var12);
                            iA4 += p44Var12.a();
                        }
                    }
                    if (z2) {
                        arrayList5 = arrayList4;
                        m34Var = m34Var2;
                        i27 = i22;
                    } else {
                        m34Var2.c((int) f, iG, iF, arrayList4, aeVar4, m44Var2, zB0, z9, i12, i22, me1Var, k03Var);
                        m34Var = m34Var2;
                        arrayList5 = arrayList4;
                        m44Var2 = m44Var2;
                        i27 = i22;
                    }
                    if (zB0) {
                        z6 = zB0;
                        f6 = f;
                    } else {
                        jA = m34Var.a();
                        f6 = f;
                        if (!dl3.b(jA, 0L)) {
                            iG = t61.g(Math.max(iG, (int) (jA >> 32)), jI);
                            iF2 = t61.f(Math.max(iF, (int) (jA & 4294967295L)), jI);
                            if (iF2 != iF) {
                                size7 = arrayList5.size();
                                for (i40 = 0; i40 < size7; i40++) {
                                    z6 = zB0;
                                    p44 p44Var13 = (p44) arrayList5.get(i40);
                                    p44Var13.s = iF2;
                                    p44Var13.u = p44Var13.f + iF2;
                                }
                                z6 = zB0;
                            }
                            z6 = zB0;
                            iF = iF2;
                        }
                    }
                    z6 = zB0;
                    if (kwVar.isEmpty()) {
                        obj3 = null;
                    } else {
                        obj3 = kwVar.n[kwVar.m];
                    }
                    p44Var3 = (p44) obj3;
                    if (p44Var3 != null) {
                        i28 = p44Var3.a;
                    } else {
                        i28 = 0;
                    }
                    p44Var4 = (p44) kwVar.g();
                    if (p44Var4 != null) {
                        i29 = p44Var4.a;
                    } else {
                        i29 = 0;
                    }
                    i44Var2.b.getClass();
                    jw4 jw4Var4 = sk3.a;
                    if (yi5Var != null || arrayList5.isEmpty() || (i35 = jw4Var4.b) == 0) {
                        f7 = f6;
                        i30 = i78;
                        z7 = true;
                        list = ea2Var;
                    } else {
                        if (i29 - i28 < 0 || i35 == 0) {
                            jw4Var2 = jw4Var4;
                        } else {
                            yk3 yk3VarB0 = ct1.b0(0, i35);
                            int i96 = yk3VarB0.m;
                            int i97 = yk3VarB0.n;
                            if (i96 <= i97) {
                                iC = -1;
                                while (jw4Var4.c(i96) <= i28) {
                                    iC = jw4Var4.c(i96);
                                    if (i96 == i97) {
                                        break;
                                    }
                                    i96++;
                                }
                                i39 = -1;
                            } else {
                                i39 = -1;
                                iC = -1;
                            }
                            if (iC == i39) {
                                jw4Var2 = sk3.a;
                            } else {
                                jw4Var2 = new jw4(1);
                                jw4Var2.a(iC);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList(arrayList5.size());
                        int size8 = arrayList5.size();
                        int i98 = 0;
                        while (i98 < size8) {
                            int i99 = size8;
                            Object obj6 = arrayList5.get(i98);
                            int i100 = i98;
                            int i101 = ((p44) obj6).a;
                            float f9 = f6;
                            int[] iArr6 = jw4Var4.a;
                            int i102 = jw4Var4.b;
                            jw4 jw4Var5 = jw4Var4;
                            int i103 = 0;
                            while (i103 < i102) {
                                int i104 = i103;
                                if (iArr6[i104] == i101) {
                                    arrayList8.add(obj6);
                                    break;
                                }
                                i103 = i104 + 1;
                            }
                            i98 = i100 + 1;
                            size8 = i99;
                            f6 = f9;
                            jw4Var4 = jw4Var5;
                        }
                        f7 = f6;
                        int[] iArr7 = jw4Var2.a;
                        int i105 = jw4Var2.b;
                        int i106 = 0;
                        while (i106 < i105) {
                            int i107 = iArr7[i106];
                            Iterator it = arrayList5.iterator();
                            int i108 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i36 = i105;
                                    i37 = -1;
                                    break;
                                }
                                i36 = i105;
                                if (((p44) it.next()).a == i107) {
                                    i37 = i108;
                                    break;
                                }
                                i108++;
                                i105 = i36;
                            }
                            p44 p44VarA4 = i37 == -1 ? m44Var2.a(i107, j) : (p44) arrayList5.remove(i37);
                            int iZ = pm8.z(p44VarA4);
                            long j3 = j;
                            int iB = i37 == -1 ? Integer.MIN_VALUE : (int) (p44VarA4.b(0) & 4294967295L);
                            int size9 = arrayList8.size();
                            int i109 = 0;
                            while (true) {
                                if (i109 >= size9) {
                                    obj5 = null;
                                    break;
                                }
                                obj5 = arrayList8.get(i109);
                                if (((p44) obj5).a != i107) {
                                    break;
                                }
                                i109++;
                            }
                            p44 p44Var14 = (p44) obj5;
                            int iB2 = p44Var14 != null ? (int) (p44Var14.b(0) & 4294967295L) : Integer.MIN_VALUE;
                            if (iB == Integer.MIN_VALUE) {
                                iMax5 = i78;
                                i38 = iMax5;
                            } else {
                                i38 = i78;
                                iMax5 = Math.max(i38, iB);
                            }
                            if (iB2 != Integer.MIN_VALUE) {
                                iMax5 = Math.min(iMax5, iB2 - iZ);
                            }
                            p44VarA4.r = true;
                            p44VarA4.d(iMax5, iG, iF);
                            arrayList7.add(p44VarA4);
                            i106++;
                            i78 = i38;
                            i105 = i36;
                            j = j3;
                        }
                        i30 = i78;
                        z7 = true;
                        list = arrayList7;
                    }
                    if (z5) {
                        p44Var8 = (p44) lv0.o0(arrayList5);
                        if (p44Var8 != null) {
                            numValueOf = Integer.valueOf(p44Var8.a);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        if (kwVar.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = kwVar.n[kwVar.m];
                        }
                        p44Var5 = (p44) obj4;
                        if (p44Var5 != null) {
                            numValueOf = Integer.valueOf(p44Var5.a);
                        } else {
                            numValueOf = null;
                        }
                    }
                    if (z5) {
                        p44Var7 = (p44) lv0.w0(arrayList5);
                        if (p44Var7 != null) {
                            numValueOf2 = Integer.valueOf(p44Var7.a);
                        }
                    } else {
                        p44Var6 = (p44) kwVar.g();
                        if (p44Var6 != null) {
                            numValueOf2 = Integer.valueOf(p44Var6.a);
                        }
                    }
                    if (i18 >= iC2 || i27 > iH2) {
                        z8 = z7;
                    } else {
                        z8 = false;
                    }
                    eo4 eo4VarU = md7Var2.u(t61.g(iG + i49, j2), t61.f(iF + iQ3, j2), fa2Var, new mk(px4Var3, arrayList5, list, z6));
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (numValueOf2 != null) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (arrayList5.isEmpty()) {
                        list2 = ea2Var;
                    } else {
                        ArrayList arrayList9 = new ArrayList(list);
                        size5 = arrayList5.size();
                        for (i31 = 0; i31 < size5; i31++) {
                            p44 p44Var15 = (p44) arrayList5.get(i31);
                            i32 = p44Var15.a;
                            if (iIntValue > i32 && i32 <= iIntValue2) {
                                arrayList9.add(p44Var15);
                            }
                        }
                        pv0.b0(arrayList9, pm8.p);
                        list2 = arrayList9;
                    }
                    size6 = list.size();
                    i34 = 0;
                    for (i33 = 0; i33 < size6; i33++) {
                        i34 += ((p44) list.get(i33)).n;
                    }
                    md7Var = md7Var2;
                    o44Var = new o44(p44Var, i12, z8, f7, eo4VarU, f5, z12, me1Var, r34Var2, m44Var2.d, i34, list2, i30, i75, iC2, gb5Var, i50, iQ4);
                } else {
                    iMax = i83;
                    i2 = i73;
                    i3 = iA11;
                }
                i4 = i70;
                i5 = iMax;
                if (Integer.signum(Math.round(f8)) == Integer.signum(i2)) {
                    f = f8;
                } else {
                    f = f8;
                }
                f2 = f8 - f;
                f3 = 0.0f;
                if (zB0) {
                    f3 = (i2 - i73) + f2;
                }
                f4 = f3;
                if (i3 < 0) {
                    ni3.a("negative currentFirstItemScrollOffset");
                }
                i6 = -i3;
                if (!kwVar.isEmpty()) {
                    an4.j("ArrayDeque is empty.");
                    return null;
                }
                i7 = i3;
                p44Var = (p44) kwVar.n[kwVar.m];
                if (iQ2 <= 0) {
                    iA = kwVar.a();
                    i8 = i7;
                    f5 = f4;
                    p44Var2 = p44Var;
                    i9 = 0;
                    while (true) {
                        if (i9 >= iA) {
                            i10 = i8;
                            i11 = i6;
                            break;
                        }
                        i11 = i6;
                        iA2 = ((p44) kwVar.get(i9)).a();
                        if (i8 != 0) {
                        }
                        i10 = i8;
                        break;
                        i8 = i10 - iA2;
                        i9++;
                        p44Var2 = (p44) kwVar.get(i9);
                        i6 = i11;
                    }
                    p44Var = p44Var2;
                    z = z10;
                    i12 = i10;
                } else {
                    iA = kwVar.a();
                    i8 = i7;
                    f5 = f4;
                    p44Var2 = p44Var;
                    i9 = 0;
                    while (true) {
                        if (i9 >= iA) {
                            i10 = i8;
                            i11 = i6;
                            break;
                        }
                        i11 = i6;
                        iA2 = ((p44) kwVar.get(i9)).a();
                        if (i8 != 0) {
                        }
                        i10 = i8;
                        break;
                        i8 = i10 - iA2;
                        i9++;
                        p44Var2 = (p44) kwVar.get(i9);
                        i6 = i11;
                    }
                    p44Var = p44Var2;
                    z = z10;
                    i12 = i10;
                }
                iMax2 = Math.max(0, i4);
                i13 = i4 - 1;
                if (iMax2 <= i13) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        z2 = z;
                        arrayList.add(m44Var2.a(i13, j));
                        if (i13 != iMax2) {
                            break;
                            break;
                        }
                        i13--;
                        z = z2;
                    }
                } else {
                    z2 = z;
                    arrayList = null;
                }
                iArr = jw4Var.a;
                while (-1 < i14) {
                    i47 = iArr[i14];
                    if (i47 >= iMax2) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(m44Var2.a(i47, j));
                    }
                }
                if (arrayList == null) {
                    arrayList = ea2Var;
                }
                iMax3 = i5;
                i15 = 0;
                while (i15 < size) {
                    iMax3 = Math.max(iMax3, ((p44) arrayList.get(i15)).q);
                    i15++;
                }
                iMin2 = Math.min(((p44) lv0.v0(kwVar)).a, iC2 - 1);
                i16 = ((p44) lv0.v0(kwVar)).a + 1;
                if (i16 <= iMin2) {
                    arrayList6 = null;
                    while (true) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        i17 = iMax3;
                        arrayList2 = arrayList6;
                        i18 = i84;
                        arrayList2.add(m44Var2.a(i16, j));
                        if (i16 != iMin2) {
                            break;
                            break;
                        }
                        i16++;
                        i84 = i18;
                        arrayList6 = arrayList2;
                        iMax3 = i17;
                    }
                } else {
                    i17 = iMax3;
                    i18 = i84;
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    iMin2 = ((p44) lv0.v0(arrayList2)).a;
                }
                iArr2 = jw4Var.a;
                i19 = jw4Var.b;
                arrayList3 = arrayList2;
                i20 = 0;
                while (i20 < i19) {
                    int i910 = i19;
                    i46 = iArr2[i20];
                    if (i46 <= iMin2) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(m44Var2.a(i46, j));
                    }
                    i20++;
                    i19 = i910;
                }
                if (arrayList3 == null) {
                    arrayList3 = ea2Var;
                }
                size2 = arrayList3.size();
                iMax4 = i17;
                while (i21 < size2) {
                    iMax4 = Math.max(iMax4, ((p44) arrayList3.get(i21)).q);
                }
                if (!kwVar.isEmpty()) {
                    an4.j("ArrayDeque is empty.");
                    return null;
                }
                if (!im3.n(p44Var, kwVar.n[kwVar.m])) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                iG = t61.g(iMax4, jI);
                iF = t61.f(i82, jI);
                if (i82 < Math.min(iF, iH2)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    ni3.c("non-zero itemsScrollOffset");
                }
                z5 = z3;
                i22 = i82;
                arrayList4 = new ArrayList(arrayList3.size() + arrayList.size() + kwVar.a());
                if (z4) {
                    if (arrayList.isEmpty()) {
                        ni3.a("no extra items");
                    } else {
                        ni3.a("no extra items");
                    }
                    iA5 = kwVar.a();
                    iArr3 = new int[iA5];
                    while (i41 < iA5) {
                        iArr3[i41] = ((p44) kwVar.get(i41)).n;
                    }
                    iArr4 = new int[iA5];
                    if (gwVar != null) {
                        throw fx3.l("null verticalArrangement when isVertical == true");
                    }
                    gwVar.b(r34Var3, iF, iArr3, iArr4);
                    yk3 yk3Var2 = new yk3(0, iA5 - 1, 1);
                    i42 = yk3Var2.n;
                    i43 = yk3Var2.f2422o;
                    if (i43 > 0) {
                        i44 = 0;
                        while (true) {
                            int i911 = iArr4[i44];
                            i45 = i43;
                            p44 p44Var16 = (p44) kwVar.get(i44);
                            p44Var16.d(i911, iG, iF);
                            arrayList4.add(p44Var16);
                            if (i44 == i42) {
                                break;
                                break;
                            }
                            i44 += i45;
                            i43 = i45;
                        }
                    } else {
                        i44 = 0;
                        while (true) {
                            int i912 = iArr4[i44];
                            i45 = i43;
                            p44 p44Var17 = (p44) kwVar.get(i44);
                            p44Var17.d(i912, iG, iF);
                            arrayList4.add(p44Var17);
                            if (i44 == i42) {
                                break;
                                break;
                            }
                            i44 += i45;
                            i43 = i45;
                        }
                    }
                    r34Var2 = r34Var3;
                } else {
                    r34Var = r34Var3;
                    size3 = arrayList.size();
                    i23 = i11;
                    i24 = 0;
                    while (i24 < size3) {
                        r34 r34Var5 = r34Var;
                        p44 p44Var18 = (p44) arrayList.get(i24);
                        int i913 = size3;
                        int iA15 = i23 - p44Var18.a();
                        p44Var18.d(iA15, iG, iF);
                        arrayList4.add(p44Var18);
                        i24++;
                        i23 = iA15;
                        size3 = i913;
                        r34Var = r34Var5;
                    }
                    r34Var2 = r34Var;
                    iA3 = kwVar.a();
                    iA4 = i11;
                    while (i25 < iA3) {
                        p44 p44Var19 = (p44) kwVar.get(i25);
                        p44Var19.d(iA4, iG, iF);
                        arrayList4.add(p44Var19);
                        iA4 += p44Var19.a();
                    }
                    size4 = arrayList3.size();
                    while (i26 < size4) {
                        p44 p44Var110 = (p44) arrayList3.get(i26);
                        p44Var110.d(iA4, iG, iF);
                        arrayList4.add(p44Var110);
                        iA4 += p44Var110.a();
                    }
                }
                if (z2) {
                    m34Var2.c((int) f, iG, iF, arrayList4, aeVar4, m44Var2, zB0, z9, i12, i22, me1Var, k03Var);
                    m34Var = m34Var2;
                    arrayList5 = arrayList4;
                    m44Var2 = m44Var2;
                    i27 = i22;
                } else {
                    arrayList5 = arrayList4;
                    m34Var = m34Var2;
                    i27 = i22;
                }
                if (zB0) {
                    jA = m34Var.a();
                    f6 = f;
                    if (!dl3.b(jA, 0L)) {
                        iG = t61.g(Math.max(iG, (int) (jA >> 32)), jI);
                        iF2 = t61.f(Math.max(iF, (int) (jA & 4294967295L)), jI);
                        if (iF2 != iF) {
                            size7 = arrayList5.size();
                            while (i40 < size7) {
                                z6 = zB0;
                                p44 p44Var111 = (p44) arrayList5.get(i40);
                                p44Var111.s = iF2;
                                p44Var111.u = p44Var111.f + iF2;
                            }
                            z6 = zB0;
                        }
                        z6 = zB0;
                        iF = iF2;
                    }
                } else {
                    z6 = zB0;
                    f6 = f;
                }
                z6 = zB0;
                if (kwVar.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = kwVar.n[kwVar.m];
                }
                p44Var3 = (p44) obj3;
                if (p44Var3 != null) {
                    i28 = p44Var3.a;
                } else {
                    i28 = 0;
                }
                p44Var4 = (p44) kwVar.g();
                if (p44Var4 != null) {
                    i29 = p44Var4.a;
                } else {
                    i29 = 0;
                }
                i44Var2.b.getClass();
                jw4 jw4Var6 = sk3.a;
                if (yi5Var != null) {
                    f7 = f6;
                    i30 = i78;
                    z7 = true;
                    list = ea2Var;
                } else {
                    f7 = f6;
                    i30 = i78;
                    z7 = true;
                    list = ea2Var;
                }
                if (z5) {
                    p44Var8 = (p44) lv0.o0(arrayList5);
                    if (p44Var8 != null) {
                        numValueOf = Integer.valueOf(p44Var8.a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    if (kwVar.isEmpty()) {
                        obj4 = null;
                    } else {
                        obj4 = kwVar.n[kwVar.m];
                    }
                    p44Var5 = (p44) obj4;
                    if (p44Var5 != null) {
                        numValueOf = Integer.valueOf(p44Var5.a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z5) {
                    p44Var7 = (p44) lv0.w0(arrayList5);
                    if (p44Var7 != null) {
                        numValueOf2 = Integer.valueOf(p44Var7.a);
                    }
                } else {
                    p44Var6 = (p44) kwVar.g();
                    if (p44Var6 != null) {
                        numValueOf2 = Integer.valueOf(p44Var6.a);
                    }
                }
                if (i18 >= iC2) {
                    z8 = z7;
                } else {
                    z8 = z7;
                }
                eo4 eo4VarU2 = md7Var2.u(t61.g(iG + i49, j2), t61.f(iF + iQ3, j2), fa2Var, new mk(px4Var3, arrayList5, list, z6));
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (arrayList5.isEmpty()) {
                    list2 = ea2Var;
                } else {
                    ArrayList arrayList10 = new ArrayList(list);
                    size5 = arrayList5.size();
                    while (i31 < size5) {
                        p44 p44Var112 = (p44) arrayList5.get(i31);
                        i32 = p44Var112.a;
                        if (iIntValue > i32) {
                        }
                    }
                    pv0.b0(arrayList10, pm8.p);
                    list2 = arrayList10;
                }
                size6 = list.size();
                i34 = 0;
                while (i33 < size6) {
                    i34 += ((p44) list.get(i33)).n;
                }
                md7Var = md7Var2;
                o44Var = new o44(p44Var, i12, z8, f7, eo4VarU2, f5, z12, me1Var, r34Var2, m44Var2.d, i34, list2, i30, i75, iC2, gb5Var, i50, iQ4);
            }
            w44Var.g(o44Var, md7Var.b0(), false);
            return o44Var;
        } catch (Throwable th) {
            el5.h(n47VarC, n47VarF, function1E);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fb  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        v23 v23Var;
        dj3 dj3Var;
        int i;
        o72 o72Var;
        String string;
        ux2 ux2Var;
        byte b = this.m;
        Object obj3 = null;
        tg3 tg3Var = LayoutNode.e0;
        cs4 cs4Var = cs4.b;
        aw awVar = e01.a;
        byte b2 = 1;
        f88 f88Var = f88.a;
        Object obj4 = this.f502o;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                pm8.g((l33) obj5, (fs4) obj4, (ux2) obj, yo1.Y(49));
                return f88Var;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                ((mf) obj5).a(fFloatValue, ((Float) obj2).floatValue());
                ((h76) obj4).m = fFloatValue;
                return f88Var;
            case 2:
                ph phVar = (ph) obj4;
                int iIntValue = ((Integer) obj).intValue();
                fp6 fp6Var = (fp6) obj2;
                if (!((gp6) obj5).b.b(fp6Var.f)) {
                    phVar.i(iIntValue, fp6Var);
                    phVar.s.b(f88Var);
                }
                return f88Var;
            case 3:
                ((Integer) obj2).getClass();
                qf0.c((q20) obj5, (fs4) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case 4:
                String str = (String) obj5;
                yy0 yy0Var = (yy0) obj4;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zF = ux2Var2.f(str);
                    Object objK = ux2Var2.K();
                    if (zF || objK == awVar) {
                        objK = new fy(str, b2);
                        ux2Var2.g0(objK);
                    }
                    fs4 fs4VarA = cp6.a(cs4Var, false, (Function1) objK);
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL = ux2Var2.l();
                    fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var2);
                    o67.n(yj5VarL, d82.u, ux2Var2);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                    o67.l(ux2Var2);
                    o67.n(fs4VarS, d82.t, ux2Var2);
                    yy0Var.invoke(ux2Var2, 0);
                    ux2Var2.p(true);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case 5:
                ((Integer) obj2).getClass();
                pm8.h((fs4) obj4, (jb4) obj5, (ux2) obj, yo1.Y(1));
                return f88Var;
            case 6:
                String str2 = (String) obj5;
                Map map = (Map) obj4;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-settings-biometrics-urlText");
                    h72 h72Var = un4.a;
                    qs7.c(g77.s(str2, map, new c77(((rn4) ux2Var3.j(h72Var)).a.a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), 0L, ux2Var3, 24), fs4VarA2, ((rn4) ux2Var3.j(h72Var)).a.s, 0L, 0L, 0L, 0, false, 0, 0, null, null, new ot7(0L, 0L, null, 0L, 5, 0L, 16744447), ux2Var3, 48, 0, 262136);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            case 7:
                md7 md7Var = (md7) obj;
                r61 r61Var = (r61) obj2;
                return ((do4) obj5).c(md7Var, md7Var.m0(f88Var, new yy0(-431986394, true, new c9(obj4, (Object) new ab0(md7Var, r61Var.a), (byte) 8))), r61Var.a);
            case 8:
                yy0 yy0Var2 = (yy0) obj5;
                Object obj6 = (ab0) obj4;
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    yy0Var2.d(obj6, ux2Var4, 0);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            case ep1.b /* 9 */:
                nd5 nd5Var = (nd5) obj5;
                iw2 iw2Var = (iw2) obj4;
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fs4 fs4VarA3 = ka0.A(androidx.compose.foundation.layout.b.a(cs4Var, og0.c, ((Boolean) qp5.a.getValue()).booleanValue() ? 36.0f : 40.0f), nd5Var);
                    dg6 dg6VarA = cg6.a(iq8.e, xz2.y, ux2Var5, 54);
                    int iHashCode2 = Long.hashCode(ux2Var5.T);
                    yj5 yj5VarL2 = ux2Var5.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var5, fs4VarA3);
                    yz0.c.getClass();
                    ux2Var5.a0();
                    if (ux2Var5.S) {
                        ux2Var5.k(tg3Var);
                    } else {
                        ux2Var5.j0();
                    }
                    o67.n(dg6VarA, d82.v, ux2Var5);
                    o67.n(yj5VarL2, d82.u, ux2Var5);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var5);
                    o67.l(ux2Var5);
                    o67.n(fs4VarS2, d82.t, ux2Var5);
                    iw2Var.d(fg6.a, ux2Var5, 6);
                    ux2Var5.p(true);
                } else {
                    ux2Var5.Q();
                }
                return f88Var;
            case ep1.c /* 10 */:
                ((Integer) obj2).getClass();
                qf0.i((h71) obj5, (fs4) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case 11:
                ((Integer) obj2).getClass();
                ((ac1) obj5).a((zb1) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case ep1.d /* 12 */:
                fs4 fs4Var = (fs4) obj4;
                d11 d11Var = (d11) obj5;
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (ux2Var6.N(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var6, 0);
                    int iHashCode3 = Long.hashCode(ux2Var6.T);
                    yj5 yj5VarL3 = ux2Var6.l();
                    fs4 fs4VarS3 = uf0.s(ux2Var6, fs4Var);
                    yz0.c.getClass();
                    ux2Var6.a0();
                    if (ux2Var6.S) {
                        ux2Var6.k(tg3Var);
                    } else {
                        ux2Var6.j0();
                    }
                    o67.n(kw0VarA, d82.v, ux2Var6);
                    o67.n(yj5VarL3, d82.u, ux2Var6);
                    iz0 iz0Var = d82.w;
                    if (ux2Var6.S || !im3.n(ux2Var6.K(), Integer.valueOf(iHashCode3))) {
                        ux2Var6.g0(Integer.valueOf(iHashCode3));
                        ux2Var6.b(Integer.valueOf(iHashCode3), iz0Var);
                    }
                    o67.n(fs4VarS3, d82.t, ux2Var6);
                    ux2Var6.W(1299062041);
                    ux2Var6.p(false);
                    ((yy0) d11Var.r).d(new tn(), ux2Var6, 0);
                    ux2Var6.p(true);
                } else {
                    ux2Var6.Q();
                }
                return f88Var;
            case 13:
                ((Integer) obj2).getClass();
                ((mj1) obj5).a((d11) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case 14:
                ((Integer) obj2).getClass();
                ((nj1) obj5).a((j93) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case 15:
                ((Integer) obj2).getClass();
                ((bl1) obj5).a((p07) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                fp7 fp7Var = (fp7) obj5;
                rp7 rp7Var = (rp7) obj4;
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (ux2Var7.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zF2 = ux2Var7.f(fp7Var);
                    Object objK2 = ux2Var7.K();
                    if (zF2 || objK2 == awVar) {
                        objK2 = d57.b(new m9(0, fp7Var, fp7.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, (byte) 21));
                        ux2Var7.g0(objK2);
                    }
                    rl1.a(rp7Var, (ep7) ((i97) objK2).getValue(), ux2Var7, 0);
                } else {
                    ux2Var7.Q();
                }
                return f88Var;
            case 17:
                ((Integer) obj2).getClass();
                rl1.a((rp7) obj5, (ep7) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((Integer) obj2).getClass();
                ((vl1) obj5).a((nf) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((Integer) obj2).getClass();
                ex1.d((vx6) obj5, (ul1) obj4, (ux2) obj, yo1.Y(1));
                return f88Var;
            case 20:
                String str3 = (String) obj5;
                Function1 function1 = (Function1) obj4;
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!ux2Var8.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ux2Var8.Q();
                } else if (str3.length() > 0) {
                    ux2Var8.W(1682346347);
                    ud5 ud5VarT = lv1.T(R.drawable.ic_close, ux2Var8, 0);
                    String strZ = m77.z(R.string.close_content_description, ux2Var8);
                    long j = ((rn4) ux2Var8.j(un4.a)).a.s;
                    fs4 fs4VarJ = iq8.j(cs4Var, sf6.a);
                    boolean zF3 = ux2Var8.f(function1);
                    Object objK3 = ux2Var8.K();
                    if (zF3 || objK3 == awVar) {
                        objK3 = new qv1(function1, (byte) 7);
                        ux2Var8.g0(objK3);
                    }
                    td3.b(ud5VarT, strZ, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(ka0.B(androidx.compose.foundation.b.b(fs4VarJ, false, null, null, (Function0) objK3, 15), 8.0f), 24.0f), "TVTA-devicesScreen-searchClear"), j, ux2Var8, 8, 0);
                    ux2Var8.p(false);
                } else {
                    ux2Var8.W(1682983211);
                    ux2Var8.p(false);
                }
                return f88Var;
            case 21:
                ud5 ud5Var = (ud5) obj5;
                rz1 rz1Var = (rz1) obj4;
                ux2 ux2Var9 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!ux2Var9.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ux2Var9.Q();
                } else if (ud5Var == null) {
                    ux2Var9.W(25371513);
                    ux2Var9.p(false);
                } else {
                    ux2Var9.W(25371514);
                    xo1.k(rz1Var.g, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-groupTopBarBack"), false, null, null, au8.O(1328581343, new uz1(ud5Var, (byte) 0), ux2Var9), ux2Var9, 1572912, 60);
                    ux2Var9.p(false);
                }
                return f88Var;
            case 22:
                Function1 function2 = (Function1) obj5;
                Function0 function0 = (Function0) obj4;
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (ux2Var10.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zF4 = ux2Var10.f(function2) | ux2Var10.f(function0);
                    Object objK4 = ux2Var10.K();
                    if (zF4 || objK4 == awVar) {
                        objK4 = new j5((byte) 3, function0, function2);
                        ux2Var10.g0(objK4);
                    }
                    v67.d((Function0) objK4, null, null, false, "TVTA-settings-feedback-gotItButton", hm3.g, ux2Var10, 221184, 14);
                } else {
                    ux2Var10.Q();
                }
                return f88Var;
            case 23:
                au2 au2Var = (au2) obj5;
                k17 k17Var = (k17) obj4;
                int iIntValue11 = ((Integer) obj).intValue();
                if (obj2 instanceof mz0) {
                    ((xx4) au2Var.g).b((mz0) obj2);
                } else if (!(obj2 instanceof id6)) {
                    if (obj2 instanceof yx2) {
                        j51.O(k17Var, iIntValue11, obj2);
                        au2Var.f((yx2) obj2);
                    } else if (obj2 instanceof j56) {
                        j51.O(k17Var, iIntValue11, obj2);
                        ((j56) obj2).c();
                    }
                }
                return f88Var;
            case 24:
                f33 f33Var = (f33) obj5;
                gl4 gl4Var = (gl4) obj4;
                k33 k33Var = (k33) obj;
                List list = (List) obj2;
                l97 l97Var = f33Var.w;
                l97 l97Var2 = f33Var.C;
                j23 j23Var = f33Var.G;
                gl4Var.getClass();
                l97 l97Var3 = f33Var.v;
                boolean zN = im3.n(l97Var3.getValue(), k33Var);
                Object[] objArr = !f33Var.z.a(k33Var) && gl4Var.a(k33Var);
                Object[] objArr2 = !f33Var.z.d(k33Var) && gl4Var.d(k33Var);
                Object[] objArr3 = f33Var.z.a(k33Var) && !gl4Var.a(k33Var);
                boolean z = f33Var.z.d(k33Var) && !gl4Var.d(k33Var);
                f33Var.z = gl4Var;
                if (objArr3 != false || z) {
                    j23Var.B++;
                    j23Var.C++;
                }
                if (zN && im3.n(l97Var.getValue(), list)) {
                    if (objArr != false || objArr2 != false) {
                        r13 r13Var = j23Var.t;
                        gu0 gu0Var = j23Var.c;
                        iw7 iw7Var = j23Var.v;
                        long j2 = j23Var.B + 1;
                        j23Var.B = j2;
                        g76 g76Var = new g76();
                        im3.R(gu0Var, null, null, new ab1(j23Var, new iw7(j23Var.d, gu0Var, 200, new b23(j23Var, r13Var, (hc1) null), new f42(g76Var, b2)), g76Var, j2, r13Var, iw7Var, null, (byte) 1), 3);
                    }
                    if (objArr2 != false) {
                        f33Var.a1();
                    }
                } else {
                    boolean z2 = zN && ((v23) l97Var2.getValue()).d && ((k33Var instanceof j33) || (k33Var instanceof h33));
                    if (!z2) {
                        f33Var.Y0();
                    }
                    m13 m13Var = ((v23) l97Var2.getValue()).g;
                    n87 n87Var = f33Var.A;
                    if (n87Var != null) {
                        n87Var.j(null);
                    }
                    n87 n87Var2 = f33Var.B;
                    if (n87Var2 != null) {
                        n87Var2.j(null);
                    }
                    l97Var.k(list);
                    l97Var3.k(k33Var);
                    do {
                        value = l97Var2.getValue();
                        v23Var = (v23) value;
                    } while (!l97Var2.j(value, v23.a(v23Var, null, false, false, false, null, false, null, false, false, false, false, zN && v23Var.l, 0, 0, 12415)));
                    j23Var.getClass();
                    m13Var.getClass();
                    r13 r13Var2 = new r13(k33Var, list != null ? lv0.P0(list) : null, m13Var);
                    if (!im3.n(j23Var.t, r13Var2)) {
                        j23Var.t = r13Var2;
                        j23Var.m(r13Var2);
                        j23Var.l(r13Var2);
                    }
                    if (z2) {
                        j23.j(j23Var.v);
                        f33Var.a1();
                    } else if (k33Var instanceof i33) {
                        f33Var.V0(m13Var);
                    } else {
                        f33Var.f1();
                    }
                }
                return f88Var;
            case 25:
                pk7 pk7Var = (pk7) obj5;
                Context context = (Context) obj4;
                String str4 = (String) obj;
                String str5 = (String) obj2;
                str4.getClass();
                str5.getClass();
                dj3.f627o.getClass();
                context.getClass();
                for (Object obj7 : dj3.r) {
                    if (im3.n(context.getString(((dj3) obj7).n), str4)) {
                        obj3 = obj7;
                        dj3Var = (dj3) obj3;
                        if (dj3Var == null) {
                            dj3Var = dj3.MOUSE;
                        }
                        i = R.string.tv_options_PreferredResolutionBestFit;
                        if (str5.equals(context.getString(R.string.tv_options_PreferredResolutionBestFit))) {
                            o72Var = o72.f1638o;
                        } else {
                            o72Var = o72.n;
                        }
                        SharedPreferences sharedPreferences = pk7Var.f1743o;
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.getClass();
                        editorEdit.putInt("INPUT_METHOD_INT", dj3Var.m ? 1 : 0);
                        editorEdit.putString("PREFERRED_RESOLUTION", o72Var.name());
                        editorEdit.commit();
                        he2 he2Var = new he2();
                        EventParam eventParam = EventParam.EP_SETTINGS_KEY;
                        he2Var.c(eventParam, "INPUT_METHOD_INT");
                        EventHub eventHub = pk7Var.n;
                        EventType eventType = EventType.EVENT_SETTINGS_CHANGED;
                        eventHub.d(eventType, he2Var);
                        he2 he2Var2 = new he2();
                        he2Var2.c(eventParam, "PREFERRED_RESOLUTION");
                        eventHub.d(eventType, he2Var2);
                        pk7Var.q.A(dj3Var.n);
                        yf5 yf5Var = pk7Var.r;
                        string = sharedPreferences.getString("PREFERRED_RESOLUTION", "DontChange");
                        if (string == null) {
                            string = "";
                        }
                        if (string.equals("DontChange") || !string.equals("BestFit")) {
                            i = R.string.tv_options_PreferredResolutionDontChange;
                        }
                        yf5Var.A(i);
                        return f88Var;
                    }
                }
                dj3Var = (dj3) obj3;
                if (dj3Var == null) {
                    dj3Var = dj3.MOUSE;
                }
                i = R.string.tv_options_PreferredResolutionBestFit;
                if (str5.equals(context.getString(R.string.tv_options_PreferredResolutionBestFit))) {
                    o72Var = o72.f1638o;
                } else {
                    o72Var = o72.n;
                }
                SharedPreferences sharedPreferences2 = pk7Var.f1743o;
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.getClass();
                editorEdit2.putInt("INPUT_METHOD_INT", dj3Var.m ? 1 : 0);
                editorEdit2.putString("PREFERRED_RESOLUTION", o72Var.name());
                editorEdit2.commit();
                he2 he2Var3 = new he2();
                EventParam eventParam2 = EventParam.EP_SETTINGS_KEY;
                he2Var3.c(eventParam2, "INPUT_METHOD_INT");
                EventHub eventHub2 = pk7Var.n;
                EventType eventType2 = EventType.EVENT_SETTINGS_CHANGED;
                eventHub2.d(eventType2, he2Var3);
                he2 he2Var4 = new he2();
                he2Var4.c(eventParam2, "PREFERRED_RESOLUTION");
                eventHub2.d(eventType2, he2Var4);
                pk7Var.q.A(dj3Var.n);
                yf5 yf5Var2 = pk7Var.r;
                string = sharedPreferences2.getString("PREFERRED_RESOLUTION", "DontChange");
                if (string == null) {
                    string = "";
                }
                if (string.equals("DontChange")) {
                    i = R.string.tv_options_PreferredResolutionDontChange;
                } else {
                    i = R.string.tv_options_PreferredResolutionDontChange;
                }
                yf5Var2.A(i);
                return f88Var;
            case 26:
                h14 h14Var = (h14) obj5;
                hw2 hw2Var = (hw2) obj4;
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (ux2Var11.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    Boolean bool = (Boolean) h14Var.g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    ux2Var11.Z(bool);
                    boolean zG = ux2Var11.g(zBooleanValue);
                    if (zBooleanValue) {
                        hw2Var.invoke(ux2Var11, 0);
                    } else {
                        if (ux2Var11.l != 0) {
                            i01.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!ux2Var11.S) {
                            if (zG) {
                                g17 g17Var = ux2Var11.G;
                                int i2 = g17Var.g;
                                int i3 = g17Var.h;
                                f01 f01Var = ux2Var11.M;
                                f01Var.getClass();
                                f01Var.d(false);
                                f01Var.b.V.v0(p95.d);
                                j51.P(ux2Var11.s, i2, i3);
                                ux2Var11.G.t();
                            } else {
                                ux2Var11.P();
                            }
                        }
                    }
                    if (ux2Var11.y && ux2Var11.G.i == ux2Var11.z) {
                        ux2Var11.z = -1;
                        ux2Var11.y = false;
                    }
                    ux2Var11.p(false);
                } else {
                    ux2Var11.Q();
                }
                return f88Var;
            case 27:
                o34 o34Var = (o34) obj5;
                n34 n34Var = (n34) obj4;
                Object obj8 = n34Var.a;
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (ux2Var12.N(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    i44 i44Var = (i44) o34Var.b.a();
                    int iG = n34Var.c;
                    if ((iG >= i44Var.c() || !i44Var.d(iG).equals(obj8)) && (iG = i44Var.d.g(obj8)) != -1) {
                        n34Var.c = iG;
                    }
                    if (iG != -1) {
                        ux2Var12.W(-1664741271);
                        qs1.y(i44Var, o34Var.a, iG, obj8, ux2Var12, 0);
                        ux2Var = ux2Var12;
                        ux2Var.p(false);
                    } else {
                        ux2Var = ux2Var12;
                        ux2Var.W(-1664505826);
                        ux2Var.p(false);
                    }
                    boolean zH = ux2Var.h(n34Var);
                    Object objK5 = ux2Var.K();
                    if (zH || objK5 == awVar) {
                        objK5 = new fj3(n34Var, b2);
                        ux2Var.g0(objK5);
                    }
                    ck3.e(obj8, (Function1) objK5, ux2Var);
                } else {
                    ux2Var12.Q();
                }
                return f88Var;
            case 28:
                return c(obj, obj2);
            default:
                yy0 yy0Var3 = (yy0) obj5;
                Object obj9 = (c54) obj4;
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (ux2Var13.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    yy0Var3.d(obj9, ux2Var13, 0);
                } else {
                    ux2Var13.Q();
                }
                return f88Var;
        }
    }

    public /* synthetic */ c9(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f502o = obj2;
    }

    public /* synthetic */ c9(fs4 fs4Var, jb4 jb4Var, int i) {
        this.m = (byte) 5;
        this.f502o = fs4Var;
        this.n = jb4Var;
    }

    public /* synthetic */ c9(byte b, int i, Object obj, Object obj2) {
        this.m = b;
        this.n = obj;
        this.f502o = obj2;
    }
}
