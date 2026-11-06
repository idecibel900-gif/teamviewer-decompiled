package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.teamviewer.apidefinitions.legacydevices.models.BuddyIdList;
import com.teamviewer.apidefinitions.legacydevices.models.Device;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceListResponse;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceMeta;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceSearchRequest;
import com.teamviewer.apidefinitions.legacydevices.models.GroupEditModel;
import com.teamviewer.apidefinitions.legacydevices.models.GroupListResponse;
import com.teamviewer.apidefinitions.legacydevices.models.GroupShareModel;
import com.teamviewer.commonresourcelib.swig.IIPCMessagesViewModel;
import com.teamviewer.commonresourcelib.swig.IPCMessagesSignalsHelper;
import com.teamviewer.commonresourcelib.swig.IPCMessagesViewModelLocator;
import com.teamviewer.oneapinetworklib.swig.OneAPIRequestHandlerAndroid;
import com.teamviewer.remotecontrollib.swig.INavigationViewModel;
import com.teamviewer.remotecontrollib.swig.INavigationViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModelSWIGJNI;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public class nx3 implements ay3, s67, bd6, df4, mb3, ge0, ze0, be, hp4, f12, o22 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f1610o;
    public final /* synthetic */ byte m;
    public final Object n;

    public nx3(byte b) {
        this.m = b;
        switch (b) {
            case 11:
                am4 am4Var = new am4();
                this.n = am4Var;
                if (!am4Var.n) {
                    if (am4Var.f337o) {
                        vp5.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    am4Var.a();
                    am4Var.f337o = true;
                    break;
                }
                break;
            case ep1.d /* 12 */:
                this.n = new SparseArray();
                break;
            default:
                this.n = new fm(q85.e, (byte) 6);
                break;
        }
    }

    public static int H() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public static final nx3 I(g95 g95Var, df6 df6Var) throws GeneralSecurityException {
        byte[] bArr;
        ya2 ya2VarO = ya2.o(g95Var.S(), cg2.a());
        if (ya2VarO.m().size() == 0) {
            hk0.u("empty keyset");
            return null;
        }
        try {
            yh0 yh0VarM = ya2VarO.m();
            int size = yh0VarM.size();
            if (size == 0) {
                bArr = sl3.b;
            } else {
                byte[] bArr2 = new byte[size];
                yh0VarM.d(bArr2, size);
                bArr = bArr2;
            }
            oy3 oy3VarS = oy3.s(df6Var.l(bArr, new byte[0]), cg2.a());
            if (oy3VarS.o() > 0) {
                return new nx3((Object) oy3VarS, (byte) 4);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (qm3 unused) {
            hk0.u("invalid keyset, corrupted key material");
            return null;
        }
    }

    public static w34 K(nx3 nx3Var, int i) {
        w44 w44Var = (w44) nx3Var.n;
        n47 n47VarC = el5.c();
        Function1 function1E = n47VarC != null ? n47VarC.e() : null;
        n47 n47VarF = el5.f(n47VarC);
        try {
            o44 o44Var = (o44) w44Var.f.getValue();
            el5.h(n47VarC, n47VarF, function1E);
            x34 x34Var = w44Var.q;
            long j = o44Var.j;
            boolean z = w44Var.d;
            ek3 ek3Var = new ek3(i, o44Var);
            io.sentry.z7 z7Var = x34Var.c;
            if (z7Var == null) {
                return xz2.J;
            }
            ep3 ep3Var = x34Var.b;
            sr5 sr5Var = (sr5) z7Var.d;
            boolean z2 = sr5Var instanceof jk;
            rr5 rr5Var = new rr5(z7Var, i, ep3Var, ek3Var);
            rr5Var.p = new r61(j);
            if (!z2) {
                sr5Var.a(rr5Var);
            } else if (z) {
                jk jkVar = (jk) sr5Var;
                jkVar.n.add(new vs5(1, rr5Var));
                if (!jkVar.f1174o) {
                    jkVar.f1174o = true;
                    jkVar.m.post(jkVar);
                }
            } else {
                jk jkVar2 = (jk) sr5Var;
                jkVar2.n.add(new vs5(0, rr5Var));
                if (!jkVar2.f1174o) {
                    jkVar2.f1174o = true;
                    jkVar2.m.post(jkVar2);
                }
            }
            hm3.F("compose:lazy:schedule_prefetch:index", i);
            return rr5Var;
        } catch (Throwable th) {
            el5.h(n47VarC, n47VarF, function1E);
            throw th;
        }
    }

    public synchronized Object A(int i) {
        return ((SparseArray) this.n).get(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(int i, jc1 jc1Var) {
        a64 a64Var;
        long j;
        if (jc1Var instanceof a64) {
            a64Var = (a64) jc1Var;
            int i2 = a64Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a64Var.q = i2 - Integer.MIN_VALUE;
            } else {
                a64Var = new a64(this, jc1Var);
            }
        } else {
            a64Var = new a64(this, jc1Var);
        }
        Object objA = a64Var.f301o;
        int i3 = a64Var.q;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            a64Var.m = i;
            j = 30000;
            a64Var.n = 30000L;
            a64Var.q = 1;
            objA = n85Var.a(30000L, a64Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = a64Var.n;
        int i4 = a64Var.m;
        ct1.a0(objA);
        j = j2;
        i = i4;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<GroupShareModel> sharedContactRights = y85.m.t().c().getSharedContactRights(i);
        a64Var.m = i;
        a64Var.n = j;
        a64Var.q = 2;
        Object objM = nv1.m(sharedContactRights, a64Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    public synchronized boolean C(int i) {
        Iterator it = Collections.unmodifiableList(((oy3) ((ly3) this.n).n).p()).iterator();
        while (it.hasNext()) {
            if (((ny3) it.next()).n() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(int i, String str, Integer num, jc1 jc1Var) {
        b64 b64Var;
        long j;
        if (jc1Var instanceof b64) {
            b64Var = (b64) jc1Var;
            int i2 = b64Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b64Var.s = i2 - Integer.MIN_VALUE;
            } else {
                b64Var = new b64(this, jc1Var);
            }
        } else {
            b64Var = new b64(this, jc1Var);
        }
        Object objA = b64Var.q;
        int i3 = b64Var.s;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            b64Var.n = str;
            b64Var.f401o = num;
            b64Var.m = i;
            j = 30000;
            b64Var.p = 30000L;
            b64Var.s = 1;
            objA = n85Var.a(30000L, b64Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = b64Var.p;
        int i4 = b64Var.m;
        Integer num2 = b64Var.f401o;
        String str2 = b64Var.n;
        ct1.a0(objA);
        j = j2;
        i = i4;
        num = num2;
        str = str2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<DeviceListResponse> qi0VarListDevicesByGroupId = y85.m.t().c().listDevicesByGroupId(i, str, num);
        b64Var.n = null;
        b64Var.f401o = null;
        b64Var.m = i;
        b64Var.p = j;
        b64Var.s = 2;
        Object objM = nv1.m(qi0VarListDevicesByGroupId, b64Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    public cp4 E(ke3 ke3Var, Object obj, za5 za5Var, z06 z06Var) {
        String str;
        String strJ;
        ii0 ii0Var = ke3Var.j;
        Map map = ke3Var.e;
        if (ii0Var != ii0.p) {
            List list = ((i46) this.n).d.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    vd5 vd5Var = (vd5) list.get(i);
                    kk kkVar = (kk) vd5Var.m;
                    if (((wt3) vd5Var.n).o(obj)) {
                        kkVar.getClass();
                        switch (kkVar.a) {
                            case 0:
                                x98 x98Var = (x98) obj;
                                if (!im3.n(x98Var.c, "android.resource")) {
                                    str = null;
                                } else {
                                    Configuration configuration = za5Var.a.getResources().getConfiguration();
                                    Bitmap.Config[] configArr = ya8.a;
                                    str = x98Var + ":" + (configuration.uiMode & 48);
                                }
                                break;
                            case 1:
                                x98 x98Var2 = (x98) obj;
                                String str2 = x98Var2.c;
                                if (!(str2 == null || str2.equals("file")) || x98Var2.e == null) {
                                    str = null;
                                } else {
                                    Bitmap.Config[] configArr2 = ya8.a;
                                    if ((im3.n(x98Var2.c, "file") && im3.n(lv0.o0(v67.k(x98Var2)), "android_asset")) || !((Boolean) nv1.x(za5Var, me3.c)).booleanValue() || (strJ = v67.j(x98Var2)) == null) {
                                        str = null;
                                    } else {
                                        sj2 sj2Var = za5Var.f;
                                        String str3 = wg5.n;
                                        str = x98Var2 + "-" + ((Long) sj2Var.J(vv.s(strJ)).g);
                                    }
                                }
                                break;
                            default:
                                str = ((x98) obj).a;
                                break;
                        }
                        if (str != null) {
                        }
                    }
                    i++;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                if (((List) nv1.w(ke3Var, me3.a)).isEmpty()) {
                    return new cp4(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", za5Var.b.toString());
                return new cp4(str, linkedHashMap);
            }
        }
        return null;
    }

    public synchronized ny3 F(qx3 qx3Var) {
        cx3 cx3VarC;
        int iH;
        try {
            cx3VarC = j96.c(qx3Var);
            synchronized (this) {
                iH = H();
                while (C(iH)) {
                    iH = H();
                }
            }
            return (ny3) my3VarR.a();
        } catch (Throwable th) {
            throw th;
        }
        dc5 dc5VarM = qx3Var.m();
        if (dc5VarM == dc5.UNKNOWN_PREFIX) {
            dc5VarM = dc5.TINK;
        }
        my3 my3VarR = ny3.r();
        my3VarR.c();
        ((ny3) my3VarR.n).s(cx3VarC);
        my3VarR.c();
        ((ny3) my3VarR.n).t(iH);
        my3VarR.c();
        ((ny3) my3VarR.n).v();
        my3VarR.c();
        ((ny3) my3VarR.n).u(dc5VarM);
        return (ny3) my3VarR.a();
    }

    public cx3 G(yh0 yh0Var) throws GeneralSecurityException {
        sx3 sx3Var = (sx3) this.n;
        try {
            ds1 ds1VarC = sx3Var.c();
            s1 s1VarB0 = ds1VarC.b0(yh0Var);
            ds1VarC.r0(s1VarB0);
            s1 s1Var = (s1) ds1VarC.E(s1VarB0);
            ax3 ax3VarQ = cx3.q();
            String strB = sx3Var.b();
            ax3VarQ.c();
            ((cx3) ax3VarQ.n).s(strB);
            try {
                int iA = s1Var.a();
                vh0 vh0Var = yh0.n;
                byte[] bArr = new byte[iA];
                yu0 yu0Var = new yu0(bArr, iA);
                s1Var.d(yu0Var);
                if (iA - yu0Var.d != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                vh0 vh0Var2 = new vh0(bArr);
                ax3VarQ.c();
                ((cx3) ax3VarQ.n).t(vh0Var2);
                bx3 bx3Var = bx3.SYMMETRIC;
                ax3VarQ.c();
                ((cx3) ax3VarQ.n).r(bx3Var);
                return (cx3) ax3VarQ.a();
            } catch (IOException e) {
                throw new RuntimeException(s1Var.b("ByteString"), e);
            }
        } catch (qm3 e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object J(int i, String str, jc1 jc1Var) {
        c64 c64Var;
        long j;
        if (jc1Var instanceof c64) {
            c64Var = (c64) jc1Var;
            int i2 = c64Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c64Var.r = i2 - Integer.MIN_VALUE;
            } else {
                c64Var = new c64(this, jc1Var);
            }
        } else {
            c64Var = new c64(this, jc1Var);
        }
        Object objA = c64Var.p;
        int i3 = c64Var.r;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            c64Var.n = str;
            c64Var.m = i;
            j = 30000;
            c64Var.f494o = 30000L;
            c64Var.r = 1;
            objA = n85Var.a(30000L, c64Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = c64Var.f494o;
        int i4 = c64Var.m;
        String str2 = c64Var.n;
        ct1.a0(objA);
        j = j2;
        i = i4;
        str = str2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<f88> qi0VarEditGroupById = y85.m.t().c().editGroupById(i, new GroupEditModel(str));
        c64Var.n = null;
        c64Var.m = i;
        c64Var.f494o = j;
        c64Var.r = 2;
        Object objL = nv1.l(qi0VarEditGroupById, c64Var);
        return objL == ne1Var ? ne1Var : objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object L(int i, DeviceMeta deviceMeta, jc1 jc1Var) {
        f64 f64Var;
        long j;
        if (jc1Var instanceof f64) {
            f64Var = (f64) jc1Var;
            int i2 = f64Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f64Var.r = i2 - Integer.MIN_VALUE;
            } else {
                f64Var = new f64(this, jc1Var);
            }
        } else {
            f64Var = new f64(this, jc1Var);
        }
        Object objA = f64Var.p;
        int i3 = f64Var.r;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            f64Var.n = deviceMeta;
            f64Var.m = i;
            j = 30000;
            f64Var.f772o = 30000L;
            f64Var.r = 1;
            objA = n85Var.a(30000L, f64Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = f64Var.f772o;
        int i4 = f64Var.m;
        DeviceMeta deviceMeta2 = f64Var.n;
        ct1.a0(objA);
        j = j2;
        i = i4;
        deviceMeta = deviceMeta2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<Device> qi0VarPatchDevice = y85.m.t().c().patchDevice(i, deviceMeta);
        f64Var.n = null;
        f64Var.m = i;
        f64Var.f772o = j;
        f64Var.r = 2;
        Object objM = nv1.m(qi0VarPatchDevice, f64Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    @Override // o.hp4
    public boolean a(jp4 jp4Var, MenuItem menuItem) {
        Object next;
        char c;
        j05 j05Var = ((BottomNavigationView) this.n).r;
        if (j05Var != null) {
            j16 j16Var = (j16) ((ar) j05Var).n;
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            w05.f2361o.getClass();
            Iterator it = w05.u.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((w05) next).n != itemId);
            w05 w05Var = (w05) next;
            if (w05Var == null) {
                w05Var = w05.Connect;
            }
            v05 v05Var = j16Var.q0;
            if (v05Var == null) {
                im3.e0("viewModel");
                throw null;
            }
            if (v05Var.q != w05Var) {
                int iOrdinal = w05Var.ordinal();
                int i = 3;
                int i2 = 2;
                if (iOrdinal == 0) {
                    c = 1;
                } else if (iOrdinal == 1) {
                    c = 2;
                } else if (iOrdinal == 2) {
                    c = 3;
                } else {
                    if (iOrdinal != 3) {
                        gk0.s();
                        return false;
                    }
                    c = 5;
                }
                INavigationViewModel iNavigationViewModel = v05Var.f2261o;
                if (iNavigationViewModel != null) {
                    long j = iNavigationViewModel.a;
                    if (c == 1) {
                        i = 0;
                    } else if (c == 2) {
                        i = 1;
                    } else if (c != 3) {
                        i2 = 4;
                        if (c != 4) {
                            if (c != 5) {
                                throw null;
                            }
                            i = i2;
                        }
                    } else {
                        i = i2;
                    }
                    INavigationViewModelSWIGJNI.INavigationViewModel_ReportScreenView(j, iNavigationViewModel, i);
                } else {
                    ye4.c("NavigationFragmentViewModel", "Sending GA statistics failed. ViewModel is null.");
                }
                SharedPreferences.Editor editorEdit = v05Var.n.edit();
                editorEdit.getClass();
                editorEdit.putInt("CURRENT_TAB", w05Var.m);
                editorEdit.apply();
                v05Var.q = w05Var;
            }
            j20 j20Var = j16Var.p0;
            if (j20Var != null) {
                j20Var.Q(w05Var, null);
            }
        }
        return false;
    }

    @Override // o.df4
    public ff4 b(Context context, ps6 ps6Var, du6 du6Var) {
        d31 d31Var = (d31) this.n;
        if (du6Var instanceof yt5) {
            return new rf4(context, ps6Var, (yt5) du6Var, d31Var);
        }
        if (du6Var instanceof xt5) {
            return new lf4(context, ps6Var, (xt5) du6Var, d31Var);
        }
        if (du6Var instanceof wt5) {
            return new jf4(context, ps6Var, du6Var, d31Var);
        }
        return null;
    }

    @Override // o.o22
    public dm1 c() {
        return (em1) this.n;
    }

    @Override // o.f12
    public boolean e(float f) {
        if (f == 0.0f) {
            return false;
        }
        i();
        ((NestedScrollView) this.n).j((int) f);
        return true;
    }

    @Override // o.f12
    public float f() {
        return -((NestedScrollView) this.n).getVerticalScrollFactorCompat();
    }

    @Override // o.ze0
    public void g(gk7 gk7Var) {
        gk7.O0(gk7Var, ((cm4) this.n).C());
    }

    @Override // o.hp4
    public void h(jp4 jp4Var) {
    }

    @Override // o.f12
    public void i() {
        ((NestedScrollView) this.n).p.abortAnimation();
    }

    @Override // o.ge0
    public void j() {
        PListNavigationStatisticsViewModel pListNavigationStatisticsViewModel = ((tc0) this.n).e;
        PListNavigationStatisticsViewModelSWIGJNI.PListNavigationStatisticsViewModel_SendStatistics(pListNavigationStatisticsViewModel.a, pListNavigationStatisticsViewModel, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(DeviceMeta deviceMeta, jc1 jc1Var) {
        v54 v54Var;
        long j;
        if (jc1Var instanceof v54) {
            v54Var = (v54) jc1Var;
            int i = v54Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                v54Var.q = i - Integer.MIN_VALUE;
            } else {
                v54Var = new v54(this, jc1Var);
            }
        } else {
            v54Var = new v54(this, jc1Var);
        }
        Object objA = v54Var.f2279o;
        int i2 = v54Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            v54Var.m = deviceMeta;
            j = 30000;
            v54Var.n = 30000L;
            v54Var.q = 1;
            objA = n85Var.a(30000L, v54Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = v54Var.n;
        DeviceMeta deviceMeta2 = v54Var.m;
        ct1.a0(objA);
        j = j2;
        deviceMeta = deviceMeta2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<Device> qi0VarAddDevice = y85.m.t().c().addDevice(deviceMeta);
        v54Var.m = null;
        v54Var.n = j;
        v54Var.q = 2;
        Object objM = nv1.m(qi0VarAddDevice, v54Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    @Override // o.ay3
    public void l(int i) {
        ((cy3) this.n).I.l(i);
    }

    public synchronized int m(Object obj) {
        int i;
        synchronized (this) {
            i = f1610o;
            f1610o = i + 1;
        }
        return i;
        ((SparseArray) this.n).append(i, obj);
        return i;
    }

    @Override // o.be
    public void n(int i) {
        dt4 dt4Var = (dt4) this.n;
        zd zdVar = dt4Var.r0;
        if (zdVar != null) {
            oq0 oq0VarE0 = zdVar.E0(i);
            bb5 bb5Var = dt4Var.p0;
            if (bb5Var != null) {
                bb5Var.I0(oq0VarE0, true);
            }
        }
    }

    @Override // o.ay3
    public void o(int i) {
        ((cy3) this.n).I.o(i);
    }

    @Override // o.ay3
    public void p(int[] iArr, int i) {
        cy3 cy3Var = (cy3) this.n;
        cy3Var.I.p(iArr, i);
        cy3Var.c();
    }

    @Override // o.ay3
    public void q(CharSequence charSequence) {
        cy3 cy3Var = (cy3) this.n;
        cy3Var.I.q(charSequence);
        cy3Var.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(List list, jc1 jc1Var) {
        w54 w54Var;
        long j;
        if (jc1Var instanceof w54) {
            w54Var = (w54) jc1Var;
            int i = w54Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                w54Var.q = i - Integer.MIN_VALUE;
            } else {
                w54Var = new w54(this, jc1Var);
            }
        } else {
            w54Var = new w54(this, jc1Var);
        }
        Object objA = w54Var.f2381o;
        int i2 = w54Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            w54Var.m = list;
            j = 30000;
            w54Var.n = 30000L;
            w54Var.q = 1;
            objA = n85Var.a(30000L, w54Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = w54Var.n;
        List list2 = w54Var.m;
        ct1.a0(objA);
        j = j2;
        list = list2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<f88> qi0VarBulkDeleteDevices = y85.m.t().c().bulkDeleteDevices(new BuddyIdList(list));
        w54Var.m = null;
        w54Var.n = j;
        w54Var.q = 2;
        Object objL = nv1.l(qi0VarBulkDeleteDevices, w54Var);
        return objL == ne1Var ? ne1Var : objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(int i, jc1 jc1Var) {
        x54 x54Var;
        long j;
        if (jc1Var instanceof x54) {
            x54Var = (x54) jc1Var;
            int i2 = x54Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x54Var.q = i2 - Integer.MIN_VALUE;
            } else {
                x54Var = new x54(this, jc1Var);
            }
        } else {
            x54Var = new x54(this, jc1Var);
        }
        Object objA = x54Var.f2483o;
        int i3 = x54Var.q;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            x54Var.m = i;
            j = 30000;
            x54Var.n = 30000L;
            x54Var.q = 1;
            objA = n85Var.a(30000L, x54Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = x54Var.n;
        int i4 = x54Var.m;
        ct1.a0(objA);
        j = j2;
        i = i4;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<f88> qi0VarDeleteGroupById = y85.m.t().c().deleteGroupById(i);
        x54Var.m = i;
        x54Var.n = j;
        x54Var.q = 2;
        Object objL = nv1.l(qi0VarDeleteGroupById, x54Var);
        return objL == ne1Var ? ne1Var : objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(String str, Integer num, jc1 jc1Var) {
        y54 y54Var;
        long j;
        if (jc1Var instanceof y54) {
            y54Var = (y54) jc1Var;
            int i = y54Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                y54Var.r = i - Integer.MIN_VALUE;
            } else {
                y54Var = new y54(this, jc1Var);
            }
        } else {
            y54Var = new y54(this, jc1Var);
        }
        Object objA = y54Var.p;
        int i2 = y54Var.r;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            y54Var.m = str;
            y54Var.n = num;
            j = 30000;
            y54Var.f2578o = 30000L;
            y54Var.r = 1;
            objA = n85Var.a(30000L, y54Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = y54Var.f2578o;
        Integer num2 = y54Var.n;
        String str2 = y54Var.m;
        ct1.a0(objA);
        j = j2;
        num = num2;
        str = str2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<DeviceListResponse> qi0VarFilterDevices = y85.m.t().c().filterDevices(new DeviceSearchRequest(str, null, num));
        y54Var.m = null;
        y54Var.n = null;
        y54Var.f2578o = j;
        y54Var.r = 2;
        Object objM = nv1.m(qi0VarFilterDevices, y54Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    public String toString() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 4:
                return na8.a((oy3) obj).toString();
            case 7:
                StringBuilder sb = new StringBuilder();
                i24 i24Var = (i24) obj;
                sb.append(i24Var);
                sb.append(": ");
                sb.append(((Map) i67.s(i24Var.u, i24.y[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        if (r8 == r7) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable u(java.util.Collection r9, o.jc1 r10) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.nx3.u(java.util.Collection, o.jc1):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(String str, Integer num, jc1 jc1Var) {
        z54 z54Var;
        long j;
        if (jc1Var instanceof z54) {
            z54Var = (z54) jc1Var;
            int i = z54Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                z54Var.r = i - Integer.MIN_VALUE;
            } else {
                z54Var = new z54(this, jc1Var);
            }
        } else {
            z54Var = new z54(this, jc1Var);
        }
        Object objA = z54Var.p;
        int i2 = z54Var.r;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            z54Var.m = str;
            z54Var.n = num;
            j = 30000;
            z54Var.f2671o = 30000L;
            z54Var.r = 1;
            objA = n85Var.a(30000L, z54Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = z54Var.f2671o;
        Integer num2 = z54Var.n;
        String str2 = z54Var.m;
        ct1.a0(objA);
        j = j2;
        num = num2;
        str = str2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<GroupListResponse> allGroups = y85.m.t().c().getAllGroups(str, num);
        z54Var.m = null;
        z54Var.n = null;
        z54Var.f2671o = j;
        z54Var.r = 2;
        Object objM = nv1.m(allGroups, z54Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    public dp4 w(ke3 ke3Var, cp4 cp4Var, w07 w07Var, oi6 oi6Var) {
        dp4 dp4Var;
        boolean zI;
        int iAbs;
        dp4 dp4Var2;
        ii0 ii0Var = ke3Var.j;
        pp5 pp5Var = ke3Var.r;
        if (ii0Var.m) {
            m46 m46VarD = ((i46) this.n).d();
            if (m46VarD != null) {
                synchronized (m46VarD.c) {
                    try {
                        q46 q46Var = (q46) ((LinkedHashMap) ((io.sentry.android.replay.gestures.c) m46VarD.a.d).m).get(cp4Var);
                        dp4Var = q46Var != null ? new dp4(q46Var.a, q46Var.b) : null;
                        if (dp4Var == null) {
                            nd ndVar = m46VarD.b;
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) ndVar.f1562o).get(cp4Var);
                            if (arrayList == null) {
                                dp4Var = null;
                            } else {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        dp4Var2 = null;
                                        break;
                                    }
                                    t46 t46Var = (t46) arrayList.get(i);
                                    xd3 xd3Var = (xd3) t46Var.a.get();
                                    dp4Var2 = xd3Var != null ? new dp4(xd3Var, t46Var.b) : null;
                                    if (dp4Var2 != null) {
                                        break;
                                    }
                                    i++;
                                }
                                ndVar.b();
                                dp4Var = dp4Var2;
                            }
                        }
                        if (dp4Var != null && !dp4Var.a.c()) {
                            synchronized (m46VarD.c) {
                                io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) m46VarD.a.d;
                                Object objRemove = ((LinkedHashMap) cVar.m).remove(cp4Var);
                                if (objRemove != null) {
                                    cVar.f153o = cVar.d() - cVar.g(cp4Var, objRemove);
                                    cVar.c(cp4Var, objRemove, null);
                                }
                                if (objRemove != null) {
                                }
                                if (((LinkedHashMap) m46VarD.b.f1562o).remove(cp4Var) != null) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                dp4Var = null;
            }
            if (dp4Var != null) {
                xd3 xd3Var2 = dp4Var.a;
                r70 r70Var = xd3Var2 instanceof r70 ? (r70) xd3Var2 : null;
                if (r70Var == null) {
                    zI = true;
                } else {
                    Bitmap.Config config = r70Var.a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    zI = cj3.I(ke3Var, config);
                }
                if (zI) {
                    String str = (String) cp4Var.b.get("coil#size");
                    if (str == null) {
                        Object obj = dp4Var.b.get("coil#is_sampled");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        if ((bool != null ? bool.booleanValue() : false) || (!im3.n(w07Var, w07.c) && pp5Var != pp5.n)) {
                            int iB = xd3Var2.b();
                            int iA = xd3Var2.a();
                            w07 w07Var2 = xd3Var2 instanceof r70 ? (w07) nv1.w(ke3Var, me3.b) : w07.c;
                            j12 j12Var = w07Var.a;
                            int i2 = j12Var instanceof g12 ? ((g12) j12Var).a : Integer.MAX_VALUE;
                            j12 j12Var2 = w07Var2.a;
                            int iMin = Math.min(i2, j12Var2 instanceof g12 ? ((g12) j12Var2).a : Integer.MAX_VALUE);
                            j12 j12Var3 = w07Var.b;
                            int i3 = j12Var3 instanceof g12 ? ((g12) j12Var3).a : Integer.MAX_VALUE;
                            j12 j12Var4 = w07Var2.b;
                            int iMin2 = Math.min(i3, j12Var4 instanceof g12 ? ((g12) j12Var4).a : Integer.MAX_VALUE);
                            double d = ((double) iMin) / ((double) iB);
                            double d2 = ((double) iMin2) / ((double) iA);
                            int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? oi6.n : oi6Var).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    gk0.s();
                                    return null;
                                }
                                if (d < d2) {
                                    iAbs = Math.abs(iMin - iB);
                                } else {
                                    iAbs = Math.abs(iMin2 - iA);
                                    d = d2;
                                }
                            } else if (d > d2) {
                                iAbs = Math.abs(iMin - iB);
                            } else {
                                iAbs = Math.abs(iMin2 - iA);
                                d = d2;
                            }
                            if (iAbs > 1) {
                                int iOrdinal2 = pp5Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 != 1) {
                                        gk0.s();
                                        return null;
                                    }
                                    if (d <= 1.0d) {
                                    }
                                } else if (d == 1.0d) {
                                }
                            }
                        }
                        return dp4Var;
                    }
                    if (str.equals(w07Var.toString())) {
                        return dp4Var;
                    }
                }
            }
        }
        return null;
    }

    @Override // o.ze0
    public void x(oq0 oq0Var) {
        cm4 cm4Var = (cm4) this.n;
        int i = cm4.D0;
        bb5 bb5Var = cm4Var.r0;
        if (bb5Var != null) {
            bb5Var.I0(oq0Var, true);
        }
    }

    public synchronized int y(Object obj) {
        int iIndexOfValue = ((SparseArray) this.n).indexOfValue(obj);
        if (iIndexOfValue < 0) {
            ye4.c("ListenerRegistry", "removeListener(): Listener not registered");
            return -1;
        }
        return ((SparseArray) this.n).keyAt(iIndexOfValue);
    }

    public synchronized nx3 z() {
        oy3 oy3Var;
        oy3Var = (oy3) ((ly3) this.n).a();
        if (oy3Var.o() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new nx3((Object) oy3Var, (byte) 4);
    }

    public nx3(u7 u7Var) {
        this.m = (byte) 21;
        iz6 iz6Var = new iz6(u7Var);
        jz6 jz6Var = new jz6();
        u7Var.getClass();
        IIPCMessagesViewModel iIPCMessagesViewModelGetIIPCMessagesViewModel = IPCMessagesViewModelLocator.GetIIPCMessagesViewModel();
        this.n = iIPCMessagesViewModelGetIIPCMessagesViewModel;
        IPCMessagesSignalsHelper.RegisterForPopUpMessageChangedSlot(iIPCMessagesViewModelGetIIPCMessagesViewModel, iz6Var);
        IPCMessagesSignalsHelper.RegisterForTrayMessageChangedSlot(iIPCMessagesViewModelGetIIPCMessagesViewModel, jz6Var);
        iIPCMessagesViewModelGetIIPCMessagesViewModel.getClass();
    }

    public nx3(fc1 fc1Var) {
        this.m = (byte) 28;
        fc1Var.getClass();
        this.n = di1.g();
        hc1 hc1Var = null;
        go2 go2VarK = ga0.k(it1.q(new vt4(this, hc1Var, (byte) 7)));
        OneAPIRequestHandlerAndroid oneAPIRequestHandlerAndroid = t85.a;
        q85 q85Var = q85.a;
        im3.R(fc1Var, null, null, new y0(go2VarK, hc1Var, (byte) 24), 3);
    }

    public /* synthetic */ nx3(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public nx3(i46 i46Var, cj3 cj3Var) {
        this.m = (byte) 19;
        this.n = i46Var;
    }

    public nx3(sx3 sx3Var, Class cls) {
        this.m = (byte) 0;
        if (!((Map) sx3Var.d).keySet().contains(cls) && !Void.class.equals(cls)) {
            hk0.g(to7.k("Given internalKeyMananger ", sx3Var.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
        this.n = sx3Var;
    }
}
