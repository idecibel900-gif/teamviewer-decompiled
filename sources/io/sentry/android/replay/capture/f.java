package io.sentry.android.replay.capture;

import io.sentry.n1;
import io.sentry.v1;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import o.f88;
import o.ho8;
import o.il5;
import o.in1;
import o.iu;
import o.j04;
import o.jl5;
import o.jn0;
import o.kf0;
import o.l03;
import o.ll0;
import o.lv0;
import o.oq4;
import o.pn5;
import o.u52;
import o.xx0;
import o.yz3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f146o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, byte b) {
        super(1);
        this.n = b;
        this.f146o = obj;
        this.p = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws InterruptedException {
        f88 f88Var;
        byte b = this.n;
        f88 f88Var2 = f88.a;
        Object obj2 = this.f146o;
        Object obj3 = this.p;
        switch (b) {
            case 0:
                m mVar = (m) obj;
                mVar.getClass();
                h hVar = (h) obj2;
                ArrayList arrayList = hVar.y;
                n1 n1Var = hVar.w;
                arrayList.getClass();
                k kVar = (k) (arrayList.isEmpty() ? null : arrayList.remove(0));
                while (kVar != null) {
                    k.a(kVar, n1Var);
                    kVar = (k) (arrayList.isEmpty() ? null : arrayList.remove(0));
                    Thread.sleep(100L);
                }
                if (mVar instanceof k) {
                    k kVar2 = (k) mVar;
                    k.a(kVar2, n1Var);
                    ((Function1) obj3).invoke(kVar2.a.G);
                }
                return f88Var2;
            case 1:
                m mVar2 = (m) obj;
                q qVar = (q) obj2;
                mVar2.getClass();
                if (mVar2 instanceof k) {
                    k.a((k) mVar2, qVar.w);
                }
                qVar.k(-1);
                io.sentry.util.b.h((File) obj3);
                return f88Var2;
            case 2:
                v1 v1Var = (v1) obj;
                v1Var.getClass();
                v1Var.m((String) obj2, "domain_name");
                ArrayList arrayList2 = (ArrayList) obj3;
                if (!arrayList2.isEmpty()) {
                    v1Var.m(lv0.t0(arrayList2, null, null, null, io.sentry.okhttp.d.f218o, 31), "dns_addresses");
                }
                return f88Var2;
            case 3:
                u52 u52Var = (u52) obj;
                u52 u52Var2 = (u52) obj2;
                in1 in1VarZ = u52Var.h0().z();
                j04 j04VarB = u52Var.h0().B();
                ll0 ll0VarX = u52Var.h0().x();
                long jD = u52Var.h0().D();
                l03 l03Var = (l03) u52Var.h0().p;
                Function1 function1 = (Function1) obj3;
                in1 in1VarZ2 = u52Var2.h0().z();
                j04 j04VarB2 = u52Var2.h0().B();
                ll0 ll0VarX2 = u52Var2.h0().x();
                long jD2 = u52Var2.h0().D();
                l03 l03Var2 = (l03) u52Var2.h0().p;
                iu iuVarH0 = u52Var2.h0();
                iuVarH0.Q(in1VarZ);
                iuVarH0.R(j04VarB);
                iuVarH0.P(ll0VarX);
                iuVarH0.S(jD);
                iuVarH0.p = l03Var;
                ll0VarX.g();
                try {
                    function1.invoke(u52Var2);
                    return f88Var2;
                } finally {
                    ll0VarX.p();
                    iu iuVarH1 = u52Var2.h0();
                    iuVarH1.Q(in1VarZ2);
                    iuVarH1.R(j04VarB2);
                    iuVarH1.P(ll0VarX2);
                    iuVarH1.S(jD2);
                    iuVarH1.p = l03Var2;
                }
            case 4:
                Throwable th = (Throwable) obj;
                ((io.sentry.okhttp.b) obj2).invoke(th);
                kf0 kf0Var = (kf0) ((pn5) obj3).f1752o;
                kf0Var.e(th, false);
                do {
                    Object objA = jn0.a(kf0Var.l());
                    if (objA != null) {
                        ((oq4) objA).b.N(new xx0(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th, false));
                        f88Var = f88Var2;
                    } else {
                        f88Var = null;
                    }
                } while (f88Var != null);
                return f88Var2;
            default:
                ((il5) obj).g((jl5) obj2, 0, 0, ((ho8) obj3).A);
                return f88Var2;
        }
    }
}
