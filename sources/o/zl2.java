package o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl2 implements le7, ic1 {
    public final /* synthetic */ FirebaseRemoteConfig m;

    public /* synthetic */ zl2(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.m = firebaseRemoteConfig;
    }

    @Override // o.le7
    public bo7 i(Object obj) {
        return this.m.lambda$fetchAndActivate$1((Void) obj);
    }

    @Override // o.ic1
    public Object j(bo7 bo7Var) {
        return Boolean.valueOf(this.m.processActivatePutTask(bo7Var));
    }
}
