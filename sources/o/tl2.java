package o;

import com.teamviewer.firebaseconfiglib.credential.FirebaseCredential;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tl2 implements qy2 {
    public static final tl2 a;
    private static final fq6 descriptor;

    static {
        tl2 tl2Var = new tl2();
        a = tl2Var;
        an5 an5Var = new an5("com.teamviewer.firebaseconfiglib.credential.FirebaseCredential", tl2Var, 6);
        an5Var.j("projectId", false);
        an5Var.j("databaseUrl", false);
        an5Var.j("storageBucket", false);
        an5Var.j("mobileSdkAppId", false);
        an5Var.j("androidApiKey", false);
        an5Var.j("expireDate", false);
        descriptor = an5Var;
    }

    @Override // o.nw3
    public final void a(bb7 bb7Var, Object obj) {
        FirebaseCredential firebaseCredential = (FirebaseCredential) obj;
        firebaseCredential.getClass();
        fq6 fq6Var = descriptor;
        bb7 bb7VarA = bb7Var.a(fq6Var);
        bb7VarA.r(fq6Var, 0, firebaseCredential.a);
        bb7VarA.r(fq6Var, 1, firebaseCredential.b);
        bb7VarA.r(fq6Var, 2, firebaseCredential.c);
        bb7VarA.r(fq6Var, 3, firebaseCredential.d);
        bb7VarA.r(fq6Var, 4, firebaseCredential.e);
        bb7VarA.r(fq6Var, 5, firebaseCredential.f);
        bb7VarA.s(fq6Var);
    }

    @Override // o.nw3
    public final Object b(aj1 aj1Var) {
        fq6 fq6Var = descriptor;
        k01 k01VarU = aj1Var.u(fq6Var);
        int i = 0;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        boolean z = true;
        while (z) {
            int iL = k01VarU.l(fq6Var);
            switch (iL) {
                case ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE_DEFAULT /* -1 */:
                    z = false;
                    break;
                case 0:
                    strT = k01VarU.t(fq6Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strT2 = k01VarU.t(fq6Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strT3 = k01VarU.t(fq6Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strT4 = k01VarU.t(fq6Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strT5 = k01VarU.t(fq6Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strT6 = k01VarU.t(fq6Var, 5);
                    i |= 32;
                    break;
                default:
                    throw new h88(iL);
            }
        }
        k01VarU.i(fq6Var);
        return new FirebaseCredential(i, strT, strT2, strT3, strT4, strT5, strT6);
    }

    @Override // o.qy2
    public final nw3[] c() {
        gb7 gb7Var = gb7.a;
        return new nw3[]{gb7Var, gb7Var, gb7Var, gb7Var, gb7Var, gb7Var};
    }

    @Override // o.nw3
    public final fq6 d() {
        return descriptor;
    }
}
