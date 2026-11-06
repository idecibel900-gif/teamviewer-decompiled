package o;

import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class he2 {
    public static final he2 b = new he2();
    public final EnumMap a = new EnumMap(EventParam.class);

    public final void a(EventParam eventParam, float f) {
        eventParam.getClass();
        this.a.put(eventParam, new nn2(Float.valueOf(f)));
    }

    public final void b(EventParam eventParam, Enum r3) {
        eventParam.getClass();
        this.a.put(eventParam, new pc2(r3));
    }

    public final void c(EventParam eventParam, String str) {
        eventParam.getClass();
        str.getClass();
        this.a.put(eventParam, new rb7(str));
    }

    public final byte[] d(EventParam eventParam) {
        eventParam.getClass();
        byte[] bArr = (byte[]) i(eventParam);
        return bArr == null ? new byte[0] : bArr;
    }

    public final Enum e(EventParam eventParam) {
        eventParam.getClass();
        return (Enum) i(eventParam);
    }

    public final float f(EventParam eventParam) {
        eventParam.getClass();
        Float f = (Float) i(eventParam);
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final int g(EventParam eventParam) {
        eventParam.getClass();
        Integer num = (Integer) i(eventParam);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final String h(EventParam eventParam) {
        eventParam.getClass();
        String str = (String) i(eventParam);
        return str == null ? "" : str;
    }

    public final Object i(EventParam eventParam) {
        je2 je2Var = (je2) this.a.get(eventParam);
        Object obj = je2Var != null ? je2Var.a : null;
        if (obj == null) {
            ye4.c("EventProperties", "getValue - entry not found: " + eventParam);
        }
        return obj;
    }

    public final String toString() {
        EnumMap enumMap = this.a;
        ArrayList arrayList = new ArrayList(enumMap.size());
        for (Map.Entry entry : enumMap.entrySet()) {
            arrayList.add(entry.getKey() + " " + entry.getValue());
        }
        return lv0.t0(arrayList, "\n", null, null, null, 62);
    }
}
