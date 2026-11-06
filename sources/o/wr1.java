package o;

import android.content.SharedPreferences;
import android.os.Build;
import android.util.Base64;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthInstructionsFragmentViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthQrScannerActivityViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationInstructionsFragmentViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationQrScannerActivityViewModel;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final class wr1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yr1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wr1(yr1 yr1Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = yr1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        switch (this.m) {
            case 0:
                return new wr1(this.n, hc1Var, (byte) 0);
            default:
                return new wr1(this.n, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((wr1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((wr1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strEncodeToString;
        byte b = this.m;
        f88 f88Var = f88.a;
        yr1 yr1Var = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                String str = yr1Var.q;
                SharedPreferences sharedPreferences = yr1Var.n;
                if (str == null) {
                    im3.e0("keyMaterial");
                    throw null;
                }
                KeyPair keyPairY = it1.y();
                PublicKey publicKey = keyPairY != null ? keyPairY.getPublic() : null;
                try {
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.getClass();
                    cipher.init(1, publicKey);
                    byte[] bytes = str.getBytes(vn0.a);
                    bytes.getClass();
                    strEncodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
                    break;
                } catch (Exception e) {
                    ye4.c("MFAUtils", "Encryption failed: ".concat(ct1.Y(e)));
                    strEncodeToString = null;
                }
                if (strEncodeToString != null) {
                    String str2 = yr1Var.r;
                    if (str2 == null) {
                        im3.e0("uuid");
                        throw null;
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.getClass();
                    editorEdit.putString(str2, strEncodeToString);
                    editorEdit.apply();
                    String str3 = yr1Var.r;
                    if (str3 == null) {
                        im3.e0("uuid");
                        throw null;
                    }
                    String strF = it1.F(sharedPreferences, str3);
                    IDeviceAuthenticationQrScannerActivityViewModel iDeviceAuthenticationQrScannerActivityViewModel = yr1Var.f2633o;
                    Settings.i.n();
                    DyngateID dyngateIDE = Settings.e();
                    DyngateID dyngateID = yr1Var.t;
                    IDeviceAuthQrScannerActivityViewModelSWIGJNI.IDeviceAuthenticationQrScannerActivityViewModel_SendActivateMfaCommand(iDeviceAuthenticationQrScannerActivityViewModel.a, iDeviceAuthenticationQrScannerActivityViewModel, DyngateID.getCPtr(dyngateIDE), dyngateIDE, DyngateID.getCPtr(dyngateID), dyngateID, yr1Var.s, strF, Build.MANUFACTURER + " " + Build.MODEL);
                }
                return f88Var;
            default:
                ct1.a0(obj);
                IDeviceAuthenticationInstructionsFragmentViewModel iDeviceAuthenticationInstructionsFragmentViewModel = yr1Var.p;
                IDeviceAuthInstructionsFragmentViewModelSWIGJNI.IDeviceAuthenticationInstructionsFragmentViewModel_ReportDeviceAuthenticationInstructionsScreenIsShown(iDeviceAuthenticationInstructionsFragmentViewModel.a, iDeviceAuthenticationInstructionsFragmentViewModel);
                return f88Var;
        }
    }
}
