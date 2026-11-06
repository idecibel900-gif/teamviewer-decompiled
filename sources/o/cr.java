package o;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.teamviewer.apidefinitions.remotecontrol.apis.ConnectApi;
import com.teamviewer.apidefinitions.remotecontrol.models.CapabilitiesByKnownDeviceTeamViewerIdResponse;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cr implements dw, th0, v08, nh7, sb1, lg1, hq5, df4, jk4, mf8, pz3 {
    public static cr n;
    public final /* synthetic */ byte m;

    public /* synthetic */ cr(byte b) {
        this.m = b;
    }

    public static n72 f(int i) {
        Object next;
        jc2 jc2Var = n72.r;
        jc2Var.getClass();
        j1 j1Var = new j1(jc2Var, (byte) 0);
        do {
            if (!j1Var.hasNext()) {
                next = null;
                break;
            }
            next = j1Var.next();
        } while (((n72) next).m != i);
        n72 n72Var = (n72) next;
        return n72Var == null ? n72.Mouse : n72Var;
    }

    public static lm1 l(m98 m98Var, boolean z) {
        boolean zE;
        m98Var.getClass();
        if (m98Var instanceof lm1) {
            return (lm1) m98Var;
        }
        m98Var.o0();
        if ((m98Var.o0().a() instanceof d58) || (m98Var instanceof h35)) {
            ys0 ys0VarA = m98Var.o0().a();
            e58 e58Var = ys0VarA instanceof e58 ? (e58) ys0VarA : null;
            zE = true;
            if (e58Var == null || e58Var.x) {
                zE = (z && (m98Var.o0().a() instanceof d58)) ? p58.e(m98Var) : true ^ db8.G(g68.n(false, null, 24), bt1.I(m98Var), h48.b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (m98Var instanceof um2) {
            um2 um2Var = (um2) m98Var;
            im3.n(um2Var.n.o0(), um2Var.f2226o.o0());
        }
        return new lm1(bt1.I(m98Var).s0(false), z);
    }

    public static ok2 m(boolean z) {
        int i = ok2.X0;
        Bundle bundle = new Bundle(2);
        bundle.putBoolean("checkable", z);
        bundle.putString("directory", null);
        ok2 ok2Var = new ok2();
        ok2Var.u0(bundle);
        return ok2Var;
    }

    @Override // o.df4
    public ff4 b(Context context, ps6 ps6Var, du6 du6Var) {
        return null;
    }

    @Override // o.th0
    public byte[] c(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // o.lg1
    public Iterable d(Object obj) {
        Collection collectionJ;
        zi0 zi0Var = (zi0) obj;
        return (zi0Var == null || (collectionJ = zi0Var.j()) == null) ? ea2.m : collectionJ;
    }

    @Override // o.mf8
    public sk8 e(View view, sk8 sk8Var, nf8 nf8Var) {
        nf8Var.d = sk8Var.a() + nf8Var.d;
        WeakHashMap weakHashMap = be8.a;
        boolean z = view.getLayoutDirection() == 1;
        int iB = sk8Var.b();
        int iC = sk8Var.c();
        int i = nf8Var.a + (z ? iC : iB);
        nf8Var.a = i;
        int i2 = nf8Var.c;
        if (!z) {
            iB = iC;
        }
        int i3 = i2 + iB;
        nf8Var.c = i3;
        view.setPaddingRelative(i, nf8Var.b, i3, nf8Var.d);
        return sk8Var;
    }

    @Override // o.sb1
    public long g(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i = qi6.a;
            return jFloatToRawIntBits;
        }
        float fK = e8.k(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fK)) << 32) | (((long) Float.floatToRawIntBits(fK)) & 4294967295L);
        int i2 = qi6.a;
        return jFloatToRawIntBits2;
    }

    @Override // o.dw
    public void h(in1 in1Var, int i, int[] iArr, j04 j04Var, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int length = iArr.length;
        int i5 = i - i3;
        int i6 = 0;
        while (i2 < length) {
            int i7 = iArr[i2];
            iArr2[i6] = i5;
            i5 += i7;
            i2++;
            i6++;
        }
    }

    @Override // o.hq5
    public CharSequence i(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        CharSequence[] charSequenceArr = listPreference.e0;
        int iY = listPreference.y(listPreference.g0);
        if (TextUtils.isEmpty((iY < 0 || charSequenceArr == null) ? null : charSequenceArr[iY])) {
            return listPreference.m.getString(R.string.not_set);
        }
        int iY2 = listPreference.y(listPreference.g0);
        if (iY2 < 0 || charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[iY2];
    }

    @Override // o.pz3
    public boolean j(k48 k48Var, k48 k48Var2) {
        return k48Var.equals(k48Var2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(long j, jc1 jc1Var) {
        g31 g31Var;
        long j2;
        if (jc1Var instanceof g31) {
            g31Var = (g31) jc1Var;
            int i = g31Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                g31Var.q = i - Integer.MIN_VALUE;
            } else {
                g31Var = new g31(this, jc1Var);
            }
        } else {
            g31Var = new g31(this, jc1Var);
        }
        Object objA = g31Var.f851o;
        int i2 = g31Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            g31Var.m = j;
            j2 = 30000;
            g31Var.n = 30000L;
            g31Var.q = 1;
            objA = n85Var.a(30000L, g31Var);
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
        long j3 = g31Var.n;
        long j4 = g31Var.m;
        ct1.a0(objA);
        j2 = j3;
        j = j4;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<CapabilitiesByKnownDeviceTeamViewerIdResponse> capabilitiesByKnownDeviceTeamViewerId = ((ConnectApi) ((kh7) y85.m.t().l).getValue()).getCapabilitiesByKnownDeviceTeamViewerId(j);
        g31Var.m = j;
        g31Var.n = j2;
        g31Var.q = 2;
        Object objM = nv1.m(capabilitiesByKnownDeviceTeamViewerId, g31Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r6 == r3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.String r7, o.jc1 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof o.rr4
            if (r0 == 0) goto L13
            r0 = r8
            o.rr4 r0 = (o.rr4) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            o.rr4 r0 = new o.rr4
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r6 = r0.f1942o
            int r8 = r0.q
            r1 = 2
            r2 = 1
            o.ne1 r3 = o.ne1.m
            if (r8 == 0) goto L3d
            if (r8 == r2) goto L35
            if (r8 != r1) goto L2e
            o.ct1.a0(r6)
            o.tc6 r6 = (o.tc6) r6
            java.lang.Object r6 = r6.m
            goto L89
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            o.hk0.l(r6)
            r6 = 0
            return r6
        L35:
            long r7 = r0.n
            long r4 = r0.m
            o.ct1.a0(r6)
            goto L5b
        L3d:
            o.ct1.a0(r6)
            java.lang.Long r6 = o.bc7.P(r7)
            if (r6 == 0) goto La1
            long r4 = r6.longValue()
            o.n85 r6 = o.n85.a
            r0.m = r4
            r7 = 30000(0x7530, double:1.4822E-319)
            r0.n = r7
            r0.q = r2
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r3) goto L5b
            goto L88
        L5b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L94
            o.aw r6 = o.y85.m
            o.y85 r6 = r6.t()
            java.lang.Object r6 = r6.i
            o.kh7 r6 = (o.kh7) r6
            java.lang.Object r6 = r6.getValue()
            com.teamviewer.apidefinitions.mobilewake.apis.MobilewakeApi r6 = (com.teamviewer.apidefinitions.mobilewake.apis.MobilewakeApi) r6
            com.teamviewer.apidefinitions.mobilewake.models.MobileWakeRequest r2 = new com.teamviewer.apidefinitions.mobilewake.models.MobileWakeRequest
            r2.<init>(r4)
            o.qi0 r6 = r6.mobilewake(r2)
            r0.m = r4
            r0.n = r7
            r0.q = r1
            java.lang.Object r6 = o.nv1.m(r6, r0)
            if (r6 != r3) goto L89
        L88:
            return r3
        L89:
            boolean r7 = r6 instanceof o.sc6
            if (r7 != 0) goto L93
            com.teamviewer.apidefinitions.mobilewake.models.MobileWakeResponse r6 = (com.teamviewer.apidefinitions.mobilewake.models.MobileWakeResponse) r6
            com.teamviewer.apidefinitions.mobilewake.models.MobileWakeResult r6 = r6.getResult()
        L93:
            return r6
        L94:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "OneAPI not available (not logged in)"
            r6.<init>(r7)
            o.sc6 r7 = new o.sc6
            r7.<init>(r6)
            return r7
        La1:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "deviceId must be a numeric TeamViewer ID"
            r6.<init>(r7)
            o.sc6 r7 = new o.sc6
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cr.n(java.lang.String, o.jc1):java.lang.Object");
    }

    @Override // o.jk4
    public void p(ob3 ob3Var) {
        switch (this.m) {
            case 25:
                if (ob3Var != null) {
                    x02 x02VarA = ik7.a();
                    gk7 gk7Var = new gk7();
                    fx3.o(1, "dialogId", x02VarA, gk7Var);
                    gk7Var.Z0 = x02VarA;
                    gk7Var.F0 = R.string.tv_IDS_SORRY_CONNECTIONS_ARE_BLOCKED;
                    gk7Var.H0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_LicenseBlockedActiveMarketingTrialBlocked;
                    gk7Var.K0 = R.string.tv_ok;
                    gk7.O0(gk7Var, (MainActivity) ob3Var);
                }
                break;
            default:
                if (ob3Var != null) {
                    MainActivity mainActivity = (MainActivity) ob3Var;
                    x02 x02VarA2 = ik7.a();
                    gk7 gk7Var2 = new gk7();
                    fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                    gk7Var2.Z0 = x02VarA2;
                    gk7Var2.a1 = false;
                    gk7Var2.F0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_UnpaidLicenseDetected_title;
                    gk7Var2.H0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_UnpaidLicenseDetected_message;
                    xk1 xk1Var = ct1.a;
                    if (xk1Var != null) {
                        xk1.M(mainActivity.p0, new r02(gk7Var2, p02.Neutral));
                    }
                    gk7Var2.S0 = R.string.tv_IDS_LEARN_MORE;
                    if (xk1Var != null) {
                        xk1.M(mainActivity.o0, new r02(gk7Var2, p02.Positive));
                    }
                    gk7Var2.K0 = R.string.tv_IDS_PAY_INVOICE;
                    gk7Var2.O0 = R.string.tv_cancel;
                    gk7.O0(gk7Var2, mainActivity);
                }
                break;
        }
    }

    public String toString() {
        switch (this.m) {
            case 1:
                return "AbsoluteArrangement#Right";
            default:
                return super.toString();
        }
    }
}
