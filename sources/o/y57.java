package o;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.apidefinitions.contacts.models.ContactOnlineStatus;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionType;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class y57 implements ef8 {
    public static el7 a;
    public static DialogInterface.OnCancelListener b;

    public static final void A(w36 w36Var, int i, hw2 hw2Var) throws IOException {
        bf0 bf0Var = w36Var.n;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                gk0.l("bad zip: truncated header in extra field");
                return;
            }
            int iY = w36Var.Y() & 65535;
            long jY = ((long) w36Var.Y()) & 65535;
            long j2 = j - 4;
            if (j2 < jY) {
                gk0.l("bad zip: truncated value in extra field");
                return;
            }
            w36Var.k0(jY);
            long j3 = bf0Var.n;
            hw2Var.invoke(Integer.valueOf(iY), Long.valueOf(jY));
            long j4 = (bf0Var.n + jY) - j3;
            if (j4 < 0) {
                gk0.l(fx3.e(iY, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    bf0Var.skip(j4);
                }
                j = j2 - jY;
            }
        }
    }

    public static final io8 B(w36 w36Var, io8 io8Var) throws IOException {
        int iF = w36Var.F();
        if (iF != 67324752) {
            throw new IOException("bad zip: expected " + t(67324752) + " but was " + t(iF));
        }
        w36Var.skip(2L);
        short sY = w36Var.Y();
        int i = sY & 65535;
        if ((sY & 1) != 0) {
            gk0.l("unsupported zip: general purpose bit flag=".concat(t(i)));
            return null;
        }
        w36Var.skip(18L);
        long jY = ((long) w36Var.Y()) & 65535;
        int iY = w36Var.Y() & 65535;
        w36Var.skip(jY);
        if (io8Var == null) {
            w36Var.skip(iY);
            return null;
        }
        k76 k76Var = new k76();
        k76 k76Var2 = new k76();
        k76 k76Var3 = new k76();
        A(w36Var, iY, new lo8(w36Var, k76Var, k76Var2, k76Var3));
        return new io8(io8Var.a, io8Var.b, io8Var.c, io8Var.d, io8Var.e, io8Var.f, io8Var.g, io8Var.h, io8Var.i, io8Var.j, io8Var.k, io8Var.l, io8Var.m, (Integer) k76Var.m, (Integer) k76Var2.m, (Integer) k76Var3.m);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    public static final ot7 C(ot7 ot7Var, j04 j04Var) {
        long j;
        es7 es7Var;
        int i;
        int i2;
        dt7 dt7Var;
        c77 c77Var = ot7Var.a;
        bs7 bs7Var = d77.d;
        bs7 bs7Var2 = c77Var.a;
        if (bs7Var2.equals(as7.a)) {
            bs7Var2 = d77.d;
        }
        bs7 bs7Var3 = bs7Var2;
        long j2 = c77Var.b;
        rt7[] rt7VarArr = qt7.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = d77.a;
        }
        long j3 = j2;
        ms2 ms2Var = c77Var.c;
        if (ms2Var == null) {
            ms2Var = ms2.f1503o;
        }
        ms2 ms2Var2 = ms2Var;
        ks2 ks2Var = c77Var.d;
        ks2 ks2Var2 = new ks2(ks2Var != null ? ks2Var.a : 0);
        ls2 ls2Var = c77Var.e;
        ls2 ls2Var2 = new ls2(ls2Var != null ? ls2Var.a : 65535);
        nr2 nr2Var = c77Var.f;
        if (nr2Var == null) {
            nr2Var = nr2.a;
        }
        nr2 nr2Var2 = nr2Var;
        String str = c77Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = c77Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = d77.b;
        }
        long j5 = j4;
        h40 h40Var = c77Var.i;
        float f = h40Var != null ? h40Var.a : 0.0f;
        h40 h40Var2 = new h40(Float.isNaN(f) ? 0.0f : f);
        cs7 cs7Var = c77Var.j;
        if (cs7Var == null) {
            cs7Var = cs7.c;
        }
        cs7 cs7Var2 = cs7Var;
        kd4 kd4VarY = c77Var.k;
        if (kd4VarY == null) {
            kd4 kd4Var = kd4.f1251o;
            kd4VarY = vl5.a.y();
        }
        kd4 kd4Var2 = kd4VarY;
        long j6 = c77Var.l;
        if (j6 == 16) {
            j6 = d77.c;
        }
        long j7 = j6;
        vp7 vp7Var = c77Var.m;
        if (vp7Var == null) {
            vp7Var = vp7.b;
        }
        vp7 vp7Var2 = vp7Var;
        lw6 lw6Var = c77Var.n;
        if (lw6Var == null) {
            lw6Var = lw6.d;
        }
        lw6 lw6Var2 = lw6Var;
        rm5 rm5Var = c77Var.f499o;
        v52 v52Var = c77Var.p;
        if (v52Var == null) {
            v52Var = zk2.a;
        }
        c77 c77Var2 = new c77(bs7Var3, j3, ms2Var2, ks2Var2, ls2Var2, nr2Var2, str2, j5, h40Var2, cs7Var2, kd4Var2, j7, vp7Var2, lw6Var2, rm5Var, v52Var);
        gf5 gf5Var = ot7Var.b;
        int i3 = hf5.b;
        int i4 = gf5Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = gf5Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = j04Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        gk0.s();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = gf5Var.c;
            if ((j & 1095216660480L) == 0) {
                j = hf5.a;
            }
            es7Var = gf5Var.d;
            if (es7Var == null) {
                es7Var = es7.c;
            }
            gm5 gm5Var = gf5Var.e;
            p94 p94Var = gf5Var.f;
            i = gf5Var.g;
            if (i == 0) {
                i = k94.b;
            }
            i2 = gf5Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            dt7Var = gf5Var.i;
            if (dt7Var == null) {
                dt7Var = dt7.c;
            }
            return new ot7(c77Var2, new gf5(i4, i6, j, es7Var, gm5Var, p94Var, i, i2, dt7Var), ot7Var.c);
        }
        int iOrdinal2 = j04Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            gk0.s();
            return null;
        }
        i6 = i5;
        j = gf5Var.c;
        if ((j & 1095216660480L) == 0) {
            j = hf5.a;
        }
        es7Var = gf5Var.d;
        if (es7Var == null) {
            es7Var = es7.c;
        }
        gm5 gm5Var2 = gf5Var.e;
        p94 p94Var2 = gf5Var.f;
        i = gf5Var.g;
        if (i == 0) {
            i = k94.b;
        }
        i2 = gf5Var.h;
        if (i2 == 0) {
            i2 = 1;
        }
        dt7Var = gf5Var.i;
        if (dt7Var == null) {
            dt7Var = dt7.c;
        }
        return new ot7(c77Var2, new gf5(i4, i6, j, es7Var, gm5Var2, p94Var2, i, i2, dt7Var), ot7Var.c);
    }

    public static final boolean D(int i, m5 m5Var, br2 br2Var, v56 v56Var) {
        br2 br2VarO;
        xx4 xx4Var = new xx4(new br2[16]);
        if (!br2Var.m.z) {
            ki3.c("visitChildren called on an unattached node");
        }
        xx4 xx4Var2 = new xx4(new es4[16]);
        es4 es4Var = br2Var.m;
        es4 es4Var2 = es4Var.r;
        if (es4Var2 == null) {
            vn4.V(xx4Var2, es4Var);
        } else {
            xx4Var2.b(es4Var2);
        }
        while (true) {
            int i2 = xx4Var2.f2559o;
            if (i2 == 0) {
                break;
            }
            es4 es4VarL0 = (es4) xx4Var2.k(i2 - 1);
            if ((es4VarL0.p & 1024) == 0) {
                vn4.V(xx4Var2, es4VarL0);
            } else {
                while (es4VarL0 != null) {
                    if ((es4VarL0.f737o & 1024) != 0) {
                        xx4 xx4Var3 = null;
                        while (es4VarL0 != null) {
                            if (es4VarL0 instanceof br2) {
                                br2 br2Var2 = (br2) es4VarL0;
                                if (br2Var2.z) {
                                    xx4Var.b(br2Var2);
                                }
                            } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                int i3 = 0;
                                for (es4 es4Var3 = ((vm1) es4VarL0).B; es4Var3 != null; es4Var3 = es4Var3.r) {
                                    if ((es4Var3.f737o & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            es4VarL0 = es4Var3;
                                        } else {
                                            if (xx4Var3 == null) {
                                                xx4Var3 = new xx4(new es4[16]);
                                            }
                                            if (es4VarL0 != null) {
                                                xx4Var3.b(es4VarL0);
                                                es4VarL0 = null;
                                            }
                                            xx4Var3.b(es4Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            es4VarL0 = vn4.l0(xx4Var3);
                        }
                        break;
                    }
                    es4VarL0 = es4VarL0.r;
                }
            }
        }
        while (xx4Var.f2559o != 0 && (br2VarO = o(xx4Var, v56Var, i)) != null) {
            if (br2VarO.W0().a) {
                return ((Boolean) m5Var.invoke(br2VarO)).booleanValue();
            }
            if (q(i, m5Var, br2VarO, v56Var)) {
                return true;
            }
            xx4Var.j(br2VarO);
        }
        return false;
    }

    public static final vl7 E(ContactOnlineStatus contactOnlineStatus) {
        contactOnlineStatus.getClass();
        String value = contactOnlineStatus.getValue();
        if (im3.n(value, ContactOnlineStatus.Online.getValue())) {
            return vl7.Online;
        }
        if (im3.n(value, ContactOnlineStatus.Busy.getValue())) {
            return vl7.Busy;
        }
        return im3.n(value, ContactOnlineStatus.Away.getValue()) ? vl7.Away : vl7.Offline;
    }

    public static final Boolean F(int i, m5 m5Var, br2 br2Var, v56 v56Var) {
        int iOrdinal = br2Var.Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                br2 br2VarL = xs1.L(br2Var);
                if (br2VarL == null) {
                    hk0.l("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = br2VarL.Z0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolF = F(i, m5Var, br2VarL, v56Var);
                        if (!im3.n(boolF, Boolean.FALSE)) {
                            return boolF;
                        }
                        if (v56Var == null) {
                            if (br2VarL.Z0() != wq2.n) {
                                hk0.l("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            br2 br2VarH = xs1.H(br2VarL);
                            if (br2VarH == null) {
                                hk0.l("ActiveParent must have a focusedChild");
                                return null;
                            }
                            v56Var = xs1.J(br2VarH);
                        }
                        return Boolean.valueOf(q(i, m5Var, br2Var, v56Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            gk0.s();
                            return null;
                        }
                        hk0.l("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (v56Var == null) {
                    v56Var = xs1.J(br2VarL);
                }
                return Boolean.valueOf(q(i, m5Var, br2Var, v56Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    gk0.s();
                    return null;
                }
                if (br2Var.W0().a) {
                    return (Boolean) m5Var.invoke(br2Var);
                }
                return v56Var == null ? Boolean.valueOf(p(br2Var, i, m5Var)) : Boolean.valueOf(D(i, m5Var, br2Var, v56Var));
            }
        }
        return Boolean.valueOf(p(br2Var, i, m5Var));
    }

    public static String G(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case ep1.b /* 9 */:
                        sb.append("\\t");
                        break;
                    case ep1.c /* 10 */:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case ep1.d /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void d(final String str, final long j, final long j2, ux2 ux2Var, final int i) {
        int i2;
        ux2 ux2Var2;
        ux2Var.Y(-853476628);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.e(j2) ? 256 : 128;
        }
        int i3 = i & 3072;
        cs4 cs4Var = cs4.b;
        if (i3 == 0) {
            i2 |= ux2Var.f(cs4Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            fs4 fs4VarS = au8.s(androidx.compose.foundation.layout.b.l(ka0.F(cs4Var, 16.0f, 0.0f, 16.0f, 0.0f, 10), 40.0f), j, sf6.a);
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarS);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS2, d82.t, ux2Var);
            qs7.b(str, androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), j2, 0L, null, 0L, new qo7(3), 0L, 1, false, 1, 0, null, ((rn4) ux2Var.j(un4.a)).b.j, ux2Var, (i2 & 14) | 48 | (i2 & 896), 24960, 109560);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.pf7
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y57.d(str, j, j2, (ux2) obj, yo1.Y(i | 1));
                    return f88.a;
                }
            };
        }
    }

    public static final void e(boolean z, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2Var.Y(656000901);
        int i2 = (ux2Var.g(z) ? 4 : 2) | i | 48;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                ux2Var.W(821765111);
                String strZ = m77.z(R.string.session_assistar_avatar_name, ux2Var);
                h72 h72Var = vf2.a;
                d(strZ, ((tf2) ux2Var.j(h72Var)).g, ((tf2) ux2Var.j(h72Var)).f, ux2Var, 3072);
                ux2Var.p(false);
            } else {
                ux2Var.W(822062711);
                String strZ2 = m77.z(R.string.session_default_avatar_name, ux2Var);
                h72 h72Var2 = un4.a;
                d(strZ2, ((rn4) ux2Var.j(h72Var2)).a.c, ((rn4) ux2Var.j(h72Var2)).a.d, ux2Var, 3072);
                ux2Var.p(false);
            }
            fs4Var2 = cs4.b;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new vh(z, fs4Var2, i, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(SupportSession supportSession, fs4 fs4Var, Function0 function0, Function1 function1, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        boolean z;
        int i2;
        int i3;
        Function1 function2 = function1;
        ux2 ux2Var2 = ux2Var;
        supportSession.getClass();
        ux2Var2.Y(-1219726043);
        byte b2 = 4;
        int i4 = i | (ux2Var2.h(supportSession) ? 4 : 2) | 48 | (ux2Var2.h(function0) ? 256 : 128) | (ux2Var2.h(function2) ? 2048 : 1024);
        if (ux2Var2.N(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z2 = supportSession.getSupportSessionType() == SupportSessionType.AssistAR;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), sf6.a(12.0f));
            h72 h72Var = ug3.a;
            xg3 xg3Var = (xg3) ux2Var2.j(h72Var);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ua5.s(ux2Var2);
            }
            mw4 mw4Var = (mw4) objK;
            Object[] objArr = (i4 & 896) == 256;
            Object objK2 = ux2Var2.K();
            if (objArr != false || objK2 == awVar) {
                objK2 = new yd7(function0, b2);
                ux2Var2.g0(objK2);
            }
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.b.a(fs4VarJ, mw4Var, xg3Var, false, null, (Function0) objK2, 28), 0.0f, 12.0f, 1);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z3 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z3) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            e(z2, null, ux2Var2, 0);
            s14 s14Var = new s14(1.0f, true);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, s14Var);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            String name = supportSession.getName();
            if (name == null) {
                z = false;
                name = to7.m(ux2Var2, 46992204, R.string.session_default_name, ux2Var2, false);
            } else {
                z = false;
                ux2Var2.W(46991708);
                ux2Var2.p(false);
            }
            boolean z4 = z;
            qs7.b(name, null, ep1.r(ux2Var2).q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ep1.s(ux2Var2).j, ux2Var, 0, 24960, 110586);
            String strValueOf = String.valueOf(supportSession.getSessioncode());
            boolean zF = ux2Var.f(strValueOf);
            Object objK3 = ux2Var.K();
            if (zF || objK3 == awVar) {
                objK3 = new fy(strValueOf, (byte) 18);
                ux2Var.g0(objK3);
            }
            qs7.b(qs1.M(strValueOf), cp6.a(cs4Var, z4, (Function1) objK3), ep1.r(ux2Var).s, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ep1.s(ux2Var).k, ux2Var, 0, 24960, 110584);
            int i5 = qf7.a[supportSession.getRecipientStatus().ordinal()];
            if (i5 == 1) {
                i2 = 47020612;
                i3 = R.string.user_waiting;
            } else {
                if (i5 != 2) {
                    throw fx3.m(47017881, ux2Var, z4);
                }
                i2 = 47023815;
                i3 = R.string.user_not_joined;
            }
            qs7.b(to7.m(ux2Var, i2, i3, ux2Var, z4), null, ep1.r(ux2Var).s, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ep1.s(ux2Var).l, ux2Var, 0, 24960, 110586);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            ud5 ud5VarT = lv1.T(R.drawable.ic_connect, ux2Var2, z4 ? 1 : 0);
            String strZ = m77.z(R.string.connect_content_description, ux2Var2);
            long j = ep1.r(ux2Var2).a;
            fs4 fs4VarJ2 = iq8.j(androidx.compose.foundation.layout.b.l(ka0.F(cs4Var, 20.0f, 0.0f, 12.0f, 0.0f, 10), 40.0f), sf6.a(8.0f));
            xg3 xg3Var2 = (xg3) ux2Var2.j(h72Var);
            Object objK4 = ux2Var2.K();
            if (objK4 == awVar) {
                objK4 = ua5.s(ux2Var2);
            }
            mw4 mw4Var2 = (mw4) objK4;
            boolean z5 = (ux2Var2.h(supportSession) ? 1 : 0) | ((i4 & 7168) == 2048 ? (char) 1 : z4 ? 1 : 0);
            Object objK5 = ux2Var2.K();
            if (z5 != 0 || objK5 == awVar) {
                function2 = function1;
                objK5 = new xw1(function2, supportSession, (byte) 2);
                ux2Var2.g0(objK5);
            } else {
                function2 = function1;
            }
            td3.b(ud5VarT, strZ, ka0.B(androidx.compose.foundation.b.a(fs4VarJ2, mw4Var2, xg3Var2, false, null, (Function0) objK5, 28), 8.0f), j, ux2Var2, 8, 0);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) supportSession, fs4Var2, (Object) function0, (Object) function2, i, (byte) 19);
        }
    }

    public static m78 g(int i) {
        return new m78(i, new Object[0]);
    }

    public static final void h(fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1181016503);
        int i2 = i | 6;
        if (ux2Var2.N(i2 & 1, (i2 & 3) != 2)) {
            w50 w50Var = xz2.B;
            cw cwVar = iq8.e;
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            kw0 kw0VarA = iw0.a(cwVar, w50Var, ux2Var2, 54);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fillElement);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarL = androidx.compose.foundation.layout.b.l(ka0.F(cs4Var, 0.0f, 0.0f, 0.0f, 30.0f, 7), 36.0f);
            h72 h72Var = un4.a;
            st5.a(fs4VarL, ((rn4) ux2Var2.j(h72Var)).a.a, 4.0f, 0L, 0, 0.0f, ux2Var2, 390, 56);
            qs7.b(m77.z(R.string.buddy_list_activating_header, ux2Var2), null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var, 0, 0, 131066);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var2, i, (byte) 15);
        }
    }

    public static final Object i(bo7 bo7Var, j0 j0Var) throws Exception {
        if (!bo7Var.j()) {
            gl0 gl0Var = new gl0(1, vt1.A(j0Var));
            gl0Var.t();
            bo7Var.b(m12.n, new ek0(gl0Var, (byte) 4));
            return gl0Var.q();
        }
        Exception excH = bo7Var.h();
        if (excH != null) {
            throw excH;
        }
        if (!((hy8) bo7Var).d) {
            return bo7Var.i();
        }
        throw new CancellationException("Task " + bo7Var + " was cancelled normally.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        o.hk0.l("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        o.hk0.l("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean j(o.v56 r18, o.v56 r19, o.v56 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = k(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = k(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            o.hk0.l(r4)
            return r12
        L94:
            o.hk0.l(r4)
            return r12
        L98:
            return r18
        L99:
            o.hk0.l(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.y57.j(o.v56, o.v56, o.v56, int):boolean");
    }

    public static final boolean k(int i, v56 v56Var, v56 v56Var2) {
        if (i == 3 || i == 4) {
            return v56Var.d > v56Var2.b && v56Var.b < v56Var2.d;
        }
        if (i == 5 || i == 6) {
            return v56Var.c > v56Var2.a && v56Var.a < v56Var2.c;
        }
        hk0.l("This function should only be used for 2-D focus search");
        return false;
    }

    public static final LinkedHashMap l(ArrayList arrayList) {
        String str = wg5.n;
        wg5 wg5VarS = vv.s("/");
        vd5[] vd5VarArr = {new vd5(wg5VarS, new io8(wg5VarS, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(xm4.Q(1));
        xm4.T(linkedHashMap, vd5VarArr);
        for (io8 io8Var : lv0.J0(arrayList, new dj6((byte) 8))) {
            if (((io8) linkedHashMap.put(io8Var.a, io8Var)) == null) {
                while (true) {
                    wg5 wg5Var = io8Var.a;
                    wg5 wg5VarC = wg5Var.c();
                    if (wg5VarC == null) {
                        break;
                    }
                    io8 io8Var2 = (io8) linkedHashMap.get(wg5VarC);
                    if (io8Var2 != null) {
                        io8Var2.q.add(wg5Var);
                        break;
                    }
                    io8 io8Var3 = new io8(wg5VarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMap.put(wg5VarC, io8Var3);
                    io8Var3.q.add(wg5Var);
                    io8Var = io8Var3;
                }
            }
        }
        return linkedHashMap;
    }

    public static final void m(br2 br2Var, xx4 xx4Var) {
        if (!br2Var.m.z) {
            ki3.c("visitChildren called on an unattached node");
        }
        xx4 xx4Var2 = new xx4(new es4[16]);
        es4 es4Var = br2Var.m;
        es4 es4Var2 = es4Var.r;
        if (es4Var2 == null) {
            vn4.V(xx4Var2, es4Var);
        } else {
            xx4Var2.b(es4Var2);
        }
        while (true) {
            int i = xx4Var2.f2559o;
            if (i == 0) {
                return;
            }
            es4 es4VarL0 = (es4) xx4Var2.k(i - 1);
            if ((es4VarL0.p & 1024) == 0) {
                vn4.V(xx4Var2, es4VarL0);
            } else {
                while (es4VarL0 != null) {
                    if ((es4VarL0.f737o & 1024) != 0) {
                        xx4 xx4Var3 = null;
                        while (es4VarL0 != null) {
                            if (es4VarL0 instanceof br2) {
                                br2 br2Var2 = (br2) es4VarL0;
                                if (br2Var2.z && !vn4.p0(br2Var2).c0) {
                                    if (br2Var2.W0().a) {
                                        xx4Var.b(br2Var2);
                                    } else {
                                        m(br2Var2, xx4Var);
                                    }
                                }
                            } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                int i2 = 0;
                                for (es4 es4Var3 = ((vm1) es4VarL0).B; es4Var3 != null; es4Var3 = es4Var3.r) {
                                    if ((es4Var3.f737o & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            es4VarL0 = es4Var3;
                                        } else {
                                            if (xx4Var3 == null) {
                                                xx4Var3 = new xx4(new es4[16]);
                                            }
                                            if (es4VarL0 != null) {
                                                xx4Var3.b(es4VarL0);
                                                es4VarL0 = null;
                                            }
                                            xx4Var3.b(es4Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            es4VarL0 = vn4.l0(xx4Var3);
                        }
                        break;
                    }
                    es4VarL0 = es4VarL0.r;
                }
            }
        }
    }

    public static final String n(k48 k48Var) {
        StringBuilder sb = new StringBuilder("type: " + k48Var);
        sb.append('\n');
        sb.append("hashCode: " + k48Var.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + k48Var.getClass().getCanonicalName());
        sb.append('\n');
        for (fi1 fi1VarA = k48Var.a(); fi1VarA != null; fi1VarA = fi1VarA.i()) {
            sb.append("fqName: ".concat(qo1.c.v(fi1VarA)));
            sb.append('\n');
            sb.append("javaClass: " + fi1VarA.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    public static final br2 o(xx4 xx4Var, v56 v56Var, int i) {
        v56 v56VarH;
        br2 br2Var = null;
        if (i == 3) {
            v56VarH = v56Var.h((v56Var.c - v56Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            v56VarH = v56Var.h(-((v56Var.c - v56Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            v56VarH = v56Var.h(0.0f, (v56Var.d - v56Var.b) + 1.0f);
        } else {
            if (i != 6) {
                hk0.l("This function should only be used for 2-D focus search");
                return null;
            }
            v56VarH = v56Var.h(0.0f, -((v56Var.d - v56Var.b) + 1.0f));
        }
        Object[] objArr = xx4Var.m;
        int i2 = xx4Var.f2559o;
        for (int i3 = 0; i3 < i2; i3++) {
            br2 br2Var2 = (br2) objArr[i3];
            if (xs1.R(br2Var2)) {
                v56 v56VarJ = xs1.J(br2Var2);
                if (v(v56VarJ, v56VarH, v56Var, i)) {
                    br2Var = br2Var2;
                    v56VarH = v56VarJ;
                }
            }
        }
        return br2Var;
    }

    public static final boolean p(br2 br2Var, int i, Function1 function1) {
        v56 v56Var;
        xx4 xx4Var = new xx4(new br2[16]);
        m(br2Var, xx4Var);
        int i2 = xx4Var.f2559o;
        if (i2 <= 1) {
            br2 br2Var2 = (br2) (i2 == 0 ? null : xx4Var.m[0]);
            if (br2Var2 != null) {
                return ((Boolean) function1.invoke(br2Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                v56 v56VarJ = xs1.J(br2Var);
                float f = v56VarJ.a;
                float f2 = v56VarJ.b;
                v56Var = new v56(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    hk0.l("This function should only be used for 2-D focus search");
                    return false;
                }
                v56 v56VarJ2 = xs1.J(br2Var);
                float f3 = v56VarJ2.c;
                float f4 = v56VarJ2.d;
                v56Var = new v56(f3, f4, f3, f4);
            }
            br2 br2VarO = o(xx4Var, v56Var, i);
            if (br2VarO != null) {
                return ((Boolean) function1.invoke(br2VarO)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean q(int i, m5 m5Var, br2 br2Var, v56 v56Var) {
        if (D(i, m5Var, br2Var, v56Var)) {
            return true;
        }
        Boolean bool = (Boolean) im3.a0(br2Var, i, new jw0(((lq2) vn4.q0(br2Var).getFocusOwner()).g(), br2Var, v56Var, i, m5Var));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final z57 r(PackageManager packageManager, String str) {
        PackageInfo packageInfoG;
        try {
            packageInfoG = it1.G(packageManager, str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoG = null;
        } catch (RuntimeException e) {
            boolean z = e.getCause() instanceof TransactionTooLargeException;
            ye4 ye4Var = ye4.a;
            if (z) {
                ye4Var.g("AppIntegrationHelper", "PackageInfo query result was over the IPC transaction limit! (1MB)");
            } else {
                ye4Var.g("AppIntegrationHelper", "PackageInfo query failed");
            }
        }
        if (packageInfoG != null) {
            return z57.n;
        }
        return z57.m;
    }

    public static final Intent s(f67 f67Var, String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) f67Var.d.invoke(str)));
        intent.addFlags(268435456);
        if (str2 != null) {
            str = str2;
        }
        intent.putExtra("eventaction", str.concat("-installation-initiated"));
        return intent;
    }

    public static final String t(int i) {
        qf0.s(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static final Intent u(f67 f67Var, PackageManager packageManager, String str, String str2) {
        String strConcat;
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            if (str2 != null) {
                str = str2;
            }
            strConcat = str.concat("-open-initiated");
        } else {
            launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse((String) f67Var.c.invoke(str)));
            if (str2 != null) {
                str = str2;
            }
            strConcat = str.concat("-installation-initiated");
        }
        launchIntentForPackage.putExtra("eventaction", strConcat);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static final boolean v(v56 v56Var, v56 v56Var2, v56 v56Var3, int i) {
        if (!w(i, v56Var, v56Var3)) {
            return false;
        }
        if (w(i, v56Var2, v56Var3) && !j(v56Var3, v56Var, v56Var2, i)) {
            return !j(v56Var3, v56Var2, v56Var, i) && x(i, v56Var3, v56Var) < x(i, v56Var3, v56Var2);
        }
        return true;
    }

    public static final boolean w(int i, v56 v56Var, v56 v56Var2) {
        if (i == 3) {
            float f = v56Var2.c;
            float f2 = v56Var2.a;
            float f3 = v56Var.c;
            return (f > f3 || f2 >= f3) && f2 > v56Var.a;
        }
        if (i == 4) {
            float f4 = v56Var2.a;
            float f5 = v56Var2.c;
            float f6 = v56Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < v56Var.c;
        }
        if (i == 5) {
            float f7 = v56Var2.d;
            float f8 = v56Var2.b;
            float f9 = v56Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > v56Var.b;
        }
        if (i != 6) {
            hk0.l("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = v56Var2.b;
        float f11 = v56Var2.d;
        float f12 = v56Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < v56Var.d;
    }

    public static final long x(int i, v56 v56Var, v56 v56Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = v56Var.a;
            f2 = v56Var2.c;
        } else if (i == 4) {
            f = v56Var2.a;
            f2 = v56Var.c;
        } else if (i == 5) {
            f = v56Var.b;
            f2 = v56Var2.d;
        } else {
            if (i != 6) {
                hk0.l("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = v56Var2.b;
            f2 = v56Var.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = v56Var.b;
            f3 = ((v56Var.d - f7) / 2.0f) + f7;
            f4 = v56Var2.b;
            f5 = v56Var2.d;
        } else {
            if (i != 5 && i != 6) {
                hk0.l("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = v56Var.a;
            f3 = ((v56Var.c - f8) / 2.0f) + f8;
            f4 = v56Var2.a;
            f5 = v56Var2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b6 A[Catch: all -> 0x014a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    public static final jo8 y(wg5 wg5Var, sj2 sj2Var, Function1 function1) {
        w36 w36Var;
        Throwable th;
        Throwable th2;
        Throwable th3;
        sj2Var.getClass();
        gs3 gs3VarB0 = sj2Var.b0(wg5Var);
        try {
            long size = gs3VarB0.size();
            long j = size - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + gs3VarB0.size());
            }
            long jMax = Math.max(size - 65558, 0L);
            do {
                w36 w36Var2 = new w36(gs3VarB0.e(j));
                try {
                    if (w36Var2.F() == 101010256) {
                        int iY = w36Var2.Y() & 65535;
                        int iY2 = w36Var2.Y() & 65535;
                        long jY = w36Var2.Y() & 65535;
                        if (jY != (w36Var2.Y() & 65535) || iY != 0 || iY2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        w36Var2.skip(4L);
                        long jF = ((long) w36Var2.F()) & 4294967295L;
                        int iY3 = w36Var2.Y() & 65535;
                        na0 na0Var = new na0(iY3, jY, jF);
                        w36Var2.b0(iY3);
                        w36Var2.close();
                        long j3 = j - 20;
                        if (j3 > 0) {
                            w36 w36Var3 = new w36(gs3VarB0.e(j3));
                            try {
                                if (w36Var3.F() == 117853008) {
                                    int iF = w36Var3.F();
                                    long jG = w36Var3.G();
                                    if (w36Var3.F() != 1 || iF != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    w36 w36Var4 = new w36(gs3VarB0.e(jG));
                                    try {
                                        int iF2 = w36Var4.F();
                                        if (iF2 != 101075792) {
                                            throw new IOException("bad zip: expected " + t(101075792) + " but was " + t(iF2));
                                        }
                                        w36Var4.skip(12L);
                                        int iF3 = w36Var4.F();
                                        int iF4 = w36Var4.F();
                                        long jG2 = w36Var4.G();
                                        if (jG2 != w36Var4.G() || iF3 != 0 || iF4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        w36Var4.skip(8L);
                                        na0 na0Var2 = new na0(iY3, jG2, w36Var4.G());
                                        try {
                                            w36Var4.close();
                                            th3 = null;
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                        }
                                        na0Var = na0Var2;
                                        if (th3 != null) {
                                            throw th3;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            w36Var4.close();
                                        } catch (Throwable th6) {
                                            ct1.q(th5, th6);
                                        }
                                        th3 = th5;
                                    }
                                }
                                try {
                                    w36Var3.close();
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    w36Var3.close();
                                } catch (Throwable th9) {
                                    ct1.q(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        w36 w36Var5 = new w36(gs3VarB0.e(na0Var.b));
                        try {
                            long j4 = na0Var.a;
                            while (j2 < j4) {
                                io8 io8VarZ = z(w36Var5);
                                w36Var = w36Var5;
                                try {
                                    if (io8VarZ.h >= na0Var.b) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (((Boolean) function1.invoke(io8VarZ)).booleanValue()) {
                                        arrayList.add(io8VarZ);
                                    }
                                    j2++;
                                    w36Var5 = w36Var;
                                } catch (Throwable th10) {
                                    th = th10;
                                    th = th;
                                    try {
                                        w36Var.close();
                                    } catch (Throwable th11) {
                                        ct1.q(th, th11);
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    jo8 jo8Var = new jo8(wg5Var, sj2Var, l(arrayList));
                                    try {
                                        gs3VarB0.close();
                                    } catch (Throwable unused) {
                                    }
                                    return jo8Var;
                                }
                            }
                            try {
                                w36Var5.close();
                                th = null;
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            w36Var = w36Var5;
                        }
                        if (th == null) {
                            throw th;
                        }
                        jo8 jo8Var2 = new jo8(wg5Var, sj2Var, l(arrayList));
                        gs3VarB0.close();
                        return jo8Var2;
                    }
                    w36Var2.close();
                    j--;
                } catch (Throwable th14) {
                    w36Var2.close();
                    throw th14;
                }
            } while (j >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th15) {
            if (gs3VarB0 == null) {
                throw th15;
            }
            try {
                gs3VarB0.close();
                throw th15;
            } catch (Throwable th16) {
                ct1.q(th15, th16);
                throw th15;
            }
        }
    }

    public static final io8 z(final w36 w36Var) throws IOException {
        int iF = w36Var.F();
        if (iF != 33639248) {
            throw new IOException("bad zip: expected " + t(33639248) + " but was " + t(iF));
        }
        w36Var.skip(4L);
        short sY = w36Var.Y();
        int i = sY & 65535;
        if ((sY & 1) != 0) {
            gk0.l("unsupported zip: general purpose bit flag=".concat(t(i)));
            return null;
        }
        int iY = w36Var.Y() & 65535;
        int iY2 = w36Var.Y() & 65535;
        int iY3 = w36Var.Y() & 65535;
        long jF = ((long) w36Var.F()) & 4294967295L;
        final j76 j76Var = new j76();
        j76Var.m = ((long) w36Var.F()) & 4294967295L;
        final j76 j76Var2 = new j76();
        j76Var2.m = ((long) w36Var.F()) & 4294967295L;
        int iY4 = w36Var.Y() & 65535;
        int iY5 = w36Var.Y() & 65535;
        int iY6 = w36Var.Y() & 65535;
        w36Var.skip(8L);
        final j76 j76Var3 = new j76();
        j76Var3.m = ((long) w36Var.F()) & 4294967295L;
        String strB0 = w36Var.b0(iY4);
        if (ub7.R(strB0, (char) 0)) {
            gk0.l("bad zip: filename contains 0x00");
            return null;
        }
        long j = j76Var2.m == 4294967295L ? 8L : 0L;
        if (j76Var.m == 4294967295L) {
            j += 8;
        }
        if (j76Var3.m == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final k76 k76Var = new k76();
        final k76 k76Var2 = new k76();
        final k76 k76Var3 = new k76();
        final g76 g76Var = new g76();
        A(w36Var, iY5, new hw2() { // from class: o.ko8
            @Override // o.hw2
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                w36 w36Var2 = w36Var;
                if (iIntValue == 1) {
                    g76 g76Var2 = g76Var;
                    if (g76Var2.m) {
                        gk0.l("bad zip: zip64 extra repeated");
                        return null;
                    }
                    g76Var2.m = true;
                    if (jLongValue < j2) {
                        gk0.l("bad zip: zip64 extra too short");
                        return null;
                    }
                    j76 j76Var4 = j76Var2;
                    long jG = j76Var4.m;
                    if (jG == 4294967295L) {
                        jG = w36Var2.G();
                    }
                    j76Var4.m = jG;
                    j76 j76Var5 = j76Var;
                    j76Var5.m = j76Var5.m == 4294967295L ? w36Var2.G() : 0L;
                    j76 j76Var6 = j76Var3;
                    j76Var6.m = j76Var6.m == 4294967295L ? w36Var2.G() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        gk0.l("bad zip: NTFS extra too short");
                        return null;
                    }
                    w36Var2.skip(4L);
                    y57.A(w36Var2, (int) (jLongValue - 4), new lo8(k76Var, w36Var2, k76Var2, k76Var3));
                }
                return f88.a;
            }
        });
        if (j2 > 0 && !g76Var.m) {
            gk0.l("bad zip: zip64 extra required but absent");
            return null;
        }
        String strB1 = w36Var.b0(iY6);
        String str = wg5.n;
        return new io8(vv.s("/").e(strB0), bc7.G(false, strB0, "/"), strB1, jF, j76Var.m, j76Var2.m, iY, j76Var3.m, iY3, iY2, (Long) k76Var.m, (Long) k76Var2.m, (Long) k76Var3.m, 57344);
    }

    @Override // o.ef8
    public void a() {
    }

    @Override // o.ef8
    public void b() {
    }
}
