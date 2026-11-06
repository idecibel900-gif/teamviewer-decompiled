package o;

import android.content.Context;
import android.security.KeyChain;
import android.security.KeyChainException;
import com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.AndroidKeyChainByteArray;
import com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.AndroidKeyChainByteArrayVector;
import com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.AndroidKeyChainCertificateInfo;
import com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.AndroidKeyChainStringVector;
import com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.CertificateFingerprints;
import com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.IAndroidKeyChainCallback;
import java.io.ByteArrayInputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wi extends IAndroidKeyChainCallback {
    public static final wi a = new wi();

    @Override // com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.IAndroidKeyChainCallback
    public final AndroidKeyChainByteArrayVector GetCertificateChainDer(String str) throws InterruptedException, KeyChainException, CertificateEncodingException {
        byte[][] bArr;
        if (str == null) {
            str = "";
        }
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
        AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector = new AndroidKeyChainByteArrayVector();
        for (byte[] bArr3 : bArr) {
            AndroidKeyChainByteArray androidKeyChainByteArray = new AndroidKeyChainByteArray();
            androidKeyChainByteArray.setData(bArr3);
            androidKeyChainByteArrayVector.add(androidKeyChainByteArray);
        }
        return androidKeyChainByteArrayVector;
    }

    @Override // com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.IAndroidKeyChainCallback
    public final AndroidKeyChainCertificateInfo GetCertificateInfo(AndroidKeyChainByteArray androidKeyChainByteArray) {
        String[] strArrC;
        byte[] bArrD = iq8.D(androidKeyChainByteArray);
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArrD));
            certificateGenerateCertificate.getClass();
            String name = ((X509Certificate) certificateGenerateCertificate).getSubjectX500Principal().getName();
            name.getClass();
            strArrC = au8.C(name);
        } catch (Exception e) {
            ye4.c("AndroidKeyChainHandler", "getCertificateInfo failed: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            strArrC = new String[0];
        }
        AndroidKeyChainCertificateInfo androidKeyChainCertificateInfo = new AndroidKeyChainCertificateInfo();
        AndroidKeyChainStringVector androidKeyChainStringVector = new AndroidKeyChainStringVector();
        for (String str : strArrC) {
            androidKeyChainStringVector.add(str);
        }
        androidKeyChainCertificateInfo.setSubjectPairs(androidKeyChainStringVector);
        return androidKeyChainCertificateInfo;
    }

    @Override // com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.IAndroidKeyChainCallback
    public final CertificateFingerprints GetFingerprints(String str) throws InterruptedException, KeyChainException {
        String[] strArr;
        if (str == null) {
            str = "";
        }
        Context context = au8.V0;
        if (context == null) {
            ye4.c("AndroidKeyChainHandler", "ApplicationContext is null. Call setApplicationContext() first.");
            strArr = new String[0];
        } else {
            X509Certificate[] certificateChain = KeyChain.getCertificateChain(context, str);
            if (certificateChain == null) {
                strArr = new String[0];
            } else if (certificateChain.length == 0) {
                strArr = new String[0];
            } else {
                X509Certificate x509Certificate = (X509Certificate) cx.R0(certificateChain);
                X509Certificate x509Certificate2 = (X509Certificate) cx.a1(certificateChain);
                x509Certificate.getClass();
                String strB = au8.B(x509Certificate);
                x509Certificate2.getClass();
                strArr = new String[]{strB, au8.B(x509Certificate2)};
            }
        }
        CertificateFingerprints certificateFingerprints = new CertificateFingerprints();
        String str2 = (String) cx.V0(0, strArr);
        if (str2 == null) {
            str2 = "";
        }
        certificateFingerprints.setUserCertFingerprint(str2);
        String str3 = (String) cx.V0(1, strArr);
        certificateFingerprints.setRootCaFingerprint(str3 != null ? str3 : "");
        return certificateFingerprints;
    }

    @Override // com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.IAndroidKeyChainCallback
    public final AndroidKeyChainByteArray Sign(String str, AndroidKeyChainByteArray androidKeyChainByteArray) throws InterruptedException, NoSuchAlgorithmException, SignatureException, KeyChainException, InvalidKeyException {
        byte[] bArrSign;
        String str2;
        if (str == null) {
            str = "";
        }
        byte[] bArrD = iq8.D(androidKeyChainByteArray);
        Context context = au8.V0;
        if (context == null) {
            ye4.c("AndroidKeyChainHandler", "ApplicationContext is null. Call setApplicationContext() first.");
            bArrSign = new byte[0];
        } else {
            PrivateKey privateKey = KeyChain.getPrivateKey(context, str);
            if (privateKey == null) {
                bArrSign = new byte[0];
            } else {
                String algorithm = privateKey.getAlgorithm();
                if (im3.n(algorithm, "RSA")) {
                    str2 = "SHA512withRSA";
                } else if (im3.n(algorithm, "EC")) {
                    str2 = "SHA512withECDSA";
                } else {
                    bArrSign = new byte[0];
                }
                Signature signature = Signature.getInstance(str2);
                signature.initSign(privateKey);
                signature.update(bArrD);
                bArrSign = signature.sign();
                bArrSign.getClass();
            }
        }
        AndroidKeyChainByteArray androidKeyChainByteArray2 = new AndroidKeyChainByteArray();
        androidKeyChainByteArray2.setData(bArrSign);
        return androidKeyChainByteArray2;
    }

    @Override // com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.IAndroidKeyChainCallback
    public final boolean VerifyChainPkix(AndroidKeyChainByteArray androidKeyChainByteArray, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector, AndroidKeyChainByteArrayVector androidKeyChainByteArrayVector2) {
        byte[] bArrD = iq8.D(androidKeyChainByteArray);
        byte[][] bArrE = iq8.E(androidKeyChainByteArrayVector);
        byte[][] bArrE2 = iq8.E(androidKeyChainByteArrayVector2);
        bArrE.getClass();
        bArrE2.getClass();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            X509Certificate x509CertificateW = au8.W(certificateFactory, bArrD, "leafDer");
            ArrayList arrayList = new ArrayList(bArrE.length);
            int length = bArrE.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                arrayList.add(au8.W(certificateFactory, bArrE[i], "interDer[" + i2 + "]"));
                i++;
                i2++;
            }
            ArrayList arrayList2 = new ArrayList(bArrE2.length);
            int length2 = bArrE2.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length2) {
                arrayList2.add(au8.W(certificateFactory, bArrE2[i3], "rootsDer[" + i4 + "]"));
                i3++;
                i4++;
            }
            if (arrayList2.isEmpty()) {
                return false;
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size() + 1);
            arrayList3.add(x509CertificateW);
            arrayList3.addAll(arrayList);
            CertPath certPathGenerateCertPath = certificateFactory.generateCertPath(arrayList3);
            ArrayList arrayList4 = new ArrayList(mv0.Z(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList4.add(new TrustAnchor((X509Certificate) it.next(), null));
            }
            Set setT0 = lv0.T0(arrayList4);
            CertPathValidator certPathValidator = CertPathValidator.getInstance("PKIX");
            PKIXParameters pKIXParameters = new PKIXParameters((Set<TrustAnchor>) setT0);
            pKIXParameters.setRevocationEnabled(false);
            certPathValidator.validate(certPathGenerateCertPath, pKIXParameters);
            return true;
        } catch (Exception e) {
            ye4.c("AndroidKeyChainHandler", "verifyChainPkix failed: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return false;
        }
    }

    @Override // com.teamviewer.teamviewerlib.swig.tvclientcertificateauthentication.IAndroidKeyChainCallback
    public final boolean VerifySignature(AndroidKeyChainByteArray androidKeyChainByteArray, AndroidKeyChainByteArray androidKeyChainByteArray2, AndroidKeyChainByteArray androidKeyChainByteArray3) {
        String str;
        byte[] bArrD = iq8.D(androidKeyChainByteArray);
        byte[] bArrD2 = iq8.D(androidKeyChainByteArray2);
        byte[] bArrD3 = iq8.D(androidKeyChainByteArray3);
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArrD));
            certificateGenerateCertificate.getClass();
            PublicKey publicKey = ((X509Certificate) certificateGenerateCertificate).getPublicKey();
            String algorithm = publicKey.getAlgorithm();
            if (im3.n(algorithm, "RSA")) {
                str = "SHA512withRSA";
            } else {
                if (!im3.n(algorithm, "EC")) {
                    return false;
                }
                str = "SHA512withECDSA";
            }
            Signature signature = Signature.getInstance(str);
            signature.initVerify(publicKey);
            signature.update(bArrD2);
            return signature.verify(bArrD3);
        } catch (Exception e) {
            ye4.c("AndroidKeyChainHandler", "verifySignature failed: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return false;
        }
    }
}
