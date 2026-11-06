package o;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vv implements th0, sb1, v46, ba3, m02, jk4, v65 {
    public final /* synthetic */ byte m;

    public vv() {
        this.m = (byte) 1;
        new ni4(16);
        long[] jArr = ti6.a;
        new jx4();
    }

    public static bx0 r(int i) {
        bx0 bx0Var = bx0.q;
        if (i == 59 || i == 299) {
            return bx0Var;
        }
        return i != 10801 ? bx0.f462o : bx0.p;
    }

    public static wg5 s(String str) {
        str.getClass();
        ai0 ai0Var = c.a;
        bf0 bf0Var = new bf0();
        bf0Var.Z0(str);
        return c.d(bf0Var, false);
    }

    public static int u() {
        int i = no1.d;
        no1.d = i << 1;
        return i;
    }

    @Override // o.ba3
    public void a() {
    }

    @Override // o.ba3
    public void b() {
    }

    @Override // o.th0
    public byte[] c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // o.ba3
    public void d() {
    }

    @Override // o.ba3
    public void e(bb5 bb5Var) {
    }

    @Override // o.ba3
    public void f() {
    }

    @Override // o.sb1
    public long g(long j, long j2) {
        float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        int i = qi6.a;
        return jFloatToRawIntBits;
    }

    @Override // o.v46
    public oz3 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // o.ba3
    public boolean h(MenuItem menuItem) {
        menuItem.getClass();
        return false;
    }

    @Override // o.ba3
    public void i() {
    }

    @Override // o.ba3
    public void j(View view, Bundle bundle, xt2 xt2Var) {
    }

    @Override // o.v65
    public int k(int i) {
        return i;
    }

    @Override // o.m02
    public void l() {
    }

    @Override // o.ba3
    public void m(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
    }

    @Override // o.ba3
    public void n(Uri uri) {
    }

    @Override // o.ba3
    public void o() {
    }

    @Override // o.jk4
    public void p(ob3 ob3Var) {
        switch (this.m) {
            case 24:
                if (ob3Var != null) {
                    x02 x02VarA = ik7.a();
                    gk7 gk7Var = new gk7();
                    fx3.o(1, "dialogId", x02VarA, gk7Var);
                    gk7Var.Z0 = x02VarA;
                    gk7Var.F0 = R.string.tv_IDS_SORRY_CONNECTIONS_ARE_BLOCKED;
                    gk7Var.H0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_ExpiredMarketingTrialLicenseDetected;
                    gk7Var.K0 = R.string.tv_ok;
                    gk7.O0(gk7Var, (MainActivity) ob3Var);
                }
                break;
            default:
                if (ob3Var != null) {
                    x02 x02VarA2 = ik7.a();
                    gk7 gk7Var2 = new gk7();
                    fx3.o(1, "dialogId", x02VarA2, gk7Var2);
                    gk7Var2.Z0 = x02VarA2;
                    gk7Var2.F0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_PassiveLicenseBlockedDetected_title;
                    gk7Var2.H0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_PassiveExpiredMarketingTrialDetected;
                    gk7Var2.K0 = R.string.tv_ok;
                    gk7.O0(gk7Var2, (MainActivity) ob3Var);
                }
                break;
        }
    }

    @Override // o.v65
    public int q(int i) {
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(String str, jc1 jc1Var) {
        uv uvVar;
        jg3 jg3Var;
        List list;
        if (jc1Var instanceof uv) {
            uvVar = (uv) jc1Var;
            int i = uvVar.f2251o;
            if ((i & Integer.MIN_VALUE) != 0) {
                uvVar.f2251o = i - Integer.MIN_VALUE;
            } else {
                uvVar = new uv(this, jc1Var);
            }
        } else {
            uvVar = new uv(this, jc1Var);
        }
        Object objA = uvVar.m;
        int i2 = uvVar.f2251o;
        try {
            if (i2 == 0) {
                ct1.a0(objA);
                tv tvVar = ((sv) sv.b.getValue()).a;
                uvVar.f2251o = 1;
                objA = tvVar.a(str, "apps-page-android", uvVar);
                ne1 ne1Var = ne1.m;
                if (objA == ne1Var) {
                    return ne1Var;
                }
            } else {
                if (i2 != 1) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(objA);
            }
            List list2 = (List) objA;
            if (list2 == null || (jg3Var = (jg3) lv0.o0(list2)) == null || (list = jg3Var.a) == null) {
                throw new IllegalStateException("Apps list is null or empty");
            }
            return list;
        } catch (Throwable th) {
            return new sc6(th);
        }
    }

    public /* synthetic */ vv(byte b) {
        this.m = b;
    }
}
