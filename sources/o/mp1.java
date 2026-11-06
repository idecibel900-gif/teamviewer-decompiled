package o;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mp1 extends qs1 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ AbstractCollection e;

    public /* synthetic */ mp1(AbstractCollection abstractCollection, byte b) {
        this.d = b;
        this.e = abstractCollection;
    }

    private final void X(zi0 zi0Var, zi0 zi0Var2) {
    }

    @Override // o.qs1
    public final void I(zi0 zi0Var, zi0 zi0Var2) {
        switch (this.d) {
            case 0:
                if (zi0Var2 instanceof zw2) {
                    zw2 zw2Var = (zw2) zi0Var2;
                    Map linkedHashMap = zw2Var.O;
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                        zw2Var.O = linkedHashMap;
                    }
                    linkedHashMap.put(sp1.a, zi0Var);
                }
                break;
        }
    }

    @Override // o.qs1
    public final void z(zi0 zi0Var) {
        byte b = this.d;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 0:
                zi0Var.getClass();
                hc5.r(zi0Var, null);
                ((ArrayList) abstractCollection).add(zi0Var);
                return;
            default:
                if (zi0Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "fakeOverride", "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4", "addFakeOverride"));
                }
                hc5.r(zi0Var, null);
                ((LinkedHashSet) abstractCollection).add(zi0Var);
                return;
        }
    }
}
