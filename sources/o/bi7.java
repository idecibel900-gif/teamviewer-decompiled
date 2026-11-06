package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class bi7 {
    public static final bi7 b = new bi7(0);
    public final long a;

    public bi7(Bundle bundle, byte b2) {
        switch (b2) {
            case 2:
                this.a = -1L;
                if (bundle != null) {
                    this.a = bundle.getLong("ManagedDeviceV2SelectedItemId", -1L);
                }
                break;
            default:
                this.a = bundle != null ? bundle.getLong("PartnerSelectedItemId", -1L) : -1L;
                break;
        }
    }

    public bi7(long j) {
        this.a = j;
    }
}
