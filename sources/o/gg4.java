package o;

import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Configuration;
import android.view.textclassifier.TextClassification;
import coil3.compose.AsyncImagePainter;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.OnBoardingActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gg4 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ gg4(byte b, int i, Object obj) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x02e3 A[LOOP:2: B:106:0x02ad->B:119:0x02e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x041b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0430 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0437  */
    /* JADX WARN: Code duplicated, block: B:313:0x0768 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:314:0x076a A[Catch: all -> 0x0787, LOOP:8: B:304:0x073e->B:314:0x076a, LOOP_END, TryCatch #2 {, blocks: (B:301:0x0729, B:304:0x073e, B:306:0x074a, B:308:0x0754, B:310:0x075a, B:311:0x0762, B:314:0x076a, B:315:0x076d, B:317:0x0773, B:319:0x0779), top: B:344:0x0729 }] */
    /* JADX WARN: Code duplicated, block: B:353:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x076d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:187:0x0437, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        char c;
        char c2;
        Object objA0;
        byte b = 15;
        char c3 = 7;
        fl0 fl0VarY = null;
        wp6Var = null;
        wp6Var = null;
        wp6Var = null;
        wp6 wp6Var = null;
        bp3 bp3Var = null;
        byte b2 = 2;
        switch (this.m) {
            case 0:
                ((zp7) this.n).d(((t65) obj2).a);
                return f88.a;
            case 1:
                M2MClientActivity m2MClientActivity = (M2MClientActivity) this.n;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = M2MClientActivity.h0;
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ut7.a(au8.O(-1471007037, new l64(ds1.d0((Configuration) ux2Var.j(lh.a), vn4.Y(m2MClientActivity, ux2Var), new l51(m2MClientActivity), ux2Var), m2MClientActivity, (byte) 4), ux2Var), ux2Var, 48);
                } else {
                    ux2Var.Q();
                }
                return f88.a;
            case 2:
                ((Integer) obj2).getClass();
                ((sr4) this.n).a(yo1.Y(1), (ux2) obj);
                return f88.a;
            case 3:
                gv4 gv4Var = (gv4) this.n;
                Set set = (Set) obj;
                k76 k76Var = new k76();
                synchronized (gv4Var.m) {
                    jx4 jx4Var = gv4Var.n;
                    m5 m5Var = new m5((Object) set, (Object) gv4Var, (Object) k76Var, (byte) 28);
                    e8.i(1, m5Var);
                    Object[] objArr = jx4Var.b;
                    long[] jArr = jx4Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j & 255) < 128) {
                                        m5Var.invoke(objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i3 == 8) {
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            } else if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    List list = (List) k76Var.m;
                    if (list != null) {
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            ((wp6) list.get(i5)).b(f88.a);
                        }
                    }
                }
                return f88.a;
            case 4:
                OnBoardingActivity onBoardingActivity = (OnBoardingActivity) this.n;
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i6 = OnBoardingActivity.N;
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    a06 a06VarD0 = ds1.d0((Configuration) ux2Var2.j(lh.a), vn4.Y(onBoardingActivity, ux2Var2), new l51(onBoardingActivity), ux2Var2);
                    Object objK = ux2Var2.K();
                    aw awVar = e01.a;
                    if (objK == awVar) {
                        obj3 = objK;
                        q37 q37Var = new q37();
                        ux2Var2.g0(q37Var);
                        obj3 = q37Var;
                    }
                    obj3 = objK;
                    q37 q37Var2 = (q37) obj3;
                    boolean zF = ux2Var2.f(a06VarD0);
                    Object objK2 = ux2Var2.K();
                    Object obj4 = objK2;
                    if (zF || objK2 == awVar) {
                        s21 s21Var = new s21(q37Var2, a06VarD0, b2);
                        ux2Var2.g0(s21Var);
                        obj4 = s21Var;
                    }
                    Function1 function1 = (Function1) obj4;
                    Object objK3 = ux2Var2.K();
                    Object obj5 = objK3;
                    if (objK3 == awVar) {
                        t21 t21Var = new t21(q37Var2, b2);
                        ux2Var2.g0(t21Var);
                        obj5 = t21Var;
                    }
                    ut7.a(au8.O(-2057213280, new o31(q37Var2, onBoardingActivity, a06VarD0, function1, (Function0) obj5), ux2Var2), ux2Var2, 48);
                } else {
                    ux2Var2.Q();
                }
                return f88.a;
            case 5:
                hj5 hj5Var = (hj5) this.n;
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lv1.k(null, 0.0f, ((rn4) ux2Var3.j(un4.a)).a.A, ux2Var3, 0, 3);
                    x37.e(new sk7(y57.g(R.string.permissions_disclaimer), new n78(hj5Var.h), new yk7(R.drawable.info), null, 8), null, null, null, null, ux2Var3, 0, 62);
                } else {
                    ux2Var3.Q();
                }
                return f88.a;
            case 6:
                Integer num = (Integer) this.n;
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ux2Var4.Q();
                } else if (num != null) {
                    ux2Var4.W(-1319200294);
                    qs7.b(m77.z(num.intValue(), ux2Var4), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var4.j(un4.a)).b.f, ux2Var4, 0, 0, 131070);
                    ux2Var4.p(false);
                } else {
                    ux2Var4.W(-1319034041);
                    ux2Var4.p(false);
                }
                return f88.a;
            case 7:
                ((Integer) obj2).getClass();
                ((yo5) this.n).a(yo1.Y(1), (ux2) obj);
                return f88.a;
            case 8:
                RCClientActivity rCClientActivity = (RCClientActivity) this.n;
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i7 = RCClientActivity.c0;
                if (ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ut7.a(au8.O(329687807, new l64(ds1.d0((Configuration) ux2Var5.j(lh.a), vn4.Y(rCClientActivity, ux2Var5), new l51(rCClientActivity), ux2Var5), rCClientActivity, b), ux2Var5), ux2Var5, 48);
                } else {
                    ux2Var5.Q();
                }
                return f88.a;
            case ep1.b /* 9 */:
                p56 p56Var = (p56) this.n;
                Set set2 = (Set) obj;
                synchronized (p56Var.c) {
                    try {
                        if (((m56) p56Var.u.getValue()).compareTo(m56.q) >= 0) {
                            kx4 kx4Var = p56Var.h;
                            if (set2 instanceof vi6) {
                                kx4 kx4Var2 = ((vi6) set2).m;
                                Object[] objArr2 = kx4Var2.b;
                                long[] jArr2 = kx4Var2.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j2 = jArr2[i8];
                                        if ((((~j2) << c3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            int i10 = 0;
                                            while (i10 < i9) {
                                                if ((j2 & 255) < 128) {
                                                    Object obj6 = objArr2[(i8 << 3) + i10];
                                                    c2 = c3;
                                                    if (!(obj6 instanceof t97) || ((t97) obj6).q(1)) {
                                                        kx4Var.a(obj6);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j2 >>= 8;
                                                i10++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i9 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i8 != length2) {
                                            i8++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj7 : set2) {
                                    if (!(obj7 instanceof t97) || ((t97) obj7).q(1)) {
                                        kx4Var.a(obj7);
                                    }
                                }
                            }
                            fl0VarY = p56Var.y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (fl0VarY != null) {
                    ((gl0) fl0VarY).resumeWith(f88.a);
                }
                return f88.a;
            case ep1.c /* 10 */:
                di6 di6Var = (di6) this.n;
                jh6 jh6Var = (jh6) obj;
                px4 px4Var = (px4) obj2;
                if (!(px4Var instanceof a57)) {
                    hk0.g("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                a57 a57Var = (a57) px4Var;
                Object objG = di6Var.G(jh6Var, a57Var.getValue());
                if (objG == null) {
                    return null;
                }
                c57 c57VarE = a57Var.e();
                c57VarE.getClass();
                return new bg5(objG, c57VarE);
            case 11:
                vg6 vg6Var = (vg6) this.n;
                int iIntValue6 = ((Integer) obj).intValue();
                be1 be1Var = (be1) obj2;
                ce1 key = be1Var.getKey();
                be1 be1VarL0 = vg6Var.n.l0(key);
                if (key == z06.z) {
                    bp3 bp3Var2 = (bp3) be1VarL0;
                    bp3 parent = (bp3) be1Var;
                    while (parent != null) {
                        if (parent != bp3Var2 && (parent instanceof mj6)) {
                            pq0 pq0Var = (pq0) defpackage.a.a.getObjectVolatile((mj6) parent, op3.m);
                            parent = pq0Var != null ? pq0Var.getParent() : null;
                        } else {
                            bp3Var = parent;
                            if (bp3Var == bp3Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + bp3Var + ", expected child of " + bp3Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (bp3Var2 != null) {
                                iIntValue6++;
                            }
                        }
                    }
                    if (bp3Var == bp3Var2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + bp3Var + ", expected child of " + bp3Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (bp3Var2 != null) {
                        iIntValue6++;
                    }
                } else if (be1Var != be1VarL0) {
                    iIntValue6 = Integer.MIN_VALUE;
                } else {
                    iIntValue6++;
                }
                return Integer.valueOf(iIntValue6);
            case ep1.d /* 12 */:
                Function1 function2 = (Function1) this.n;
                ux2 ux2Var6 = (ux2) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (ux2Var6.N(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zF2 = ux2Var6.f(function2);
                    Object objK4 = ux2Var6.K();
                    if (zF2 || objK4 == e01.a) {
                        objK4 = new qv1(function2, (byte) 13);
                        ux2Var6.g0(objK4);
                    }
                    xo1.k((Function0) objK4, null, false, null, null, ga0.p, ux2Var6, 1572864, 62);
                } else {
                    ux2Var6.Q();
                }
                return f88.a;
            case 13:
                j76 j76Var = (j76) this.n;
                ((in5) obj).a();
                j76Var.m = ((t65) obj2).a;
                return f88.a;
            case 14:
                nv6 nv6Var = (nv6) this.n;
                ux2 ux2Var7 = (ux2) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (ux2Var7.N(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    a06 a06VarD1 = ds1.d0((Configuration) ux2Var7.j(lh.a), vn4.Y(nv6Var.p0(), ux2Var7), new l51(nv6Var.p0()), ux2Var7);
                    boolean zH = ux2Var7.h(nv6Var);
                    Object objK5 = ux2Var7.K();
                    if (zH || objK5 == e01.a) {
                        objK5 = new y46(nv6Var, b);
                        ux2Var7.g0(objK5);
                    }
                    xo1.w((Function1) objK5, a06VarD1, null, null, ux2Var7, 0);
                } else {
                    ux2Var7.Q();
                }
                return f88.a;
            case 15:
                eg3 eg3Var = (eg3) this.n;
                ux2 ux2Var8 = (ux2) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!ux2Var8.N(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ux2Var8.Q();
                } else if (eg3Var != eg3.m) {
                    ux2Var8.W(381198078);
                    f57.b(eg3Var, null, null, null, ux2Var8, 0);
                    ux2Var8.p(false);
                } else {
                    ux2Var8.W(381347994);
                    ux2Var8.p(false);
                }
                return f88.a;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                q07 q07Var = (q07) this.n;
                Set set3 = (Set) obj;
                synchronized (q07Var.m) {
                    try {
                        kx4 kx4Var3 = q07Var.p;
                        if (kx4Var3 != null) {
                            Object[] objArr3 = kx4Var3.b;
                            long[] jArr3 = kx4Var3.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j3 = jArr3[i11];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length3)) >>> 31);
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < i12) {
                                                if ((j3 & 255) >= 128 || !set3.contains(objArr3[(i11 << 3) + i13])) {
                                                    j3 >>= 8;
                                                    i13++;
                                                } else {
                                                    wp6Var = q07Var.r;
                                                }
                                            } else if (i12 == 8) {
                                                if (i11 != length3) {
                                                    i11++;
                                                }
                                            }
                                        }
                                    } else if (i11 != length3) {
                                        i11++;
                                    }
                                }
                            }
                        } else if (lv0.h0(set3, q07Var.n)) {
                            wp6Var = q07Var.r;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (wp6Var != null) {
                    wp6Var.b(f88.a);
                }
                return f88.a;
            case 17:
                br5 br5Var = (br5) this.n;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = (AtomicReference) br5Var.d;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        objA0 = set4;
                    } else if (obj8 instanceof Set) {
                        objA0 = qf0.L(obj8, set4);
                    } else {
                        if (!(obj8 instanceof List)) {
                            i01.b("Unexpected notification");
                            hk0.b();
                            return null;
                        }
                        objA0 = lv0.A0((Collection) obj8, qf0.K(set4));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj8, objA0)) {
                            if (br5Var.c()) {
                                ((Function1) br5Var.c).invoke(new y26(br5Var, (byte) 19));
                            }
                            return f88.a;
                        }
                    } while (atomicReference.get() == obj8);
                }
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                v57 v57Var = (v57) this.n;
                ux2 ux2Var9 = (ux2) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (ux2Var9.N(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e8.a(new wx(v57Var.c, (ox) ux2Var9.j(vc4.a), s07.a((Context) ux2Var9.j(lh.b))), v57Var.a, iq8.j(androidx.compose.foundation.layout.b.c, sf6.a(16.0f)), AsyncImagePainter.G, xz2.s, rb1.b, ux2Var9, 0, 0);
                } else {
                    ux2Var9.Q();
                }
                return f88.a;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                w57 w57Var = (w57) this.n;
                ux2 ux2Var10 = (ux2) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (ux2Var10.N(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    qs1.l(lv1.T(w57Var.c, ux2Var10, 0), m77.z(w57Var.a, ux2Var10), iq8.j(androidx.compose.foundation.layout.b.c, sf6.a(16.0f)), null, rb1.a, 0.0f, null, ux2Var10, 24584, 104);
                } else {
                    ux2Var10.Q();
                }
                return f88.a;
            case 20:
                c67 c67Var = (c67) this.n;
                ux2 ux2Var11 = (ux2) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (ux2Var11.N(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    c67Var.A0(null, ux2Var11, 0);
                } else {
                    ux2Var11.Q();
                }
                return f88.a;
            case 21:
                char[] cArr = (char[]) this.n;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iA0 = ub7.a0(charSequence, cArr, iIntValue13, false);
                if (iA0 < 0) {
                    return null;
                }
                return new vd5(Integer.valueOf(iA0), 1);
            case 22:
                sk7 sk7Var = (sk7) this.n;
                ux2 ux2Var12 = (ux2) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (ux2Var12.N(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    hw2 hw2Var = sk7Var.e;
                    if (hw2Var == null) {
                        ux2Var12.W(-1261108899);
                    } else {
                        ux2Var12.W(236413732);
                        hw2Var.invoke(ux2Var12, 0);
                    }
                    ux2Var12.p(false);
                } else {
                    ux2Var12.Q();
                }
                return f88.a;
            case 23:
                l08 l08Var = (l08) this.n;
                ux2 ux2Var13 = (ux2) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (ux2Var13.N(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    td3.b(((al7) l08Var.c.getValue()).a(ux2Var13), null, null, 0L, ux2Var13, 56, 12);
                } else {
                    ux2Var13.Q();
                }
                return f88.a;
            case 24:
                TextClassification textClassification = (TextClassification) this.n;
                ux2 ux2Var14 = (ux2) obj;
                ((Integer) obj2).intValue();
                ux2Var14.W(950061013);
                String strValueOf = String.valueOf(textClassification.getLabel());
                ux2Var14.p(false);
                return strValueOf;
            case 25:
                RemoteAction remoteAction = (RemoteAction) this.n;
                ux2 ux2Var15 = (ux2) obj;
                ((Integer) obj2).intValue();
                ux2Var15.W(-1376593684);
                String string = remoteAction.getTitle().toString();
                ux2Var15.p(false);
                return string;
            case 26:
                ((Integer) obj2).getClass();
                ((at7) this.n).a(yo1.Y(1), (ux2) obj);
                return f88.a;
            case 27:
                ((ek3) this.n).invoke(obj);
                return f88.a;
            case 28:
                return new vk3(((long) ((x50) this.n).a(0, (int) (((dl3) obj).a & 4294967295L))) & 4294967295L);
            default:
                return new vk3(((y50) this.n).a(0L, ((dl3) obj).a, (j04) obj2));
        }
    }

    public /* synthetic */ gg4(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
