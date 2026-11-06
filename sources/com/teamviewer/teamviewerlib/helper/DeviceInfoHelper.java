package com.teamviewer.teamviewerlib.helper;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.TransactionTooLargeException;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.Metadata;
import o.e41;
import o.fi7;
import o.ga0;
import o.h57;
import o.hm3;
import o.im3;
import o.it1;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/teamviewer/teamviewerlib/helper/DeviceInfoHelper;", "", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class DeviceInfoHelper {
    public static String a() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        String str2 = Build.BRAND;
        str2.getClass();
        if (str2.length() > 0) {
            return str2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0147 A[LOOP:0: B:13:0x004d->B:60:0x0147, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c8 A[Catch: NoSuchAlgorithmException -> 0x01ef, TryCatch #5 {NoSuchAlgorithmException -> 0x01ef, blocks: (B:68:0x01b3, B:71:0x01c8, B:73:0x01d0, B:74:0x01e9), top: B:108:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d0 A[Catch: NoSuchAlgorithmException -> 0x01ef, LOOP:1: B:72:0x01ce->B:73:0x01d0, LOOP_END, TryCatch #5 {NoSuchAlgorithmException -> 0x01ef, blocks: (B:68:0x01b3, B:71:0x01c8, B:73:0x01d0, B:74:0x01e9), top: B:108:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fc  */
    public static String b(fi7 fi7Var) {
        Signature[] apkContentsSigners;
        Signature signature;
        StringBuilder sb;
        X509Certificate x509Certificate;
        String str;
        byte[] bArrDigest;
        char[] cArr;
        int length;
        if (!"samsung".equalsIgnoreCase(a())) {
            PackageManager packageManager = fi7Var.getPackageManager();
            String str2 = ga0.f0;
            if (str2 == null) {
                String[] strArr = ga0.d0;
                for (int i = 0; i < 3; i++) {
                    String str3 = strArr[i];
                    ye4 ye4Var = ye4.a;
                    if (str3 == null) {
                        ye4.c("PackageSignatureInfo", "packageName is null");
                    } else if (packageManager != null) {
                        try {
                            int i2 = Build.VERSION.SDK_INT;
                            PackageInfo packageInfoG = i2 >= 28 ? it1.G(packageManager, str3, 134217728) : it1.G(packageManager, str3, 64);
                            if (i2 >= 28) {
                                SigningInfo signingInfo = packageInfoG.signingInfo;
                                if (signingInfo == null) {
                                    apkContentsSigners = new Signature[0];
                                } else if (signingInfo.hasMultipleSigners()) {
                                    ye4Var.b("PackageSignatureInfo", "Multiple signers");
                                    apkContentsSigners = signingInfo.getApkContentsSigners();
                                    if (apkContentsSigners == null) {
                                        apkContentsSigners = new Signature[0];
                                    }
                                } else {
                                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                                    signingCertificateHistory.getClass();
                                    ye4Var.b("PackageSignatureInfo", "Signing history contains " + signingCertificateHistory.length + " entries");
                                    signature = signingCertificateHistory[signingCertificateHistory.length - 1];
                                }
                                if (signature != null) {
                                    sb = new StringBuilder("System signature:");
                                    try {
                                        Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                                        certificateGenerateCertificate.getClass();
                                        x509Certificate = (X509Certificate) certificateGenerateCertificate;
                                    } catch (CertificateException e) {
                                        e41.s("cannot extract certificate: ", e.getMessage(), "PackageSignatureInfo");
                                        x509Certificate = null;
                                    }
                                    if (x509Certificate != null) {
                                        String string = x509Certificate.getSerialNumber().toString(16);
                                        sb.append(" serial=");
                                        sb.append(string);
                                        sb.append(" version=");
                                        sb.append(x509Certificate.getVersion());
                                        sb.append(" issuerDN='");
                                        sb.append(x509Certificate.getIssuerDN());
                                        sb.append("' subjectDN='");
                                        sb.append(x509Certificate.getSubjectDN());
                                        sb.append('\'');
                                    }
                                    try {
                                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                        messageDigest.update(signature.toByteArray());
                                        bArrDigest = messageDigest.digest();
                                        if (bArrDigest == null) {
                                            str = null;
                                        } else {
                                            cArr = new char[bArrDigest.length * 2];
                                            length = bArrDigest.length;
                                            for (int i3 = 0; i3 < length; i3++) {
                                                byte b = bArrDigest[i3];
                                                int i4 = i3 * 2;
                                                char[] cArr2 = ga0.e0;
                                                cArr[i4] = cArr2[(b & 255) >>> 4];
                                                cArr[i4 + 1] = cArr2[b & 15];
                                            }
                                            str = new String(cArr);
                                        }
                                    } catch (NoSuchAlgorithmException e2) {
                                        e41.s("hashing failed: ", e2.getMessage(), "PackageSignatureInfo");
                                    }
                                    if (str != null) {
                                        sb.append(" signatureHash=");
                                        sb.append(str);
                                    }
                                    ye4.a("PackageSignatureInfo", sb.toString());
                                    ga0.f0 = str;
                                    break;
                                }
                            } else {
                                apkContentsSigners = packageInfoG.signatures;
                                if (apkContentsSigners == null) {
                                    apkContentsSigners = new Signature[0];
                                }
                            }
                            if (apkContentsSigners.length == 0) {
                                ye4.c("PackageSignatureInfo", "invalid number of signatures (" + apkContentsSigners.length + ") for package '" + str3 + "'");
                            } else {
                                if (apkContentsSigners.length > 1) {
                                    ye4.a("PackageSignatureInfo", "number of signatures for package '" + str3 + "' : " + apkContentsSigners.length);
                                }
                                signature = apkContentsSigners[0];
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            ye4.c("PackageSignatureInfo", "package '" + str3 + "' not found: " + e3.getMessage());
                        } catch (RuntimeException e4) {
                            if (e4.getCause() instanceof TransactionTooLargeException) {
                                ye4Var.g("PackageSignatureInfo", "PackageInfo query result was over the IPC transaction limit! (1MB)");
                            } else {
                                String message = e4.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                ye4.c("PackageSignatureInfo", message);
                            }
                        }
                        if (signature != null) {
                            sb = new StringBuilder("System signature:");
                            Certificate certificateGenerateCertificate2 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                            certificateGenerateCertificate2.getClass();
                            x509Certificate = (X509Certificate) certificateGenerateCertificate2;
                            if (x509Certificate != null) {
                                String string2 = x509Certificate.getSerialNumber().toString(16);
                                sb.append(" serial=");
                                sb.append(string2);
                                sb.append(" version=");
                                sb.append(x509Certificate.getVersion());
                                sb.append(" issuerDN='");
                                sb.append(x509Certificate.getIssuerDN());
                                sb.append("' subjectDN='");
                                sb.append(x509Certificate.getSubjectDN());
                                sb.append('\'');
                            }
                            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
                            messageDigest2.update(signature.toByteArray());
                            bArrDigest = messageDigest2.digest();
                            if (bArrDigest == null) {
                                str = null;
                            } else {
                                cArr = new char[bArrDigest.length * 2];
                                length = bArrDigest.length;
                                while (i3 < length) {
                                    byte b2 = bArrDigest[i3];
                                    int i5 = i3 * 2;
                                    char[] cArr3 = ga0.e0;
                                    cArr[i5] = cArr3[(b2 & 255) >>> 4];
                                    cArr[i5 + 1] = cArr3[b2 & 15];
                                }
                                str = new String(cArr);
                            }
                            if (str != null) {
                                sb.append(" signatureHash=");
                                sb.append(str);
                            }
                            ye4.a("PackageSignatureInfo", sb.toString());
                            ga0.f0 = str;
                            break;
                        }
                    } else {
                        ye4.c("PackageSignatureInfo", "packageManager is null");
                    }
                    signature = null;
                    if (signature != null) {
                        sb = new StringBuilder("System signature:");
                        Certificate certificateGenerateCertificate3 = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                        certificateGenerateCertificate3.getClass();
                        x509Certificate = (X509Certificate) certificateGenerateCertificate3;
                        if (x509Certificate != null) {
                            String string3 = x509Certificate.getSerialNumber().toString(16);
                            sb.append(" serial=");
                            sb.append(string3);
                            sb.append(" version=");
                            sb.append(x509Certificate.getVersion());
                            sb.append(" issuerDN='");
                            sb.append(x509Certificate.getIssuerDN());
                            sb.append("' subjectDN='");
                            sb.append(x509Certificate.getSubjectDN());
                            sb.append('\'');
                        }
                        MessageDigest messageDigest3 = MessageDigest.getInstance("SHA-256");
                        messageDigest3.update(signature.toByteArray());
                        bArrDigest = messageDigest3.digest();
                        if (bArrDigest == null) {
                            str = null;
                        } else {
                            cArr = new char[bArrDigest.length * 2];
                            length = bArrDigest.length;
                            while (i3 < length) {
                                byte b3 = bArrDigest[i3];
                                int i6 = i3 * 2;
                                char[] cArr4 = ga0.e0;
                                cArr[i6] = cArr4[(b3 & 255) >>> 4];
                                cArr[i6 + 1] = cArr4[b3 & 15];
                            }
                            str = new String(cArr);
                        }
                        if (str != null) {
                            sb.append(" signatureHash=");
                            sb.append(str);
                        }
                        ye4.a("PackageSignatureInfo", sb.toString());
                        ga0.f0 = str;
                        break;
                    }
                }
                str2 = ga0.f0;
            }
            if ("AD71F412F4D91BBD8B176ADCC6940A3FAB6A10C343CE098866FB4D4348D6ECC1".equals(str2)) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.juniper.unitserial").getInputStream()));
                    String line = bufferedReader.readLine();
                    line.getClass();
                    bufferedReader.close();
                    return line;
                } catch (Exception unused) {
                    String str4 = Build.SERIAL;
                    str4.getClass();
                    return str4;
                }
            }
            SharedPreferences sharedPreferences = h57.a;
            if (sharedPreferences == null) {
                im3.e0("sharedPreferences");
                throw null;
            }
            String string4 = sharedPreferences.getString("SERIAL_NUMBER_KEY", null);
            if (string4 != null) {
                return string4;
            }
            if (Build.VERSION.SDK_INT == 28 && hm3.h(fi7Var, "android.permission.READ_PHONE_STATE") == 0) {
                String serial = Build.getSerial();
                serial.getClass();
                return serial;
            }
            String str5 = Build.SERIAL;
            str5.getClass();
            return str5;
        }
        String str6 = Build.SERIAL;
        str6.getClass();
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, "ril.serialnumber", str6);
            objInvoke.getClass();
            String str7 = (String) objInvoke;
            return !"00000000000".equals(str7) ? str7 : str6;
        } catch (Exception unused2) {
        }
    }
}
