package o;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yv8 extends yo8 {
    public final /* synthetic */ do7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv8(yp8 yp8Var, do7 do7Var) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", (byte) 0);
        this.d = do7Var;
        Objects.requireNonNull(yp8Var);
    }

    @Override // o.yo8
    public final boolean g(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) fp8.a(parcel, Status.CREATOR);
        fp8.b(parcel);
        int i2 = status.m;
        do7 do7Var = this.d;
        if (i2 <= 0) {
            do7Var.a(null);
            return true;
        }
        do7Var.a.n(status.f34o != null ? new nb6(status) : new br(status));
        return true;
    }
}
