package io.sentry.okhttp;

import io.sentry.a8;
import io.sentry.v1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import o.a46;
import o.ae2;
import o.cw0;
import o.ew0;
import o.f88;
import o.gl2;
import o.il5;
import o.im3;
import o.iu;
import o.j51;
import o.jl5;
import o.kh7;
import o.kj0;
import o.l03;
import o.lc6;
import o.lv0;
import o.mm8;
import o.po;
import o.rj;
import o.rj2;
import o.rv0;
import o.u52;
import o.ua5;
import o.vh1;
import o.xc0;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f216o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, byte b) {
        super(1);
        this.n = b;
        this.f216o = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        f88 f88Var = f88.a;
        Object obj2 = this.f216o;
        switch (b) {
            case 0:
                ((a46) obj).getClass();
                return (ae2) ((mm8) obj2).m;
            case 1:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                if (!((List) obj2).isEmpty()) {
                    v1Var.m(lv0.t0((List) obj2, null, null, null, d.p, 31), "proxies");
                }
                return f88Var;
            case 2:
                v1 v1Var2 = (v1) obj;
                v1Var2.getClass();
                int i = ((lc6) obj2).p;
                v1Var2.m(Integer.valueOf(i), "http.response.status_code");
                if (v1Var2.getStatus() == null) {
                    v1Var2.a(a8.fromHttpStatusCode(i));
                }
                return f88Var;
            case 3:
                return Boolean.valueOf(im3.n(obj, obj2));
            case 4:
                il5 il5Var = (il5) obj;
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    il5Var.g((jl5) arrayList.get(i2), 0, 0, 0.0f);
                }
                return f88Var;
            case 5:
                po poVar = (po) obj;
                float f = poVar.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = poVar.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = poVar.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = poVar.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new rv0(rv0.a(j51.h(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, ew0.x), (cw0) obj2));
            case 6:
                Throwable th = (Throwable) obj;
                vh1 vh1Var = (vh1) obj2;
                kh7 kh7Var = vh1Var.j;
                if (th != null) {
                    vh1Var.h.c(new gl2(th));
                }
                if (kh7Var.a()) {
                    ((rj2) kh7Var.getValue()).close();
                }
                return f88Var;
            case 7:
                u52 u52Var = (u52) obj;
                l03 l03Var = (l03) obj2;
                rj rjVar = l03Var.l;
                if (l03Var.n && l03Var.A && rjVar != null) {
                    iu iuVarH0 = u52Var.h0();
                    long jD = iuVarH0.D();
                    iuVarH0.x().g();
                    try {
                        ((iu) ((xc0) iuVarH0.f1103o).n).x().d(rjVar, 1);
                        l03Var.c(u52Var);
                    } finally {
                        ua5.x(iuVarH0, jD);
                    }
                } else {
                    l03Var.c(u52Var);
                }
                return f88Var;
            default:
                ((kj0) obj2).cancel(false);
                return f88Var;
        }
    }
}
