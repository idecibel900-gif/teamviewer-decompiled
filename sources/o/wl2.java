package o;

import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl2 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ FirebaseInstallations n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2426o;

    public /* synthetic */ wl2(FirebaseInstallations firebaseInstallations, boolean z, byte b) {
        this.m = b;
        this.n = firebaseInstallations;
        this.f2426o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        boolean z = this.f2426o;
        FirebaseInstallations firebaseInstallations = this.n;
        switch (b) {
            case 0:
                firebaseInstallations.lambda$doRegistrationOrRefresh$3(z);
                break;
            default:
                firebaseInstallations.lambda$getToken$2(z);
                break;
        }
    }
}
