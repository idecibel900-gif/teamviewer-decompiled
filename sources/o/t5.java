package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthQrScannerActivityViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationQrScannerActivityViewModel;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class t5 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2084o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(Context context, qk4 qk4Var, yr1 yr1Var, px4 px4Var, px4 px4Var2, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 4;
        this.p = context;
        this.n = qk4Var;
        this.f2084o = yr1Var;
        this.r = px4Var;
        this.q = px4Var2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.f2084o;
        switch (b) {
            case 0:
                t5 t5Var = new t5(obj5, obj4, obj3, obj2, hc1Var, (byte) 0);
                t5Var.n = obj;
                return t5Var;
            case 1:
                t5 t5Var2 = new t5(obj5, obj4, obj3, obj2, hc1Var, (byte) 1);
                t5Var2.n = obj;
                return t5Var2;
            case 2:
                return new t5((px4) obj2, (List) this.n, (Function1) obj5, (fx1) obj4, (px4) obj3, hc1Var);
            case 3:
                return new t5((me1) this.n, (l85) obj5, (Resources) obj4, (px4) obj2, (px4) obj3, hc1Var, (byte) 3);
            case 4:
                return new t5((Context) obj4, (qk4) this.n, (yr1) obj5, (px4) obj2, (px4) obj3, hc1Var);
            case 5:
                return new t5((me1) this.n, (bn6) obj5, (Resources) obj4, (px4) obj2, (px4) obj3, hc1Var, (byte) 5);
            case 6:
                t5 t5Var3 = new t5(obj5, obj4, obj3, obj2, hc1Var, (byte) 6);
                t5Var3.n = obj;
                return t5Var3;
            case 7:
                return new t5((Context) obj4, (qk4) this.n, (px4) obj2, (px4) obj5, (px4) obj3, hc1Var);
            default:
                t5 t5Var4 = new t5(obj5, obj4, obj3, obj2, hc1Var, (byte) 8);
                t5Var4.n = obj;
                return t5Var4;
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
                ((t5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 1:
                return ((t5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 2:
                ((t5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 3:
                ((t5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 4:
                ((t5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 5:
                ((t5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 6:
                ((t5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 7:
                ((t5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            default:
                ((t5) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x0208  */
    /* JADX WARN: Code duplicated, block: B:75:0x0211  */
    /* JADX WARN: Code duplicated, block: B:77:0x0215  */
    /* JADX WARN: Code duplicated, block: B:79:0x0227  */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        h71 h71Var;
        tx1 rx1Var;
        tx1 qx1Var;
        ContactOnlineStatus contactOnlineStatus;
        ContactOnlineStatus contactOnlineStatus2;
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.r;
        Object obj3 = this.q;
        Object obj4 = this.f2084o;
        hc1 hc1Var = null;
        Object obj5 = this.p;
        switch (b) {
            case 0:
                me1 me1Var = (me1) this.n;
                ct1.a0(obj);
                j6 j6Var = (j6) obj4;
                im3.R(me1Var, null, null, new h0((Object) j6Var, obj5, hc1Var, (byte) 5), 3);
                iv6 iv6Var = (iv6) obj3;
                px4 px4Var = (px4) obj2;
                im3.R(me1Var, null, null, new s5(j6Var, (Context) obj5, iv6Var, px4Var, (hc1) null), 3);
                im3.R(me1Var, null, null, new s5(j6Var, iv6Var, px4Var, (Context) obj5, (hc1) null), 3);
                im3.R(me1Var, null, null, new l5(2, null, (byte) 1), 3);
                return f88Var;
            case 1:
                ct1.a0(obj);
                me1 me1Var2 = (me1) this.n;
                kb0 kb0Var = (kb0) obj4;
                hc1 hc1Var2 = null;
                im3.R(me1Var2, null, null, new j0((Object) kb0Var, obj5, obj3, hc1Var2, (byte) 11), 3);
                return im3.R(me1Var2, null, null, new h0((Object) kb0Var, obj2, hc1Var2, (byte) 16), 3);
            case 2:
                ct1.a0(obj);
                px4 px4Var2 = (px4) obj2;
                List list = ex1.a;
                z31 z31Var = (z31) px4Var2.getValue();
                if (z31Var == null) {
                    return f88Var;
                }
                List list2 = (List) this.n;
                Function1 function1 = (Function1) obj4;
                fx1 fx1Var = (fx1) obj5;
                Function1 function2 = (Function1) ((px4) obj3).getValue();
                list2.getClass();
                l33 l33VarR = lq1.r(z31Var, list2);
                switch (z31Var.j.ordinal()) {
                    case 0:
                        Integer numO = bc7.O(z31Var.d);
                        if (numO != null) {
                            int iIntValue = numO.intValue();
                            Integer num = z31Var.f;
                            String str = z31Var.a;
                            String str2 = z31Var.g;
                            String str3 = z31Var.h;
                            switch (z31Var.i.ordinal()) {
                                case 0:
                                    contactOnlineStatus = ContactOnlineStatus.Busy;
                                    contactOnlineStatus2 = contactOnlineStatus;
                                    h71Var = new h71(iIntValue, num, str, str2, str3, contactOnlineStatus2, b91.m, 16);
                                    break;
                                case 1:
                                    contactOnlineStatus = ContactOnlineStatus.Offline;
                                    contactOnlineStatus2 = contactOnlineStatus;
                                    h71Var = new h71(iIntValue, num, str, str2, str3, contactOnlineStatus2, b91.m, 16);
                                    break;
                                case 2:
                                    contactOnlineStatus = ContactOnlineStatus.Online;
                                    contactOnlineStatus2 = contactOnlineStatus;
                                    h71Var = new h71(iIntValue, num, str, str2, str3, contactOnlineStatus2, b91.m, 16);
                                    break;
                                case 3:
                                    contactOnlineStatus = ContactOnlineStatus.Away;
                                    contactOnlineStatus2 = contactOnlineStatus;
                                    h71Var = new h71(iIntValue, num, str, str2, str3, contactOnlineStatus2, b91.m, 16);
                                    break;
                                case 4:
                                    contactOnlineStatus = ContactOnlineStatus.Standby;
                                    contactOnlineStatus2 = contactOnlineStatus;
                                    h71Var = new h71(iIntValue, num, str, str2, str3, contactOnlineStatus2, b91.m, 16);
                                    break;
                                case 5:
                                case 6:
                                    contactOnlineStatus2 = null;
                                    h71Var = new h71(iIntValue, num, str, str2, str3, contactOnlineStatus2, b91.m, 16);
                                    break;
                                default:
                                    gk0.s();
                                    return null;
                            }
                        } else {
                            h71Var = null;
                        }
                        if (h71Var != null) {
                            qx1Var = new qx1(h71Var);
                            rx1Var = qx1Var;
                        } else {
                            rx1Var = null;
                        }
                        if (rx1Var != null) {
                            if (rx1Var instanceof sx1) {
                                function1.invoke(new n5((Object) fx1Var, (Object) rx1Var, (Object) function2, (byte) 13));
                            } else if (rx1Var instanceof rx1) {
                                function1.invoke(new pw1(fx1Var, rx1Var, list2, function2, z31Var));
                            } else {
                                if (rx1Var instanceof qx1) {
                                    gk0.s();
                                    return null;
                                }
                                function1.invoke(new pw1(fx1Var, rx1Var, z31Var, list2, function2));
                            }
                        }
                        px4Var2.setValue(null);
                        return f88Var;
                    case 1:
                    case 2:
                        ns1 ns1VarJ = lq1.J(z31Var);
                        if (ns1VarJ != null) {
                            rx1Var = new rx1(ns1VarJ.a, l33VarR != null ? l33VarR.a : null);
                        } else {
                            rx1Var = null;
                        }
                        if (rx1Var != null) {
                            if (rx1Var instanceof sx1) {
                                function1.invoke(new n5((Object) fx1Var, (Object) rx1Var, (Object) function2, (byte) 13));
                            } else if (rx1Var instanceof rx1) {
                                function1.invoke(new pw1(fx1Var, rx1Var, list2, function2, z31Var));
                            } else {
                                if (rx1Var instanceof qx1) {
                                    gk0.s();
                                    return null;
                                }
                                function1.invoke(new pw1(fx1Var, rx1Var, z31Var, list2, function2));
                            }
                        }
                        px4Var2.setValue(null);
                        return f88Var;
                    case 3:
                    case 6:
                        rx1Var = null;
                        if (rx1Var != null) {
                            if (rx1Var instanceof sx1) {
                                function1.invoke(new n5((Object) fx1Var, (Object) rx1Var, (Object) function2, (byte) 13));
                            } else if (rx1Var instanceof rx1) {
                                function1.invoke(new pw1(fx1Var, rx1Var, list2, function2, z31Var));
                            } else {
                                if (rx1Var instanceof qx1) {
                                    gk0.s();
                                    return null;
                                }
                                function1.invoke(new pw1(fx1Var, rx1Var, z31Var, list2, function2));
                            }
                        }
                        px4Var2.setValue(null);
                        return f88Var;
                    case 4:
                    case 5:
                        if (l33VarR != null) {
                            qx1Var = new sx1(l33VarR);
                            rx1Var = qx1Var;
                        } else {
                            rx1Var = null;
                        }
                        if (rx1Var != null) {
                            if (rx1Var instanceof sx1) {
                                function1.invoke(new n5((Object) fx1Var, (Object) rx1Var, (Object) function2, (byte) 13));
                            } else if (rx1Var instanceof rx1) {
                                function1.invoke(new pw1(fx1Var, rx1Var, list2, function2, z31Var));
                            } else {
                                if (rx1Var instanceof qx1) {
                                    gk0.s();
                                    return null;
                                }
                                function1.invoke(new pw1(fx1Var, rx1Var, z31Var, list2, function2));
                            }
                        }
                        px4Var2.setValue(null);
                        return f88Var;
                    default:
                        gk0.s();
                        return null;
                }
            case 3:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(r75.OnBoardingOpened);
                im3.R((me1) this.n, null, null, new bj((l85) obj4, (Resources) obj5, (px4) obj2, (px4) obj3, null, (byte) 14), 3);
                return f88Var;
            case 4:
                px4 px4Var3 = (px4) obj2;
                ct1.a0(obj);
                if (hm3.h((Context) obj5, "android.permission.CAMERA") == 0) {
                    IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel = ((yr1) obj4).f2633o;
                    IDeviceAuthQrScannerActivityViewModelSWIGJNI.IDeviceAuthenticationQrScannerActivityViewModel_ReportCameraPermissionIsGranted(iDeviceAuthenticationQrScannerActivityViewModel.a, iDeviceAuthenticationQrScannerActivityViewModel);
                } else if (!((Boolean) px4Var3.getValue()).booleanValue() && !((Boolean) ((px4) obj3).getValue()).booleanValue()) {
                    px4Var3.setValue(Boolean.TRUE);
                    ((qk4) this.n).a("android.permission.CAMERA", null);
                }
                return f88Var;
            case 5:
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(jz2.q);
                me1 me1Var3 = (me1) this.n;
                bn6 bn6Var = (bn6) obj4;
                px4 px4Var4 = (px4) obj2;
                px4 px4Var5 = (px4) obj3;
                im3.R(me1Var3, null, null, new xl6(bn6Var, (Resources) obj5, px4Var4, px4Var5, null, (byte) 0), 3);
                im3.R(me1Var3, null, null, new xl6(bn6Var, (Resources) obj5, px4Var5, px4Var4, null, (byte) 1), 3);
                return f88Var;
            case 6:
                me1 me1Var4 = (me1) this.n;
                ct1.a0(obj);
                im3.R(me1Var4, null, null, new bj((jf3) obj4, (Function1) obj5, (String) obj3, (Function0) obj2, null, (byte) 20), 3);
                return f88Var;
            case 7:
                px4 px4Var6 = (px4) obj2;
                ct1.a0(obj);
                if (Build.VERSION.SDK_INT >= 33 && hm3.h((Context) obj5, "android.permission.POST_NOTIFICATIONS") != 0 && !((Boolean) px4Var6.getValue()).booleanValue() && ((Boolean) ((px4) obj4).getValue()).booleanValue() && !((Boolean) ((px4) obj3).getValue()).booleanValue()) {
                    px4Var6.setValue(Boolean.TRUE);
                    ((qk4) this.n).a("android.permission.POST_NOTIFICATIONS", null);
                }
                return f88Var;
            default:
                me1 me1Var5 = (me1) this.n;
                ct1.a0(obj);
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                th8 th8Var = (th8) obj4;
                ga7.a(h57.D(zh8.ScreenOpened, th8Var.A0()));
                im3.R(me1Var5, null, null, new bj(th8Var, (Function1) obj5, (ComposeView) obj3, (Function0) obj2, null, (byte) 22), 3);
                return f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(Context context, qk4 qk4Var, px4 px4Var, px4 px4Var2, px4 px4Var3, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 7;
        this.p = context;
        this.n = qk4Var;
        this.r = px4Var;
        this.f2084o = px4Var2;
        this.q = px4Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(Object obj, Object obj2, Object obj3, Object obj4, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2084o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(me1 me1Var, oe8 oe8Var, Resources resources, px4 px4Var, px4 px4Var2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = me1Var;
        this.f2084o = oe8Var;
        this.p = resources;
        this.r = px4Var;
        this.q = px4Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(px4 px4Var, List list, Function1 function1, fx1 fx1Var, px4 px4Var2, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 2;
        this.r = px4Var;
        this.n = list;
        this.f2084o = function1;
        this.p = fx1Var;
        this.q = px4Var2;
    }
}
