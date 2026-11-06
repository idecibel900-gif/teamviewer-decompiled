package o;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModel;
import com.teamviewer.remotecontrollib.swig.ILoginStateAwareContainerViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class v31 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y31 f2269o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v31(y31 y31Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2269o = y31Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        y31 y31Var = this.f2269o;
        switch (b) {
            case 0:
                return new v31(y31Var, hc1Var, (byte) 0);
            case 1:
                return new v31(y31Var, hc1Var, (byte) 1);
            case 2:
                return new v31(y31Var, hc1Var, (byte) 2);
            case 3:
                return new v31(y31Var, hc1Var, (byte) 3);
            case 4:
                return new v31(y31Var, hc1Var, (byte) 4);
            case 5:
                return new v31(y31Var, hc1Var, (byte) 5);
            case 6:
                return new v31(y31Var, hc1Var, (byte) 6);
            case 7:
                return new v31(y31Var, hc1Var, (byte) 7);
            case 8:
                return new v31(y31Var, hc1Var, (byte) 8);
            case ep1.b /* 9 */:
                return new v31(y31Var, hc1Var, (byte) 9);
            default:
                return new v31(y31Var, hc1Var, (byte) 10);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case ep1.b /* 9 */:
                break;
        }
        return ((v31) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0163  */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        PackageInfo packageInfoG;
        Object objC;
        byte b = this.m;
        k37 k37Var = k37.m;
        byte b2 = 0;
        k37 k37Var2 = k37.n;
        f88 f88Var = f88.a;
        y31 y31Var = this.f2269o;
        ne1 ne1Var = ne1.m;
        byte b3 = 1;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                fm fmVar = (fm) y31Var.w.m;
                u31 u31Var = new u31(y31Var, b2);
                this.n = true;
                return fmVar.b(u31Var, this) == ne1Var ? ne1Var : f88Var;
            case 1:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                fm fmVar2 = (fm) y31Var.v.n;
                u31 u31Var2 = new u31(y31Var, b3);
                this.n = true;
                return fmVar2.b(u31Var2, this) == ne1Var ? ne1Var : f88Var;
            case 2:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    h37 h37Var = new h37(new j37(R.string.tv_connectNoConnection, null), k37Var, null, 12);
                    this.n = true;
                    return y31Var.c1(h37Var, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z3) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    h37 h37Var2 = new h37(new j37(R.string.tv_connectNoConnection, null), k37Var, null, 12);
                    this.n = true;
                    return y31Var.c1(h37Var2, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z4) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.n;
                if (z5) {
                    if (z5) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                ILoginStateAwareContainerViewModel iLoginStateAwareContainerViewModel = y31Var.p;
                if (ILoginStateAwareContainerViewModelSWIGJNI.ILoginStateAwareContainerViewModel_ShowLoggedInView(iLoginStateAwareContainerViewModel.a, iLoginStateAwareContainerViewModel)) {
                    y31Var.j1();
                    return f88Var;
                }
                this.n = true;
                return y31Var.V0(this) == ne1Var ? ne1Var : f88Var;
            case 5:
                boolean z6 = this.n;
                if (z6) {
                    if (z6) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                fm fmVar3 = (fm) y31Var.y.n;
                u31 u31Var3 = new u31(y31Var, (byte) 2);
                this.n = true;
                return fmVar3.b(u31Var3, this) == ne1Var ? ne1Var : f88Var;
            case 6:
                boolean z7 = this.n;
                if (z7) {
                    if (z7) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                fm fmVar4 = ((xl4) y31Var.x).a;
                u31 u31Var4 = new u31(y31Var, (byte) 3);
                this.n = true;
                return fmVar4.b(u31Var4, this) == ne1Var ? ne1Var : f88Var;
            case 7:
                boolean z8 = this.n;
                if (z8) {
                    if (z8) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                this.n = true;
                yx6 yx6Var = y31Var.N;
                yc4 yc4Var = y31Var.B;
                if (yc4Var == null) {
                    im3.e0("qsPromotionHelper");
                    throw null;
                }
                String str = (String) yc4Var.n;
                Intent launchIntentForPackage = ((Context) yc4Var.m).getPackageManager().getLaunchIntentForPackage(str);
                t60 t60Var = (t60) yc4Var.p;
                t60Var.getClass();
                str.getClass();
                PackageManager packageManager = t60Var.a.getPackageManager();
                packageManager.getClass();
                try {
                    packageInfoG = it1.G(packageManager, str, 0);
                    break;
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfoG = null;
                } catch (RuntimeException e) {
                    boolean z9 = e.getCause() instanceof TransactionTooLargeException;
                    ye4 ye4Var = ye4.a;
                    if (z9) {
                        ye4Var.g("AppIntegrationHelper", "PackageInfo query result was over the IPC transaction limit! (1MB)");
                    } else {
                        ye4Var.g("AppIntegrationHelper", "PackageInfo query failed");
                    }
                }
                if (packageInfoG == null) {
                    launchIntentForPackage = null;
                }
                if (launchIntentForPackage == null) {
                    yc4 yc4Var2 = y31Var.B;
                    if (yc4Var2 == null) {
                        im3.e0("qsPromotionHelper");
                        throw null;
                    }
                    t60 t60Var2 = (t60) yc4Var2.p;
                    String str2 = (String) yc4Var2.q;
                    t60Var2.getClass();
                    str2.getClass();
                    Context context = t60Var2.a;
                    Uri uri = Uri.parse(str2);
                    uri.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(uri);
                    intent.addFlags(268435456);
                    try {
                        context.startActivity(intent);
                    } catch (ActivityNotFoundException unused2) {
                        String str3 = (String) yc4Var2.f2598o;
                        if (str3 != null) {
                            t60Var2.getClass();
                            Context context2 = t60Var2.a;
                            Uri uri2 = Uri.parse(str3);
                            uri2.getClass();
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(uri2);
                            intent2.addFlags(268435456);
                            try {
                                context2.startActivity(intent2);
                            } catch (ActivityNotFoundException unused3) {
                                objC = yx6Var.c(new bz5(null, cz5.n), this);
                                if (objC != ne1Var) {
                                }
                                if (objC == ne1Var) {
                                    return ne1Var;
                                }
                                return f88Var;
                            }
                            break;
                        } else {
                            objC = yx6Var.c(new bz5(null, cz5.n), this);
                            if (objC != ne1Var) {
                            }
                        }
                        if (objC == ne1Var) {
                            return ne1Var;
                        }
                        return f88Var;
                    }
                    objC = f88Var;
                    break;
                } else {
                    objC = yx6Var.c(new bz5(launchIntentForPackage, cz5.m), this);
                    if (objC != ne1Var) {
                        objC = f88Var;
                    }
                }
                if (objC == ne1Var) {
                    return ne1Var;
                }
                return f88Var;
            case 8:
                boolean z10 = this.n;
                if (!z10) {
                    ct1.a0(obj);
                    h37 h37Var3 = new h37(new j37(R.string.session_copy_code, null), k37Var2, null, 12);
                    this.n = true;
                    return y31Var.c1(h37Var3, this) == ne1Var ? ne1Var : f88Var;
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
                    h37 h37Var4 = new h37(new j37(R.string.session_copy_link, null), k37Var2, null, 12);
                    this.n = true;
                    return y31Var.c1(h37Var4, this) == ne1Var ? ne1Var : f88Var;
                }
                if (z11) {
                    ct1.a0(obj);
                    return f88Var;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z12 = this.n;
                if (z12) {
                    if (z12) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var2 = y31Var.J;
                p93 p93VarA = y31Var.f2573o.a();
                this.n = true;
                return yx6Var2.c(p93VarA, this) == ne1Var ? ne1Var : f88Var;
        }
    }
}
