package o;

import android.content.Context;
import android.content.Intent;
import com.teamviewer.teamviewer.market.mobile.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hm implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f985o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ hm(Function0 function0, Function1 function1, Context context, Function1 function2) {
        this.m = (byte) 8;
        this.n = function0;
        this.p = function1;
        this.f985o = context;
        this.q = function2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x0163  */
    /* JADX WARN: Code duplicated, block: B:72:0x0211  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l97 l97Var;
        Object value;
        yl6 yl6Var;
        byte b = this.m;
        jz2 jz2Var = null;
        f88 f88Var = f88.a;
        Object obj2 = this.q;
        Object obj3 = this.f985o;
        Object obj4 = this.p;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                km kmVar = (km) obj5;
                ko koVar = (ko) obj3;
                Function1 function1 = (Function1) obj4;
                g76 g76Var = (g76) obj2;
                io ioVar = (io) obj;
                i67.E(ioVar, kmVar.c);
                bg5 bg5Var = ioVar.e;
                Object objB = kmVar.b(bg5Var.getValue());
                if (!im3.n(objB, bg5Var.getValue())) {
                    kmVar.c.n.setValue(objB);
                    koVar.n.setValue(objB);
                    if (function1 != null) {
                        function1.invoke(kmVar);
                    }
                    ioVar.a();
                    g76Var.m = true;
                } else if (function1 != null) {
                    function1.invoke(kmVar);
                }
                return f88Var;
            case 1:
                j64 j64Var = (j64) obj5;
                js7 js7Var = (js7) obj3;
                zr7 zr7Var = (zr7) obj4;
                bf3 bf3Var = (bf3) obj2;
                if (j64Var.b()) {
                    wk0 wk0Var = j64Var.d;
                    od1 od1Var = j64Var.v;
                    od1 od1Var2 = j64Var.w;
                    k76 k76Var = new k76();
                    xn5 xn5Var = new xn5(wk0Var, od1Var, k76Var);
                    vm5 vm5Var = js7Var.a;
                    vm5Var.b(zr7Var, bf3Var, xn5Var, od1Var2);
                    ns7 ns7Var = new ns7(js7Var, vm5Var);
                    js7Var.b.set(ns7Var);
                    k76Var.m = ns7Var;
                    j64Var.e = ns7Var;
                }
                return new fc((byte) 2);
            case 2:
                is1 is1Var = (is1) obj5;
                px4 px4Var = (px4) obj4;
                px4 px4Var2 = (px4) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!((Boolean) ((px4) obj3).getValue()).booleanValue()) {
                    if (zBooleanValue) {
                        px4Var.setValue(is1Var);
                        px4Var2.setValue(null);
                    } else if (((is1) px4Var.getValue()) == is1Var) {
                        px4Var2.setValue(is1Var);
                    }
                }
                return f88Var;
            case 3:
                ns1 ns1Var = (ns1) obj;
                ns1Var.getClass();
                ((Function1) obj4).invoke(new eb(obj5, obj3, obj2, (Object) ns1Var, (byte) 8));
                return f88Var;
            case 4:
                th3 th3Var = (th3) obj3;
                h76 h76Var = (h76) obj4;
                me1 me1Var = (me1) obj2;
                long jLongValue = ((Long) obj).longValue();
                i97 i97Var = (i97) ((px4) obj5).getValue();
                long jLongValue2 = i97Var != null ? ((Number) i97Var.getValue()).longValue() : jLongValue;
                long j = th3Var.c;
                xx4 xx4Var = th3Var.a;
                if (j == Long.MIN_VALUE || h76Var.m != i67.p(me1Var.getCoroutineContext())) {
                    th3Var.c = jLongValue;
                    Object[] objArr = xx4Var.m;
                    int i = xx4Var.f2559o;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((rh3) objArr[i2]).r = true;
                    }
                    h76Var.m = i67.p(me1Var.getCoroutineContext());
                }
                float f = h76Var.m;
                if (f == 0.0f) {
                    Object[] objArr2 = xx4Var.m;
                    int i3 = xx4Var.f2559o;
                    for (int i4 = 0; i4 < i3; i4++) {
                        rh3 rh3Var = (rh3) objArr2[i4];
                        rh3Var.f1923o.setValue(rh3Var.p.f2432o);
                        rh3Var.r = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - th3Var.c) / f);
                    Object[] objArr3 = xx4Var.m;
                    int i5 = xx4Var.f2559o;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        rh3 rh3Var2 = (rh3) objArr3[i6];
                        boolean zE = rh3Var2.q;
                        if (!zE) {
                            rh3Var2.t.b.setValue(Boolean.FALSE);
                            if (rh3Var2.r) {
                                rh3Var2.r = false;
                                rh3Var2.s = j2;
                            }
                            long j3 = j2 - rh3Var2.s;
                            rh3Var2.f1923o.setValue(rh3Var2.p.g(j3));
                            zE = rh3Var2.p.e(j3);
                            rh3Var2.q = zE;
                        }
                        if (!zE) {
                            z = false;
                        }
                    }
                    th3Var.d.setValue(Boolean.valueOf(!z));
                }
                return f88Var;
            case 5:
                x34 x34Var = (x34) obj5;
                io.sentry.z7 z7Var = new io.sentry.z7();
                z7Var.b = (o34) obj3;
                z7Var.c = (ld7) obj4;
                z7Var.d = (sr5) obj2;
                z7Var.a = true;
                x34Var.c = z7Var;
                return new m8(x34Var, (byte) 9);
            case 6:
                h76 h76Var2 = (h76) obj5;
                nu4 nu4Var = (nu4) obj3;
                wk6 wk6Var = (wk6) obj4;
                l8 l8Var = (l8) obj2;
                io ioVar2 = (io) obj;
                float fFloatValue = ((Number) ioVar2.e.getValue()).floatValue() - h76Var2.m;
                if (bt1.G(fFloatValue)) {
                    if (((Boolean) l8Var.invoke(Float.valueOf(h76Var2.m))).booleanValue()) {
                        ioVar2.a();
                    }
                } else if (bt1.G(fFloatValue - nu4Var.c(wk6Var, fFloatValue))) {
                    h76Var2.m += fFloatValue;
                    if (((Boolean) l8Var.invoke(Float.valueOf(h76Var2.m))).booleanValue()) {
                        ioVar2.a();
                    }
                } else {
                    ioVar2.a();
                }
                return f88Var;
            case 7:
                ql6 ql6Var = (ql6) obj5;
                bn6 bn6Var = (bn6) obj3;
                iq2 iq2Var = (iq2) obj4;
                q57 q57Var = (q57) obj2;
                z31 z31Var = (z31) obj;
                z31Var.getClass();
                if (ql6Var instanceof ol6) {
                    switch (z31Var.j.ordinal()) {
                        case 0:
                            jz2Var = jz2.u;
                            if (jz2Var != null) {
                                ga7.a(jz2Var);
                            }
                            bt1.l(iq2Var, q57Var);
                            bn6Var.E = z31Var;
                            l97Var = bn6Var.u;
                            do {
                                value = l97Var.getValue();
                                yl6Var = (yl6) value;
                                yl6Var.getClass();
                            } while (!l97Var.j(value, yl6.a(yl6Var, null, null, z31Var, bn6.e1(z31Var), null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 2097139)));
                            bn6Var.i1(z31Var.a);
                            break;
                        case 1:
                        case 2:
                            jz2Var = jz2.t;
                            if (jz2Var != null) {
                                ga7.a(jz2Var);
                            }
                            bt1.l(iq2Var, q57Var);
                            bn6Var.E = z31Var;
                            l97Var = bn6Var.u;
                            do {
                                value = l97Var.getValue();
                                yl6Var = (yl6) value;
                                yl6Var.getClass();
                            } while (!l97Var.j(value, yl6.a(yl6Var, null, null, z31Var, bn6.e1(z31Var), null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 2097139)));
                            bn6Var.i1(z31Var.a);
                            break;
                        case 3:
                            jz2Var = jz2.s;
                            if (jz2Var != null) {
                                ga7.a(jz2Var);
                            }
                            bt1.l(iq2Var, q57Var);
                            bn6Var.E = z31Var;
                            l97Var = bn6Var.u;
                            do {
                                value = l97Var.getValue();
                                yl6Var = (yl6) value;
                                yl6Var.getClass();
                            } while (!l97Var.j(value, yl6.a(yl6Var, null, null, z31Var, bn6.e1(z31Var), null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 2097139)));
                            bn6Var.i1(z31Var.a);
                            break;
                        case 4:
                        case 5:
                            jz2Var = jz2.v;
                            if (jz2Var != null) {
                                ga7.a(jz2Var);
                            }
                            bt1.l(iq2Var, q57Var);
                            bn6Var.E = z31Var;
                            l97Var = bn6Var.u;
                            do {
                                value = l97Var.getValue();
                                yl6Var = (yl6) value;
                                yl6Var.getClass();
                            } while (!l97Var.j(value, yl6.a(yl6Var, null, null, z31Var, bn6.e1(z31Var), null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 2097139)));
                            bn6Var.i1(z31Var.a);
                            break;
                        case 6:
                            if (jz2Var != null) {
                                ga7.a(jz2Var);
                            }
                            bt1.l(iq2Var, q57Var);
                            bn6Var.E = z31Var;
                            l97Var = bn6Var.u;
                            do {
                                value = l97Var.getValue();
                                yl6Var = (yl6) value;
                                yl6Var.getClass();
                            } while (!l97Var.j(value, yl6.a(yl6Var, null, null, z31Var, bn6.e1(z31Var), null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 2097139)));
                            bn6Var.i1(z31Var.a);
                            break;
                        default:
                            gk0.s();
                            return null;
                    }
                } else {
                    if (!(ql6Var instanceof pl6)) {
                        gk0.s();
                        return null;
                    }
                    ((pl6) ql6Var).c.invoke(new eb((Object) z31Var, (Object) ql6Var, (Object) iq2Var, (Object) q57Var, (byte) 12));
                }
                return f88Var;
            default:
                Function0 function0 = (Function0) obj5;
                Function1 function2 = (Function1) obj4;
                Context context = (Context) obj3;
                Function1 function3 = (Function1) obj2;
                z7 z7Var2 = (z7) obj;
                z7Var2.getClass();
                if (z7Var2.m == -1) {
                    Intent intent = z7Var2.n;
                    String stringExtra = intent != null ? intent.getStringExtra("LOGIN_RESULT_KEY") : null;
                    if (stringExtra != null) {
                        int iHashCode = stringExtra.hashCode();
                        k37 k37Var = k37.f1227o;
                        switch (iHashCode) {
                            case -1808121791:
                                if (stringExtra.equals("LOGIN_ACCOUNT_DEVICE_LIMIT_EXCEEDED_ERROR")) {
                                    String string = context.getString(R.string.install_limit_dialog_title);
                                    string.getClass();
                                    function2.invoke(new vh3(string, context.getString(R.string.install_limit_dialog_message), zh3.n));
                                }
                                break;
                            case -1516551446:
                                if (stringExtra.equals("LOGIN_GENERIC_ERROR")) {
                                    String string2 = context.getString(R.string.sign_in_generic_error);
                                    string2.getClass();
                                    function3.invoke(new h37(new i37(string2), k37Var, a47.n, 4));
                                }
                                break;
                            case -1191502261:
                                if (stringExtra.equals("LOGIN_TIMEOUT")) {
                                    String string3 = context.getString(R.string.sign_in_timeout_error);
                                    string3.getClass();
                                    function3.invoke(new h37(new i37(string3), k37Var, a47.q, 4));
                                }
                                break;
                            case -491045568:
                                if (stringExtra.equals("LOGIN_NO_BROWSER")) {
                                    String string4 = context.getString(R.string.no_browser_dialog_title);
                                    string4.getClass();
                                    function2.invoke(new vh3(string4, context.getString(R.string.no_browser_dialog_message), zh3.m));
                                }
                                break;
                            case -468599472:
                                if (stringExtra.equals("LOGIN_SUCCESSFUL")) {
                                    ye4.a("WebLoginLauncher", "Login result: LOGIN_SUCCESSFUL");
                                    function0.a();
                                }
                                break;
                            case 950567925:
                                if (stringExtra.equals("LOGIN_WRONG_EMAIL_OR_PASSWORD_ERROR")) {
                                    String string5 = context.getString(R.string.sign_in_incorrect_credentials_error);
                                    string5.getClass();
                                    function3.invoke(new h37(new i37(string5), k37Var, a47.p, 4));
                                }
                                break;
                            case 2092837115:
                                if (stringExtra.equals("LOGIN_ACTIVATION_EXPIRED_ERROR")) {
                                    String string6 = context.getString(R.string.sign_in_expired_activation_error);
                                    string6.getClass();
                                    function3.invoke(new h37(new i37(string6), k37Var, a47.f296o, 4));
                                }
                                break;
                        }
                    }
                }
                return f88Var;
        }
    }

    public /* synthetic */ hm(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.m = b;
        this.n = obj;
        this.f985o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    public /* synthetic */ hm(Function1 function1, l33 l33Var, Function1 function2, fx1 fx1Var) {
        this.m = (byte) 3;
        this.p = function1;
        this.n = l33Var;
        this.f985o = function2;
        this.q = fx1Var;
    }
}
