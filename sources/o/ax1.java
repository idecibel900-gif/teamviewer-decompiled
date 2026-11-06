package o;

import android.content.SharedPreferences;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ax1 extends cx2 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax1(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.n = b;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0385 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0387 A[LOOP:6: B:99:0x0355->B:109:0x0387, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x043e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0440 A[LOOP:10: B:148:0x0413->B:158:0x0440, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0443 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws Exception {
        Object value;
        lq2 lq2Var;
        nf nfVar;
        lq2 lq2Var2;
        Object value2;
        Object value3;
        v23 v23Var;
        Object value4;
        yl6 yl6Var;
        Object value5;
        yl6 yl6Var2;
        Object value6;
        yl6 yl6Var3;
        Object value7;
        or6 or6Var;
        byte b = this.n;
        byte b2 = 5;
        byte b3 = 1;
        byte b4 = 0;
        hc1 hc1Var = null;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                fx1 fx1Var = (fx1) this.receiver;
                fx1Var.V0();
                l97 l97Var = fx1Var.n;
                do {
                    value = l97Var.getValue();
                } while (!l97Var.j(value, gw1.a((gw1) value, null, null, null, null, 11)));
                return f88Var;
            case 1:
                ((fx1) this.receiver).b1();
                return f88Var;
            case 2:
                ((fx1) this.receiver).V0();
                return f88Var;
            case 3:
                ((mi2) this.receiver).V0();
                return f88Var;
            case 4:
                gq2 gq2Var = (gq2) this.receiver;
                kx4 kx4Var = gq2Var.c;
                kx4 kx4Var2 = gq2Var.d;
                lq2 lq2Var3 = gq2Var.a;
                br2 br2VarG = lq2Var3.g();
                wq2 wq2Var = wq2.f2437o;
                if (br2VarG == null) {
                    Object[] objArr = kx4Var2.b;
                    long[] jArr = kx4Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            lq2Var = lq2Var3;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((j & 255) < 128) {
                                        ((xp2) objArr[(i << 3) + i3]).D(wq2Var);
                                    }
                                    j >>= 8;
                                }
                                if (i2 == 8) {
                                    if (i != length) {
                                        i++;
                                        lq2Var3 = lq2Var;
                                    }
                                }
                            } else if (i != length) {
                                i++;
                                lq2Var3 = lq2Var;
                            }
                        }
                    } else {
                        lq2Var = lq2Var3;
                    }
                } else {
                    lq2Var = lq2Var3;
                    if (br2VarG.z) {
                        if (kx4Var.c(br2VarG)) {
                            br2VarG.a1();
                        }
                        wq2 wq2VarZ0 = br2VarG.Z0();
                        if (!br2VarG.m.z) {
                            ki3.c("visitAncestors called on an unattached node");
                        }
                        es4 es4Var = br2VarG.m;
                        LayoutNode layoutNodeP0 = vn4.p0(br2VarG);
                        int i4 = 0;
                        while (layoutNodeP0 != null) {
                            if ((((es4) layoutNodeP0.S.g).p & 5120) != 0) {
                                while (es4Var != null) {
                                    int i5 = es4Var.f737o;
                                    if ((i5 & 5120) != 0) {
                                        if ((i5 & 1024) != 0) {
                                            i4++;
                                        }
                                        if ((es4Var instanceof xp2) && kx4Var2.c(es4Var)) {
                                            if (i4 <= 1) {
                                                ((xp2) es4Var).D(wq2VarZ0);
                                            } else {
                                                ((xp2) es4Var).D(wq2.n);
                                            }
                                            kx4Var2.l(es4Var);
                                        }
                                    }
                                    es4Var = es4Var.q;
                                }
                            }
                            layoutNodeP0 = layoutNodeP0.F();
                            es4Var = (layoutNodeP0 == null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
                        }
                        Object[] objArr2 = kx4Var2.b;
                        long[] jArr2 = kx4Var2.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j2 = jArr2[i6];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        if ((j2 & 255) < 128) {
                                            ((xp2) objArr2[(i6 << 3) + i8]).D(wq2Var);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i7 == 8) {
                                        if (i6 != length2) {
                                            i6++;
                                        }
                                    }
                                } else if (i6 != length2) {
                                    i6++;
                                }
                            }
                        }
                    }
                }
                if (lq2Var.g() != null) {
                    lq2Var2 = lq2Var;
                    if (lq2Var2.c.Z0() == wq2Var) {
                    }
                    kx4Var.b();
                    kx4Var2.b();
                    gq2Var.e = false;
                    return f88Var;
                }
                lq2Var2 = lq2Var;
                lq2Var2.d();
                kx4Var.b();
                kx4Var2.b();
                gq2Var.e = false;
                return f88Var;
            case 5:
                return Boolean.valueOf(br2.d1(((fr2) this.receiver).H));
            case 6:
                f33 f33Var = (f33) this.receiver;
                f33Var.getClass();
                im3.R(e8.n(f33Var), null, null, new z23(f33Var, hc1Var, b3), 3);
                return f88Var;
            case 7:
                f33 f33Var2 = (f33) this.receiver;
                f33Var2.getClass();
                im3.R(e8.n(f33Var2), null, null, new z23(f33Var2, hc1Var, b4), 3);
                return f88Var;
            case 8:
                ((f33) this.receiver).u.w();
                return f88Var;
            case ep1.b /* 9 */:
                f33 f33Var3 = (f33) this.receiver;
                l97 l97Var2 = f33Var3.C;
                if (!(f33Var3.v.getValue() instanceof i33) || ((v23) l97Var2.getValue()).h) {
                    do {
                        value2 = l97Var2.getValue();
                    } while (!l97Var2.j(value2, f33Var3.W0(v23.a((v23) value2, null, false, false, true, null, false, null, false, false, false, false, false, 0, 0, 15863))));
                }
                return f88Var;
            case ep1.c /* 10 */:
                ((f33) this.receiver).Y0();
                return f88Var;
            case 11:
                ((f33) this.receiver).f1();
                return f88Var;
            case ep1.d /* 12 */:
                f33 f33Var4 = (f33) this.receiver;
                l97 l97Var3 = f33Var4.C;
                if ((f33Var4.v.getValue() instanceof i33) && ((v23) l97Var3.getValue()).i) {
                    j23 j23Var = f33Var4.G;
                    j23Var.l(j23Var.t);
                    f33Var4.V0(((v23) l97Var3.getValue()).g);
                }
                return f88Var;
            case 13:
                l97 l97Var4 = ((f33) this.receiver).C;
                if (!((v23) l97Var4.getValue()).k && !((v23) l97Var4.getValue()).d) {
                    do {
                        value3 = l97Var4.getValue();
                        v23Var = (v23) value3;
                    } while (!l97Var4.j(value3, v23.a(v23Var, null, false, false, false, null, false, null, false, false, !v23Var.j, false, false, 0, 0, 15871)));
                }
                return f88Var;
            case 14:
                e43 e43Var = (e43) this.receiver;
                e43Var.getClass();
                im3.R(e8.n(e43Var), null, null, new d43(e43Var, hc1Var, b3), 3);
                return f88Var;
            case 15:
                e43 e43Var2 = (e43) this.receiver;
                e43Var2.getClass();
                im3.R(e8.n(e43Var2), null, null, new d43(e43Var2, hc1Var, b4), 3);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((e43) this.receiver).n.w();
                return f88Var;
            case 17:
                yt2 yt2Var = ((z64) ((hb3) this.receiver)).n;
                fx3.q((SharedPreferences) yt2Var.n, "KEY_EULA_ACCEPTED", true);
                ll2 ll2Var = (ll2) yt2Var.f2642o;
                ll2Var.m = false;
                ((io.sentry.l6) ll2Var.f1375o).z(false);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((M2MClientActivity) this.receiver).N();
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((l85) this.receiver).f1342o.k(null);
                return f88Var;
            case 20:
                ze6 ze6Var = (ze6) this.receiver;
                fc1 fc1Var = ze6Var.a;
                if (fc1Var == null) {
                    im3.e0("coroutineScope");
                    throw null;
                }
                hm3.f(fc1Var, null);
                ze6Var.f();
                ve6 ve6Var = ze6Var.d;
                if (ve6Var != null) {
                    ((s41) ve6Var.f).close();
                    return f88Var;
                }
                im3.e0("connectionManager");
                throw null;
            case 21:
                l97 l97Var5 = ((bn6) this.receiver).u;
                do {
                    value4 = l97Var5.getValue();
                    yl6Var = (yl6) value4;
                    yl6Var.getClass();
                } while (!l97Var5.j(value4, yl6.a(yl6Var, null, null, null, false, null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 2031615)));
                return f88Var;
            case 22:
                l97 l97Var6 = ((bn6) this.receiver).u;
                do {
                    value5 = l97Var6.getValue();
                    yl6Var2 = (yl6) value5;
                    yl6Var2.getClass();
                } while (!l97Var6.j(value5, yl6.a(yl6Var2, null, null, null, false, null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 1966079)));
                return f88Var;
            case 23:
                bn6 bn6Var = (bn6) this.receiver;
                bn6Var.C = null;
                bn6Var.D = false;
                l97 l97Var7 = bn6Var.u;
                do {
                    value6 = l97Var7.getValue();
                    yl6Var3 = (yl6) value6;
                    yl6Var3.getClass();
                } while (!l97Var7.j(value6, yl6.a(yl6Var3, null, null, null, false, null, null, null, null, null, null, null, false, null, false, false, false, null, null, false, 2078719)));
                return f88Var;
            case 24:
                bn6 bn6Var2 = (bn6) this.receiver;
                bn6Var2.getClass();
                im3.R(e8.n(bn6Var2), null, null, new rm6(bn6Var2, hc1Var, (byte) 4), 3);
                return f88Var;
            case 25:
                bn6 bn6Var3 = (bn6) this.receiver;
                bn6Var3.getClass();
                im3.R(e8.n(bn6Var3), null, null, new rm6(bn6Var3, hc1Var, b2), 3);
                return f88Var;
            case 26:
                bn6 bn6Var4 = (bn6) this.receiver;
                bn6Var4.getClass();
                im3.R(e8.n(bn6Var4), null, null, new rm6(bn6Var4, hc1Var, b2), 3);
                return f88Var;
            case 27:
                ((xr6) this.receiver).d1();
                return f88Var;
            case 28:
                xr6 xr6Var = (xr6) this.receiver;
                Integer num = xr6Var.x;
                xr6Var.x = null;
                xr6Var.w = null;
                l97 l97Var8 = xr6Var.r;
                do {
                    value7 = l97Var8.getValue();
                    or6Var = (or6) value7;
                } while (!l97Var8.j(value7, num == null ? or6.a(or6Var, null, null, false, false, false, false, false, false, null, 0, 0, 1919) : or6.a(xr6.a1(or6Var, num.intValue()), null, null, false, false, false, false, false, false, null, 0, 0, 1919)));
                return f88Var;
            default:
                xr6 xr6Var2 = (xr6) this.receiver;
                SupportSession supportSession = ((or6) xr6Var2.r.getValue()).b;
                if (supportSession != null) {
                    im3.R(e8.n(xr6Var2), xr6Var2.f2546o, null, new ko2((Object) xr6Var2, (Object) supportSession, (Object) new oq6((byte) 19), (hc1) null, (byte) 22), 2);
                    xr6Var2.V0();
                }
                return f88Var;
        }
    }
}
