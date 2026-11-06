package o;

import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntryType;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class lt4 implements up3 {
    public final /* synthetic */ xu1 a;

    public lt4(xu1 xu1Var) {
        this.a = xu1Var;
    }

    @Override // o.up3
    public final vp3 a(Type type, Set set, pt4 pt4Var) {
        if (!set.isEmpty()) {
            return null;
        }
        Set set2 = ma8.a;
        if (f57.h(DeviceListEntryType.class, type)) {
            return this.a;
        }
        return null;
    }
}
