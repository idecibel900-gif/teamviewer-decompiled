package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.LiveData;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.teamviewer.apidefinitions.policies.apis.PoliciesApi;
import com.teamviewer.apidefinitions.policies.models.PolicyData;
import com.teamviewer.apidefinitions.recentconnections.apis.RecentconnectionsApi;
import com.teamviewer.apidefinitions.recentconnections.models.RecentConnectionsItem;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class g95 implements vc1, lt5, b96, t93, oe2, nt6 {
    public Object m;

    public g95(byte b) {
        switch (b) {
            case 5:
                this.m = new mg4((Object) null);
                break;
            case 6:
                this.m = new fm(q85.e, (byte) 8);
                break;
            case 11:
                this.m = new fm(q85.e, (byte) 9);
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                this.m = new Stack();
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                this.m = new LinkedHashSet();
                break;
            case 20:
                this.m = new Region();
                break;
            default:
                this.m = Build.VERSION.SDK_INT >= 28 ? new wj5((byte) 1) : new rk5((byte) 1);
                break;
        }
    }

    public static ti5 D(Context context, AttributeSet attributeSet) {
        ti5 ti5Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vz5.a);
        float fraction = typedArrayObtainStyledAttributes.getFraction(9, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            ti5Var = new ti5();
            ti5Var.a = fraction;
        } else {
            ti5Var = null;
        }
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (ti5Var == null) {
                ti5Var = new ti5();
            }
            ti5Var.b = fraction2;
        }
        float fraction3 = typedArrayObtainStyledAttributes.getFraction(5, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (ti5Var == null) {
                ti5Var = new ti5();
            }
            ti5Var.c = fraction3;
            ti5Var.d = fraction3;
            ti5Var.e = fraction3;
            ti5Var.f = fraction3;
        }
        float fraction4 = typedArrayObtainStyledAttributes.getFraction(4, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (ti5Var == null) {
                ti5Var = new ti5();
            }
            ti5Var.c = fraction4;
        }
        float fraction5 = typedArrayObtainStyledAttributes.getFraction(8, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (ti5Var == null) {
                ti5Var = new ti5();
            }
            ti5Var.d = fraction5;
        }
        float fraction6 = typedArrayObtainStyledAttributes.getFraction(6, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (ti5Var == null) {
                ti5Var = new ti5();
            }
            ti5Var.e = fraction6;
        }
        float fraction7 = typedArrayObtainStyledAttributes.getFraction(2, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (ti5Var == null) {
                ti5Var = new ti5();
            }
            ti5Var.f = fraction7;
        }
        float fraction8 = typedArrayObtainStyledAttributes.getFraction(7, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (ti5Var == null) {
                ti5Var = new ti5();
            }
            ti5Var.g = fraction8;
        }
        float fraction9 = typedArrayObtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (ti5Var == null) {
                ti5Var = new ti5();
            }
            ti5Var.h = fraction9;
        }
        float fraction10 = typedArrayObtainStyledAttributes.getFraction(0, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (ti5Var == null) {
                ti5Var = new ti5();
            }
            ti5Var.i = fraction10;
        }
        typedArrayObtainStyledAttributes.recycle();
        return ti5Var;
    }

    public void B(zh0 zh0Var) {
        if (!zh0Var.g()) {
            if (!(zh0Var instanceof hf6)) {
                String strValueOf = String.valueOf(zh0Var.getClass());
                hk0.g(e41.l(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                return;
            } else {
                hf6 hf6Var = (hf6) zh0Var;
                B(hf6Var.f968o);
                B(hf6Var.p);
                return;
            }
        }
        int size = zh0Var.size();
        int[] iArr = hf6.t;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.m;
        if (stack.isEmpty() || ((zh0) stack.peek()).size() >= i) {
            stack.push(zh0Var);
            return;
        }
        int i2 = iArr[iBinarySearch];
        zh0 hf6Var2 = (zh0) stack.pop();
        while (!stack.isEmpty() && ((zh0) stack.peek()).size() < i2) {
            hf6Var2 = new hf6((zh0) stack.pop(), hf6Var2);
        }
        hf6 hf6Var3 = new hf6(hf6Var2, zh0Var);
        while (!stack.isEmpty()) {
            int[] iArr2 = hf6.t;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, hf6Var3.n);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((zh0) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                hf6Var3 = new hf6((zh0) stack.pop(), hf6Var3);
            }
        }
        stack.push(hf6Var3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(jc1 jc1Var) {
        tn5 tn5Var;
        long j;
        if (jc1Var instanceof tn5) {
            tn5Var = (tn5) jc1Var;
            int i = tn5Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn5Var.p = i - Integer.MIN_VALUE;
            } else {
                tn5Var = new tn5(this, jc1Var);
            }
        } else {
            tn5Var = new tn5(this, jc1Var);
        }
        Object objA = tn5Var.n;
        int i2 = tn5Var.p;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            j = 30000;
            tn5Var.m = 30000L;
            tn5Var.p = 1;
            objA = n85Var.a(30000L, tn5Var);
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
        j = tn5Var.m;
        ct1.a0(objA);
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<List<PolicyData>> policies = ((PoliciesApi) ((kh7) y85.m.t().k).getValue()).getPolicies();
        tn5Var.m = j;
        tn5Var.p = 2;
        Object objM = nv1.m(policies, tn5Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object K(int i, jc1 jc1Var) {
        a56 a56Var;
        long j;
        byte b;
        if (jc1Var instanceof a56) {
            a56Var = (a56) jc1Var;
            int i2 = a56Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a56Var.q = i2 - Integer.MIN_VALUE;
            } else {
                a56Var = new a56(this, jc1Var);
            }
        } else {
            a56Var = new a56(this, jc1Var);
        }
        Object objA = a56Var.f300o;
        int i3 = a56Var.q;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            a56Var.m = i;
            j = 30000;
            a56Var.n = 30000L;
            a56Var.q = 1;
            objA = n85Var.a(30000L, a56Var);
            if (objA != ne1Var) {
            }
            b = i;
            return ne1Var;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = a56Var.n;
        byte b2 = a56Var.m;
        ct1.a0(objA);
        j = j2;
        b = b2;
        b = i;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<List<RecentConnectionsItem>> qi0VarRecentconnections = ((RecentconnectionsApi) ((kh7) y85.m.t().g).getValue()).recentconnections(b);
        a56Var.m = b;
        a56Var.n = j;
        a56Var.q = 2;
        Object objM = nv1.m(qi0VarRecentconnections, a56Var);
        if (objM != ne1Var) {
            return objM;
        }
        b = i;
        return ne1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean L() {
        ti5 ti5VarA;
        ViewGroup viewGroup = (ViewGroup) this.m;
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ui5) && (ti5VarA = ((ui5) layoutParams).a()) != null) {
                vi5 vi5Var = ti5VarA.j;
                if ((childAt.getMeasuredWidthAndState() & (-16777216)) == 16777216 && ti5VarA.a >= 0.0f && ((ViewGroup.MarginLayoutParams) vi5Var).width == -2) {
                    layoutParams.width = -2;
                    z = true;
                }
                if ((childAt.getMeasuredHeightAndState() & (-16777216)) == 16777216 && ti5VarA.b >= 0.0f && ((ViewGroup.MarginLayoutParams) vi5Var).height == -2) {
                    layoutParams.height = -2;
                    z = true;
                }
            }
        }
        return z;
    }

    public void O(mo4 mo4Var) {
        Object obj;
        ps6 ps6Var = (ps6) this.m;
        du6 du6Var = ps6Var.d;
        if (du6Var.c == mo4Var.q(l10.TeamViewerSessionID).b) {
            el5 el5Var = ks6.n;
            byte bV = mo4Var.v();
            el5Var.getClass();
            int iOrdinal = ((ks6) ks6.f1299o.C(bV)).ordinal();
            if (iOrdinal == 4) {
                g71 g71Var = ps6Var.i.b;
                if (g71Var != null) {
                    g71Var.a(ha7.m);
                    return;
                }
                return;
            }
            if (iOrdinal == 12) {
                hr2 hr2Var = ps6Var.h;
                Object obj2 = mo4Var.s(gs6.ConnectionProtocol).n;
                if (obj2 != null) {
                    hr2Var.getClass();
                    hr2Var.n = (String) obj2;
                }
                if (du6Var.e.length() == 0 && (obj = mo4Var.s(gs6.LocalGUID).n) != null) {
                    du6Var.e = (String) obj;
                }
                mo4Var.r(gs6.BytesReceived);
                hr2Var.getClass();
                mo4Var.r(gs6.BytesSent);
                return;
            }
            if (iOrdinal != 16) {
                return;
            }
            boolean z = mo4Var.n(hs6.Show).b;
            AtomicBoolean atomicBoolean = ps6Var.l;
            if (!z) {
                atomicBoolean.set(false);
                ye4.a("SessionController", "Reconnect finished. Hiding message.");
                gk7 gk7Var = ps6Var.m;
                ps6Var.m = null;
                if (gk7Var != null) {
                    gk7Var.A0();
                    return;
                }
                return;
            }
            if (atomicBoolean.getAndSet(true)) {
                return;
            }
            ye4.a("SessionController", "Got reconnect command. Showing message");
            if (bt1.a == null) {
                im3.e0("dialogFactory");
                throw null;
            }
            gk7 gk7VarF = ir.f();
            gk7VarF.a1 = true;
            gk7VarF.W0 = R.layout.tv_dialog_reconnect;
            gk7VarF.X0 = null;
            gk7VarF.N0();
            ps6Var.m = gk7VarF;
        }
    }

    public nw4 P() {
        a2 a2Var = (a2) ((wc3) this.m);
        nw4 nw4Var = a2Var.p.d;
        ye4.c("RemoteActionsUiModel", "canDisablePartnerInput is " + nw4Var.getValue());
        k3 k3VarW = iq8.w(a2Var.q, vi8.DisableRemoteInput);
        nm nmVar = new nm(2);
        nmVar.g(k3VarW);
        nmVar.i(new LiveData[0]);
        ArrayList arrayList = nmVar.a;
        LiveData[] liveDataArr = (LiveData[]) arrayList.toArray(new LiveData[arrayList.size()]);
        lo4 lo4Var = new lo4();
        byte b = 5;
        c7 c7Var = new c7(lo4Var, liveDataArr, b);
        c7Var.a();
        for (LiveData liveData : liveDataArr) {
            lo4Var.b(liveData, new a7(new h16(c7Var, b), (byte) 8));
        }
        ye4.c("RemoteActionsUiModel", "remoteSideAllowsDisableInput is " + lo4Var.getValue());
        return qf0.o(nw4Var, lo4Var);
    }

    public io.sentry.android.core.n1 Q(a65 a65Var, AndroidComposeView androidComposeView) {
        long j;
        boolean z;
        long jG;
        mg4 mg4Var = (mg4) this.m;
        ArrayList arrayList = (ArrayList) a65Var.n;
        mg4 mg4Var2 = new mg4(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            kn5 kn5Var = (kn5) arrayList.get(i);
            long j2 = kn5Var.a;
            jn5 jn5Var = (jn5) mg4Var.b(j2);
            if (jn5Var == null) {
                j = kn5Var.b;
                jG = kn5Var.d;
                z = false;
            } else {
                long j3 = jn5Var.a;
                j = j3;
                z = jn5Var.c;
                jG = androidComposeView.G(jn5Var.b);
            }
            long j4 = kn5Var.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            mg4Var2.e(j4, new in5(j4, kn5Var.b, kn5Var.d, kn5Var.e, kn5Var.f, j, jG, z, kn5Var.g, kn5Var.i, kn5Var.j, kn5Var.k, kn5Var.l, kn5Var.m));
            boolean z2 = kn5Var.e;
            if (z2) {
                mg4Var.e(j2, new jn5(kn5Var.b, kn5Var.c, z2));
            } else {
                mg4Var.g(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new io.sentry.android.core.n1(mg4Var2, a65Var);
    }

    public byte[] S() throws CharConversionException {
        try {
            String string = ((SharedPreferences) this.m).getString("__androidx_security_crypto_encrypted_file_keyset__", null);
            if (string != null) {
                return xs1.A(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value __androidx_security_crypto_encrypted_file_keyset__ does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException("can't read keyset; the pref value __androidx_security_crypto_encrypted_file_keyset__ is not a valid hex string");
        }
    }

    public lo4 U() {
        byte b;
        a2 a2Var = (a2) ((ec3) this.m);
        k3 k3VarW = iq8.w(a2Var.q, vi8.RemoteControlAccess);
        nm nmVar = new nm(2);
        nmVar.g(k3VarW);
        nmVar.i(new LiveData[0]);
        ArrayList arrayList = nmVar.a;
        LiveData[] liveDataArr = (LiveData[]) arrayList.toArray(new LiveData[arrayList.size()]);
        lo4 lo4Var = new lo4();
        byte b2 = 7;
        c7 c7Var = new c7(lo4Var, liveDataArr, b2);
        c7Var.a();
        int length = liveDataArr.length;
        int i = 0;
        while (true) {
            b = 1;
            if (i >= length) {
                break;
            }
            lo4Var.b(liveDataArr[i], new rz7(new h16(c7Var, (byte) 8), b));
            i++;
        }
        LiveData[] liveDataArr2 = {a2Var.f283o.f962o};
        nm nmVar2 = new nm(2);
        nmVar2.g(lo4Var);
        nmVar2.i(liveDataArr2);
        ArrayList arrayList2 = nmVar2.a;
        LiveData[] liveDataArr3 = (LiveData[]) arrayList2.toArray(new LiveData[arrayList2.size()]);
        lo4 lo4Var2 = new lo4();
        c7 c7Var2 = new c7(lo4Var2, liveDataArr3, (byte) 6);
        c7Var2.a();
        for (LiveData liveData : liveDataArr3) {
            lo4Var2.b(liveData, new rz7(new h16(c7Var2, b2), b));
        }
        return lo4Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void V() {
        ti5 ti5VarA;
        ViewGroup viewGroup = (ViewGroup) this.m;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getChildAt(i).getLayoutParams();
            if ((layoutParams instanceof ui5) && (ti5VarA = ((ui5) layoutParams).a()) != null) {
                boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
                vi5 vi5Var = ti5VarA.j;
                if (z) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (!vi5Var.b) {
                        ((ViewGroup.LayoutParams) marginLayoutParams).width = ((ViewGroup.MarginLayoutParams) vi5Var).width;
                    }
                    if (!vi5Var.a) {
                        ((ViewGroup.LayoutParams) marginLayoutParams).height = ((ViewGroup.MarginLayoutParams) vi5Var).height;
                    }
                    vi5Var.b = false;
                    vi5Var.a = false;
                    marginLayoutParams.leftMargin = ((ViewGroup.MarginLayoutParams) vi5Var).leftMargin;
                    marginLayoutParams.topMargin = ((ViewGroup.MarginLayoutParams) vi5Var).topMargin;
                    marginLayoutParams.rightMargin = ((ViewGroup.MarginLayoutParams) vi5Var).rightMargin;
                    marginLayoutParams.bottomMargin = ((ViewGroup.MarginLayoutParams) vi5Var).bottomMargin;
                    marginLayoutParams.setMarginStart(vi5Var.getMarginStart());
                    marginLayoutParams.setMarginEnd(vi5Var.getMarginEnd());
                } else {
                    if (!vi5Var.b) {
                        layoutParams.width = ((ViewGroup.MarginLayoutParams) vi5Var).width;
                    }
                    if (!vi5Var.a) {
                        layoutParams.height = ((ViewGroup.MarginLayoutParams) vi5Var).height;
                    }
                    vi5Var.b = false;
                    vi5Var.a = false;
                }
            }
        }
    }

    public void X(zk3 zk3Var) {
        ((Region) this.m).set(zk3Var.a, zk3Var.b, zk3Var.c, zk3Var.d);
    }

    @Override // o.oe2
    public b46 d() throws Throwable {
        IOException iOException = null;
        while (!((o46) this.m).k.C) {
            try {
                zf6 zf6VarB = ((o46) this.m).b();
                if (!zf6VarB.c()) {
                    yf6 yf6VarD = zf6VarB.d();
                    if (yf6VarD.b == null && yf6VarD.c == null) {
                        yf6VarD = zf6VarB.g();
                    }
                    zf6 zf6Var = yf6VarD.b;
                    Throwable th = yf6VarD.c;
                    if (th != null) {
                        throw th;
                    }
                    if (zf6Var != null) {
                        ((o46) this.m).p.addFirst(zf6Var);
                    }
                }
                return zf6VarB.b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    ct1.q(iOException, e);
                }
                if (e instanceof s72) {
                    throw iOException;
                }
                if (!((o46) this.m).a(null)) {
                    throw iOException;
                }
            }
        }
        gk0.l("Canceled");
        return null;
    }

    @Override // o.oe2
    public o46 g() {
        return (o46) this.m;
    }

    @Override // o.nt6
    public void l0(qk7 qk7Var) {
        this.m = qk7Var;
    }

    @Override // o.t93
    public void n() {
        bn6 bn6Var = (bn6) this.m;
        im3.R(e8.n(bn6Var), null, null, new rm6(bn6Var, null, (byte) 0), 3);
    }

    @Override // o.lt5
    public void o() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // o.nt6
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        qk7 qk7Var;
        if (i == 4 || i == 82 || (qk7Var = (qk7) this.m) == null) {
            return false;
        }
        return qk7Var.onKeyDown(i, keyEvent);
    }

    @Override // o.nt6
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return ((qk7) this.m) != null;
    }

    @Override // o.nt6
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        qk7 qk7Var;
        if (i == 4 || i == 82 || (qk7Var = (qk7) this.m) == null) {
            return false;
        }
        return qk7Var.a(i, keyEvent);
    }

    @Override // o.lt5
    public void q(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case ep1.b /* 9 */:
            default:
                str = "";
                break;
            case ep1.c /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            io.sentry.android.core.v0.d("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.m).setResultCode(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(int i, int i2) {
        ti5 ti5VarA;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        ViewGroup viewGroup = (ViewGroup) this.m;
        int paddingLeft = (size - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ui5) && (ti5VarA = ((ui5) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    ti5VarA.a(marginLayoutParams, paddingLeft, size2);
                    vi5 vi5Var = ti5VarA.j;
                    ((ViewGroup.MarginLayoutParams) vi5Var).leftMargin = marginLayoutParams.leftMargin;
                    ((ViewGroup.MarginLayoutParams) vi5Var).topMargin = marginLayoutParams.topMargin;
                    ((ViewGroup.MarginLayoutParams) vi5Var).rightMargin = marginLayoutParams.rightMargin;
                    ((ViewGroup.MarginLayoutParams) vi5Var).bottomMargin = marginLayoutParams.bottomMargin;
                    vi5Var.setMarginStart(marginLayoutParams.getMarginStart());
                    vi5Var.setMarginEnd(marginLayoutParams.getMarginEnd());
                    float f = ti5VarA.c;
                    if (f >= 0.0f) {
                        marginLayoutParams.leftMargin = Math.round(paddingLeft * f);
                    }
                    float f2 = ti5VarA.d;
                    if (f2 >= 0.0f) {
                        marginLayoutParams.topMargin = Math.round(size2 * f2);
                    }
                    float f3 = ti5VarA.e;
                    if (f3 >= 0.0f) {
                        marginLayoutParams.rightMargin = Math.round(paddingLeft * f3);
                    }
                    float f4 = ti5VarA.f;
                    if (f4 >= 0.0f) {
                        marginLayoutParams.bottomMargin = Math.round(size2 * f4);
                    }
                    float f5 = ti5VarA.g;
                    boolean z2 = true;
                    if (f5 >= 0.0f) {
                        marginLayoutParams.setMarginStart(Math.round(paddingLeft * f5));
                        z = true;
                    } else {
                        z = false;
                    }
                    float f6 = ti5VarA.h;
                    if (f6 >= 0.0f) {
                        marginLayoutParams.setMarginEnd(Math.round(paddingLeft * f6));
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        WeakHashMap weakHashMap = be8.a;
                        marginLayoutParams.resolveLayoutDirection(childAt.getLayoutDirection());
                    }
                } else {
                    ti5VarA.a(layoutParams, paddingLeft, size2);
                }
            }
        }
    }

    @Override // o.vc1
    public Object w(Object obj) {
        return Optional.ofNullable(((vc1) this.m).w((nc6) obj));
    }

    public int x(int[] iArr, int i) throws f76 {
        int[] iArr2;
        int[] iArr3;
        yt2 yt2Var;
        yt2 yt2Var2;
        yt2 yt2Var3;
        int iB;
        int i2;
        int i3 = i;
        xy2 xy2Var = (xy2) this.m;
        int i4 = 0;
        if (iArr.length == 0) {
            yq4.f();
            return 0;
        }
        int length = iArr.length;
        int i5 = 1;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i6 = 1;
            while (i6 < length && iArr[i6] == 0) {
                i6++;
            }
            if (i6 == length) {
                iArr2 = new int[]{0};
            } else {
                int i7 = length - i6;
                int[] iArr4 = new int[i7];
                System.arraycopy(iArr, i6, iArr4, 0, i7);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i3];
        int i8 = 0;
        boolean z = true;
        while (i8 < i3) {
            int i9 = xy2Var.a[(xy2Var.g ? 1 : 0) + i8];
            if (i9 == 0) {
                i2 = iArr2[iArr2.length - 1];
            } else {
                if (i9 == 1) {
                    iB = 0;
                    for (int i10 : iArr2) {
                        xy2 xy2Var2 = xy2.h;
                        iB ^= i10;
                    }
                } else {
                    iB = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i11 = 1; i11 < length2; i11++) {
                        iB = xy2Var.b(i9, iB) ^ iArr2[i11];
                    }
                }
                i2 = iB;
            }
            iArr5[(i3 - 1) - i8] = i2;
            if (i2 != 0) {
                z = false;
            }
            i8++;
            z = z;
        }
        if (z) {
            return 0;
        }
        yt2 yt2Var4 = new yt2(xy2Var, iArr5);
        xy2Var.getClass();
        yt2 yt2Var5 = xy2Var.c;
        if (i3 < 0) {
            yq4.f();
            return 0;
        }
        int[] iArr6 = new int[i3 + 1];
        iArr6[0] = 1;
        yt2 yt2Var6 = new yt2(xy2Var, iArr6);
        if (yt2Var6.B() >= yt2Var4.B()) {
            yt2Var6 = yt2Var4;
            yt2Var4 = yt2Var6;
        }
        yt2 yt2VarE = yt2Var4;
        yt2 yt2Var7 = yt2Var6;
        yt2 yt2Var8 = xy2Var.d;
        yt2 yt2Var9 = yt2Var5;
        while (yt2Var7.B() * 2 >= i3) {
            if (yt2Var7.J()) {
                throw new f76("r_{i-1} was zero");
            }
            int iA = xy2Var.a(yt2Var7.A(yt2Var7.B()));
            yt2 yt2VarE2 = yt2Var5;
            while (yt2VarE.B() >= yt2Var7.B() && !yt2VarE.J()) {
                int iB2 = yt2VarE.B() - yt2Var7.B();
                int iB3 = xy2Var.b(yt2VarE.A(yt2VarE.B()), iA);
                if (iB2 < 0) {
                    int i12 = i4;
                    yq4.f();
                    return i12;
                }
                if (iB3 == 0) {
                    yt2Var2 = yt2Var5;
                } else {
                    int[] iArr7 = new int[iB2 + 1];
                    iArr7[i4] = iB3;
                    yt2Var2 = new yt2(xy2Var, iArr7);
                }
                yt2VarE2 = yt2VarE2.e(yt2Var2);
                int[] iArr8 = (int[]) yt2Var7.f2642o;
                xy2 xy2Var3 = (xy2) yt2Var7.n;
                if (iB2 < 0) {
                    int i13 = i4;
                    yq4.f();
                    return i13;
                }
                if (iB3 == 0) {
                    yt2Var3 = xy2Var3.c;
                } else {
                    int length3 = iArr8.length;
                    int[] iArr9 = new int[iB2 + length3];
                    while (i4 < length3) {
                        iArr9[i4] = xy2Var3.b(iArr8[i4], iB3);
                        i4++;
                    }
                    yt2Var3 = new yt2(xy2Var3, iArr9);
                }
                yt2VarE = yt2VarE.e(yt2Var3);
                i5 = i5;
                i4 = i4;
            }
            int i14 = i4;
            int i15 = i5;
            xy2 xy2Var4 = (xy2) yt2VarE2.n;
            if (!xy2Var4.equals((xy2) yt2Var8.n)) {
                hk0.g("GenericGFPolys do not have same GenericGF field");
                return i14;
            }
            if (yt2VarE2.J() || yt2Var8.J()) {
                yt2Var = xy2Var4.c;
            } else {
                int[] iArr10 = (int[]) yt2VarE2.f2642o;
                int length4 = iArr10.length;
                int[] iArr11 = (int[]) yt2Var8.f2642o;
                int length5 = iArr11.length;
                int[] iArr12 = new int[(length4 + length5) - 1];
                for (int i16 = i14; i16 < length4; i16++) {
                    int i17 = iArr10[i16];
                    int i18 = i14;
                    while (i18 < length5) {
                        int i19 = i16 + i18;
                        iArr12[i19] = iArr12[i19] ^ xy2Var4.b(i17, iArr11[i18]);
                        i18++;
                        iArr10 = iArr10;
                    }
                }
                yt2Var = new yt2(xy2Var4, iArr12);
            }
            yt2 yt2VarE3 = yt2Var.e(yt2Var9);
            if (yt2VarE.B() >= yt2Var7.B()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + yt2VarE + ", rLast: " + yt2Var7);
            }
            yt2 yt2Var10 = yt2VarE;
            yt2VarE = yt2Var7;
            yt2Var7 = yt2Var10;
            i5 = i15;
            yt2Var9 = yt2Var8;
            i4 = i14;
            yt2Var8 = yt2VarE3;
            i3 = i;
        }
        int i20 = i4;
        int i21 = i5;
        int iA2 = yt2Var8.A(i20);
        if (iA2 == 0) {
            throw new f76("sigmaTilde(0) was zero");
        }
        int iA3 = xy2Var.a(iA2);
        yt2[] yt2VarArr = {yt2Var8.K(iA3), yt2Var7.K(iA3)};
        yt2 yt2Var11 = yt2VarArr[i20];
        yt2 yt2Var12 = yt2VarArr[i21];
        int iB4 = yt2Var11.B();
        if (iB4 == i21) {
            iArr3 = new int[]{yt2Var11.A(i21)};
        } else {
            int[] iArr13 = new int[iB4];
            int i22 = 0;
            for (int i23 = 1; i23 < xy2Var.e && i22 < iB4; i23++) {
                if (yt2Var11.y(i23) == 0) {
                    iArr13[i22] = xy2Var.a(i23);
                    i22++;
                }
            }
            if (i22 != iB4) {
                throw new f76("Error locator degree does not match number of roots");
            }
            iArr3 = iArr13;
        }
        int length6 = iArr3.length;
        int[] iArr14 = new int[length6];
        for (int i24 = 0; i24 < length6; i24++) {
            int iA4 = xy2Var.a(iArr3[i24]);
            int iB5 = 1;
            for (int i25 = 0; i25 < length6; i25++) {
                if (i24 != i25) {
                    int iB6 = xy2Var.b(iArr3[i25], iA4);
                    iB5 = xy2Var.b(iB5, (iB6 & 1) == 0 ? iB6 | 1 : iB6 & (-2));
                }
            }
            int iB7 = xy2Var.b(yt2Var12.y(iA4), xy2Var.a(iB5));
            iArr14[i24] = iB7;
            if (xy2Var.g) {
                iArr14[i24] = xy2Var.b(iB7, iA4);
            }
        }
        for (int i26 = 0; i26 < iArr3.length; i26++) {
            int length7 = iArr.length - 1;
            int i27 = iArr3[i26];
            if (i27 == 0) {
                yq4.f();
                return 0;
            }
            int i28 = length7 - xy2Var.b[i27];
            if (i28 < 0) {
                throw new f76("Bad error location");
            }
            iArr[i28] = iArr[i28] ^ iArr14[i26];
        }
        return iArr3.length;
    }

    @Override // o.t93
    public void y() {
        bn6 bn6Var = (bn6) this.m;
        Integer num = bn6Var.C;
        if (num != null) {
            im3.R(e8.n(bn6Var), bn6Var.r, null, new j81(bn6Var, num.intValue(), null, (byte) 4), 2);
        }
    }

    public /* synthetic */ g95(Object obj) {
        this.m = obj;
    }

    @Override // o.b96
    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public boolean mo34d() {
        return ((Matcher) this.m).find();
    }

    public g95(Context context, byte b) {
        switch (b) {
            case 28:
                this.m = context.getApplicationContext().getSharedPreferences("__androidx_security_crypto_encrypted_file_pref__", 0).edit();
                break;
            default:
                this.m = context.getApplicationContext().getSharedPreferences("__androidx_security_crypto_encrypted_file_pref__", 0);
                break;
        }
    }
}
