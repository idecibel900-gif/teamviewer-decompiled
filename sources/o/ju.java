package o;

import android.text.TextUtils;
import androidx.compose.ui.node.LayoutNode;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.security.Provider;
import java.util.concurrent.Executors;
import javax.crypto.Mac;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ju implements dw, ce1, kv, v46, hq5, jb2, ex5, m02, jf8, i20, jk4, d45, qg5 {
    public static ju n;
    public final /* synthetic */ byte m;

    public /* synthetic */ ju(byte b) {
        this.m = b;
    }

    public static ai0 r(String str) {
        if (str.length() % 2 != 0) {
            gk0.h("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (xk0.r(str.charAt(i2 + 1)) + (xk0.r(str.charAt(i2)) << 4));
        }
        return new ai0(bArr);
    }

    public static ai0 s(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(vn0.a);
        bytes.getClass();
        ai0 ai0Var = new ai0(bytes);
        ai0Var.f325o = str;
        return ai0Var;
    }

    public static e51 t(int i) {
        Object next;
        jc2 jc2Var = e51.s;
        jc2Var.getClass();
        j1 j1Var = new j1(jc2Var, (byte) 0);
        do {
            if (!j1Var.hasNext()) {
                next = null;
                break;
            }
            next = j1Var.next();
        } while (((e51) next).m != i);
        e51 e51Var = (e51) next;
        return e51Var == null ? e51.Unknown : e51Var;
    }

    public static fl4 u(int i) {
        Object next;
        jc2 jc2Var = fl4.s;
        jc2Var.getClass();
        j1 j1Var = new j1(jc2Var, (byte) 0);
        do {
            if (!j1Var.hasNext()) {
                next = null;
                break;
            }
            next = j1Var.next();
        } while (((fl4) next).m != i);
        fl4 fl4Var = (fl4) next;
        return fl4Var == null ? fl4.UNKNOWN : fl4Var;
    }

    public static float v(float f, float f2, float f3, int i) {
        float f4 = ((f / 60.0f) + i) % 6.0f;
        return f3 - (Math.max(0.0f, Math.min(f4, Math.min(4.0f - f4, 1.0f))) * (f2 * f3));
    }

    public static ai0 w(byte[] bArr) {
        ai0 ai0Var = ai0.p;
        int length = bArr.length;
        ck3.p(bArr.length, 0L, length);
        return new ai0(cx.K0(bArr, 0, length));
    }

    @Override // o.jb2
    public Object b(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // o.d45
    public boolean c(es4 es4Var) {
        return false;
    }

    @Override // o.d45
    public int d() {
        return 8;
    }

    @Override // o.d45
    public boolean e(x53 x53Var, LayoutNode layoutNode) {
        return false;
    }

    @Override // o.d45
    public void f(LayoutNode layoutNode, long j, x53 x53Var, int i, boolean z) {
        e45 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        at4 at4Var = e45.j0;
        layoutNode.getOuterCoordinator$ui().g1(e45.p0, outerCoordinator$ui.X0(j), x53Var, 1, z);
    }

    @Override // o.qg5
    public String g(DyngateID dyngateID) {
        return "";
    }

    @Override // o.ex5
    public Object get() {
        return new eh6(Executors.newSingleThreadExecutor(), (byte) 0);
    }

    @Override // o.v46
    public oz3 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // o.dw
    public void h(in1 in1Var, int i, int[] iArr, j04 j04Var, int[] iArr2) {
        int i2 = 0;
        if (j04Var == j04.m) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            i6 += iArr[i2];
            i2++;
        }
        int i7 = i - i6;
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = i7;
            i7 += i8;
        }
    }

    @Override // o.hq5
    public CharSequence i(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.e0) ? editTextPreference.m.getString(R.string.not_set) : editTextPreference.e0;
    }

    @Override // o.i20
    public void j(Enum r1, bb5 bb5Var) {
    }

    @Override // o.qg5
    public void k(DyngateID dyngateID) {
    }

    @Override // o.m02
    public void l() {
    }

    @Override // o.kv
    public Object m(dk6 dk6Var, Float f, Float f2, Function1 function1, g47 g47Var) {
        Object objH = l47.h(dk6Var, f.floatValue(), pm8.b(0.0f, f2.floatValue(), 28), uf0.n, function1, g47Var);
        return objH == ne1.m ? objH : (go) objH;
    }

    @Override // o.jf8
    public int n() {
        return R.id.view_tree_view_model_store_owner;
    }

    @Override // o.d45
    public boolean o(LayoutNode layoutNode) {
        ap6 ap6VarH = layoutNode.H();
        boolean z = false;
        if (ap6VarH != null && ap6VarH.p) {
            z = true;
        }
        return !z;
    }

    @Override // o.jk4
    public void p(ob3 ob3Var) {
        if (ob3Var != null) {
            x02 x02VarA = ik7.a();
            gk7 gk7Var = new gk7();
            fx3.o(1, "dialogId", x02VarA, gk7Var);
            gk7Var.Z0 = x02VarA;
            gk7Var.F0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_LicenseBlockedPassiveBlocked_title;
            gk7Var.H0 = R.string.tv_IDS_STATUS_MSG_NOROUTE_LicenseBlockedPassiveBlocked_message;
            gk7Var.K0 = R.string.tv_ok;
            gk7.O0(gk7Var, (MainActivity) ob3Var);
        }
    }

    @Override // o.d45
    public boolean q(es4 es4Var) {
        return db8.R(vs1.i(vn4.p0(es4Var), false));
    }

    public String toString() {
        switch (this.m) {
            case 1:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
