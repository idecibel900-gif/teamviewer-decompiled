package o;

import android.content.Context;
import android.graphics.Paint;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l8 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1338o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ l8(iy iyVar, me1 me1Var, px4 px4Var, xy6 xy6Var, Function0 function0) {
        this.m = (byte) 5;
        this.n = iyVar;
        this.f1338o = me1Var;
        this.r = px4Var;
        this.p = xy6Var;
        this.q = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection<kl6> collectionA0;
        byte b;
        el6 el6Var;
        Function1 function1;
        Function1 function2;
        byte b2 = this.m;
        Object[] objArr = 0;
        f88 f88Var = f88.a;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.f1338o;
        Object obj6 = this.n;
        switch (b2) {
            case 0:
                g8 g8Var = (g8) obj6;
                g8Var.a = ((ky0) obj5).d((String) obj4, (e8) obj3, new io.sentry.android.core.h2((px4) obj2, (byte) 1));
                return new m8(g8Var, (byte) 0);
            case 1:
                k64 k64Var = (k64) obj;
                t54 t54Var = ((cj) obj5).a;
                k64Var.h = (zr7) obj6;
                k64Var.i = (bf3) obj4;
                k64Var.c = (xn5) obj3;
                k64Var.d = (Function1) obj2;
                k64Var.e = t54Var != null ? t54Var.B : null;
                k64Var.f = t54Var != null ? t54Var.C : null;
                k64Var.g = t54Var != null ? (ee8) xk0.q(t54Var, b11.t) : null;
                return f88Var;
            case 2:
                yo5 yo5Var = (yo5) obj6;
                yo5Var.B.addView(yo5Var, yo5Var.C);
                yo5Var.n((Function0) obj5, (cp5) obj3, (String) obj4, (j04) obj2);
                return new m8(yo5Var, (byte) 2);
            case 3:
                ak3 ak3Var = (ak3) obj6;
                Function1 function3 = (Function1) obj5;
                String str = (String) obj4;
                px4 px4Var = (px4) obj2;
                px4 px4Var2 = (px4) obj3;
                zj3 zj3Var = (zj3) obj;
                zj3Var.getClass();
                int iOrdinal = zj3Var.ordinal();
                cv cvVar = cv.s;
                if (iOrdinal == 0) {
                    px4Var.setValue(Boolean.FALSE);
                    function3.invoke(str);
                    kh7 kh7Var = ev.a;
                    ak3Var.getClass();
                    ev.a(new dv(cvVar, ak3Var, "InstallationVendorNotFound", false, 8));
                    return f88Var;
                }
                if (iOrdinal == 1) {
                    px4Var2.setValue(Boolean.TRUE);
                    return f88Var;
                }
                if (iOrdinal == 2) {
                    px4Var2.setValue(Boolean.FALSE);
                    kh7 kh7Var2 = ev.a;
                    ak3Var.getClass();
                    ev.a(new dv(cv.q, ak3Var, null, false, 12));
                    return f88Var;
                }
                if (iOrdinal != 3) {
                    gk0.s();
                    return null;
                }
                px4Var.setValue(Boolean.FALSE);
                function3.invoke(str);
                kh7 kh7Var3 = ev.a;
                ak3Var.getClass();
                ev.a(new dv(cvVar, ak3Var, "FileAccessError", false, 8));
                return f88Var;
            case 4:
                Function1 function4 = (Function1) obj5;
                String str2 = (String) obj4;
                ak3 ak3Var2 = (ak3) obj3;
                Function0 function0 = (Function0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((Context) obj6).getClass();
                if (zBooleanValue) {
                    function4.invoke(str2);
                    kh7 kh7Var4 = ev.a;
                    ak3Var2.getClass();
                    ev.a(new dv(cv.r, ak3Var2, null, false, 12));
                } else {
                    function0.a();
                }
                return f88Var;
            case 5:
                xy6 xy6Var = (xy6) obj4;
                ((wx3) obj).getClass();
                ((iy) obj6).V0((String) ((px4) obj2).getValue());
                im3.R((me1) obj5, null, null, new gy(xy6Var, null, objArr == true ? 1 : 0), 3).o0(new cy(xy6Var, (Function0) obj3, (byte) 0));
                return f88Var;
            case 6:
                nu4 nu4Var = (nu4) obj6;
                k76 k76Var = (k76) obj5;
                h76 h76Var = (h76) obj4;
                yk6 yk6Var = (yk6) obj3;
                g76 g76Var = (g76) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                ju4 ju4VarG = nu4.g(nu4Var.g);
                if (ju4VarG != null) {
                    wk0 wk0Var = nu4Var.e;
                    long j = ju4VarG.b;
                    long j2 = ju4VarG.a;
                    ((pc8) wk0Var.n).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((pc8) wk0Var.f2420o).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    ju4 ju4VarA = ((ju4) k76Var.m).a(ju4VarG);
                    k76Var.m = ju4VarA;
                    float fJ = yk6Var.j(yk6Var.f(ju4VarA.a));
                    h76Var.m = fJ;
                    g76Var.m = !bt1.G(fJ - fFloatValue);
                }
                return Boolean.valueOf(ju4VarG != null);
            case 7:
                yl6 yl6Var = (yl6) obj6;
                zl6 zl6Var = (zl6) obj5;
                el6 el6Var2 = (el6) obj4;
                Function1 function5 = (Function1) obj3;
                Function1 function6 = (Function1) obj2;
                h44 h44Var = (h44) obj;
                h44Var.getClass();
                al6 al6Var = yl6Var.k;
                String str3 = yl6Var.a;
                int iOrdinal2 = al6Var.ordinal();
                if (iOrdinal2 == 0) {
                    h44.a(h44Var, null, au8.i, 3);
                    return f88Var;
                }
                if (iOrdinal2 == 1) {
                    h44.a(h44Var, null, au8.h, 3);
                    return f88Var;
                }
                cs4 cs4Var = cs4.b;
                if (iOrdinal2 == 2) {
                    h44.a(h44Var, null, new yy0(1845764148, true, new ma2(zl6Var.n, str3, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-searchScreen-noResults"))), 3);
                    return f88Var;
                }
                if (iOrdinal2 == 3) {
                    Set set = nm6.a;
                    zl6Var.getClass();
                    int iOrdinal3 = zl6Var.ordinal();
                    byte b3 = 10;
                    if (iOrdinal3 == 0) {
                        List listK = qf0.K(new jl6(yl6Var.g));
                        List<zl6> list = nm6.c;
                        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                        for (zl6 zl6Var2 : list) {
                            arrayList.add(new il6(zl6Var2, nm6.a(zl6Var2, yl6Var)));
                        }
                        collectionA0 = lv0.A0(listK, arrayList);
                    } else if (iOrdinal3 == 1 || iOrdinal3 == 2 || iOrdinal3 == 3) {
                        collectionA0 = qf0.K(new hl6(zl6Var, nm6.a(zl6Var, yl6Var)));
                    } else {
                        gk0.s();
                    }
                    if (!collectionA0.isEmpty()) {
                        Iterator it = collectionA0.iterator();
                        while (it.hasNext()) {
                            if (!((kl6) it.next()).c().isEmpty()) {
                                for (kl6 kl6Var : collectionA0) {
                                    if (kl6Var.c().isEmpty()) {
                                        b = b3;
                                        el6Var = el6Var2;
                                        function1 = function5;
                                    } else {
                                        if (kl6Var.b()) {
                                            h44.a(h44Var, null, new yy0(1800678798, true, new b9(kl6Var, b3)), 3);
                                        }
                                        List listE = kl6Var.e();
                                        b = b3;
                                        el6Var = el6Var2;
                                        function1 = function5;
                                        h44Var.b(listE.size(), null, new ha1(listE, (byte) 6), new yy0(802480018, true, new mm6(listE, el6Var2, kl6Var, yl6Var, function5)));
                                        yl6 yl6Var2 = yl6Var;
                                        zl6 zl6VarF = kl6Var.f();
                                        if (zl6VarF != null) {
                                            Function1 function7 = function6;
                                            q34 q34Var = new q34(yl6Var2, kl6Var, function7, zl6VarF, (byte) 6);
                                            yl6Var = yl6Var2;
                                            function2 = function7;
                                            h44.a(h44Var, null, new yy0(859013540, true, q34Var), 3);
                                        } else {
                                            yl6Var = yl6Var2;
                                        }
                                        el6Var2 = el6Var;
                                        function5 = function1;
                                        function6 = function2;
                                        b3 = b;
                                    }
                                    function2 = function6;
                                    el6Var2 = el6Var;
                                    function5 = function1;
                                    function6 = function2;
                                    b3 = b;
                                }
                                return f88Var;
                            }
                        }
                    }
                    h44.a(h44Var, null, new yy0(1845764148, true, new ma2(zl6Var.n, str3, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-searchScreen-noResults"))), 3);
                    return f88Var;
                }
                if (iOrdinal2 == 4) {
                    return f88Var;
                }
                gk0.s();
                return null;
            case 8:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj6;
                ((r22) obj).getClass();
                h8 h8Var = new h8((j67) obj5, (Context) obj4, (f67) obj3, (px4) obj2, (byte) 1);
                lifecycleOwner.getR().a(h8Var);
                return new l9(lifecycleOwner, h8Var, (byte) 18);
            default:
                v65 v65Var = (v65) obj5;
                zr7 zr7Var = (zr7) obj4;
                j64 j64Var = (j64) obj3;
                sb0 sb0Var = (sb0) obj2;
                d14 d14Var = (d14) obj;
                d14Var.a();
                nl0 nl0Var = d14Var.m;
                float fZ = ((sf1) obj6).c.z();
                if (fZ != 0.0f) {
                    long j3 = zr7Var.b;
                    int i = gt7.c;
                    int iQ = v65Var.q((int) (j3 >> 32));
                    ws7 ws7VarD = j64Var.d();
                    v56 v56VarC = ws7VarD != null ? ws7VarD.a.c(iQ) : new v56(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(d14Var.d0(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = v56VarC.a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (nl0Var.d() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(v56VarC.b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(v56VarC.d)) & 4294967295L);
                    ll0 ll0Var = nl0Var.m.c;
                    gy8 gy8VarK = nl0Var.p;
                    if (gy8VarK == null) {
                        gy8VarK = ka0.k();
                        gy8VarK.s(1);
                        nl0Var.p = gy8VarK;
                    }
                    Paint paint = (Paint) gy8VarK.c;
                    if (sb0Var != null) {
                        sb0Var.a(fZ, nl0Var.d(), gy8VarK);
                    } else if (paint.getAlpha() / 255.0f != fZ) {
                        gy8VarK.j(fZ);
                    }
                    if (!im3.n((tv0) gy8VarK.e, null)) {
                        gy8VarK.m(null);
                    }
                    if (gy8VarK.b != 3) {
                        gy8VarK.k(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        gy8VarK.r(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (gy8VarK.g() != 0) {
                        gy8VarK.p(0);
                    }
                    if (gy8VarK.h() != 0) {
                        gy8VarK.q(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        gy8VarK.n(1);
                    }
                    ll0Var.l(jFloatToRawIntBits, jFloatToRawIntBits2, gy8VarK);
                }
                return f88Var;
        }
    }

    public /* synthetic */ l8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.m = b;
        this.n = obj;
        this.f1338o = obj2;
        this.p = obj3;
        this.q = obj4;
        this.r = obj5;
    }

    public /* synthetic */ l8(ak3 ak3Var, Function1 function1, String str, px4 px4Var, px4 px4Var2) {
        this.m = (byte) 3;
        this.n = ak3Var;
        this.f1338o = function1;
        this.p = str;
        this.r = px4Var;
        this.q = px4Var2;
    }

    public /* synthetic */ l8(yo5 yo5Var, Function0 function0, cp5 cp5Var, String str, j04 j04Var) {
        this.m = (byte) 2;
        this.n = yo5Var;
        this.f1338o = function0;
        this.q = cp5Var;
        this.p = str;
        this.r = j04Var;
    }
}
