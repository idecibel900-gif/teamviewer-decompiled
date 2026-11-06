package o;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.teamviewer.firebaseconfiglib.credential.FirebaseCredential;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigReadyCallBack;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;

/* JADX INFO: loaded from: classes.dex */
public final class vl2 extends FirebaseConfigReadyCallBack {
    public final /* synthetic */ d11 a;

    public vl2(d11 d11Var) {
        this.a = d11Var;
        swigReleaseOwnership();
    }

    @Override // com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigReadyCallBack
    public final void OnFirebaseConfigReady() {
        swigTakeOwnership();
        FirebaseConfigurationAdapter firebaseConfigurationAdapter = xs1.a;
        if (firebaseConfigurationAdapter == null) {
            im3.e0("firebaseConfigurationAdapter");
            throw null;
        }
        if (firebaseConfigurationAdapter == null) {
            im3.e0("firebaseConfigurationAdapter");
            throw null;
        }
        FirebaseCredential credential = firebaseConfigurationAdapter.getCredential(0);
        if (credential == null) {
            credential = firebaseConfigurationAdapter.getCredential(0);
        }
        if (credential != null) {
            d11 d11Var = this.a;
            ye4.a.b("FirebaseInitManager", "Start to initialize Firebase app");
            FirebaseOptions.Builder storageBucket = new FirebaseOptions.Builder().setProjectId(credential.a).setApplicationId(credential.d).setApiKey(credential.e).setDatabaseUrl(credential.b).setStorageBucket(credential.c);
            storageBucket.getClass();
            synchronized (this) {
                try {
                    Context applicationContext = ((RemoteControlApplication) d11Var.m).getApplicationContext();
                    applicationContext.getClass();
                    credential.a(applicationContext, (le5) d11Var.p);
                    if (FirebaseApp.getApps((RemoteControlApplication) d11Var.m).isEmpty()) {
                        FirebaseApp.initializeApp((RemoteControlApplication) d11Var.m, storageBucket.build());
                        ((m10) d11Var.f578o).a();
                        FirebaseConfigurationAdapter firebaseConfigurationAdapter2 = xs1.a;
                        if (firebaseConfigurationAdapter2 == null) {
                            im3.e0("firebaseConfigurationAdapter");
                            throw null;
                        }
                        firebaseConfigurationAdapter2.RemoveFirebaseConfigReadyCallback((vl2) d11Var.r);
                        ye4.a("FirebaseInitManager", "Firebase initialisation succeeded");
                    } else {
                        ye4.a("FirebaseInitManager", "Firebase initialisation skipped");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d11 d11Var2 = this.a;
        FirebaseConfigurationAdapter firebaseConfigurationAdapter3 = xs1.a;
        if (firebaseConfigurationAdapter3 != null) {
            firebaseConfigurationAdapter3.RemoveFirebaseConfigReadyCallback((vl2) d11Var2.r);
        } else {
            im3.e0("firebaseConfigurationAdapter");
            throw null;
        }
    }
}
