package androidx.camera.camera2;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import o.ab5;
import o.an4;
import o.ax4;
import o.d21;
import o.ea2;
import o.gk0;
import o.h00;
import o.hk;
import o.hk0;
import o.jk0;
import o.l96;
import o.nk0;
import o.xc0;
import o.yk0;
import o.yq4;
import o.zx;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/camera/camera2/Camera2Config$DefaultProvider", "", "<init>", "()V", "Lo/yk0;", "getCameraXConfig", "()Lo/yk0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2Config$DefaultProvider {
    public yk0 getCameraXConfig() {
        jk0 jk0Var = new jk0((byte) 0);
        nk0 nk0Var = new nk0();
        ea2 ea2Var = ea2.m;
        zx zxVar = new zx();
        zxVar.a = ea2Var;
        nk0Var.a = zxVar;
        new l96();
        ax4 ax4Var = (ax4) new xc0((byte) 7).n;
        ax4Var.a(yk0.c, jk0Var);
        ax4Var.a(yk0.d, new gk0((byte) 0));
        ax4Var.a(yk0.e, new hk0((byte) 0));
        ax4Var.a(yk0.f, Boolean.TRUE);
        hk hkVar = ab5.b;
        if (!ab5.class.equals(ax4.class)) {
            TreeMap treeMap = new TreeMap(ab5.b);
            for (h00 h00Var : Collections.unmodifiableSet(ax4Var.a.keySet())) {
                Map map = (Map) ax4Var.a.get(h00Var);
                Set<d21> setUnmodifiableSet = map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
                ArrayMap arrayMap = new ArrayMap();
                for (d21 d21Var : setUnmodifiableSet) {
                    Map map2 = (Map) ax4Var.a.get(h00Var);
                    Object obj = null;
                    if (map2 == null) {
                        an4.i(h00Var, "Option does not exist: ");
                    } else if (map2.containsKey(d21Var)) {
                        obj = map2.get(d21Var);
                    } else {
                        yq4.s("Option does not exist: ", h00Var, " with priority=", d21Var);
                    }
                    arrayMap.put(d21Var, obj);
                }
                treeMap.put(h00Var, arrayMap);
            }
            new ab5(treeMap);
        }
        return new yk0();
    }
}
