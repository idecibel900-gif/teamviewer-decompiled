package o;

import android.content.Context;
import android.security.KeyChain;
import android.security.KeyChainException;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.settings.Settings;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bg {
    public static final bg a = new bg();

    public static boolean a(String str) throws InterruptedException, KeyChainException, CertificateEncodingException {
        byte[][] bArr;
        str.getClass();
        Context context = au8.V0;
        if (context == null) {
            ye4.c("AndroidKeyChainHandler", "ApplicationContext is null. Call setApplicationContext() first.");
            bArr = new byte[0][];
        } else {
            X509Certificate[] certificateChain = KeyChain.getCertificateChain(context, str);
            if (certificateChain == null) {
                bArr = new byte[0][];
            } else {
                int length = certificateChain.length;
                byte[][] bArr2 = new byte[length][];
                for (int i = 0; i < length; i++) {
                    byte[] encoded = certificateChain[i].getEncoded();
                    encoded.getClass();
                    bArr2[i] = encoded;
                }
                bArr = bArr2;
            }
        }
        return !(bArr.length == 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(RemoteControlApplication remoteControlApplication, jc1 jc1Var) throws Throwable {
        ag agVar;
        String str;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        if (jc1Var instanceof ag) {
            agVar = (ag) jc1Var;
            int i = agVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                agVar.p = i - Integer.MIN_VALUE;
            } else {
                agVar = new ag(this, jc1Var);
            }
        } else {
            agVar = new ag(this, jc1Var);
        }
        Object objB = agVar.n;
        int i2 = agVar.p;
        NativeLibTvExt nativeLibTvExt = NativeLibTvExt.a;
        ye4 ye4Var = ye4.a;
        String str2 = null;
        f88 f88Var = f88.a;
        if (i2 == 0) {
            ct1.a0(objB);
            Settings.i.n();
            String strD = Settings.d(rt0.P_SECURITY_BYOC_CONFIGURATION);
            if (!ub7.b0(strD)) {
                try {
                    JSONObject jSONObjectOptJSONObject2 = new JSONObject(strD).optJSONObject("cert");
                    if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("android")) != null && (strOptString = jSONObjectOptJSONObject.optString("keychain_alias")) != null && !ub7.b0(strOptString)) {
                        str2 = strOptString;
                    }
                } catch (JSONException e) {
                    e41.s("Failed to parse BYOC configuration: ", e.getMessage(), "ByocConfigurationHelper");
                }
                if (str2 == null || ub7.b0(str2)) {
                    ye4Var.g("AndroidByocInitializer", "BYOC configuration found without Android KeyChain alias");
                    return f88Var;
                }
                if (a(str2)) {
                    nativeLibTvExt.e();
                    return f88Var;
                }
                yg0 yg0Var = yg0.a;
                agVar.m = str2;
                agVar.p = 1;
                objB = yg0Var.b(remoteControlApplication, str2, agVar);
                ne1 ne1Var = ne1.m;
                if (objB == ne1Var) {
                    return ne1Var;
                }
                str = str2;
            }
            return f88Var;
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = agVar.m;
        ct1.a0(objB);
        String str3 = (String) objB;
        if (str3 == null) {
            ye4Var.g("AndroidByocInitializer", "BYOC alias access was not granted by the user");
            return f88Var;
        }
        if (!str3.equals(str)) {
            ye4.c("AndroidByocInitializer", fx3.h("BYOC alias mismatch: configured alias '", str, "', selected alias '", str3, "'"));
            return f88Var;
        }
        if (a(str)) {
            nativeLibTvExt.e();
        } else {
            ye4.c("AndroidByocInitializer", "BYOC alias access still unavailable after chooser approval");
        }
        return f88Var;
    }
}
