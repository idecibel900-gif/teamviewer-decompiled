package com.teamviewer.firebaseconfiglib.credential;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyStoreException;
import kotlin.Metadata;
import o.bn4;
import o.e41;
import o.im3;
import o.j93;
import o.kh;
import o.le5;
import o.lq1;
import o.lq6;
import o.qp3;
import o.rp3;
import o.tl2;
import o.to7;
import o.ul2;
import o.va2;
import o.wa2;
import o.wk0;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/teamviewer/firebaseconfiglib/credential/FirebaseCredential;", "", "Companion", "o/ul2", "o/tl2", "FirebaseConfigLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
@lq6
public final /* data */ class FirebaseCredential {
    public static final ul2 Companion = new ul2();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ FirebaseCredential(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            lq1.H(i, 63, tl2.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final void a(Context context, le5 le5Var) {
        File file = new File(context.getCacheDir(), "Firebase.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            String strA = bn4.a(bn4.a);
            strA.getClass();
            wk0 wk0VarD = new j93(file, context, strA, wa2.n).D();
            qp3 qp3Var = rp3.d;
            qp3Var.getClass();
            String strB = qp3Var.b(Companion.serializer(), this);
            try {
                va2 va2VarB = wk0VarD.B();
                try {
                    Charset charset = StandardCharsets.UTF_8;
                    charset.getClass();
                    byte[] bytes = strB.getBytes(charset);
                    bytes.getClass();
                    va2VarB.write(bytes);
                    va2VarB.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kh.n(va2VarB, th);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                ye4.a("FirebaseCredential", "file already exist");
                file.delete();
            }
        } catch (KeyStoreException unused2) {
            if (file.exists()) {
                file.delete();
            }
            ye4.c("FirebaseCredential", "key generation failed");
        } catch (Exception e) {
            if (file.exists()) {
                file.delete();
            }
            ye4.c("FirebaseCredential", "key generation failed: " + e.getMessage());
            ye4.d("FirebaseCredential", e);
            le5Var.invoke(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseCredential)) {
            return false;
        }
        FirebaseCredential firebaseCredential = (FirebaseCredential) obj;
        return im3.n(this.a, firebaseCredential.a) && im3.n(this.b, firebaseCredential.b) && im3.n(this.c, firebaseCredential.c) && im3.n(this.d, firebaseCredential.d) && im3.n(this.e, firebaseCredential.e) && im3.n(this.f, firebaseCredential.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + to7.e(to7.e(to7.e(to7.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = e41.o("FirebaseCredential(projectId=", this.a, ", databaseUrl=", this.b, ", storageBucket=");
        e41.t(sbO, this.c, ", mobileSdkAppId=", this.d, ", androidApiKey=");
        return e41.m(sbO, this.e, ", expireDate=", this.f, ")");
    }

    public FirebaseCredential(String str, String str2, String str3, String str4, String str5, String str6) {
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}
