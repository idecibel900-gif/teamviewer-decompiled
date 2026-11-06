package o;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zq4 {
    public final yt2 a;
    public final iu b;
    public final HashMap c;

    public zq4(Context context, iu iuVar) {
        yt2 yt2Var = new yt2((Object) context, (byte) 23);
        this.c = new HashMap();
        this.a = yt2Var;
        this.b = iuVar;
    }

    public final synchronized g28 a(String str) {
        if (this.c.containsKey(str)) {
            return (g28) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryZ = this.a.z(str);
        if (cctBackendFactoryZ == null) {
            return null;
        }
        iu iuVar = this.b;
        g28 g28VarCreate = cctBackendFactoryZ.create(new i00((Context) iuVar.n, (du0) iuVar.f1103o, (du0) iuVar.p, str));
        this.c.put(str, g28VarCreate);
        return g28VarCreate;
    }
}
