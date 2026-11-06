package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ j(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((SharedPreferencesQueue) obj).syncState();
                break;
            default:
                ((WithinAppServiceConnection.BindRequest) obj).lambda$arrangeTimeout$0();
                break;
        }
    }
}
