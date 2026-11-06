package o;

import android.text.format.DateUtils;
import android.view.View;
import android.webkit.WebView;
import com.teamviewer.teamviewer.market.mobile.R;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mf7 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1466o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf7(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1466o = obj;
        this.p = obj2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                mf7 mf7Var = new mf7((OffsetDateTime) obj2, hc1Var, (byte) 0);
                mf7Var.f1466o = obj;
                return mf7Var;
            case 1:
                return new mf7((j97) this.f1466o, (wk7) obj2, hc1Var, (byte) 1);
            case 2:
                return new mf7((hk6) this.f1466o, (km) obj2, hc1Var, (byte) 2);
            case 3:
                mf7 mf7Var2 = new mf7((WebView) obj2, hc1Var, (byte) 3);
                mf7Var2.f1466o = obj;
                return mf7Var2;
            case 4:
                return new mf7((vx4) this.f1466o, (cv7) obj2, hc1Var, (byte) 4);
            case 5:
                return new mf7((iw7) this.f1466o, (Function1) obj2, hc1Var, (byte) 5);
            case 6:
                mf7 mf7Var3 = new mf7((e38) obj2, hc1Var, (byte) 6);
                mf7Var3.f1466o = obj;
                return mf7Var3;
            case 7:
                return new mf7((e38) this.f1466o, (Function0) obj2, hc1Var, (byte) 7);
            case 8:
                mf7 mf7Var4 = new mf7((ho2) obj2, hc1Var, (byte) 8);
                mf7Var4.f1466o = obj;
                return mf7Var4;
            case ep1.b /* 9 */:
                return new mf7((vh8) this.f1466o, (h37) obj2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new mf7((String) this.f1466o, (hi8) obj2, hc1Var, (byte) 10);
            default:
                return new mf7((p56) this.f1466o, (View) obj2, hc1Var, (byte) 11);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((mf7) create((ft5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((mf7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((mf7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((mf7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                return ((mf7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 5:
                return ((mf7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 6:
                return ((mf7) create((no5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                return ((mf7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 8:
                return ((mf7) create(obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.b /* 9 */:
                return ((mf7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                return ((mf7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            default:
                return ((mf7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        String elapsedTime;
        Object value;
        byte b = this.m;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        Object obj2 = this.p;
        boolean z = true;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                ft5 ft5Var = (ft5) this.f1466o;
                boolean z2 = this.n;
                if (z2 && !z2) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                while (hm3.u(ft5Var)) {
                    OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
                    aw awVar = c72.n;
                    long epochSecond = ((OffsetDateTime) obj2).toEpochSecond() - offsetDateTimeNow.toEpochSecond();
                    g72 g72Var = g72.SECONDS;
                    long jL = lq1.L(epochSecond, g72Var);
                    if (c72.e(jL)) {
                        elapsedTime = DateUtils.formatElapsedTime(0L);
                        elapsedTime.getClass();
                    } else {
                        elapsedTime = DateUtils.formatElapsedTime(c72.g(jL, g72Var));
                        elapsedTime.getClass();
                    }
                    ft5Var.setValue(elapsedTime);
                    if (c72.e(jL)) {
                        return f88Var;
                    }
                    long jCurrentTimeMillis = 1000 - (System.currentTimeMillis() % 1000);
                    this.f1466o = ft5Var;
                    this.n = true;
                    if (im3.A(jCurrentTimeMillis, this) == ne1Var) {
                        return ne1Var;
                    }
                }
                return f88Var;
            case 1:
                boolean z3 = this.n;
                if (z3) {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                j97 j97Var = (j97) this.f1466o;
                if (j97Var == null) {
                    return f88Var;
                }
                yi yiVar = new yi((wk7) obj2, (byte) 16);
                this.n = true;
                if (j97Var.b(yiVar, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            case 2:
                hk6 hk6Var = (hk6) this.f1466o;
                boolean z4 = this.n;
                if (z4) {
                    if (z4) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                float f = hk6Var.h.a() ? 0.8f : 0.3f;
                int i = hk6Var.h.a() ? 150 : 500;
                Float f2 = new Float(f);
                z38 z38VarI0 = db8.I0(i, 6, null);
                this.n = true;
                return km.a((km) obj2, f2, z38VarI0, null, null, this, 12) == ne1Var ? ne1Var : f88Var;
            case 3:
                me1 me1Var = (me1) this.f1466o;
                boolean z5 = this.n;
                if (!z5) {
                    ct1.a0(obj);
                    long j = fm7.a;
                    this.f1466o = me1Var;
                    this.n = true;
                    if (im3.B(j, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z5) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                WebView webView = (WebView) obj2;
                if (webView == null || !webView.pageDown(true)) {
                    return f88Var;
                }
                hm3.f(me1Var, null);
                return f88Var;
            case 4:
                boolean z6 = this.n;
                if (!z6) {
                    ct1.a0(obj);
                    this.n = true;
                    return vx4.a((vx4) this.f1466o, (cv7) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z6) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                iw7 iw7Var = (iw7) this.f1466o;
                l97 l97Var = iw7Var.h;
                l97 l97Var2 = iw7Var.j;
                boolean z7 = this.n;
                try {
                    if (!z7) {
                        ct1.a0(obj);
                        iw2 iw2Var = iw7Var.d;
                        String str = iw7Var.n;
                        Integer num = new Integer(iw7Var.c);
                        this.n = true;
                        obj = iw2Var.d(str, num, this);
                        if (obj == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        if (!z7) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                    }
                    Object obj3 = ((tc6) obj).m;
                    Function1 function1 = (Function1) obj2;
                    if (!(obj3 instanceof sc6)) {
                        hw7 hw7Var = (hw7) obj3;
                        l97 l97Var3 = iw7Var.f;
                        do {
                            value = l97Var3.getValue();
                        } while (!l97Var3.j(value, (List) function1.invoke(lv0.A0((List) value, hw7Var.a))));
                        String str2 = hw7Var.b;
                        iw7Var.n = str2;
                        if (str2 == null) {
                            z = false;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z);
                        l97Var2.getClass();
                        l97Var2.l(null, boolValueOf);
                    }
                    Throwable thA = tc6.a(obj3);
                    if (thA != null) {
                        l97 l97Var4 = iw7Var.l;
                        l97Var4.getClass();
                        l97Var4.l(null, thA);
                        Boolean bool = Boolean.FALSE;
                        l97Var2.getClass();
                        l97Var2.l(null, bool);
                        Function1 function2 = iw7Var.e;
                        if (function2 != null) {
                            function2.invoke(thA);
                        }
                        break;
                    }
                    ji2 ji2Var = iw7Var.f1112o;
                    if (ji2Var != null) {
                        iw7Var.f1112o = null;
                        iw7.b(iw7Var);
                        iw7Var.c(ji2Var);
                        return f88Var;
                    }
                    Boolean bool2 = Boolean.FALSE;
                    l97Var.getClass();
                    l97Var.l(null, bool2);
                    return f88Var;
                } catch (Throwable th) {
                    ji2 ji2Var2 = iw7Var.f1112o;
                    if (ji2Var2 == null) {
                        Boolean bool3 = Boolean.FALSE;
                        l97Var.getClass();
                        l97Var.l(null, bool3);
                        throw th;
                    }
                    iw7Var.f1112o = null;
                    iw7.b(iw7Var);
                    iw7Var.c(ji2Var2);
                    throw th;
                }
            case 6:
                boolean z8 = this.n;
                if (z8) {
                    if (z8) {
                        ct1.a0(obj);
                        return obj;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                no5 no5Var = (no5) this.f1466o;
                this.n = true;
                Object objA = ((e38) obj2).a(no5Var, this);
                return objA == ne1Var ? ne1Var : objA;
            case 7:
                Function0 function0 = (Function0) obj2;
                boolean z9 = this.n;
                try {
                    if (!z9) {
                        ct1.a0(obj);
                        e38 e38Var = (e38) this.f1466o;
                        this.n = true;
                        obj = e38Var.b(this);
                        if (obj == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        if (!z9) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                    }
                    function0.a();
                    return f88Var;
                } catch (Throwable th2) {
                    function0.a();
                    throw th2;
                }
            case 8:
                Object obj4 = this.f1466o;
                boolean z10 = this.n;
                if (!z10) {
                    ct1.a0(obj);
                    this.f1466o = null;
                    this.n = true;
                    return ((ho2) obj2).c(obj4, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z10) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ep1.b /* 9 */:
                boolean z11 = this.n;
                if (!z11) {
                    ct1.a0(obj);
                    this.n = true;
                    return ((vh8) this.f1466o).p.c((h37) obj2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z11) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case ep1.c /* 10 */:
                hi8 hi8Var = (hi8) obj2;
                String str3 = (String) this.f1466o;
                boolean z12 = this.n;
                if (!z12) {
                    ct1.a0(obj);
                    if (!ub7.b0(str3)) {
                        yx6 yx6Var = hi8Var.s;
                        this.n = true;
                        if (yx6Var.c(str3, this) == ne1Var) {
                            return ne1Var;
                        }
                    }
                } else {
                    if (!z12) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                l97 l97Var5 = hi8Var.u;
                Boolean bool4 = Boolean.FALSE;
                l97Var5.getClass();
                l97Var5.l(null, bool4);
                return f88Var;
            default:
                p56 p56Var = (p56) this.f1466o;
                View view = (View) obj2;
                boolean z13 = this.n;
                try {
                    if (!z13) {
                        ct1.a0(obj);
                        this.n = true;
                        Object objL = xo1.L(p56Var.u, new i91(2, hc1Var, (byte) 3), this);
                        if (objL != ne1Var) {
                            objL = f88Var;
                        }
                        if (objL == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        if (!z13) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                    }
                    if (kl8.a(view) != p56Var) {
                        return f88Var;
                    }
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    return f88Var;
                } catch (Throwable th3) {
                    if (kl8.a(view) != p56Var) {
                        throw th3;
                    }
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf7(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.p = obj;
    }
}
