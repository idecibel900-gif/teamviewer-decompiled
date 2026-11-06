package o;

import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PListNavigationStatisticsViewModelSWIGJNI;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class df6 implements fq4, hp4, f75, vt, j30, ge0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static df6 f618o;
    public static final ef6 p = new ef6(0, false, false, 0, 0);
    public static final df6 q;
    public static final cy2 r;
    public static final dy2 s;
    public final /* synthetic */ byte m;
    public Object n;

    static {
        byte b = 1;
        q = new df6(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, b);
        r = new cy2(b);
        s = new dy2(b);
    }

    public df6(byte b) {
        qq4 qq4Var;
        pq4 pq4Var;
        this.m = b;
        switch (b) {
            case 4:
                vw5 vw5Var = vw5.c;
                try {
                    qq4Var = (qq4) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                    break;
                } catch (Exception unused) {
                    qq4Var = s;
                }
                qq4[] qq4VarArr = {dy2.b, qq4Var};
                em4 em4Var = new em4();
                em4Var.a = qq4VarArr;
                Charset charset = ul3.a;
                this.n = em4Var;
                return;
            case 5:
                this.n = new iu((byte) 2);
                return;
            case 6:
                this.n = new h4(this);
                return;
            case 14:
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    this.n = keyStore;
                    return;
                } catch (IOException | GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 20:
                this.n = new AtomicInteger(0);
                return;
            case 21:
                this.n = new AtomicReference(null);
                return;
            default:
                try {
                    pq4Var = (pq4) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                    break;
                } catch (Exception unused2) {
                    pq4Var = r;
                }
                pq4[] pq4VarArr = {cy2.b, pq4Var};
                dm4 dm4Var = new dm4();
                dm4Var.a = pq4VarArr;
                Charset charset2 = sl3.a;
                this.n = dm4Var;
                return;
        }
    }

    public static void p(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (new df6((byte) 14).u(str)) {
            hk0.g(fx3.g("cannot generate a new key ", str, " because it already exists; please delete it with deleteKey() and try again"));
            return;
        }
        String strB = gb8.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public static synchronized df6 r() {
        df6 df6Var;
        df6Var = f618o;
        if (df6Var == null) {
            df6Var = new df6((byte) 0, false);
            f618o = df6Var;
        }
        return df6Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e A[RETURN] */
    @Override // o.hp4
    public boolean a(jp4 jp4Var, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        o7 o7Var = ((ActionMenuView) this.n).M;
        if (o7Var != null) {
            Toolbar toolbar = ((fz7) o7Var).m;
            Iterator it = ((CopyOnWriteArrayList) toolbar.S.f733o).iterator();
            while (it.hasNext()) {
                if (((hq4) it.next()).j(menuItem)) {
                    zOnMenuItemSelected = true;
                    if (zOnMenuItemSelected) {
                        return true;
                    }
                }
            }
            iz7 iz7Var = toolbar.U;
            zOnMenuItemSelected = iz7Var != null ? ((kz7) iz7Var).m.P.onMenuItemSelected(0, menuItem) : false;
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // o.fq4
    public void b(jp4 jp4Var, boolean z) {
        if (jp4Var instanceof gd7) {
            ((gd7) jp4Var).z.m().c(false);
        }
        fq4 fq4Var = ((l7) this.n).q;
        if (fq4Var != null) {
            fq4Var.b(jp4Var, z);
        }
    }

    @Override // o.j30
    public void c(w41 w41Var) {
        boolean z = w41Var.n == 0;
        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) this.n;
        if (z) {
            aVar.g(null, aVar.x);
            return;
        }
        hj8 hj8Var = aVar.f35o;
        if (hj8Var != null) {
            ((uz2) hj8Var.n).c(w41Var);
        }
    }

    @Override // o.vt
    public void d(int i) {
    }

    @Override // o.vt
    public void e(int i) {
    }

    @Override // o.vt
    public void f(int i, float f) {
    }

    public void g(int i, g4 g4Var, String str, Bundle bundle) {
    }

    @Override // o.hp4
    public void h(jp4 jp4Var) {
        hp4 hp4Var = ((ActionMenuView) this.n).H;
        if (hp4Var != null) {
            hp4Var.h(jp4Var);
        }
    }

    public void i(ak7 ak7Var) {
        Object next;
        iu iuVar = (iu) this.n;
        ci7 ci7VarQ = ak7Var.q(qj7.AccessControlType);
        if (ci7VarQ.a <= 0) {
            ci7VarQ = null;
        }
        if (ci7VarQ != null) {
            int i = ci7VarQ.b;
            l3.n.getClass();
            Iterator it = l3.s.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((l3) next).m != i);
            l3 l3Var = (l3) next;
            if (l3Var == null) {
                l3Var = l3.CONTROL_TYPE_UNDEFINED;
            }
            EnumMap enumMap = (EnumMap) iuVar.p;
            iuVar.G(l3Var);
            vi8 vi8Var = vi8.RemoteControlAccess;
            l3 l3Var2 = l3.CONTROL_TYPE_CUSTOM;
            if (l3Var == l3Var2) {
                iuVar.f1103o = l3Var2;
                enumMap.put(vi8.FileTransferAccess, iu.w(ak7Var, qj7.FileTransferAccess));
                enumMap.put(vi8Var, iu.w(ak7Var, qj7.RemoteControlAccess));
                enumMap.put(vi8.ChangeSides, iu.w(ak7Var, qj7.ChangeDirAllowed));
                enumMap.put(vi8.DisableRemoteInput, iu.w(ak7Var, qj7.DisableRemoteInput));
                enumMap.put(vi8.ControlRemoteTV, iu.w(ak7Var, qj7.ControlRemoteTV));
                enumMap.put(vi8.AllowVPN, iu.w(ak7Var, qj7.AllowVPN));
                enumMap.put(vi8.AllowPartnerViewDesktop, iu.w(ak7Var, qj7.AllowPartnerViewDesktop));
            }
            au6 au6Var = bt1.b;
            if (au6Var == null) {
                im3.e0("instance");
                throw null;
            }
            mo7 mo7Var = au6Var.f;
            ec3 ec3Var = mo7Var instanceof ec3 ? (ec3) mo7Var : null;
            if (ec3Var == null) {
                return;
            }
            ((a2) ec3Var).f283o.i(iuVar.v(vi8Var) == i3.Allowed);
        }
    }

    @Override // o.ge0
    public void j() {
        PListNavigationStatisticsViewModel pListNavigationStatisticsViewModel = ((tc0) this.n).e;
        PListNavigationStatisticsViewModelSWIGJNI.PListNavigationStatisticsViewModel_SendStatistics(pListNavigationStatisticsViewModel.a, pListNavigationStatisticsViewModel, false);
    }

    public g4 k(int i) {
        return null;
    }

    public byte[] l(byte[] bArr, byte[] bArr2) {
        try {
            return m(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            io.sentry.android.core.v0.l("df6", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return m(bArr, bArr2);
        }
    }

    public byte[] m(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            hk0.u("ciphertext too short");
            return null;
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, (SecretKey) this.n, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    @Override // o.fq4
    public boolean m0(jp4 jp4Var) {
        l7 l7Var = (l7) this.n;
        if (jp4Var == l7Var.f1334o) {
            return false;
        }
        l7Var.K = ((gd7) jp4Var).A.a;
        fq4 fq4Var = l7Var.q;
        if (fq4Var != null) {
            return fq4Var.m0(jp4Var);
        }
        return false;
    }

    public byte[] n(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            hk0.u("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (SecretKey) this.n);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    public g4 o(int i) {
        return null;
    }

    public synchronized df6 q(String str) {
        df6 df6Var;
        byte[] bArrN;
        df6Var = new df6(gb8.b(str), (KeyStore) this.n);
        byte[] bArrA = p06.a(10);
        byte[] bArr = new byte[0];
        try {
            bArrN = df6Var.n(bArrA, bArr);
        } catch (GeneralSecurityException | ProviderException e) {
            io.sentry.android.core.v0.l("df6", "encountered a potentially transient KeyStore error, will wait and retry", e);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            bArrN = df6Var.n(bArrA, bArr);
        }
        if (!Arrays.equals(bArrA, df6Var.l(bArrN, bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return df6Var;
    }

    public ak7 s(ParticipantIdentifier participantIdentifier) {
        iu iuVar = (iu) this.n;
        ak7 ak7Var = new ak7(bk7.TVCmdSendAccessControl);
        ak7Var.z(KnownStreams.PrivateStream);
        ak7Var.B(participantIdentifier);
        ak7Var.d(qj7.AccessControlType, ((l3) iuVar.f1103o).m);
        i3 i3VarV = iuVar.v(vi8.FileTransferAccess);
        if (i3VarV != null) {
            ak7Var.d(qj7.FileTransferAccess, i3VarV.m);
        }
        i3 i3VarV2 = iuVar.v(vi8.RemoteControlAccess);
        if (i3VarV2 != null) {
            ak7Var.d(qj7.RemoteControlAccess, i3VarV2.m);
        }
        i3 i3VarV3 = iuVar.v(vi8.DisableRemoteInput);
        if (i3VarV3 != null) {
            ak7Var.d(qj7.DisableRemoteInput, i3VarV3.m);
        }
        i3 i3VarV4 = iuVar.v(vi8.ChangeSides);
        if (i3VarV4 != null) {
            ak7Var.d(qj7.ChangeDirAllowed, i3VarV4.m);
        }
        i3 i3VarV5 = iuVar.v(vi8.ControlRemoteTV);
        if (i3VarV5 != null) {
            ak7Var.d(qj7.ControlRemoteTV, i3VarV5.m);
        }
        i3 i3VarV6 = iuVar.v(vi8.AllowVPN);
        if (i3VarV6 != null) {
            ak7Var.d(qj7.AllowVPN, i3VarV6.m);
        }
        i3 i3VarV7 = iuVar.v(vi8.AllowPartnerViewDesktop);
        if (i3VarV7 != null) {
            ak7Var.d(qj7.AllowPartnerViewDesktop, i3VarV7.m);
        }
        return ak7Var;
    }

    @Override // o.f75
    public sk8 t(View view, sk8 sk8Var) {
        switch (this.m) {
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                AppBarLayout appBarLayout = (AppBarLayout) this.n;
                WeakHashMap weakHashMap = be8.a;
                sk8 sk8Var2 = appBarLayout.getFitsSystemWindows() ? sk8Var : null;
                if (!Objects.equals(appBarLayout.s, sk8Var2)) {
                    appBarLayout.s = sk8Var2;
                    appBarLayout.setWillNotDraw(!(appBarLayout.B != null && appBarLayout.getTopInset() > 0));
                    appBarLayout.requestLayout();
                }
                break;
            default:
                s90 s90Var = (s90) this.n;
                r90 r90Var = s90Var.z;
                if (r90Var != null) {
                    s90Var.s.P.remove(r90Var);
                }
                r90 r90Var2 = new r90(s90Var.v, sk8Var);
                s90Var.z = r90Var2;
                ArrayList arrayList = s90Var.s.P;
                if (!arrayList.contains(r90Var2)) {
                    arrayList.add(r90Var2);
                }
                break;
        }
        return sk8Var;
    }

    public String toString() {
        switch (this.m) {
            case 1:
                return "Bradford";
            case 5:
                return ((iu) this.n).toString();
            default:
                return super.toString();
        }
    }

    public synchronized boolean u(String str) {
        String strB;
        strB = gb8.b(str);
        try {
        } catch (NullPointerException unused) {
            io.sentry.android.core.v0.j("df6", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.n = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return ((KeyStore) this.n).containsAlias(strB);
        }
        return ((KeyStore) this.n).containsAlias(strB);
    }

    public boolean v(int i, int i2, Bundle bundle) {
        return false;
    }

    public void w(int i, yh0 yh0Var) {
        yu0 yu0Var = (yu0) this.n;
        yu0Var.p(i, 2);
        yu0Var.q(yh0Var.size());
        vh0 vh0Var = (vh0) yh0Var;
        yu0Var.l(vh0Var.p, vh0Var.g(), vh0Var.size());
    }

    public void x(int i, Object obj, bj6 bj6Var) {
        yu0 yu0Var = (yu0) this.n;
        yu0Var.p(i, 3);
        bj6Var.e((s1) obj, yu0Var.a);
        yu0Var.p(i, 4);
    }

    public void y(int i, Object obj, bj6 bj6Var) {
        yu0 yu0Var = (yu0) this.n;
        s1 s1Var = (s1) obj;
        yu0Var.p(i, 2);
        s1Var.getClass();
        ny2 ny2Var = (ny2) s1Var;
        int iH = ny2Var.memoizedSerializedSize;
        if (iH == -1) {
            iH = bj6Var.h(s1Var);
            ny2Var.memoizedSerializedSize = iH;
        }
        yu0Var.q(iH);
        bj6Var.e(s1Var, yu0Var.a);
    }

    public /* synthetic */ df6(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public df6(com.google.android.gms.common.internal.a aVar) {
        this.m = (byte) 24;
        Objects.requireNonNull(aVar);
        this.n = aVar;
    }

    public df6(LinearLayout linearLayout, ProgressBar progressBar, WebView webView) {
        this.m = (byte) 10;
        this.n = webView;
    }

    public df6(boolean z) {
        this.m = (byte) 19;
        this.n = new AtomicBoolean(z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r10
      0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public df6(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.m = (byte) 18;
        int i2 = 1;
        int length = fArr.length - 1;
        wv[][] wvVarArr = new wv[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == i2) {
                i3 = i2;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i7 = 5;
                            if (i6 != 5) {
                                i = i4;
                            } else {
                                i = i7;
                            }
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != i2) {
                            i3 = i2;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            wv[] wvVarArr2 = new wv[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                wvVarArr2[i11] = new wv(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            wvVarArr[i5] = wvVarArr2;
            i5 = i8;
            i4 = i;
            i2 = 1;
        }
        this.n = wvVarArr;
    }

    public df6(yu0 yu0Var) {
        this.m = (byte) 2;
        Charset charset = sl3.a;
        this.n = yu0Var;
        yu0Var.a = this;
    }

    public df6(String str, KeyStore keyStore) throws InvalidKeyException {
        this.m = (byte) 13;
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.n = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(str));
        }
    }

    public /* synthetic */ df6(byte b, boolean z) {
        this.m = b;
    }
}
