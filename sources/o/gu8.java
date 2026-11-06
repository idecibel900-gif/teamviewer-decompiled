package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gu8 extends bw8 {
    public final /* synthetic */ byte n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f924o;
    public final /* synthetic */ Object p;

    public gu8(xs8 xs8Var, IBinder iBinder) {
        this.f924o = iBinder;
        this.p = xs8Var;
    }

    @Override // o.bw8
    public final void a() {
        HashMap map;
        hu8 ct8Var = null;
        switch (this.n) {
            case 0:
                try {
                    ov8 ov8Var = (ov8) this.p;
                    hu8 hu8Var = ov8Var.a.m;
                    String str = ov8Var.b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = aw8.a;
                    synchronized (aw8.class) {
                        map = aw8.a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    cv8 cv8Var = new cv8((ov8) this.p, (do7) this.f924o);
                    ct8 ct8Var2 = (ct8) hu8Var;
                    ct8Var2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i = wr8.a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(cv8Var);
                    try {
                        ct8Var2.c.transact(2, parcelObtain, null, 1);
                        return;
                    } finally {
                        parcelObtain.recycle();
                    }
                } catch (RemoteException e) {
                    ov8 ov8Var2 = (ov8) this.p;
                    hr2 hr2Var = ov8.c;
                    Object[] objArr = {ov8Var2.b};
                    hr2Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        io.sentry.android.core.v0.d("PlayCore", hr2.c(hr2Var.n, "error requesting in-app review for %s", objArr), e);
                    }
                    ((do7) this.f924o).b(new RuntimeException(e));
                    return;
                }
            default:
                cy8 cy8Var = (cy8) ((xs8) this.p).b;
                IBinder iBinder = (IBinder) this.f924o;
                int i2 = tt8.d;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    ct8Var = iInterfaceQueryLocalInterface instanceof hu8 ? (hu8) iInterfaceQueryLocalInterface : new ct8(iBinder);
                }
                cy8Var.m = ct8Var;
                hr2 hr2Var2 = cy8Var.b;
                hr2Var2.a("linkToDeath", new Object[0]);
                try {
                    ((ct8) cy8Var.m).c.linkToDeath(cy8Var.j, 0);
                    break;
                } catch (RemoteException e2) {
                    Object[] objArr2 = new Object[0];
                    hr2Var2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        io.sentry.android.core.v0.d("PlayCore", hr2.c(hr2Var2.n, "linkToDeath failed", objArr2), e2);
                    }
                }
                cy8Var.g = false;
                Iterator it = cy8Var.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                cy8Var.d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu8(ov8 ov8Var, do7 do7Var, do7 do7Var2) {
        super(do7Var);
        this.f924o = do7Var2;
        this.p = ov8Var;
    }
}
