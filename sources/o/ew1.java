package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.commonresourcelib.swig.IFeedbackViewModel;
import com.teamviewer.commonresourcelib.swig.IRatingViewModel;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.gui.view.M2MControlView;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import com.teamviewer.teamviewerlib.swig.statistics.StatisticsEvent;
import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ew1 extends cx2 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.n = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        k33 k33Var;
        Object value4;
        byte b = this.n;
        boolean z = true;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                hz1 hz1Var = (hz1) this.receiver;
                hz1Var.getClass();
                l97 l97Var = hz1Var.r;
                j35 j35Var = (j35) l97Var.getValue();
                j35Var.getClass();
                boolean z2 = str.length() > 50;
                Character chV = ub7.V(str);
                boolean z3 = (z2 || (chV != null && qf0.J(chV.charValue()))) ? false : true;
                l97Var.l(null, j35.a(j35Var, str, str.length() > 0 && z3, z3, false, 24));
                return f88Var;
            case 1:
                h71 h71Var = (h71) obj;
                fx1 fx1Var = (fx1) this.receiver;
                if (h71Var != null) {
                    fx1Var.V0();
                    fx1Var.Y0(h71Var);
                    fx1Var.a1(false);
                } else {
                    fx1Var.V0();
                    l97 l97Var2 = fx1Var.n;
                    do {
                        value = l97Var2.getValue();
                    } while (!l97Var2.j(value, gw1.a((gw1) value, null, null, null, null, 14)));
                }
                return f88Var;
            case 2:
                h71 h71Var2 = (h71) obj;
                h71Var2.getClass();
                fx1 fx1Var2 = (fx1) this.receiver;
                fx1Var2.getClass();
                fx1Var2.V0();
                fx1Var2.Y0(h71Var2);
                fx1Var2.a1(true);
                return f88Var;
            case 3:
                SupportSession supportSession = (SupportSession) obj;
                supportSession.getClass();
                fx1 fx1Var3 = (fx1) this.receiver;
                fx1Var3.getClass();
                fx1Var3.Z0(supportSession, false);
                return f88Var;
            case 4:
                SupportSession supportSession2 = (SupportSession) obj;
                supportSession2.getClass();
                fx1 fx1Var4 = (fx1) this.receiver;
                fx1Var4.getClass();
                fx1Var4.Z0(supportSession2, true);
                return f88Var;
            case 5:
                ((fx1) this.receiver).d1(((Boolean) obj).booleanValue());
                return f88Var;
            case 6:
                ((fx1) this.receiver).e1(((Boolean) obj).booleanValue());
                return f88Var;
            case 7:
                ((fx1) this.receiver).c1(((Boolean) obj).booleanValue());
                return f88Var;
            case 8:
                ((fx1) this.receiver).d1(((Boolean) obj).booleanValue());
                return f88Var;
            case ep1.b /* 9 */:
                ((fx1) this.receiver).e1(((Boolean) obj).booleanValue());
                return f88Var;
            case ep1.c /* 10 */:
                ((fx1) this.receiver).c1(((Boolean) obj).booleanValue());
                return f88Var;
            case 11:
                int iIntValue = ((Number) obj).intValue();
                mi2 mi2Var = (mi2) this.receiver;
                l97 l97Var3 = mi2Var.p;
                oi2 oi2Var = (oi2) l97Var3.getValue();
                oi2Var.getClass();
                l97Var3.l(null, oi2.a(oi2Var, iIntValue, null, false, false, false, false, 510));
                oi2 oi2Var2 = (oi2) l97Var3.getValue();
                oi2Var2.getClass();
                l97Var3.l(null, oi2.a(oi2Var2, 0, null, false, true, false, false, 495));
                mi2Var.n.SetRating(iIntValue);
                return f88Var;
            case ep1.d /* 12 */:
                String str2 = (String) obj;
                str2.getClass();
                mi2 mi2Var2 = (mi2) this.receiver;
                mi2Var2.getClass();
                l97 l97Var4 = mi2Var2.p;
                oi2 oi2Var3 = (oi2) l97Var4.getValue();
                oi2Var3.getClass();
                l97Var4.l(null, oi2.a(oi2Var3, 0, str2, false, false, false, false, 509));
                if (str2.length() > 500) {
                    oi2 oi2Var4 = (oi2) l97Var4.getValue();
                    oi2Var4.getClass();
                    l97Var4.l(null, oi2.a(oi2Var4, 0, null, false, false, false, false, 479));
                } else {
                    oi2 oi2Var5 = (oi2) l97Var4.getValue();
                    oi2Var5.getClass();
                    l97Var4.l(null, oi2.a(oi2Var5, 0, null, false, false, true, false, 479));
                }
                mi2Var2.n.SetComment(str2);
                return f88Var;
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                IFeedbackViewModel iFeedbackViewModel = ((mi2) this.receiver).n;
                if (zBooleanValue) {
                    iFeedbackViewModel.SetCategory("SecurityFeedback");
                } else {
                    iFeedbackViewModel.SetCategory("Idea");
                }
                return f88Var;
            case 14:
                hd7 hd7Var = (hd7) obj;
                hd7Var.getClass();
                mi2 mi2Var3 = (mi2) this.receiver;
                mi2Var3.getClass();
                mi2Var3.n.SetSubcategory(hd7Var.m);
                return f88Var;
            case 15:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                mi2 mi2Var4 = (mi2) this.receiver;
                mi2Var4.getClass();
                IStatisticsHandler iStatisticsHandler = li2.a;
                li2.a.ReportEvent(new StatisticsEvent(EventType.Event, true, "qs-feedback-page", "log-files-attached", zBooleanValue2 ? "yes" : "no"));
                l97 l97Var5 = mi2Var4.p;
                oi2 oi2Var6 = (oi2) l97Var5.getValue();
                oi2Var6.getClass();
                l97Var5.l(null, oi2.a(oi2Var6, 0, null, zBooleanValue2, false, false, false, 503));
                mi2Var4.n.SetLogFileAttached(zBooleanValue2);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                IRatingViewModel iRatingViewModel = ((mi2) this.receiver).f1471o;
                if (zBooleanValue3) {
                    iRatingViewModel.ReportActionEvent(IRatingViewModel.RatingActionEventType.FeedbackSubmitted, "Problem");
                } else {
                    iRatingViewModel.ReportActionEvent(IRatingViewModel.RatingActionEventType.FeedbackRated, "Idea");
                }
                return f88Var;
            case 17:
                List list = (List) obj;
                list.getClass();
                ((s13) this.receiver).getClass();
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (hashSet.add(Long.valueOf(((ns1) obj2).a))) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                String str3 = (String) obj;
                str3.getClass();
                f33 f33Var = (f33) this.receiver;
                f33Var.getClass();
                f33Var.u.S(str3);
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                String str4 = (String) obj;
                str4.getClass();
                f33 f33Var2 = (f33) this.receiver;
                f33Var2.getClass();
                f33Var2.G.C++;
                l97 l97Var6 = f33Var2.C;
                do {
                    value2 = l97Var6.getValue();
                } while (!l97Var6.j(value2, f33Var2.W0(v23.a((v23) value2, null, false, false, false, str4, false, null, false, false, false, false, false, 0, 0, 16367))));
                return f88Var;
            case 20:
                long jLongValue = ((Number) obj).longValue();
                f33 f33Var3 = (f33) this.receiver;
                ns1 ns1VarZ0 = f33Var3.Z0(jLongValue);
                fe1 fe1Var = f33Var3.s;
                if ((ns1VarZ0 != null ? ns1VarZ0.c : null) == ls1.f1400o) {
                    long j = ns1VarZ0.a;
                    l97 l97Var7 = f33Var3.x;
                    Long l = (Long) l97Var7.getValue();
                    if (l == null || l.longValue() != j) {
                        ms1 ms1Var = ns1VarZ0.f;
                        if (ms1Var == null) {
                            ye4.c("GroupDevicesScreenViewModel", "no wake capability for " + j);
                        } else {
                            Long l2 = (Long) l97Var7.getValue();
                            if (l2 != null) {
                                f33Var3.X0(l2.longValue());
                            }
                            l97Var7.l(null, Long.valueOf(j));
                            w23 w23Var = new w23(j, z);
                            j23 j23Var = f33Var3.G;
                            j23Var.getClass();
                            j23Var.p(w23Var);
                            j23Var.o(w23Var);
                            j23Var.q(w23Var);
                            f33Var3.b1();
                            im3.R(e8.n(f33Var3), fe1Var, null, new pu1(ms1Var, f33Var3, j, null, (byte) 1), 2);
                            Long l3 = f33Var3.t;
                            if (l3 != null) {
                                im3.R(e8.n(f33Var3), fe1Var, null, new qu1(l3.longValue(), f33Var3, j, null, (byte) 1), 2);
                            }
                        }
                    }
                } else {
                    f33Var3.c1(jLongValue);
                }
                return f88Var;
            case 21:
                m13 m13Var = (m13) obj;
                m13Var.getClass();
                f33 f33Var4 = (f33) this.receiver;
                l97 l97Var8 = f33Var4.v;
                l97 l97Var9 = f33Var4.C;
                v23 v23Var = (v23) l97Var9.getValue();
                if (!v23Var.k) {
                    do {
                        value3 = l97Var9.getValue();
                    } while (!l97Var9.j(value3, v23.a((v23) value3, null, false, false, false, null, false, null, false, false, false, false, false, 0, 0, 15871)));
                    if (!v23Var.d && (k33Var = (k33) l97Var8.getValue()) != null) {
                        if (k33Var instanceof i33) {
                            f33Var4.V0(m13Var);
                        } else {
                            if (!(k33Var instanceof j33) && !(k33Var instanceof h33)) {
                                gk0.s();
                                return null;
                            }
                            k33 k33Var2 = (k33) l97Var8.getValue();
                            List list2 = (List) f33Var4.w.getValue();
                            j23 j23Var2 = f33Var4.G;
                            j23Var2.B++;
                            j23Var2.C++;
                            while (true) {
                                Object value5 = l97Var9.getValue();
                                m13 m13Var2 = m13Var;
                                if (l97Var9.j(value5, f33Var4.W0(v23.a((v23) value5, null, false, false, false, null, false, m13Var2, false, false, false, true, false, 0, 0, 15295)))) {
                                    n87 n87Var = f33Var4.B;
                                    if (n87Var != null) {
                                        n87Var.j(null);
                                    }
                                    f33Var4.B = im3.R(e8.n(f33Var4), null, null, new bj(f33Var4, m13Var2, k33Var2, list2, null, (byte) 12), 3);
                                } else {
                                    m13Var = m13Var2;
                                }
                            }
                        }
                    }
                }
                return f88Var;
            case 22:
                String str5 = (String) obj;
                str5.getClass();
                e43 e43Var = (e43) this.receiver;
                e43Var.getClass();
                e43Var.n.S(str5);
                return f88Var;
            case 23:
                ((Set) obj).getClass();
                wm3 wm3Var = (wm3) this.receiver;
                ReentrantLock reentrantLock = wm3Var.d;
                reentrantLock.lock();
                try {
                    List listP0 = lv0.P0(wm3Var.c.values());
                    reentrantLock.unlock();
                    Iterator it = listP0.iterator();
                    if (!it.hasNext()) {
                        return f88Var;
                    }
                    ((q65) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 24:
                ((jp3) this.receiver).n((Throwable) obj);
                return f88Var;
            case 25:
                ((M2MControlView) this.receiver).setMiddleButtonEnabled(((Boolean) obj).booleanValue());
                return f88Var;
            case 26:
                return ((v25) this.receiver).b((hc1) obj);
            case 27:
                rr6 rr6Var = (rr6) obj;
                rr6Var.getClass();
                xr6 xr6Var = (xr6) this.receiver;
                xr6Var.getClass();
                l97 l97Var10 = xr6Var.r;
                while (true) {
                    Object value6 = l97Var10.getValue();
                    or6 or6Var = (or6) value6;
                    rr6 rr6Var2 = rr6Var;
                    if (l97Var10.j(value6, or6.a(or6Var, xr6.c1(or6Var.a, rr6Var), null, false, false, false, false, false, false, rr6Var2, 0, 0, 1782))) {
                        return f88Var;
                    }
                    rr6Var = rr6Var2;
                }
                break;
            case 28:
                SupportSession supportSession3 = (SupportSession) obj;
                supportSession3.getClass();
                xr6 xr6Var2 = (xr6) this.receiver;
                xr6Var2.getClass();
                Integer num = xr6Var2.w;
                int sessioncode = supportSession3.getSessioncode();
                if (num != null && num.intValue() == sessioncode) {
                    xr6Var2.w = null;
                }
                return f88Var;
            default:
                String str6 = (String) obj;
                str6.getClass();
                su6 su6Var = (su6) this.receiver;
                su6Var.getClass();
                l97 l97Var11 = su6Var.t;
                do {
                    value4 = l97Var11.getValue();
                } while (!l97Var11.j(value4, it6.a((it6) value4, null, false, null, str6, null, null, null, !ub7.b0(str6) && str6.length() <= 50, false, false, false, false, false, false, false, 32631)));
                return f88Var;
        }
    }
}
